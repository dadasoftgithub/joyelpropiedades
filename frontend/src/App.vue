<template>
  <div id="app">
    <!-- <img src="./assets/logo.png"> -->
    <main>
      <b-container>
        <router-view to="/Registro">Registro</router-view>
        <!-- <router-view></router-view> -->

      </b-container>
    </main>

  </div>
 </template>

<script>
export default {
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
.cover {
  background: #2c3e50 url(./assets/cover-login.jpg) center;
  background-size: cover;
  border-radius: 0;
  height: auto;
  width: 100%;
}
</style>
