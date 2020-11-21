const http = require('http');
const route = require('./route')

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

const server = http.createServer(route.handler);

console.log(route.someText);

server.listen(3000);