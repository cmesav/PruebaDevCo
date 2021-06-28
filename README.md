# PruebaDevCo
Este proyecto fue generado para la prueba tecnica de ingreso a DevCo, en la carpeta documentacion se encuentra el plan 
de pruebas y los casos de prueba. 

# Configuracion

Para ejecutar la automatizacion se requiere Realizar algunas configuraciones en las variables de entorno, a
continuacion se explica como realizar dichas configuraciones:

* JDK:
  Instalar el JDK de java, se puede descargar de:
  https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

* IDE:
  Instalar un IDE IntelliJ o eclipse:
  IntelliJ = https://www.jetbrains.com/es-es/idea/download/#section=windows
  Eclipse =  https://www.eclipse.org/downloads

- Instalar el gestor de dependencias (Gradle) desde la url https://gradle.org/install, en la seccion de instalacion manual
  seleccionar "Binary-only", descargar y descomprimir de preferencia directamente en el disco C.

* WEBDRIVER:
- descargar el driver del navegador chrome:
  Se debe descargar segun la version que se tenga del navegador de la siguiente pagina:
  https://chromedriver.chromium.org/downloads
  Se debe descomprimir los archivos y ponerlos en una ruta facil de ubicar( se recomienda hacerlo en el disco C,
  ejemplo : C:\BrowserDrivers)

* VARIABLES DE ENTORNO: (configuracion para windows)
- Para configurar las variables de entorno, en el menu inicio en la barra de busqueda escribir variable, en los resultados
  seleccionar la opcion "editar las variables de entorno del sistema", en las propiedades del sistema en la parte inferior
  selecionar "variables de entorno", allí dependiendo de los permisos sobre el equipo (si se es administrador realizarlo
  en la seccion "variables de entorno del sistema" de lo contrario en "variables de usuario". Se deben generar las
  siguientes variables:

- JAVA_HOME = ruta donde se ha instalado el java, ejemplo "C:\Program Files\Java\jdk1.8.0_281"
- GRADLE_HOME = ruta donde se descomprimio el gradle, ejemplo "C:\Program Files\gradle-6.8"

- Despues de crear ambas variables, buscar la variable Path y editar, allí se deben agregar de la siguiente manera:
  %JAVA_HOME%\bin
  %GRADLE_HOME%\bin.
- Se debe incluir como una variable la ruta donde se almacenaron los drivers, ejemplo: C:\BrowserDrivers.

* VERIFICAR AMBIENTE:
- Para verificar que se realizo la configuracion adecuada de las variables, se debre abrir el simbolo del sistema (CMD) y
  ejecutar los siguientes comandos:

- java -version : mostrara la version java instalada.
- gradle–v : mostrara la version gradle instalada.
- chromedriver: mostrara la version instalada del driver del navegador chrome.
- geckodriver: muestra la version del driver de firefox.

# Ejecución
Para correr la automatización se ejecuta el siguiente comando:

* gradlew clean test -Dpassword="A123456B" -Duser="mesa.cristian@gmail.com"
* las variables password y user en el comando son un ejemplo, puede usarse cualquier par de correo y password registrados.

# Evidencias
- Las evidencias generadas quedan alamacenadas en la siguiente ruta dentro dela carpeta del proyecto:
- \target\site\serenity
- ubicar el index (reporte completo) o serenity-summary (reporte de una sola pagina), al abrir se podra
  visualizar las evidencias generadas.
