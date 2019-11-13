/**
 * MyHTTP Library
 * A Custom Library for making HTTP Requests
 * 
 * @version 0.2
 * @author Anim Akash
 * @license MIT
 */

 class MyHTTP{
    // Making an HTTP GET Request 
    get(url){
        return new Promise((resolve, reject) =>{ 
        fetch(url)
            .then(response => response.json())
            .then(data => resolve(data))
            .catch(error => reject(error));
     });
    }

    // Making an HTTP POST Request
    post(url, data){
        return new Promise((resolve, reject) => {
            fetch(url, {
                method: 'POST',
                headers: {
                    'Content-type': 'application/json'
                },
                body: JSON.stringify(data)
            })
                .then(response => response.json())
                .then(data => resolve(data))
                .catch(error => reject(error));
        });
    }

    // Making an HTTP PUT Request
    put(url, data){
        return new Promise((resolve, reject) => {
            fetch(url, {
                method: 'PUT',
                headers: {
                    'Content-type': 'application/json'
                },
                body: JSON.stringify(data)
            })
                .then(response => response.json())
                .then(data => resolve(data))
                .catch(error => reject(error));
        });
    }

    // Making an HTTP DELETE Request
    delete(url){
        return new Promise((resolve, reject) => {
            fetch(url, {
                method: 'DELETE',
                headers: {
                    'Content-type': 'application/json'
                }
            })
            .then(response => response.json())
            .then(() => resolve('Resource Deletd'))
            .catch(error => reject(error))
        });
    }
}