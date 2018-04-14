<template>
  <b-button class="button dada-btn" @click="onClick">
    <slot>Button</slot>
  </b-button>
</template>
<script>
export default {
  name: 'dada-btn',
  props: {
    /* we are giving our Button component a prop of onClick. We're telling Vue to validate the value passed in by using the type property and passing it the value of Function. This will cause Vue to throw a useful error in your development environment if a value of a different type is given. We are also telling Vue that this prop should always exist using required as a button component without a click event is fairly useless. */
    onClick: {
      type: Function,
      default: () => {}
    }
  }
}
</script>
<style scoped>
.dada-btn {
  height: calc(2.25rem + 2px);
  background: transparent;
  border: 2px solid var(--secondary-color);
  border-radius: 1px;
  padding: 0 1.5em 0 0.5em;
  color: var(--secondary-color);
  text-shadow: var(--shadow);

  --shadow:
 0 1px 1px rgba(0, 0, 0, 0.2);
}
.dada-btn:hover {
   background: var(--secondary-color);
   color: var(--color-light);
}

</style>
