<template>
  <div class="wrapper">
    <!-- Content here -->
    <b-form @submit.prevent="consoleClick">
      <div class="row reset-margin">
        <b-col class="form-group" cols="sm-2
        ">
          <label for="fichaSelect" class="control-label">inmueble</label>
            <br>
          <b-form-select v-model="inmueble" :options="inmuebles" class="form-control" id="fichaSelect" />
           <div>Inmueble Seleccionado: <strong>{{ inmueble }}</strong></div>
        </b-col>
        <b-col class="form-group" cols="sm-2">
          <label for="superficie" class="control-label">superficie</label>
          <b-form-input type="number" number min="0" value="0" v-model.number="superficie" id="superficie" class="form-control dada-input"></b-form-input>
        </b-col>
        <b-col class="form-group" cols="sm-2">
          <label for="ambientes" class="control-label">ambientes</label>
           <b-form-input type="text" id="ambientes" v-model="ambientes"></b-form-input>
        </b-col>
        <b-col class="form-group" cols="sm-2">
          <label for="piso" class="control-label">piso</label>
          <b-form-input type="text" id="piso" v-model="piso"></b-form-input>
        </b-col>
        <b-col class="form-group" cols="sm-2">
          <label for="depto" class="control-label">Depto</label>
           <b-form-input type="text" id="depto" v-model="depto"></b-form-input>
        </b-col>
        <b-col class="form-group" cols="sm-2">
           <label for="estado" class="control-label">estado</label>
           <b-form-select v-model="estado" :options="estados" class="mb-3" id="estado" />
            <div>Estado Seleccionado: <strong>{{ estado }}</strong></div>
        </b-col>

      </div> <!-- row -->
      <div class="row reset-margin">
        <b-col class="form-group" cols="sm-3">
          <label for="calle" class="control-label">calle</label>
          <b-form-input type="text" id="calle" v-model="calle" autocomplete="calle" placeholder="Ingrese calle"></b-form-input>
        </b-col>
        <b-col class="form-group" cols="sm-3">
          <label for="altura" class="control-label">altura</label>
          <b-form-input type="number" min="0" value="0" v-model.number="altura" id="altura" class="form-control dada-input"></b-form-input>
        </b-col>
        <b-col class="form-group" cols="sm-3
        ">
          <label for="localidad" class="control-label">localidad</label>
          <b-form-select v-model="localidad" :options="localidades" class="form-control mb-3" id="localidad" />
           <div>Localidad Seleccionada: <strong>{{ localidad }}</strong></div>
        </b-col>
        <b-col class="form-group" cols="sm-3" align-self="center">
          <b-form-checkbox class="mb-sm-0" id="credito" v-model="apto_credito" true-value="1" false-value="0">apto credito</b-form-checkbox>
        </b-col>
      </div> <!-- row -->

      <div class="row reset-margin">
        <b-col class="form-group" md="6" offset-sm="3" text-center >
          <label for="textarea">descripcion</label>
          <b-form-textarea id="textarea" v-model="descripcion"  placeholder="Escribe detalle inmueble" :rows="5"
          :max-rows="8">
          </b-form-textarea>
        </b-col>
      </div> <!-- row -->
      <div class="row">
        <b-col cols="sm-12 text-right margin-above">
          <dada-btn type="submit">Enviar</dada-btn>
        </b-col>
      </div>
    </b-form>
  </div> <!-- wrapper -->
</template>
<script>
import Button from './Button'
export default {

  data () {
    return {
      inmueble: null,
      inmuebles: [
        {value: null, text: 'Selecciona una opcion'},
        {value: 0, text: 'Departamento'},
        {value: 1, text: 'Casa'},
        {value: {2: '3PO'}, text: 'This is an option with object value'},
        {value: 3, text: 'Cochera'},
        {value: 4, text: 'Local'},
        {value: 5, text: 'Galpon'},
        {value: 6, text: 'This one is disabled', disabled: true}
      ],
      superficie: '',
      ambientes: '',
      piso: '',
      depto: '',
      estado: null,
      estados: [
        { value: null, text: 'Selecciona un estado' },
        { value: '0', text: 'vendido' },
        { value: '1', text: 'reservado' },
        { value: '2', text: 'alquilado' },
        { value: '3', text: 'suspendido' }
      ],
      descripcion: '',
      calle: '',
      altura: '',
      localidad: null,
      localidades: [
        {value: null, text: 'Selecciona una localidad'},
        {value: '0', text: 'Villa del Parque'},
        {value: '1', text: 'Villa Devoto'},
        {value: '2', text: 'Villa Crespo'}
      ],
      apto_credito: false

    }
  },
  // props: ['options'],
  methods: {
    consoleClick: function () {
      console.log('Button clicked en ficha vue')
    }
  },
  components: {
    'dada-btn': Button
  }
}
</script>
<style>

input, .custom-select, .form-control {
  color: var(--color-dark);
  height: calc(2.25rem + 2px);
  /* background: transparent; */
  border: 2px solid var(--secondary-color);
  border-radius: 1px;
  padding: 0 1.5rem 0 0.5rem;
  text-overflow: ellipsis;
  white-space: pre-wrap;
  overflow: hidden;
}
.form-control::placeholder {
  color: var(--color-dark);
}
textarea.form-control {
  height: auto;
}
.form-control:focus{
  border: 2px solid var(--primary-color);
  outline: none;
}

label{
  text-transform: uppercase;
  letter-spacing: 0.2em;
  font-size: var(--font-size);
}
</style>
<style scoped>
.reset-margin {
  margin-left:0;
  margin-right:0;
}
</style>
