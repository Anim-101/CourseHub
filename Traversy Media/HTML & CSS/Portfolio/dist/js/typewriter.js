class Typewriter {
  constructor(txtElement, words, wait = 3000) {
    this.txtElement = txtElement;
    this.words = words;
    this.txt = "";
    this.wordIndex = 0;
    this.wait = parseInt(wait, 10);
    this.type();
    this.isDeleting = false;
  }

  type() {
    // Current Index of Word
    const current = this.wordIndex % this.words.length;

    // Getting Full Text of Word
    const fullTxt = this.words[current];

    // Checking If Deleting
    if (this.isDeleting) {
      // Removing Characters
      this.txt = fullTxt.substring(0, this.txt.length - 1);
    } else {
      // Adding Characters
      this.txt = fullTxt.substring(0, this.txt.length + 1);
    }

    // Inserting Text into Element
    this.txtElement.innerHTML = `<span class="txt">${this.txt}</span>`;

    // Initalizing Type Speed
    let typeSpeed = 300;

    if (this.isDeleting) {
      typeSpeed /= 2;
    }

    // Checking If Workds is Complete
    if (!this.isDeleting && this.txt === fullTxt) {
      // Making Pause at End
      typeSpeed = this.wait;

      // Setting Delete to True
      this.isDeleting = true;
    } else if (this.isDeleting && this.txt === "") {
      this.isDeleting = false;

      // Moving to Next Word
      this.wordIndex++;

      typeSpeed = 500;
    }

    setTimeout(() => this.type(), typeSpeed);
  }
}

// Init On Dom Load
document.addEventListener("DOMContentLoaded", init);

// Init App
function init() {
  const txtElement = document.querySelector(".txt-type");
  const words = JSON.parse(txtElement.getAttribute("data-words"));
  const wait = txtElement.getAttribute("data-wait");

  //   Init Typewriter
  new Typewriter(txtElement, words, wait);
}
