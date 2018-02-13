  <template>
    <div>
      <h1>registro</h1>
      <b-container fluid>
        <b-row>
          <b-col md="12" lg="6" class="mx-auto">
            <div class="flip">
              <b-card>
                <div class="face back">
                  <div class="panel panel-default">
                    <b-form class="form-horizontal">
                      <figure>
                        <img src="./../assets/house.svg" class="img-thumbnail rounded-circle" alt="logotipo" />
                      </figure>
                      <label>Información básica</label>
                      <b-form-group id="nameRegistro"
                        label="Nombre"
                        label-for="nombre">
                        <b-form-input id="nombre" class="form-control" placeholder="Ingrese su nombre" type="text" aria-required="true" autocomplete="given-name"></b-form-input>
                      </b-form-group>
                      <b-form-group id="apellidoRegistro"
                        label="Apellido"
                        label-for="apellido">
                        <b-form-input id="apellido" class="form-control" placeholder="Ingrese su apellido" type="text" aria-required="true" autocomplete='family-name'></b-form-input>
                      </b-form-group>
                      <b-form-group id="emailRegistro"
                        label="Email"
                        label-for="email">
                        <b-form-input type="email" id="email" autocomplete="email" aria-autocomplete="email" name="email" class="form-control" placeholder="Ingrese un email" aria-required="true"></b-form-input>
                      </b-form-group>
                      <b-form-group id="passwordRegistro"
                        label="Password"
                        label-for="password">
                        <b-form-input class="form-control" type="password" id="password" name="password" placeholder="Ingresa una contraseña" autocomplete="new-password" aria-required="true">
                        </b-form-input>
                      </b-form-group>
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
  <style scoped>
    figure {
      max-width: 20%;
      margin: 0px auto;
    }

  </style>
