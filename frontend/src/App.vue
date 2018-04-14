<template>
  <div id="app">
    <AppHeader/>
    <main>
      <b-container fluid>
         <router-view></router-view>
      </b-container>
    </main>
  </div>
</template>

<script>
import AppHeader from './components/AppHeader'

export default {
  name: 'App',
  components: {
    AppHeader
  }
}
</script>

<style>
:root {
  --primary-color: #ef2f72;
  --secondary-color: #715d9d;
  --tertiary-color: #fdc800;
  --color-light:#f2f2f2;
  --color-dark: #6c757d; /* #2c3e50 */
  --secondary-gradient: #6F1635;
  --font-size:1rem;
  --header-bg: #F5F6F7;
}
.wrapper {
     background: var(--color-light);
}
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  margin:0;
  background: var(--primary-color);  /* fallback for old browsers  #cb2d3e */
  background: -webkit-linear-gradient(to right, var(--secondary-gradient), var(--primary-color));  /* Chrome 10-25, Safari 5.1-6 */
  background: linear-gradient(to right, var(--secondary-gradient), var(--primary-color)); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
  position: relative;
  min-height:100%;
  height: 900px;
 }
.cover {
  background: #2c3e50 url(./assets/cover-login.jpg) center;
  background-size: cover;
  border-radius: 0;
  height: auto;
  width: 100%;
}

</style>
