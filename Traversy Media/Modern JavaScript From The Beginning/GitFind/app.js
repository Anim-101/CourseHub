// Initializing GitFind Class
const gitfind = new GitFind;

// Initializing UI Class
const ui = new UI;

// Searching input
const searchUser = document.getElementById('searchUser');

// Event listener to searchUser
searchUser.addEventListener('keyup', (e) => {
    // Getting Text
    const userText = e.target.value;

    if(userText !== ''){
        // Making HTTP Call
        gitfind.getUser(userText)
            .then(data => {
               if(data.profile.message === 'Not Found'){
                    // Showing Alert
                    ui.showAlert('User Not Found', 'alert alert-danger');
               }
               else{
                    //Showing Profile
                    ui.showProfile(data.profile);
                    ui.showRepos(data.repos);
               }
            });
    }
    else{
        // Clearing Profile
        ui.clearProfile();
    }
});