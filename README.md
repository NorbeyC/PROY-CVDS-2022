# Gestión de recursos de la biblioteca grupo 14

## Ciclos de vida del desarrollo del software 2022-1


## Integrantes 

|           Integrante          |     Rol         |
|         -------------         | :-------------: |
| prof. Julián Mauricio Velasco |dueño de producto|
| Norbey Cardona                | front end       |
| Francisco Márquez             | front end       |
| Cesar pineda                  | back end        |
| Yhonatan Gómez                | back end        |




## Descripción del producto.

* **Descripción general.**

Permitir que los estudiantes, puedan reservar las salas de estudio, equipos de cómputo, tablero inteligente y demás recursos de la biblioteca. Deberían autenticarse con su correo institucional y hacer la reserva del recurso en el horario de su preferencia. Debe existir también una forma de gestionar aquellos recursos en caso de que se deseen agregar o modificar los mismos, así como asignar horarios de disponibilidad específicos.


    
* **Manual de usuario**

Entre a la página y encuentre una descripción breve de nuestra universidad la Escuela Colombiana de Ingeniería su biblioteca y el que es ser ingenieros de sistemas de esta universidad. 
Encontrará además un entorno amigable con el usuario que le permitirá interactuar y facilitar su paso en la interacción de los procesos que acá quiera realizar. En la parte superior encontrara dos botones, con el de la derecha podrá identificarse como un administrador o como un estudiante, recuerde que si usted es un estudiante deberá identificarse con su correo de la Escuela como normalmente lo hace con dirección nombre.apellido@mail.escuelaing.edu.co
Y si es un administrador de la pagina deberá entrar de la misma manera pero con la dirección nombre.apellido@mail.escuelaing.edu.co.
Después de autentificarse como estudiante usted podrá hacer la consulta de los recursos que la biblioteca ofrece filtrada por el tipo de recurso  como: Libros, computadores, salas de estudio y tableros inteligentes. posteriormente si así lo desea podrá hacer la reserva de alguno de estos recursos que se ofrecen, para esto solo tendrá que ingresar el id del recurso que se muestra en esta misma pantalla y la fecha en la que devolverá dicho recurso prestado por la biblioteca.

Si usted en otro caso se autentifica como un administrador al ingresar será llevado a otra ventana que le permitirá como administrador registrar un nuevo recurso y su configuración como: Nombre del recurso, ubicación, tipo del recurso, capacidad de personas, identificador y horas en las que estará disponible



* **Imágenes y descripción de las funcionalidades más importantes.**
* Esta será la página inicial que verá el usuario al ingresar, nos permite ver los recursos disponibles sin necesidad de registrarse y también registrarse para poder registrar o solicitar un recurso

![](https://github.com/NorbeyC/proycvds-grupo14/blob/circleci-project-setup/Imagen1.png)

* además podremos encontrar una breve descripción de la escuela, su biblioteca y el valor de ser egresado de la misma.

![](https://github.com/NorbeyC/proycvds-grupo14/blob/circleci-project-setup/Imagen2.png)

* El boton de inicio nos redirigira a una pagina en la que podemos elegir el tipo de inicio
 * **~NOTA:~ gracias a modificaciones en código se está logrando eliminar la selección de inicio de sección** 


![](https://github.com/NorbeyC/proycvds-grupo14/blob/circleci-project-setup/Imagen3.png)

* En la siguiente página encontraremos un campo para ingresar el correo y un campo para ingresar la contraseña, al dar clic en el botón de **inicio sesión** podremos ingresar a nuestro espacio destinado, dependiendo del tipo de usuario que seamos (estudiante, admin)

![](https://github.com/NorbeyC/proycvds-grupo14/blob/circleci-project-setup/Imagen4.png)

* Luego, de ser estudiantes, podremos ingresar a la página en la que nos permitirá reservar un recurso, en ella encontraremos los recursos disponibles, y de ellos podemos elegir el que deseamos


![](https://github.com/NorbeyC/proycvds-grupo14/blob/circleci-project-setup/Imagen5.png)

* En caso de ingresar un administrador, este será redirigido directamente a la pantalla de **registrar un recurso**, en el cual como su nombre indica podrá registrar un nuevo recurso ingresando los parámetros necesarios.

![](https://github.com/NorbeyC/proycvds-grupo14/blob/circleci-project-setup/Imagen7.png)


* **Modelo E-R**

![](https://github.com/NorbeyC/proycvds-grupo14/blob/circleci-project-setup/Diagrama%20E-R.jpeg)

* **Diagrama de clases**
![](https://github.com/NorbeyC/proycvds-grupo14/blob/circleci-project-setup/diagrama%20de%20clases.PNG)

# Descripción de la arquitectura
 ## Bases de datos
* [PostgreSQL](https://www.postgresql.org/)
## capa aplicación
* [Intellij IDEA](https://www.jetbrains.com/es-es/idea/)
* [Eclipse](https://www.eclipse.org/downloads/packages/)
* [Guice](https://www.baeldung.com/guice)
## capa presentación
* [Prime Faces](https://www.primefaces.org/)
## capa Despliegue
* [Heroku](https://www.heroku.com/)

# Enlace a la aplicación en Heroku.
* [Heroku despliegue](https://proyecvds-grupo14.herokuapp.com/faces/index.xhtml)

