<template>
  <div class="wrapper">
    <!-- Content here -->
    <b-form @submit.prevent="submitForm">
      <div class="row reset-margin">
        <b-col class="form-group" cols="sm-2
        ">
          <label for="fichaSelect" class="control-label">inmueble</label>
            <br>
          <b-form-select v-model="idTipoPropiedad" :options="inmuebles" class="form-control" id="fichaSelect" />
           <div>Inmueble Seleccionado: <strong>{{ idTipoPropiedad }}</strong></div>
        </b-col>
        <b-col class="form-group" cols="sm-2">
          <label for="superficie" class="control-label">superficie</label>
          <b-form-input type="number" number min="0" value="0" v-model.number="superficie" id="superficie" class="form-control dada-input"></b-form-input>

        </b-col>
        <b-col class="form-group" cols="sm-2">
          <label for="cantAmbiente" class="control-label">ambientes</label>
           <b-form-input type="text" id="ambientes" v-model="cantAmbiente"></b-form-input>
           <p>{{cantAmbiente}}</p>
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
           <b-form-select v-model="idEstado" :options="estados" class="mb-3" id="estado" />
            <div>Estado Seleccionado: <strong>{{ idEstado }}</strong></div>
        </b-col>

      </div> <!-- row -->
      <div class="row reset-margin">
        <b-col class="form-group" cols="sm-3">
          <label for="calle" class="control-label">calle</label>
          <b-form-input type="text" id="calle" v-model="calle" autocomplete="calle" placeholder="Ingrese calle"></b-form-input>
        </b-col>
        <b-col class="form-group" cols="sm-2">
          <label for="altura" class="control-label">altura</label>
          <b-form-input type="number" min="0" value="0" v-model.number="altura" id="altura" class="form-control dada-input"></b-form-input>
        </b-col>
        <b-col class="form-group" cols="sm-3
        ">
          <label for="localidad" class="control-label">localidad</label>
          <b-form-select v-model="idLocalidad" :options="localidades" class="form-control mb-3" id="localidad" />
           <div>Localidad Seleccionada: <strong>{{ idLocalidad }}</strong></div>
        </b-col>
        <b-col class="form-group" cols="sm-2" align-self="center">
          <b-form-checkbox class="mb-sm-0" id="credito" v-model="aptoCredito" true-value="1" false-value="0">apto credito</b-form-checkbox>
        </b-col>
         <b-col class="form-group" cols="sm-2">
          <label for="importe" class="control-label">importe</label>
          <b-input-group size="lg" prepend="$" append=".00">
          <b-form-input type="number" min="0" value="0" v-model.number="importe" id="importe" class="form-control dada-input"></b-form-input>
          </b-input-group>
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
import { AXIOS } from './http-common'
export default {

  data () {
    return {
      esVenta: 1, /* 1 venta    0=alquiler */
      idTipoPropiedad: null,
      inmuebles: [
        {value: null, text: 'Selecciona una opcion'},
        {value: 2, text: 'Departamento'},
        {value: 3, text: 'Casa / Duplex'},
        {value: 4, text: 'Tipo Casa'},
        {value: 5, text: 'Local / Galpon'},
        {value: 6, text: 'Lote / Terreno'},
        {value: 7, text: 'This one is disabled', disabled: true}
      ],
      superficie: '',
      cantAmbiente: '',
      piso: '',
      depto: '',
      idEstado: null,
      estados: [
        { value: null, text: 'Selecciona un estado' },
        { value: 1, text: 'Publicado' },
        { value: 2, text: 'Reservado' },
        { value: 3, text: 'Suspendido' },
        { value: 4, text: 'Operado' }
      ],
      calle: '',
      altura: '',
      idLocalidad: null,
      localidades: [
        {value: null, text: 'Selecciona una localidad'},
        {value: 36, text: 'Villa Crespo', disabled: true},
        {value: 37, text: 'Villa del Parque'},
        {value: 38, text: 'Villa Devoto'},
        {value: 41, text: 'Villa Luro'}
      ],
      aptoCredito: false, /* 0 false, 1 true */
      importe: '',
      descripcion: ''
    }
  },
  // props: ['options'],
  methods: {
    submitForm: function (event) {
      console.log('Button clicked en ficha vue event', event)
      AXIOS.post(`panel/saveInmueble`, {
        esVenta: this.esVenta,
        idTipoPropiedad: this.idTipoPropiedad,
        superficie: this.superficie,
        cantAmbiente: this.cantAmbiente,
        piso: this.piso,
        depto: this.depto,
        idEstado: this.idEstado,
        calle: this.calle,
        altura: this.altura,
        idLocalidad: this.idLocalidad,
        aptoCredito: this.aptoCredito,
        importe: this.importe,
        descripcion: this.descripcion
      }).then((response) => {
        this.response = response.data
        console.log('respuesta es response.data: ', response.data)
        console.log('response STATUS', response.status)
        console.log('response STATUSText', response.statusText)
        console.log('response HEADERS', response.headers)
        console.log('response  CONFIG', response.config)
      })
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
