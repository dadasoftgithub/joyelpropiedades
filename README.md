# joyelpropiedades

# TEMPLATE Para la gestion de bienes raíces.

### Arquitectura

spring-boot-vuejs
├─┬ backend → backend module with Spring Boot stuff
│ ├── src
| | └── controller
| | └── domain
│ └── pom.xml
├─┬ frontend → frontend module with Vue.js stuff
│ └── pom.xml
└── pom.xml → Maven parent pom with modules

### BACKEND
Las dependencias para spring boot se configuran desde este sitio
https://start.spring.io/
group: ar.com.dadasoft
artifact: app
dependencias:  Web, Actuator, JPA, MySQL
### FRONTEND

#Inicializamos vue con:
vue init webpack frontend

Una vez que se instala vamos a 
frontend/config/index.js y modificamos la carpeta final de distribucion
para que todo se direccione a /target.

modificamos:
index: path.resolve(__dirname, '../dist/index.html'),
assetsRoot: path.resolve(__dirname, '../dist'),

con:
index: path.resolve(__dirname, '../target/dist/index.html'),
assetsRoot: path.resolve(__dirname, '../target/dist'),

=> Vue.js <br/>
=> Bootstrap 4 <br/>
=> Axios <br/>
=> Vee validate (Vue package)

