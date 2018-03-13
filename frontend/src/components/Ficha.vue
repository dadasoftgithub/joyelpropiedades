<template>
  <div class="wrapper">
    <!-- Content here -->
    <b-row>
      <b-form class="form-inline" @submit.prevent="onSubmit">
        <b-col cols="sm-12">
            <b-row>
              <div class="inline-group padding-15 w-20 centerContent">
                <label for="fichaSelect" class="text-center">inmueble</label> <br>
                <b-form-select v-model="selected" :options="inmuebles" class="mb-3" id="fichaSelect" />
              </div>
              <div class="inline-group  padding-15 w-20 centerContent">
                <label for="superficie" class="text-center">superficie</label> <br>
                <b-form-input type="number" number min="0" v-model="superficie" id="superficie"></b-form-input>
              </div>
              <div class="inline-group  padding-15 w-20 centerContent">
                <label for="ambientes" class="text-center">ambientes</label> <br>
                <b-form-input type="text" id="ambientes" v-model="cantAmbiente"></b-form-input>
              </div>
              <div class="inline-group padding-15 w-20 centerContent">
                <label for="piso" class="text-center">piso</label> <br>
                <b-form-input type="text" id="piso" v-model="piso"></b-form-input>
              </div>
              <div class="inline-group padding-15 w-20 centerContent">
                <label for="estado" class="text-center">estado</label> <br>
                <b-form-select v-model="selected" :options="idEstado" class="mb-3" id="estado" />
              </div>
            </b-row>
        </b-col>
        <b-col cols="sm-12">
          <b-row>
              <div class="inline-group padding-15 centerContent">
                <label for="calle" class="text-center">calle</label> <br>
                <b-form-input id="calle"
                  type="text" name="calle"
                  required autofocus aria-required="true" autocomplete="address-line1"
                  placeholder="Ingrese calle" v-model="direccion.calle">
                </b-form-input>
              </div>
              <div class="inline-group padding-15 centerContent">
                <label for="calle" class="text-center">altura</label> <br>
                <b-form-input id="altura" autofocus
                type="number" v-model="direccion.altura"
                required min="0"
                placeholder="Ingrese altura"></b-form-input>
              </div>
              <div class="inline-group padding-15 centerContent">
                <label for="localidad" class="text-center">localidad</label> <br>
                <b-form-select v-model="selected" :options="idLocalidad" class="mb-3" id="localidad" />
              </div>
              <div class="inline-group padding-15 centerContent">
                <b-form-checkbox class="mb-2 mr-sm-2 mb-sm-0" id="credito" v-model="apto_credito" true-value="1" false-value="0">apto credito</b-form-checkbox>
              </div>
            </b-row>
          </b-col>
          <b-col cols="sm-12">
            <b-row>
              <div class="inline-group padding-15 descripcion centerContent">
                <label for="textarea1" class="text-center">descripcion</label>
                <b-form-textarea id="textarea1"
                  v-model="descripcion"
                  placeholder="Escribe detalle inmueble"
                  :rows="10"
                  :max-rows="6">
                </b-form-textarea>
              </div>
            </b-row>
          </b-col>
      </b-form>
    </b-row>
  </div>
</template>
<script>
export default {

  data () {
    return {
      selected: null,
      inmuebles: [
        {value: null, text: 'Selecciona una opcion'},
        {value: '0', text: 'Departamento'},
        {value: '1', text: 'Casa'},
        {value: {'2': '3PO'}, text: 'This is an option with object value'},
        {value: '3', text: 'Cochera'},
        {value: '4', text: 'Local'},
        {value: '5', text: 'Galpon'},
        {value: '6', text: 'This one is disabled', disabled: true}
      ],
      superficie: '',
      cantAmbiente: '',
      piso: '',
      idEstado: [
        { value: null, text: 'Selecciona un estado' },
        { value: '0', text: 'vendido' },
        { value: '1', text: 'reservado' },
        { value: '2', text: 'alquilado' },
        { value: '3', text: 'suspendido' }
      ],
      descripcion: '',
      direccion: {
        calle: '',
        altura: ''
      },
      idLocalidad: [
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
    onSubmit: function () {
      alert('form enviada')
    }
  }
}
</script>
<style>
.centerContent {
  margin:0px auto;
}
.wrapper {
  border: 1px solid lime;
}
.form-inline .inline-group {
  display: inline-block;
  margin-bottom: 0;
  vertical-align: middle;
}
.padding-15{
  padding: 0 15px 0 15px;
}
.padding-15:first-child {
  padding: 0;
}
input, .custom-select, .form-control {
  color: whitesmoke;
  /* width: 6em; */
  height: calc(2.25rem + 2px);
  background: transparent;
  border: 2px solid #fff;
  border-radius: 1px;
  padding: 0 1.5em 0 0.5em;
  text-overflow: ellipsis;
  white-space: nowrap;
  overflow: hidden;
}
.form-control::placeholder {
  color: whitesmoke;

}
select.form-control:not([size]):not([multiple]) {
width: 90%;
}
label{
  text-transform: uppercase;
  letter-spacing: 0.2em;
  font-size: 1em;
}
</style>
<style scoped>

.w-20 {
  width:20%;
}
.reset-margin {
  margin-left:0;
  margin-right:0;
}
.form-inline {
  justify-content: center;
}
</style>
