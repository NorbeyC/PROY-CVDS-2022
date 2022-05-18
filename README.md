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
# tecnologias aplicadas
## BACK 
* **Google Guice** Google Guice es un framework de inyección de dependencias que puede ser utilizado en aplicaciones hechas con Java en donde la relación o dependencia entre objetos de negocio necesita ser administrada o mantenida. Fuente:[Wikipedia](https://es.wikipedia.org/wiki/Google_Guice)
## FRONT
* **PrimeFaces** PrimeFaces es una biblioteca de componentes para JavaServer Faces de código abierto que cuenta con un conjunto de componentes enriquecidos que facilitan la creación de las aplicaciones web. Primefaces está bajo la licencia de Apache License V2.
Fuente:[Wikipedia](https://es.wikipedia.org/wiki/PrimeFaces)

## DATA BASE
* **PostgreSQL** PostgreSQL, también llamado Postgres, es un sistema de gestión de bases de datos relacional orientado a objetos y de código abierto, publicado bajo la licencia PostgreSQL, ​ similar a la BSD o la MIT. 
* Fuente:[Wikipedia](https://es.wikipedia.org/wiki/PostgreSQL)

# Enlace a la aplicación en Heroku.
* [Heroku despliegue](https://proyecvds-grupo14.herokuapp.com/faces/index.xhtml)

# Enlace al sistema de integración continua
* [![CircleCI](https://circleci.com/gh/NorbeyC/proycvds-grupo14/tree/circleci-project-setup.svg?style=svg)](https://circleci.com/gh/NorbeyC/proycvds-grupo14/tree/circleci-project-setup)

# Descripción del proceso:
## Integrantes:
* Norbey Cardona
* Francisco Márquez
* Cesar pineda
* Yhonatan Gómez

# Breve descripción de la Metodología
## Metodología Scrum:
La metodología Scrum es un proceso para llevar a cabo un conjunto de tareas de forma regular con el objetivo principal de trabajar de manera colaborativa, es decir, para fomentar el trabajo en equipo.

Con este método de trabajo lo que se pretende es alcanzar el mejor resultado de un proyecto determinado. Las prácticas que se aplican con la metodología Scrum se retroalimentan unas con otras y la integración de las mismas tiene su origen en un estudio de cómo hay que coordinar a los equipos para ser potencialmente competitivos.

En Scrum se van realizando entregas regulares y parciales del trabajo final, de manera prioritaria y en función del beneficio que aportan dichas entregas a los receptores del proyecto. Por este motivo, es una metodología especialmente indicada para proyectos complejos, con requisitos cambiantes y en los que la innovación y la flexibilidad son protagonistas


# Enlace a nuestro Taiga.
* [Taiga Grupo14](https://tree.taiga.io/project/cesarpineda-d-gestion-de-recursos-biblioteca/timeline)

# Generar el 'release-burndown chart' del proyecto, e indicar los puntos de historia realizados y los faltantes.
![image](https://user-images.githubusercontent.com/98216928/169092114-e76966bc-5be3-4462-bd4e-8e9e321a7f97.png)

Nos faltaron 4 historias de Usuario:
1. Consultar Reserva       -------->       Podemos Crear la Reserva sin embargo no alcanzamos a desarrollar la interfaz
2. Visualizar Horario de Reserva de Recursos      ---------------------> Es una parte de la Reserva, por tanto, no la podemos consultae
3. Reporte de Ocupación       -----------> No se alcanzaron a generar los reportes
4. Cancelar Reserva             ------------->  No se tiene la interfaz para cancelar la reserva

# Sprint 1
## Descripción:
### Sprint Burst
![image](https://user-images.githubusercontent.com/98216928/169084511-b6bf3f6a-9ae6-4529-9e43-826a80ec3fcf.png)
### Sprint Backlog
![image](https://user-images.githubusercontent.com/98216928/169085251-8a269600-aae5-477a-af1f-111e58eb8e6e.png)


Para el Sprint 1 nos propusimos dos historias de usuario, las cuales consistian en:
1. Inicio Sesión
2. Registrar un Recurso

Consideramos para iniciar que estás dos tareas son bastante robustas y como es nuestra primer vez utilizando esta metodología no se ve gran avance, puesto que olvidamos mover las tareas en el Taiga, e incluso hay tareas sin asignar, pero a medida que fuimos avanzando fuimos aprendiendo y aplicando


# Sprint 2
## Descripción:
### Sprint Burst
![image](https://user-images.githubusercontent.com/98216928/169086505-d1a8210c-b35a-4aa9-9050-51f7e48628f4.png)
### Sprint Backlog
![image](https://user-images.githubusercontent.com/98216928/169086591-c13fa289-cafe-42ae-b2a3-c77402cbf50d.png)
![image](https://user-images.githubusercontent.com/98216928/169086679-ba5252a7-2a97-4298-9729-f75b60e54d18.png)
![image](https://user-images.githubusercontent.com/98216928/169086768-b187ee72-fe3f-45d2-a142-504884c4177d.png)
![image](https://user-images.githubusercontent.com/98216928/169086881-00ad6543-1b20-4bdd-b9cf-75ef2b4eec6e.png)
![image](https://user-images.githubusercontent.com/98216928/169086972-d6f786ac-504d-427c-9a8e-eec0f9c2bb44.png)



Para el Sprint 2 nos propusimos cuatro historias de usuario, las cuales consistian en:
1. Corrección Sprint 1
2. Reservar un Recurso
3. Consultar un Recurso
4. Cambiar Estado de un Recurso

Como se puede observar para el Sprint 2, acatamos las recomendaciones e instrucciones dadas por nuestro profesor y se evidencian las tareas más detalladas y el Sprint Burst mucho más desarrollado.

Nos enfocamos principalmente en implementar las correcciones del Sprint 1 y en desarrollar las interfaces gráficas de las demás clases



# Sprint 3
## Descripción:
### Sprint Burst
![image](https://user-images.githubusercontent.com/98216928/169089853-bb380568-125c-4be3-9f1f-96ba0d9784b6.png)
### Sprint Backlog
![image](https://user-images.githubusercontent.com/98216928/169089922-63a4282e-493f-4d4d-b2fe-1bcd624c50ca.png)
![image](https://user-images.githubusercontent.com/98216928/169090184-609a2fdf-f470-44bb-a022-1953602dbfe4.png)




Para nuestro último Sprint nos enfocamos en dos tareas que abarcan todo lo visto:
1. Corrección Sprint 2
2. Visualizar Reservas

La corrección del Sprint 2 finaliza

Nos enfocamos principalmente en implementar las correcciones del Sprint 2, la cual nos tomó la mayoría de tiempo pero se logró finalizar exitosamente el Sprint 3







