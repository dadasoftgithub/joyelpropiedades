<!-- ./src/components/Login.vue -->
<template>
  <div class="login bootstrap">
    <b-container fluid>
      <b-row>
        <b-col md="12" lg="6" class="mx-auto">
          <div class="flip">
            <b-card>
              <div class="face front">
                <div class="panel panel-default">
                  <b-form class="form-horizontal" @submit.prevent="onSubmit">
                    <figure>
                      <img src="./../assets/house.svg" class="img-thumbnail rounded-circle" alt="logotipo" />
                    </figure>
                    <b-form-group id="emailLogin"
                      label="Email"
                      label-for="email">
                      <b-form-input id="email" autocomplete="email" type="email" name="email"  autofocus  class="form-control" placeholder="Ingrese su email" v-model="user.email" v-validate.initial="'email'"  v-bind:class=" {'form-control':true,
                        'error': errors.has('email') } "></b-form-input>
                      <p>
                        <span v-show="errors.has('email')" class="text-danger">
                          {{ errors.first('email') }}
                        </span>
                      </p>
                      <p> {{ user.email }} </p>
                    </b-form-group>

                    <b-form-group id="passwordLogin"
                      label="Password"
                      label-for="password">
                      <b-form-input class="form-control" id="password" type="password" name="password" placeholder="Ingrese su contraseña" autocomplete="current-password" v-model="user.password" v-validate.initial="'required|min:6'" v-bind:class="{'error': errors.has('password')}"></b-form-input>

                      <p><span>{{ user.password }}</span></p>

                      <span v-show="errors.has('password')" class="text-danger">
                        {{ errors.first('password') }}
                      </span>
                    </b-form-group>

                    <b-form-group>
                      <p class="text-right forgot"><a href="">{{ forgotPwd }}</a></p>

                      <b-button type="submit" variant="primary" class="btn-block btn-success">{{ submitMsg }}</b-button>
                      <b-button class="btn-block btn-outline-info" type="submit" v-on:click="login">test panel btn</b-button>

                      <b-alert variant="success">Bienvenido</b-alert>
                    </b-form-group>

                    <hr>
                    <a class="text-center cursor">
                      <router-link to="/registro"  class="fliper-btn">{{ createAccount }}</router-link>
                    </a>
                  </b-form>
                  <!-- <div v-else>
                    <h6 class="submitted">Form submitted successfully!</h6>
                  </div> -->

                </div>

              </div>
            </b-card>
          </div>
        </b-col>
      </b-row>

    </b-container>
  </div>
</template>

// import axios from 'axios'
<script>
import {AXIOS} from './http-common'
// import {Logo} from './common'
export default {
  name: 'login',
  data () {
    return {
      forgotPwd: '¿Olvidaste tu contraseña?',
      submitMsg: 'Ingresar',
      createAccount: '¿Nuevo Usuario?',
      user: {
        email: '',
        password: '',
        formSubmitted: false
      }
    }
  },
  methods: {

    onSubmit: function (e) {
      console.log('this is e ', e)
      this.$validator.validateAll()
      if (!this.errors.any()) {
        this.submitForm()
      }
    },
    submitForm () {
      this.formSubmitted = true
      AXIOS.post(`panel/testsave`, this.user)
        .then((response) => {
          this.response = response.data
          console.log('respuesta es response.data: ', response.data)
          console.log('response STATUS', response.status)
          console.log('response STATUSText', response.statusText)
          console.log('response HEADERS', response.headers)
          console.log('response  CONFIG', response.config)
        })
    },
    login: function () {
      this.$router.replace('testpanel')
    }
  }
}
</script>
<style>

form{
  padding: 20px;
  box-shadow: 0 2px 4px 0 rgba(0,0,0,0.16),0 2px 15px 0 rgba(0,0,0,0.12) !important;
}
.btn{
  border-radius: 0px;
}
  .card {
    background-color: #f5f6f7;
    border: none;
    border-radius: 0;
  }
  .form-control{
    border: 1px solid #ccc;
    border-radius: 1px;
  }
  .form-control.error {
    border-color: #E84444;
    box-shadow: inset 0 1px 1px rgba(0,0,0,.075), 0 0 8px rgba(232,68,68,.6);
  }
  .submitted {
  color: #4fc08d;
  }
</style>

<style scoped>
  figure {
    max-width: 20%;
    margin: 0px auto;
  }
  .cursor {
    cursor: pointer;
  }

</style>
