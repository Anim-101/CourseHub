const app = Vue.createApp({
    data() {
        return {
            showBooks: true,
            title: 'The Final Empire',
            author: 'Brandon Sanderson',
            age: '35'
        }
    },
    methods: {
       toggleShowBooks() {
           this.showBooks = !this.showBooks
       }
    }
})

app.mount('#app')