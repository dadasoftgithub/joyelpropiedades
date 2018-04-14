<!-- ./src/components/Header.vue -->
<template>
  <header class="appHeader container-fluid" >
    <b-navbar toggleable="md" type="dark">
        <b-navbar-toggle target="nav_collapse"></b-navbar-toggle>
         <b-navbar-brand href="#" left>
             <logo></logo>
         </b-navbar-brand>

         <!-- Right aligned nav items -->
        <b-navbar-nav class="ml-auto">
          <b-nav-item-dropdown right>
          <template slot="button-content">
            <img src="./../assets/bigpanda.svg" class="img-thumbnail rounded-circle img-avatar" alt="admin@bootstrapmaster.com" >
          </template>
          <b-dropdown-item>Cerrar sesión</b-dropdown-item>
         </b-nav-item-dropdown>
        </b-navbar-nav>

    </b-navbar>
  </header>
</template>

<script>
import {Logo} from './common'
export default {
  name: 'AppHeader',
  components: {
    Logo
  }
}
</script>
<style>
.appHeader{
  background: var(--header-bg);
  margin-bottom: 5%;
  box-shadow: 0 1px 1px rgba(0,0,0,0.1);
}
li {
  list-style: none;
}
</style>
