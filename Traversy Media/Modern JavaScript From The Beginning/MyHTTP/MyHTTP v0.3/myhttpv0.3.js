/**
 * MyHTTP Library
 * A Custom Library for Making HTTP Request
 * 
 * @version 0.3
 * @author Anim Akash
 * @license MIT
 */

 class MyHTTP{
     // Making an HTTP GET Request
     async get(url){
       const response = await fetch(url);
       const responseData = await response.json();
       return responseData;
     }

     // Making an HTTP POST Request
     async post(url, data){
         const response = await fetch(url, {
                method: 'POST',
                headers: {
                    'Content-type': 'application/json'
                },
                body: JSON.stringify(data)
            });

         const responseData = await response.json();
         return responseData;
     }
     
     // Making an HTTP PUT Request
     async put(url, data){
         const response = await fetch(url, {
             method: 'PUT',
             headers: {
                 'Content-type': 'application/json'
             }
         });

         const responseData = await response.json();
         return responseData;
     }

     // Making an HTTP DELETE Request
     async delete(url){
         const response = await fetch(url, {
            method: 'DELETE',
            headers: {
                'Content-type': 'application/json'
            }
         });

         const responseData = await 'Resource Deleted';
         return responseData;
     }
}