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
NOTA: para que el POM de frontend corra con éxito hay que instalar manualmente la dependencia de webpack. Ir a
`````
cd frontend
`````
y luego:
````
npm install webpack --save dev
````
y después hacemos
````
mvn clean install
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

````
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


### INSTALACION DE PREREQUISITOS (WINDOWS)

SI A USTED LE CUESTA USAR LA COMPUTADORA Y POR ESO USA WINDOWS...
-------------------------------------------------------------------


1. descargar el jdk 1.8.161

	http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

2. crear la variable de entorno JAVA_HOME con el full path de donde fue instalado el jdk (solamente hasta el home, justo antes de la carpeta bin)

3. descargar maven

	http://mirrors.dcarsat.com.ar/apache/maven/maven-3/3.5.2/binaries/apache-maven-3.5.2-bin.zip

4. agregar a la variable de entorno PATH el full path de donde esta isntalado maven/bin

5. verifivar que este bien instalado y configurado:

	mvn -v

	deberiamos ver algo asi: (verificar que este bien la version de java y el java_home)

		Apache Maven 3.5.2 (138edd61fd100ec658bfa2d307c43b76940a5d7d; 2017-10-18T04:58:13-03:00)
		Maven home: C:\utils\apache-maven-3.5.2\bin\..
		Java version: 1.8.0_161, vendor: Oracle Corporation
		Java home: C:\Program Files\Java\jdk1.8.0_161\jre
		Default locale: es_AR, platform encoding: Cp1252
		OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"

6. installar git bash

	https://github.com/git-for-windows/git/releases/download/v2.16.1.windows.4/Git-2.16.1.4-64-bit.exe

7. pararse en la carpeta donde se va descargar (clonar) el proyecto

8. clonar el proyecto. ejecutar:

	git clone <url_del_proyecto>

9. entrar a la carpeta

	cd <folder>

10. descargar las actualizaciones del proyecto. ejecutar:

	git pull

11. instalar node.js

	https://nodejs.org/dist/v8.9.4/node-v8.9.4-x64.msi

12. reiniciar la maquina

13. abrir git bash y corroborar la instalacion.

	node -v

	npm -v

14. instalar vue

	npm install --global vue-cli

15. pararse en la carpeta de frontend e

	cd <path_al_directorio_root>/frontend

16. instalar el webpack

	npm install webpack --save-dev

17. nos paramos en el root del proyecto

18. hacemos un clean install

	mvn clean install

19. corremos spring boot
````
	mvn --projects backend spring-boot:run
````


--> RECUERDE: Ante cualquier duda, siempre recuerde que google atiende las 24hs



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

