<template>
  <div>
    <h1>registro</h1>
    <b-container fluid>
      <b-row>
        <b-col cols="6" class="mx-auto">
          <div class="flip">
            <b-card></b-card>
          </div>
        </b-col>
      </b-row>
    </b-container>
    <div class="face back">
              <div class="panel panel-default">

              <form class="form-horizontal">
                <br>
                <h1 class="text-center">LOGO</h1>
                <br>
                <label>Basic Information</label>
                <input class="form-control" placeholder="Fullname"/>
                <input class="form-control" placeholder="Email"/>
                <label>Private Information</label>
                <input class="form-control" placeholder="Password"/>
                <input class="form-control" placeholder="Mobile Number"/>
                <button class="btn btn-primary btn-block">SIGN UP</button>

                <p class="text-center">
                  <a href="#" class="fliper-btn">Already have an account?</a>
                </p>
              </form>
            </div>

          </div>
  </div>
</template>
