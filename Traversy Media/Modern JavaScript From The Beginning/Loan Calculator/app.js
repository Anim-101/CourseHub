//Listening for Submit
document.getElementById('loan-form').addEventListener('submit', function(e)
{
    //Hiding Results
    document.getElementById('results').style.display='none';

    //Showing Loader
    document.getElementById('loading').style.display='block';

    setTimeout(calculateResult, 2000);

    e.preventDefault();
});

//Calculate Results
function calculateResult(e)
{
    console.log('Calculating...');

    //UI Variables
    const amount = document.getElementById('amount');
    const interest = document.getElementById('interest');
    const years = document.getElementById('years');

    const monthlyPayment = document.getElementById('monthly-payment');
    const totalPayment = document.getElementById('total-payment');
    const totalInterest = document.getElementById('total-interest');

    const principal = parseFloat(amount.value);
    const calculatedInterest = parseFloat(interest.value) / 100 / 12;
    const calculatedPayment = parseFloat(years.value) * 12;

    //Computing Monthly Payment
    const x = Math.pow(1 + calculatedInterest, calculatedPayment);
    const monthly = (principal * x * calculatedInterest) / (x-1);

    if(isFinite(monthly))
    {
        monthlyPayment.value = monthly.toFixed(2);
        totalPayment.value = (monthly * calculatedPayment).toFixed(2); 
        totalInterest.value = ((monthly * calculatedPayment) - principal).toFixed(2);

        //Showing Results
        document.getElementById('results').style.display='block';

        //Hiding Loader
        document.getElementById('loading').style.display='none';
    }
    else
    {
       showError('Please Check Your Numbers');
    }
}

//Show Error Message
function showError(error)
{

    //Hiding Results
    document.getElementById('results').style.display='none';

    //Hiding Loader
    document.getElementById('loading').style.display='none';

    //Creating a Div
    const errorDiv = document.createElement('div');

    //Getting Elements
    const card = document.querySelector('.card');
    const heading = document.querySelector('.heading');

    //Adding Class
    errorDiv.className = 'alert alert-danger';

    //Creating Text Node and Appending to Div
    errorDiv.appendChild(document.createTextNode(error));

    //Inserting Error above heading
    card.insertBefore(errorDiv, heading);

    //Clearing Error after 3 second
    setTimeout(clearError, 3000);
}

//Clearing Error Message
function clearError()
{
    document.querySelector('.alert').remove();
}