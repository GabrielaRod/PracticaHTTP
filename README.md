# Internet Avanzado
### Creación Cliente HTTP – Apache Components
Práctica #1
## Objetivo:
* Trabajar con el protocolo HTTP mediante la librería Apache Components y la
librería JSOAP.
* Trabajar con gestión de proyectos basado en Gradle.
## Desarrollo de la práctica.
El estudiante realizará cada uno de los ejercicios planteado en dicho
documento. El proyecto proceso de la realización de la práctica debe estar
evidenciado en el control de versiones bajo la tecnología Git. La práctica será
individual.
## Forma de Entrega:
La entrega de la práctica se realizará un reporte conjuntamente con el envío la
asignación al servidor de versiones. Debe ser entregada el 16/05/2019.

## Desarrollo
En un proyecto basado en Gradle y utilizando la librería de Apache
Components, específicamente el modulo HTTP Client 4.4
(http://hc.apache.org/) o la librería JSOAP (http://jsoup.org/), estaremos
interpretador la trama HTML y aplicando las siguientes:

Crea un programa por consola que pida por la entrada estándar una URL
valida, una vez consultada realice las siguientes operaciones:

a) Indicar la cantidad de lineas del recurso retornado.

b) Indicar la cantidad de párrafos (p) que contiene el documento HTML.

c) Indicar la cantidad de imágenes (img) dentro de los párrafos que
contiene el archivo HTML.

d) indicar la cantidad de formularios (form) que contiene el HTML por
categorizando por el método implementado POST o GET.

e) Para cada formulario mostrar los campos del tipo input y su
respectivo tipo que contiene en el documento HTML.

f) Para cada formulario “parseado”, identificar que el método de envío
del formulario sea POST y enviar una petición al servidor con el
parámetro llamado asignatura y valor practica1 y un header llamado
matricula con el valor correspondiente a matrícula asignada. Debe
mostrar la respuesta por la salida estándar
