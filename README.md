### TEMPLATE Para la gestion de bienes raíces.

# Joyelpropiedades


### Arquitectura
```
spring-boot-vuejs
├─┬ backend     → backend module with Spring Boot stuff
│ ├── src
│ └── pom.xml
├─┬ frontend    → frontend module with Vue.js stuff
│ └── pom.xml
└── pom.xml     → Maven parent pom with modules
```

### BACKEND
Las dependencias para spring boot se configuran desde este sitio
https://start.spring.io/
group: ar.com.dadasoft
artifact: app
dependencias:  Web, Actuator, JPA, MySQL

Acerca de CORS
https://spring.io/guides/gs/rest-service-cors/

Links útiles: <br>
https://www.linkedin.com/pulse/vuejs-spring-boot-perfect-combination-simon-martinelli

````
mvn --projects backend spring-boot:run

````

### FRONTEND

#Inicializamos vue con:
```
vue init webpack frontend

```

Una vez que se instala vamos a
```
frontend/config/index.js
```
y modificamos la carpeta final de distribucion
para que todo se direccione a /target.

modificamos:
```
index: path.resolve(__dirname, '../dist/index.html'),
assetsRoot: path.resolve(__dirname, '../dist'),
```
con:
```
index: path.resolve(__dirname, '../target/dist/index.html'),
assetsRoot: path.resolve(__dirname, '../target/dist'),

```

=> Vue.js <br/>
=> Bootstrap 4 <br/>
=> Axios <br/>
=> Vee validate (Vue package)


### INICIALIZACION DEL PROYECTO 1 VEZ
```
mvn clean install
```
instala las dependendecias necesarias para configurar el local

## Corre la aplicacion Spring Boot:
```
mvn --projects backend spring-boot:run
```
En http://localhost:8088/ se levanta la aplicacion

## webpack run dev serve
Para una visualizacion inmediata, webpack actualiza de inmediato cada cambio realizado para poder levanarlo, ir a la carpeta frontend. cd frontend y levantar los siguientes comandos: <br>
```
 npm run dev
```
 Esto corre en el http://localhost:8080/

