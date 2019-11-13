//Defination of UI Variables Starts
//Definining UI Variables
const form = document.querySelector('#task-form');
const taskList = document.querySelector('.collection');
const clearBtn = document.querySelector('.clear-tasks');
const filter = document.querySelector('#filter');
const taskInput = document.querySelector('#task');
//Defination of UI Variables Ends

//Load All Event Listeners
loadEventListeners();

//Loading All Event Listeners Function Starts
//Load All Event Listeners Function
function loadEventListeners()
{
    //Dom Load Event
    document.addEventListener('DOMContentLoaded', getTasks);

    //Add Task Event
    form.addEventListener('submit', addTask);

    //Remove Task Event
    taskList.addEventListener('click', removeTask);

    //Clear Task Event
    clearBtn.addEventListener('click', clearTasks);

    //Filter Task Event
    filter.addEventListener('keyup', filterTasks);
}
//Loading All Event Listeners Function Ends

//Getting Tasks from Local Storage Starts
//Get Tasks from Local Storage
function getTasks(e)
{
    let tasks;
    
    if(localStorage.getItem('tasks') === null)
    {
        tasks = [];
    }
    else
    {
        tasks = JSON.parse(localStorage.getItem('tasks'));
    }

    tasks.forEach(function(task)
    {
        //Creating li Element
        const li = document.createElement('li');

        //Adding Class Name
        li.className = 'collection-item';

        //Creating Text Node and Appending it to li
        li.appendChild(document.createTextNode(task));

        //Creating New link element
        const link = document.createElement('a');

        //Adding Class Name
        link.className = 'delete-item secondary-content';

        //Adding Icon Html
        link.innerHTML = '<i class="fa fa-remove"></i>'

        //Appending link to li
        li.appendChild(link);

        //Appending li to ul
        taskList.appendChild(li);
    });
}
//Getting Taks from Local Storage Ends

//Adding Task Starts
//Add Task Function
function addTask(e)
{
    if(taskInput.value === '')
    {
        alert('Add a task');
    }
    else
    {
        //Creating li Elements
        const li = document.createElement('li');
        li.className = 'collection-item';

        //Creating Text Node and Appending to li
        li.appendChild(document.createTextNode(taskInput.value));

        //Creating new Link Element
        const link = document.createElement('a');

        //Adding a Class to Link
        link.className = 'delete-item secondary-content';

        //Adding icon html
        link.innerHTML = '<i class="fa fa-remove"><i>';

        //Appending the Link to li
        li.appendChild(link);

        //Appending li to ul
        taskList.appendChild(li);

        //Storing in Local Storage
        storeTaskInLocalStorage(taskInput.value);

        //Clearing Input
        taskInput.value = '';
    }

    e.preventDefault();
}

//Storing Task to Local Storage
function storeTaskInLocalStorage(task)
{
    let tasks;

    if(localStorage.getItem('tasks') === null)
    {
        tasks = [];
    }
    else
    {
        tasks = JSON.parse(localStorage.getItem('tasks'))
    }

    tasks.push(task);

    localStorage.setItem('tasks', JSON.stringify(tasks));
}
//Adding Tasks End

//Removing Tasks Starts
//Remove Task Function
function removeTask(e)
{
    if(e.target.parentElement.classList.contains('delete-item'))
    {
        if(confirm('Are you Sure?'))
        {
            e.target.parentElement.parentElement.remove();

            //Remove from Local Storage
            removeTaskFromLocalStorage(e.target.parentElement.parentElement);
        }
    }
}

//Removing Task from Local Storage
function removeTaskFromLocalStorage(taskItem)
{ 
    let tasks;

    if(localStorage.getItem('tasks') === null)
    {
        tasks = [];
    }
    else
    {
        tasks = JSON.parse(localStorage.getItem('tasks'));
    }

    tasks.forEach(function(task, index)
    {
        if(taskItem.textContent === task)
        {
            tasks.splice(index, 1);
        }
    });

    localStorage.setItem('tasks', JSON.stringify(tasks));
}
//Removing Tasks Ends

//Clearing Tasks Starts
//Clear Tasks Function
function clearTasks(e)
{
    //Slower to Clear
    //taskList.innerHTML = '';

    //Faster to Clear
    while(taskList.firstChild)
    {
        taskList.removeChild(taskList.firstChild);
    }

    //Clear from Local Storage
    clearTaskFromLocalStorage();
}

//Clearing Tasks from Local Storage
function clearTaskFromLocalStorage()
{
    localStorage.clear();
}
//Clearing Tasks Ends

//Filtering Tasks Starts
//Filter Tasks
function filterTasks(e)
{
    const text = e.target.value.toLowerCase();

    document.querySelectorAll('.collection-item').forEach(
    function(task)
    {
        const item = task.firstChild.textContent;
        
        if(item.toLowerCase().indexOf(text) != -1)
        {
            task.style.display = 'block';
        }
        else
        {
            task.style.display = 'none';
        }
    });
}
//Filtering Tasks Ends