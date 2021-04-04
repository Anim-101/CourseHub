const app = Vue.createApp({
    data() {
        return {
            title: 'The Final Empire',
            author: 'Brandon Sanderson',
            age: '35'
        }
    },
    methods: {
        // changeTitle() {
        //     this.title = 'Words of Radiance'
        // }
        changeTitle(title) {
            this.title = title
        }
    }
})

app.mount('#app')