
# paso 1
**Extensiones obligatorias en vs code**
1. Extension pack for Java (Microsoft).
2. Spring Boot Extension Pack (VMware)
3. Maven for Java
4. Postman (Postman) opcional
# paso 2
**Crear proyecto Spring Boot(lo utilizamos para crear una Api)**
1. Ctrl + Shift + p
2. seleccionamos command palette
3. escribimos Spring Initializr: Create a Maven Project y lo seleccionamos 
4. luego sale specify spring boot version:  escogems la 3.5.10
5. luego sale specify project languaje: seleccionamos java.
6. luego nos pide el input group: colocamos com.talentotech y enter
7. luego sale input artifact id: colocamos:energia
8. luego sale input package y sale esto com.talentotech.energiapi no le damos enter le damos clic al final porque sino se borray ahi si enter.
9. luego sale specify packaging type: seleccionamos jar
10. luego sale specify java version: seleccionamos 17
11. despues sale para seleccionar las dependencias: alli buscamos 3: spring web web, spring data JPA sql, postgreSql DRIVER SQL. y luego damos enter
12. se abre una ventana donde tenemos el proyecto creamos una nueva carpeta en este caso PBpg y luego le damos a seleccionar este folder y ya se crea el proyecto. 

En caso de tener problemas y necesitemos reinciar el workspace de java colocamos el en la prte de arriba 

13. "Java: Clean Java Language Server Workspace"

14. dentro de la carpeta resources(conexiones externas) creo el archivo application.yml
15. dentro de este archivo .yml copio el siguiente codigo: y lo unico que modificamos es el password aqui colocamos la clave de postgress y cambie el nombre de la base de datos por energia_db: jdbc:postgresql://localhost:5432/energia_db

spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/test_db
    username: postgres
    password: postgres
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        format_sql: true
        dialect: org.hibernate.dialect.PostgreSQLDialect
server:
  port: 8080

16. me voy a postgress AL ICONO DE ALMACENAMIENTO "query tool workspace" alli se abre una ventana selecciono la base de datos el passaword no toco nada mas y le doy a conectar.
17. dentro de query history coloco CREATE DATABASE energia_db;  en donde energia_db es el nombre de la base de datos que coloque dentro del archivo application.yml. y le doy en el boton de play y miramos si se creo la base de datos
18. ahora dentro de postgress si me voy al primer icono al lado izquierdo de los 3 puntos "default workspace" vamos a server/postgress/database alli vere mi base de datos creada.

