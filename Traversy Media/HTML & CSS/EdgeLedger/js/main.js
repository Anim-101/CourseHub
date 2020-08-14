function initMap() {
  const location = { lat: 42.361145, lng: -71.057083 };
  const map = new google.maps.Map(document.querySelector(".map"), {
    zoom: 14,
    center: location,
  });

  const marker = new google.maps.Marker({ postion: location, map: map });
}

// Navbar Transition
window.addEventListener("scroll", function () {
  if (window.scrollY > 150) {
    document.querySelector("#navbar").style.opacity = 0.9;
  } else {
    document.querySelector("#navbar").style.opacity = 1;
  }
});

// Scrolling Smooth
$("#navbar a, .btn").on("click", function (event) {
  if (this.hash !== "") {
    event.preventDefault();

    const hash = this.hash;

    $("html, body").animate(
      {
        scrollTop: $(hash).offset().top - 100,
      },
      800
    );
  }
});
