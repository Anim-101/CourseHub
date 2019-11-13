//Get Jokes Button Even Listeners
document.querySelector('.get-jokes').addEventListener('click', getJokes);

//Get Jokes Function
function getJokes(e){
    const number = document.querySelector('#jokes-number').value;

    //Checking Number for Empty or Negative Input, Otherwise Generate Jokes
    if(number < 1){
        console.log(number);
            //Creating Div to Show Messages
            const div = document.createElement('div');
    
            //Adding Class to New Div
            div.className = 'alert error';
    
            //Adding Text
            div.appendChild(document.createTextNode("Can't!! Insert number"));
    
            //Getting Main Class of HTML
            const container = document.querySelector('.container');
    
            //Grabbing Form ID to Use
            const form = document.querySelector('#jokes-form');
    
            //Inserting Error Message
            container.insertBefore(div, form);
    
            //Timeout for Error message
            setTimeout(function(){
                document.querySelector('.alert').remove();
            }, 1500);
    }
    else{
        //Openning XMLHttpRequest Method
        const xhr = new XMLHttpRequest();

        xhr.open('GET', `http://api.icndb.com/jokes/random/${number}`, true);

        //Onload Function to Generate Jokes on HTML Page
        xhr.onload = function(){
            if(this.status === 200){
                const response = JSON.parse(this.responseText);
                
                //Storing Values if it has otherwise Stores a Message
                let output = '';
    
                if(response.type === 'success'){                    
                    response.value.forEach(function(joke){
                        output += `
                            <li>${joke.joke}</li>
                        `;
                    });  
                }
                else{
                    output += '<li>Something is Wrong!</li>';
                }
    
                document.querySelector('.jokes').innerHTML = output;
            }
        }

        xhr.send();
    }

    e.preventDefault();
}
