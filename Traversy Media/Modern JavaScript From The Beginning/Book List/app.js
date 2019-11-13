//Book Constructor
function Book(title, author, isbn) {

    this.title = title;
    this.author = author;
    this.isbn = isbn;
}

//UI Constructor
function UI() {}

//Adding Book to List
UI.prototype.addBookToList = function(book) {

    const list = document.getElementById('book-list');

    //Creating tr Element
    const row = document.createElement('tr');

    //Inserting Columns
    row.innerHTML = `
    <td>${book.title}</td>
    <td>${book.author}</td>
    <td>${book.isbn}</td>
    <td><a href="#" class="delete">X</a></td>
    `;

    list.appendChild(row);
}

//Showing Alerts
UI.prototype.showAlert = function(message, className) {

    //Creating Div
    const div = document.createElement('div');

    //Adding Classes
    div.className = `alert ${className}`;

    //Adding Text
    div.appendChild(document.createTextNode(message));

    //Getting Parrent
    const container = document.querySelector('.container');

    //Selecting Form
    const form = document.querySelector('#book-form');

    //Inserting Alert
    container.insertBefore(div, form);

    //Timeout after 3 Seconds
    setTimeout(function() {
        document.querySelector('.alert').remove();
    }, 2000);
}

//Deleting Books
UI.prototype.deleteBook = function(target) {

    if(target.className === 'delete')
    {
        target.parentElement.parentElement.remove();

        //Instantiating LocalStorage
        const ls = new LocalStorage();

        //Removing from Local Storage
        ls.removeBook(target.parentElement.previousElementSibling.textContent);

        //Instantiating UI
        const ui = new UI();

        //Showing Alert
        ui.showAlert('Book has been Removed!', 'success');
    }
}

//Clearing Fields
UI.prototype.clearFields = function() {

    document.getElementById('title').value = '';
    document.getElementById('author').value = '';
    document.getElementById('isbn').value = '';
}

//LocalStorage Constructor
function LocalStorage () {}

//Getting Books from Local Storage
LocalStorage.prototype.getBooks = function () {

    let books;

    if(localStorage.getItem('books') === null)
    {
        books = [];
    }
    else
    {
        books = JSON.parse(localStorage.getItem('books'));
    }

    return books;
}

//Displaying Books from Local Storage
LocalStorage.prototype.displayBooks = function() {

    //Instantiating LocalStorage
    const ls = new LocalStorage();
        
    const books = ls.getBooks();

    books.forEach(function(book) {

        //Instantiating UI
        const ui = new UI();

        //Adding Books to UI
        ui.addBookToList(book);
    });
}

//Adding Books in Local Storage
LocalStorage.prototype.addBook = function(book) {

    //Instantiating LocalStorage
    const ls = new LocalStorage();

    const books = ls.getBooks();

    books.push(book);

    localStorage.setItem('books', JSON.stringify(books));
}

//Removing Books from Local Storage
LocalStorage.prototype.removeBook = function(isbn) {

    //Instantiating LocalStorage
    const ls = new LocalStorage();

    const books = ls.getBooks();

    books.forEach(function(book, index) {

        if(book.isbn === isbn)
        {
            books.splice(index, 1);
        }
    });

    localStorage.setItem('books', JSON.stringify(books));
}

//Instantiating LocalStorage
const ls = new LocalStorage();

//DOM Load Event Listeners
document.addEventListener('DOMContentLoaded', ls.displayBooks);

//Event Listener for Adding Books
document.getElementById('book-form').addEventListener('submit', function(e) {

    //Getting Form Values
    const title = document.getElementById('title').value,
         author = document.getElementById('author').value,
         isbn = document.getElementById('isbn').value;

    //Instantiating Book
    const book = new Book(title, author, isbn);

    //Instantiating UI
    const ui = new UI();

    //Instantiating LocalStorage
    const ls = new LocalStorage();

    //Validating
    if(title === '' || author === '' || isbn === '')
    {
        //Error Alert
        ui.showAlert('Please Fill in All Fields', 'error');
    }
    else
    {
        //Adding Book to List
        ui.addBookToList(book);

        //Adding to Local Storage
        ls.addBook(book);

        //Success Alert
        ui.showAlert('Book Information has been Added!', 'success');

        //Clearing Fields
        ui.clearFields();
    }

    e.preventDefault();
});

//Event Listener for Deleting Books
document.getElementById('book-list').addEventListener('click', function(e)
{
    //Instantiating UI
    const ui = new UI();

    ui.deleteBook(e.target);
   
    e.preventDefault();
});
