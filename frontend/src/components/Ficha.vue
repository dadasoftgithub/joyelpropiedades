<template>
  <div class="wrapper">
    <!-- Content here -->
    <b-row>
      <b-form inline @submit.prevent="onSubmit">
        <b-col cols="sm-12">
            <b-row>
              <div class="inline-group padding-15">
                <label for="fichaSelect">inmueble</label> <br>
                <b-form-select v-model="selected" :options="options" class="mb-3" id="fichaSelect" />
              </div>
              <div class="inline-group  padding-15">
                <label for="superficie">superficie</label> <br>
                <b-form-input type="number" id="superficie"></b-form-input>
              </div>
              <div class="inline-group  padding-15">
                <label for="ambientes">ambientes</label> <br>
                <b-form-input type="number" id="ambientes"></b-form-input>
              </div>
              <div class="inline-group padding-15">
                <label for="piso">piso</label> <br>
                <b-form-input type="text" id="piso"></b-form-input>
              </div>
              <div class="inline-group padding-15">
                <label for="estado">estado</label> <br>
                <b-form-input type="text" id="estado"></b-form-input>
              </div>
            </b-row>
        </b-col>
        <b-col cols="sm-12">
          <b-row>
              <div class="inline-group padding-15">
                <label for="calle">calle</label> <br>
                <b-form-input id="calle"
                  type="text" name="calle"
                  required autofocus
                  placeholder="Ingrese calle" v-model="direccion.calle">
                </b-form-input>
              </div>
              <div class="inline-group padding-15">
                <label for="calle">altura</label> <br>
                <b-form-input id="altura" autofocus
                type="number" v-model="direccion.altura"
                required
                placeholder="Ingrese altura"></b-form-input>
              </div>
              <div class="inline-group padding-15">
                <label for="localidad">localidad</label> <br>
                <b-form-select v-model="selected" :options="options" class="mb-3" id="localidad" />
              </div>
              <div class="inline-group padding-15">
                <b-form-checkbox class="mb-2 mr-sm-2 mb-sm-0" id="credito">apto credito</b-form-checkbox>
              </div>
            </b-row>
          </b-col>
          <b-col cols="sm-12">
            <b-row>
              <div class="inline-group padding-15">
                <label for="textarea1"></label>
                <b-form-textarea id="textarea1"
                  v-model="descripcion"
                  placeholder="Escribe detalle inmueble"
                  :rows="3"
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
      options: [
        { value: null, text: 'Selecciona una opcion' },
        { value: 'a', text: 'Departamento' },
        { value: 'b', text: 'Casa' },
        { value: {'C': '3PO'}, text: 'This is an option with object value' },
        { value: 'd', text: 'This one is disabled', disabled: true }
      ],
      descripcion: '',
      direccion: {
        calle: '',
        altura: ''
      }
    }
  },
  methods: {
    onSubmit: function () {
      alert('form enviada')
    }
  }
}
</script>
<style>
.wrapper {
  border: 1px solid lime;
  margin: 0px auto;
}
.form-inline .inline-group {
  display: inline-block;
  margin-bottom: 0;
  vertical-align: middle;
}
.padding-15{
  padding: 0 15px 0 15px;
}
input, .custom-select, .form-control {
  color: whitesmoke;
  width: 6em;
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
label{
  text-transform: uppercase;
  letter-spacing: 0.2em;
  font-size: 1em;
}
</style>
<style scoped>
.reset-margin {
  margin-left:0;
  margin-right:0;
}
.form-inline {
  justify-content: center;
}
</style>
