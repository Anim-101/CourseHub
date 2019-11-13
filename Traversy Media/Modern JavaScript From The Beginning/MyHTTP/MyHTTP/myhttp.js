function myHTTP(){
    this.http = new XMLHttpRequest();
}

// Creating an HTTP GET Request
myHTTP.prototype.get = function(url, callback){
    this.http.open('GET', url, true);

    let captureThis = this;

    this.http.onload = function(){
        if(captureThis.http.status === 200){
            callback(null, captureThis.http.responseText);
        }
        else{
            callback('Error: ' + captureThis.http.status);
        }
    }

    this.http.send();
}

// Creating an HTTP POST Request

myHTTP.prototype.post = function(url, data, callback){
    this.http.open('POST', url, true);
    this.http.setRequestHeader('Content-type', 'application/json');

    let captureThis = this;

    this.http.onload = function(){
        callback(null, captureThis.http.responseText);
    }

    this.http.send(JSON.stringify(data));
}

// Creating an HTTP PUT Request
myHTTP.prototype.put = function(url, data, callback){
    this.http.open('PUT', url, true)
    this.http.setRequestHeader('Content-type', 'application/json');

    let captureThis = this;
    this.http.onload = function(){
        callback(null, captureThis.http.responseText);
    }
    
    this.http.send(JSON.stringify(data));
}
// Creating an HTTP Delete Request
myHTTP.prototype.delete = function(url, callback){
    this.http.open('DELETE', url, true);

    let captureThis = this;

    this.http.onload = function(){
        if(captureThis.http.status === 200){
            callback(null, 'Post Deleted Successfully');
        }
        else{
            callback('Error: ' + captureThis.http.status);
        }
    }

    this.http.send();
}
