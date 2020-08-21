# Calculadora Web

Esta aplicación usa una implementación de una LinkedList para realizar unas operaciones matematicas
(Media y desviación estandar muestral) y la despliega en Heroku.

### Pre-requisitos

- [Maven](https://maven.apache.org/) : Con esta herramienta se creo la estructura del proyecto y se manejan las dependencias que se necesitan

- [Git](https://git-scm.com/) : Sistema distribuido de manejo de versiones que usaremos tanto en este taller como en lo que resta del curso

Cabe resaltar que es importante que las versiones del JDK de java sean las requeridas para poder instalar
maven ya que si no es actual no se puede instalar las versiones actuales de maven y esto puede desencadenar en problemas
al momento de usar la herramienta.
¿Como revisar la version del JDK?

```
java -version 
```

### Instalación

Para poder instalar el programa debe clonar el repositorio en su maquina local, ejecutando el siguiente comando
en la linea de comandos:

```
https://github.com/cvillamiljr/AREP.git
```
### Ejecución
- Previo a la ejecución del proyecto debe empaquetar el proyecto.
- Acceda a la carpeta linkedList
- Una vez dentro de la carpeta proceda a ejecutar el siguiente comando para empaquetar el proyecto:
```
mvn package
```
- Ya que el proyecto esta empaquetado, proceda a ejecutar el proyecto usando el siguiente comando:
```
java -cp target/linkedList-1.0-SNAPSHOT.jar edu.escuelaing.arem.ASE.app.App
```
Nota: Recuerde que -cp hace referencia al classpath de la clase que se va a ejecutar, en este caso es la clase App.

## Ejecución de pruebas

Una vez se haya ejecutado el proyecto y todo haya salido bien, proceda a ejecutar las pruebas con el siguiente comando:

```
mvn test
```

## Construido con

Este proyecto se llevo a cabo con la ayuda de las siguientes herramientas:
- [Maven](https://maven.apache.org/) : Herramienta para la creacion de la estructura del proyecto y el manejo de las dependencias en el mismo.
- [Git](https://git-scm.com/) : Sistema distribuido de manejo de versiones que usaremos tanto en este taller como en lo que resta del curso

## Author 

- [Cesar Villamil Ramos](https://github.com/cvillamiljr)

## Lincencia

- Este proyecto esta licenciado por GNU General Public License v3.0 .