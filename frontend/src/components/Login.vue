<!-- ./src/components/Login.vue -->
<template>
  <div class="login bootstrap">
    <b-container fluid>
      <b-row>
        <b-col cols="12">
          <h1> {{ welcome }}</h1>
        </b-col>
      </b-row>
      <b-row>
        <b-col md="12" lg="6" class="mx-auto">
          <div class="flip">
            <b-card>
              <div class="face front">
                <div class="panel panel-default">
                  <b-form class="form-horizontal" v-on:submit.prevent="onSubmit">
                    <figure>
                      <img src="./../assets/house.svg" class="img-thumbnail rounded-circle" alt="logotipo" />
                    </figure>
                    <b-form-group id="emailLogin"
                      label="Email"
                      label-for="email">
                      <b-form-input id="email" autocomplete="email" type="email" name="email"  class="form-control" placeholder="ingrese su email" v-model="User.email" v-validate.initial="'email'"  v-bind:class=" {'form-control':true, 'error': errors.has('email') } "></b-form-input>
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
                      <b-form-input class="form-control" id="password" type="password" name="password" placeholder="ingrese su contraseña" autocomplete="current-password" v-model="User.password" v-validate.initial="'required|min:6'" v-bind:class="{'form-control':true, 'error': errors.has('password')}"></b-form-input>

                      <p><span>{{ User.password }}</span></p>

                      <span v-show="errors.has('password')" class="text-danger">
                          {{ errors.first('password') }}
                      </span>
                    </b-form-group>

                    <b-form-group>
                      <p class="text-right forgot"><a href="">{{ forgotPwd }}</a></p>

                      <b-button type="submit" variant="primary" class="btn-block btn-success" :disabled="errors.any()" @click="onSubmit">{{ sendMsg }}</b-button>

                      <b-alert variant="success">Bienvenido</b-alert>
                    </b-form-group>

                    <hr>
                    <a class="text-center cursor">
                      <router-link to="/registro"  tag="span" class="fliper-btn">{{ createAccount }}</router-link>
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
      welcome: 'login',
      forgotPwd: '¿Olvidaste tu contraseña?',
      sendMsg: 'Enviar',
      createAccount: '¿Nuevo Usuario?',
      User: {
        email: '',
        password: ''
      }
    }
  },
  methods: {
    onSubmit: function () {
      // utilizamos el validador de vee validator
      this.$validator.validateAll().then((result) => {
        console.log('form valido', this.User)
        console.log('resultado', result)
        if (!result) {
          alert('error')
          return
        }
        /* let newUser = {
          email: this.User.email,
          name: this.User.password
        } */
        AXIOS.post(`api/hello`, {
          email: this.User.email,
          name: this.User.password
        })
          .then((response) => {
            // this.response = response.data
            console.log('response', response)
          })
      }).catch(e => {
        this.errors.push(e)
      })
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
  .flip .card {
  height: 100%;
  -webkit-transform-style: preserve-3d;
  -webkit-transition: 0.5s;
    transform-style: preserve-3d;
    transition: 0.5s;
  }
  .flip .card .face {
  -webkit-backface-visibility: hidden ;
  backface-visibility: hidden ;
  z-index: 2;
  }
  .flip .card .front {
    position: absolute;
    width: 100%;
    z-index: 1;
  }
  .flip .card .back {
  -webkit-transform: rotatey(-180deg);
  transform: rotatey(-180deg);
  }
  .card {
    border: none!;
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
