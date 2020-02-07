const video = document.getElementById('video');
const playButton = document.getElementById('play');
const stopButton = document.getElementById('stop');
const progress = document.getElementById('progress');
const timeStamp = document.getElementById('timeStamp');

video.addEventListener('click', toggleVideoStatus);
video.addEventListener('pause', updatePlayIcon);
video.addEventListener('play', updatePlayIcon);
video.addEventListener('timeupdate', updateProgress);

playButton.addEventListener('click', toggleVideoStatus);

stopButton.addEventListener('click', stopVideo);

progress.addEventListener('change', setVideoProgress);

// Play - Pause Video
function toggleVideoStatus() {

    if (video.paused) {

        video.play();
    }
    else {

        video.pause();
    }
}

// Update Play - Pause Icon
function updatePlayIcon() {

    if (video.paused) {

        playButton.innerHTML = '<i class="fa fa-play fa-2x"></i>';
    }
    else {

        playButton.innerHTML = '<i class="fa fa-pause fa-2x"></i>';
    }
}

// Update Progress and TimeStamp
function updateProgress() {

    progress.value = (video.currentTime / video.duration) * 100;

    let min = Math.floor(video.currentTime / 60);

    if (min < 10) {

        min = '0' + String(min);
    }

    let sec = Math.floor(video.currentTime % 60);

    if (sec < 10) {

        sec = '0' + String(sec);
    }

    timeStamp.innerHTML = `${min}:${sec}`;
}

// Set Video Progress
function setVideoProgress() {

    video.currentTime = (+progress.value * video.duration) / 100;
}

// Stop Video
function stopVideo() {

    video.currentTime = 0;

    video.pause();
}