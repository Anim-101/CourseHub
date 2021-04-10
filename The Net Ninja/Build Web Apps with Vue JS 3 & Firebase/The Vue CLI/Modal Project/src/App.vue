<template>
  <h1>{{ title }}</h1>
  <p>Welcome...</p>
  <teleport to=".modals" v-if="showModal">
    <Modal :theme="theme" @close="toggleModal">
      <template v-slot:links>
        <a href="#">Sign Up</a>
        <a href="">More Info</a>
      </template>
      <h1>Ninja Giveaway</h1>
      <p>Grab your ninja Swag for half price.</p>
    </Modal>
  </teleport>

  <teleport to=".modals" v-if="showModalTwo">
    <Modal @close="toggleModalTwo">
      <h1>Signed up to newsletter</h1>
      <p>For updates and promo codes.</p>
    </Modal>
  </teleport>

  <button @click.alt="toggleModal">Open Modal (alt)</button>
  <button @click="toggleModalTwo">Open Modal</button>
</template>

<script>
import Modal from './components/Modal.vue'

export default {
  name: 'App',
  components: { Modal },
  data() {
    return {
      title: 'My First Vue Application',
      theme: 'sale',
      // theme: 'asdad',
      showModal: false,
      showModalTwo: false
    }
  },
  methods: {
    toggleModal() {
      this.showModal = !this.showModal
    },
    toggleModalTwo() {
      this.showModalTwo = !this.showModalTwo
    }
  }
}
</script>

<style>
#app, .modals {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
h1 {
  border-bottom: 1px solid #ddd;
  display: inline-block;
  padding-bottom: 10px;
}
</style>
