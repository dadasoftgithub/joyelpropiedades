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
                  <b-form class="form-horizontal" @submit.prevent="validateBeforeSubmit">
                    <figure>
                      <img src="./../assets/house.svg" class="img-thumbnail rounded-circle" alt="logotipo" />
                    </figure>
                    <b-form-group id="emailLogin"
                      label="Email"
                      label-for="email">
                      <b-form-input id="email" autocomplete="email" type="email" name="email"  autofocus  class="form-control" placeholder="Ingrese su email" v-model="User.email" v-validate.initial="'email'"  v-bind:class=" {'form-control':true,
                        'error': errors.has('email') } "></b-form-input>
                      <p>
                        <span v-show="errors.has('email')" class="text-danger">
                          {{ errors.first('email') }}
                        </span>
                      </p>
                      <p> {{ User.email }} </p>
                    </b-form-group>

                    <b-form-group id="passwordLogin"
                      label="Password"
                      label-for="password">
                      <b-form-input class="form-control" id="password" type="password" name="password" placeholder="Ingrese su contraseña" autocomplete="current-password" v-model="User.password" v-validate.initial="'required|min:6'" v-bind:class="{'form-control':true, 'error': errors.has('password')}"></b-form-input>

                      <p><span>{{ User.password }}</span></p>

                      <span v-show="errors.has('password')" class="text-danger">
                        {{ errors.first('password') }}
                      </span>
                    </b-form-group>

                    <b-form-group>
                      <p class="text-right forgot"><a href="">{{ forgotPwd }}</a></p>

                      <b-button type="submit" variant="primary" class="btn-block btn-success" :disabled="errors.any()" @click="validateBeforeSubmit">{{ submitMsg }}</b-button>
                      <b-button class="btn-block btn-outline-info" type="button" v-on:click="login">connection btn</b-button>

                      <b-alert variant="success">Bienvenido</b-alert>
                    </b-form-group>

                    <hr>
                    <a class="text-center cursor">
                      <router-link to="/registro"  class="fliper-btn">{{ createAccount }}</router-link>
                    </a>
                  </b-form>
                </div>
              </div>
            </b-card>
          </div>
        </b-col>
      </b-row>
    </b-container>
  </div>
</template>

<script>
import {AXIOS} from './http-common'
// import axios from 'axios'
export default {
  name: 'login',
  data () {
    return {
      forgotPwd: '¿Olvidaste tu contraseña?',
      submitMsg: 'Ingresar',
      createAccount: '¿Nuevo Usuario?',
      User: {
        email: '',
        password: ''
      }
    }
  },
  methods: {
    validateBeforeSubmit () {
      // utilizamos el validador de vee validator
      this.$validator.validateAll().then((result) => {
        if (result) {
          alert('form submitted!')
          console.log('form valido', this.User, result)
          return
        }
        alert('correct the form there are errors')
      })
    },
    onSubmit: function () {
      AXIOS.post(`api/hello`, {
        email: this.User.email,
        name: this.User.password
      })
        .then((response) => {
        // this.response = response.data
          console.log('response', response)
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
    border: none;
  }
  .form-control.error {
    border-color: #E84444;
    box-shadow: inset 0 1px 1px rgba(0,0,0,.075), 0 0 8px rgba(232,68,68,.6);
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
