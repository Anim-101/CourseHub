const form = document.getElementById('form');
const userName = document.getElementById('userName');
const email = document.getElementById('email');
const password = document.getElementById('password');
const confirmPassword = document.getElementById('confirmPassword');

form.addEventListener('submit', function (e) {

    e.preventDefault();

    checkElements([userName, email, password, confirmPassword]);

    checkLength(userName, 3, 15);

    checkLength(password, 8, 16);

    checkLength(confirmPassword, 8, 16);

    checkEmail(email);

    checkPasswords(password, confirmPassword);
});

// Checks Elements
function checkElements(elementArray) {

    elementArray.forEach(function (input) {

        if (input.value.trim() === '') {

            showError(input, `${getFieldName(input)} is required`);
        }
        else {

            showSuccess(input);
        }
    });
}

// Checks Required Length
function checkLength(input, min, max) {

    if (input.value.length < min) {

        showError(input, `${getFieldName(input)} must be at least ${min} characters`);
    }
    else if (input.value.length > max) {

        showError(input, `${getFieldName(input)} must be at most ${max} characters`)
    }
    else {

        showSuccess(input);
    }
}

// Checks Email
function checkEmail(input) {

    const regex = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

    if (regex.test(String(input.value).toLowerCase())) {

        showSuccess(input);
    }
    else {

        showError(input, 'Email is not valid');
    }
}

// Checks Passwords Between Two Passwords
function checkPasswords(passwordOne, passwordTwo) {

    if (passwordOne.value !== passwordTwo.value) {

        showError(passwordTwo, 'Passwords do not match');
    }
}

// Gets Required Field Name
function getFieldName(input) {

    return input.id.charAt(0).toUpperCase() + input.id.slice(1).toLowerCase();
}

// Shows Required Errors
function showError(input, message) {

    const formControl = input.parentElement;

    formControl.className = 'form-control error';

    const small = formControl.querySelector('small');

    small.innerText = message;
}

// Shows Possible Successes
function showSuccess(input) {

    const formControl = input.parentElement;

    formControl.className = 'form-control success';
}