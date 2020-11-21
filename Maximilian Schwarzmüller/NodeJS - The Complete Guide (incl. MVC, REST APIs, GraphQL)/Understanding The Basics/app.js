const http = require('http');
const fs = require('fs');

// function rqListener(req, res) {

// }

// http.createServer(function(req, res) {

// });

// const server = http.createServer((req, res) => {
//     console.log(req.url, req.method, req.headers)
//     // process.exit();
//     res.setHeader('Content-Type', 'text/html');
//     res.write('<html>');
//     res.write('<head><title>My First Page</title></head>');
//     res.write('<body><h1>Hello From My Server</h1></body>');
//     res.write('</html>');
//     res.end();
// });

// server.listen(3000);

const server = http.createServer((req, res) => {
   const url = req.url;
   const method = req.method;

   if(url === '/'){
     res.write('<html>');
     res.write('<head><title>My First Page</title></head>');
     res.write('<body><form action="/message" method="POST"><input type="text" name="message"><button type="submit">Send</button></body>');
     res.write('</html>');
     return res.end();
   }

   if(url === '/message' && method === 'POST') {
     const body = [];

     req.on('data', (chunk) => {
          console.log(chunk);
          body.push(chunk);
     });
     return req.on('end', () => {
          const parsedBody = Buffer.concat(body).toString();
          const message = parsedBody.split('=')[1];
          fs.writeFile('message.txt', message, () => {
                // res.writeHead(302, {});
               res.statusCode = 302;
               res.setHeader('Location', '/');
               return res.end();
          });
     });
   }

    res.setHeader('Content-Type', 'text/html');
    res.write('<html>');
    res.write('<head><title>My First Page</title></head>');
    res.write('<body><h1>Hello From My Server</h1></body>');
    res.write('</html>');
    res.end();
});

server.listen(3000);