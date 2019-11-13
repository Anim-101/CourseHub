//Book Class
class Book {
    constructor(title, author, isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
}

//UI Class
class UI {

    //Adding Book to List
    addBookToList(book) {
        
        const list = document.getElementById('book-list');

        //Creating tr Element
        const row = document.createElement('tr');

        //Inserting Collumns
        row.innerHTML = `
        <td>${book.title}</td>
        <td>${book.author}</td>
        <td>${book.isbn}</td>
        <td><a href="#" class="delete">X<a></td>
        `;

        list.appendChild(row);
    }

    //Showing Allerts
    showAlert(message, className) {

        //Creating Div
        const div = document.createElement('div');

        //Adding Class
        div.className = `alert ${className}`;

        //Adding Text
        div.appendChild(document.createTextNode(message));

        //Getting Parent
        const container = document.querySelector('.container');

        //Getting Form
        const form = document.querySelector('#book-form')

        //Inserting Alert Message
        container.insertBefore(div, form);

        //Timeout After 3 Sec
        setTimeout(function() {
            document.querySelector('.alert').remove();
        }, 2000);

    }

    //Deleting Books from List
    deleteBook(target) {

        if(target.className === 'delete') {

            target.parentElement.parentElement.remove();

            //Removing from LocalStorage
            LocalStorage.remmoveBook(target.parentElement.previousElementSibling.textContent);

            //Instantiating UI
            const ui = new UI();

            //Showing Alert
            ui.showAlert('Book has been Removed!', 'success');
        }
    }

    clearFields() {

        document.getElementById('title').value = '';
        document.getElementById('author').value = '';
        document.getElementById('isbn').value = '';
    }

}

//Local Storage Class
class LocalStorage {

    //Getting Books from Local Storage
    static getBooks() {

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
    static displayBooks() {

        const books = LocalStorage.getBooks();

        books.forEach(function(book) {

            const ui = new UI();

            //Adding Books to UI
            ui.addBookToList(book);
        });
    }

    //Adding Books in Local Storage
    static addBook(book) {

        const books = LocalStorage.getBooks();

        books.push(book);

        localStorage.setItem('books', JSON.stringify(books));
    }

    //Removing Books from Local Storage
    static remmoveBook(isbn) {
 
        const books = LocalStorage.getBooks();

        books.forEach(function(book, index) {

            if(book.isbn === isbn) {
                books.splice(index, 1);
            }
        });

        localStorage.setItem('books', JSON.stringify(books));
    }
}

//DOM Load Event Listeners
document.addEventListener('DOMContentLoaded', LocalStorage.displayBooks);

//Even Listener for Adding Books
document.getElementById('book-form').addEventListener('submit', function(e) {

    //Getting form Values
    const title = document.getElementById('title').value,
          author = document.getElementById('author').value,
          isbn = document.getElementById('isbn').value;

    //Instantiating Book
    const book = new Book(title, author, isbn);

    //Instantiating UI
    const ui = new UI ();

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
        LocalStorage.addBook(book);

        //Success Alert
        ui.showAlert('Book Information has been Added', 'success');

        //Clearing Fields
        ui.clearFields();
    }

    e.preventDefault();
});

//Event Listener for Deleting Books
document.getElementById('book-list').addEventListener('click', function(e){

    //Instantiating UI
    const ui = new UI();

    //Deleting Books
    ui.deleteBook(e.target);

    e.preventDefault();
});
