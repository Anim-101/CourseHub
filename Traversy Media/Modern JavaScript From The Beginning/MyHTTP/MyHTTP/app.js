const http = new myHTTP();

// //Getting Posts
// http.get('https://jsonplaceholder.typicode.com/posts', function(error, posts){
//     if(error){
//         console.log(error);
//     }
//     else{
//         console.log(posts);
//     }
// });

// //Getting Single Posts
// http.get('https://jsonplaceholder.typicode.com/posts/1', function(error, post){
//     if(error){
//         console.log(error);
//     }
//     else{
//         console.log(post);
//     }
// });

// Creating Data
const data = {
    title: 'Custom Post',
    body: 'This is a Custom Post'
}

// Creating Post
// http.post('https://jsonplaceholder.typicode.com/posts', data, function(error, post){
//     if(error){
//         console.log(error);
//     }
//     else{
//         console.log(post);
//     }
// });

// Creating Put - Updating Post
// http.put('https://jsonplaceholder.typicode.com/posts/1', data, function(error, post){
//     if(error){
//         console.log(error);
//     }
//     else{
//         console.log(post);
//     }
// });

// Deleting Post
http.delete('https://jsonplaceholder.typicode.com/posts/1', function(error, message){
    if(error){
        console.log(error);
    }
    else{
        console.log(message);
    }
});
