// Game Values
let  min = 1, max = 10, winningNumber = getRandomNumber(min, max), guessesLeft = 3;

//UI Elements
const game = document.querySelector('#game'),  
      minNum = document.querySelector('.min-num'),
      maxNum = document.querySelector('.max-num'),
      guessButton = document.querySelector('#guess-btn'),
      guessInput = document.querySelector('#guess-input'),
      message = document.querySelector('.message');

//Assigning UI Min and Max
minNum.textContent = min;
maxNum.textContent = max;

//Play Again Even Listener
game.addEventListener('mousedown', function (e)
{
    if(e.target.className === 'play-again')
    {
        window.location.reload();
    }
});

//Listening for Guess
guessButton.addEventListener('click', function()
{
    let guess = parseInt(guessInput.value);

    //Value Validation
    if(isNaN(guess) || guess < min || guess > max)
    {
        if(isNaN(guess))
        {
            setMessage(`Enter Number, Don't Just Click Submit Button!`, 'orange');
        }
        else
        {
            setMessage(`Hush!! Enter a Number between ${min} and ${max}!`, 'olive');
        }
    }

    //Checking if Won
    else if(guess === winningNumber)
    {
        gameOver(true, `${winningNumber} is Correct, You Win!!`);
    }
    else
    {
        //Wrong Number
        guessesLeft -= 1;
        
        if(guessesLeft === 0)
        {
            //Game Over - User Lost

            //Seting Messages to Game Over
            gameOver(false, `Game Over, You Lost. The Correct Number was ${winningNumber}.`);
        }
        else
        {
            //Game Continues - User Provides Wrong Answer

            //Changing Border Color
            guessInput.style.borderColor = 'blue';

            //Clearing Input
            guessInput.value = '';

            //Setting Message
            setMessage(`${guess} is not Correct, ${guessesLeft} Guesses Left.`, 'blue');
        }
    }
});

//Game Over
function gameOver(won, messageGameOver)
{
    let color;
    won === true ? color = 'green' : color = 'red';
    //Disable Input
    guessInput.disabled = true;

    //Changing Border Color
    guessInput.style.borderColor = color;

    //Setting Message
    setMessage(messageGameOver, color);

    //Play Again
    guessButton.value = 'Play Again';
    guessButton.className += 'play-again';
}

//Getting Winning Number
function getRandomNumber(min, max)
{
    return Math.floor(Math.random() * (max - min + 1) + min);
}

//Setting Message
function setMessage(messageValue, color)
{
    message.style.color = color;
    message.textContent = messageValue;
}