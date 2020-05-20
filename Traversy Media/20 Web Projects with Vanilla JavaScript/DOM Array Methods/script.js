const main = document.getElementById('main');
const addUserButton = document.getElementById('addUser');
const doubleButton = document.getElementById('double');
const showMillionairesButton = document.getElementById('showMillionaires');
const sortButton = document.getElementById('sort');
const calculateWealthButton = document.getElementById('calculateWealth');

let data = [];

getRandomUser();
getRandomUser();
getRandomUser();

// Fetching Randomg Users and Adding Money
async function getRandomUser() {
    const res = await fetch('https://randomuser.me/api');

    const data = await res.json();

    const user = data.results[0];

    const newUser = {
        name: `${user.name.first} ${user.name.last}`,
        money: Math.floor(Math.random() * 1000000)
    };

    addData(newUser);
}

// Doubling User's Money
function doubleMoney() {
    data = data.map((user) => {
        return { ...user, money: user.money * 2 }
    });

    updateDOM();
}

// Sorting Users by Richest
function sortByRichest() {
    data.sort((a, b) => b.money - a.money);

    updateDOM();
}

// Showing Millionaires Users
function showMillionaires() {
    data = data.filter(user => user.money > 1000000);

    updateDOM();
}

// Calculating Wealth
function calculateWealth() {
    const wealth = data.reduce((acc, user) => (acc += user.money), 0);

    const wealthElement = document.createElement('div');

    wealthElement.innerHTML = `<h3>Total Wealth: <strong>${formatMoney(wealth)}</strong></h3>`;

    updateDOM();

    main.appendChild(wealthElement);
}

// Adding new Object to Data Array
function addData(object) {
    data.push(object);

    updateDOM();
}

// Updating DOM
function updateDOM(grabData = data) {

    // Clearning Main Div
    main.innerHTML = '<h2><strong>Person</strong> Wealth</h2>';

    grabData.forEach((item) => {
        const element = document.createElement('div');

        element.classList.add('person');

        element.innerHTML = `<strong>${item.name}</strong> ${formatMoney(item.money)}`;

        main.appendChild(element);

    });
}

// Formate Numbers as Money
function formatMoney(number) {
    return '$' + number.toFixed(2).replace(/\d(?=(\d{3})+\.)/g, '$&,');
}

// Event Listeners
addUserButton.addEventListener('click', getRandomUser);

doubleButton.addEventListener('click', doubleMoney);

sortButton.addEventListener('click', sortByRichest);

showMillionairesButton.addEventListener('click', showMillionaires);

calculateWealthButton.addEventListener('click', calculateWealth);