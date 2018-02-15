<template>
  <div id="app">
    <!-- <img src="./assets/logo.png"> -->
    <main>
      <b-container>
        <!--<router-view to="/Registro">Registro</router-view> -->
         <router-view></router-view>

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
  margin:0;
  background: #cb2d3e;  /* fallback for old browsers */
  background: -webkit-linear-gradient(to right, #ef473a, #cb2d3e);  /* Chrome 10-25, Safari 5.1-6 */
  background: linear-gradient(to right, #ef473a, #cb2d3e); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
}
.cover {
  background: #2c3e50 url(./assets/cover-login.jpg) center;
  background-size: cover;
  border-radius: 0;
  height: auto;
  width: 100%;
}
</style>
