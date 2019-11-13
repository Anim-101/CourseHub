class GitFind{
    constructor(){
        this.clientID = '762c963d0970d6f926ab';
        this.clientSecret = 'c30839117a89ce1fa94f94dfe844ccf24cd76d34';
        this.reposCount = 7;
        this.reposSort = 'created: asc';
    }

    async getUser(user){
        const profileResponse = await fetch(`https://api.github.com/users/${user}?client_id=${this.clientID}&client_secret=${this.clientSecret}`);

        const repoResponse = await fetch (`https://api.github.com/users/${user}/repos?per_page=${this.reposCount}&sort=${this.reposSort}&client_id=${this.clientID}&client_secret=${this.clientSecret}`);

        const profile = await profileResponse.json();

        const repos = await repoResponse.json();

        return{
            profile,
            repos
        }
    }
}