const http = new MyHTTP();

// Getting Users
// http.get('https://jsonplaceholder.typicode.com/users')
//     .then(data => console.log(data))
//     .catch(error => console.log(error));

// User Data
const data = {
    name: 'Anim Akash',
    username: 'Anim_101',
    email: 'anmaksh@gmail.com'
}

// Creating User
// http.post('https://jsonplaceholder.typicode.com/users', data)
//     .then(data => console.log(data))
//     .catch(error => console.log(error));

// Updating User
// http.put('https://jsonplaceholder.typicode.com/users/2', data)
//     .then(data => console.log(data))
//     .catch(error => console.log(error));

// Deleting User
http.delete('https://jsonplaceholder.typicode.com/users/2')
    .then(data => console.log(data))
    .catch(error => console.log(error));