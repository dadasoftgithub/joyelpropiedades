<!-- ./src/components/Panel.vue -->
<template>
<div class="wrapper">
  <h2>admin panel test</h2>
  <!-- Searchbar -->
  <b-navbar>
    <b-nav-form>
        <b-form-input type="text" class="mr-sm-2" placeholder="Ingrese su búsqueda" v-model="newSearch"></b-form-input>
      <dada-btn type="submit" class="my-2 my-sm-0"> Buscar <span> &#x1f50d;</span> </dada-btn>
    </b-nav-form>
  </b-navbar>
  <!--Adding a map compoment -->
  <!--  <google-map name="example"></google-map> -->
</div>
</template>

<script>
// import GoogleMap from './Gmap1'
import Button from './Button'
export default {
  data () {
    return {
      newSearch: ''
    }
  },
  components: {
    'dada-btn': Button
  }
}
</script>
<style>
.reset-margin {
  margin-left:0;
  margin-right:0;
}
</style>
<style scoped>
input[type='text'] {
  color: var(--color-dark);
  height: calc(2.25rem + 2px);
  border: 2px solid var(--secondary-color);
  border-radius: 1px;
  padding: 0 1.5rem 0 0.5rem;
  text-overflow: ellipsis;
  white-space: pre-wrap;
  overflow: hidden;
}
input[type='text']::placeholder {
  color: var(--color-dark);
}
input[type='text']:focus {
  border: 2px solid var(--primary-color);
  outline: none;
}
</style>
