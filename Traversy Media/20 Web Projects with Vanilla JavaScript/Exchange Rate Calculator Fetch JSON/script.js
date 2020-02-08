const currencyElementsOne = document.getElementById('currencyOne');
const currencyElementsTwo = document.getElementById('currencyTwo');
const amountElementOne = document.getElementById('amountOne');
const amountElementTwo = document.getElementById('amountTwo');
const rateElement = document.getElementById('rate');
const swapButton = document.getElementById('swap');

currencyElementsOne.addEventListener('change', calculate);
amountElementOne.addEventListener('input', calculate);
currencyElementsTwo.addEventListener('change', calculate);
amountElementTwo.addEventListener('input', calculate);

// Swaps Selection of Currencies
swapButton.addEventListener('click', () => {

    const temp = currencyElementsOne.value;

    currencyElementsOne.value = currencyElementsTwo.value;

    currencyElementsTwo.value = temp;

    calculate();
});

// Fetch - Exchange Rate and Update Dom
function calculate() {

    const currencyOne = currencyElementsOne.value;
    const currencyTwo = currencyElementsTwo.value;

    fetch(`https://api.exchangerate-api.com/v4/latest/${currencyOne}`)
        .then(res => res.json())
        .then(data => {
            const rate = data.rates[currencyTwo];

            rateElement.innerHTML = `1 ${currencyOne} = ${rate} ${currencyTwo}`

            amountElementTwo.value = (amountElementOne.value * rate).toFixed(2);

        });
}

calculate();
