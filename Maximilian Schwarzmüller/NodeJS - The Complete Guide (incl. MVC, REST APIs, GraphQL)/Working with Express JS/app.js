const express = require('express');

const app = express();

app.use('/', (req, res, next) => {
    console.log('This always run');
    next();
});

app.use('/app-product', (req, res, next) => {
    console.log('In Another Middleware');
    res.send('<h1>Product Page!</h1>')
});

app.use('/', (req, res, next) => {
    console.log('In Another Middleware');
    res.send('<h1>Hello from Express!</h1>')
});

app.listen(3000);