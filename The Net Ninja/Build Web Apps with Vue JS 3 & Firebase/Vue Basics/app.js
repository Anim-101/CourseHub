const app = Vue.createApp({
    data() {
        return {
            url: 'http://www.thenetninja.co.uk',
            showBooks: true,
            books: [
                { title: 'name of the wind', author: 'patric rothfuss', img: 'assets/1.jpg', isFav: true},
                { title: 'the way of the kings', author: 'brandon sanderson', img: 'assets/2.jpg', isFav: false},
                { title: 'the final empire', author: 'brandon sanderson', img: 'assets/3.jpg', isFav: false}
            ]
            
        }
    },
    methods: {
       toggleShowBooks() {
           this.showBooks = !this.showBooks
       },
    }
})

app.mount('#app')