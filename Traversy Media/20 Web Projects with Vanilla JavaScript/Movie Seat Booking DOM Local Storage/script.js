const container = document.querySelector('.container');
const seats = document.querySelectorAll('.row .seat:not(.occupied)');
const count = document.getElementById('count');
const total = document.getElementById('total');
const movieSelect = document.getElementById('movie');

// On Load Bring Back Local Storage Saved Data
populateUIFromLocalStorage();

let movieTicketPrice = +movieSelect.value;

// Movie Select Event
movieSelect.addEventListener('change', e => {

    movieTicketPrice = +e.target.value;

    movieDataSave(e.target.selectedIndex, e.target.value);

    updateSelectedCount();
});

// Seat Event
container.addEventListener('click', e => {

    if (e.target.classList.contains('seat') && !e.target.classList.contains('occupied')) {

        e.target.classList.toggle('selected');

        updateSelectedCount();
    }
});

// Updates Total and Count
function updateSelectedCount() {

    const selectedSeats = document.querySelectorAll('.row .seat.selected');

    const seatsIndex = [...selectedSeats].map((seat) => [...seats].indexOf(seat));

    const selectedSeatsCount = selectedSeats.length;

    localStorage.setItem('selectedSeats', JSON.stringify(seatsIndex));

    count.innerText = " " + selectedSeatsCount + " ";

    total.innerText = selectedSeatsCount * movieTicketPrice;
}

// Saves Selected Movie Index Number and Price
function movieDataSave(movieIndex, moviePrice) {

    localStorage.setItem('selectedMovieIndex', movieIndex);

    localStorage.setItem('selectedMoviePrice', moviePrice);
}

// Populates UI from Saved Local Storage Value
function populateUIFromLocalStorage() {

    const selectedSeats = JSON.parse(localStorage.getItem('selectedSeats'));

    if (selectedSeats !== null && selectedSeats.length > 0) {

        seats.forEach((seat, index) => {

            if (selectedSeats.indexOf(index) > -1) {

                seat.classList.add('selected');
            }
        });
    }

    const selectedMovieIndex = localStorage.getItem('selectedMovieIndex');

    if (selectedMovieIndex !== null) {

        movieSelect.selectedIndex = selectedMovieIndex;
    }
}

// Inital Count and Total Value
updateSelectedCount();