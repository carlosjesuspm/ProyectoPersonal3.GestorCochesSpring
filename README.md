# PROYECTO: GESTIÓN AUTOMÓVILES

## Descripción
Crear un controlador Spring para coches, con un método que reciba un string por parámetro de url indicando el tipo de coche que quiere recibir.

Existen tres tipos de coches: eléctrico, híbrido y de combustión.

El controlador recibe el parámetro e invoca a un Factory Method que le proporciona el coche solicitado y lo devuelve como respuesta json.

El factory Method utilizada una Facade para la creación de coches, donde cada una está compuesto por diferentes piezas como batería, motor, aire acondicionado, inyección, etc (cada uno será una clase diferente).

El controlador devuelve un coche en marcha, con la batería, el motor y el aire acondicionado encendidos.

Cada tipo de coche debería tener al menos una pieza diferente al resto de tipos de coches. Por ejemplo, el coche eléctrico debe tener una batería mientras que el coche híbrido un tanque de hidrógeno.

En caso de no existir el tipo de coche indicado en la url de la petición, el Factory Method lanzará una excepción, que el controlador capturará y registrará en los logs, enviando al cliente una respuesta de tipo not found (404).


## Herramientas

* IDE: Intellij
* Lenguaje: Java
  * Versión: 17 (versión 21, actualmente no soportado por IntelliJ)
* Framework: Spring
* Design Patterns: Factory y Facade
* Documentación:
  * JavaDoc
  * Swagger(OpenApi) Versión: 2.3.0
    * Enlaces:
      * HMTL: http://localhost:8080/swagger-ui/index.html#/
      * JSON: http://localhost:8080/v2/api-docs
* Testing de integración:
  * Postman
* Depedencias:
  * JPA
  * Jersey (JAX-RS) para RESTful Web Services. 
  * H2 Database
  * SpringDevTools
  * SpringBootStarterTest
  * SpringBootWeb
  * ModelMapper (conversión de entities a DTOs)
    * Versión: 3.2.2 (Octubre, 2023)
  * SpringDoc-OpenApi

# Aprendizaje

* Los DTOs son todos serializables
* La conversión de entidad a dto ocurre en la capa controlador
  * Se puede utilizar la librería modelMapper para establecer la conversión o, simplemente llevarla a cabo mediante los constructores de las clases.
* Patrón Facade se encarga de crear cada uno de los componentes que conforman el objeto. Por ejemplo, del objeto coche crearía (batería, motor, aire acondicionado...)
* Patrón Factory se encarga de crear el objeto en su totalidad. Por ejemplo, crea la entidad coche montada completamente.
* Cuando hay una clase padre se ha de utilizar @MappedSupperClass y sólo ha de tener id la versión padre y no las subclases (h2database no lo reconoce y no funciona)
* Para evitar la duplicación de código a la hora de pasar de entidad a DTO, y viceversa, es mejor crear una clase genérica que se pueda extrapolar a las subclases
* El estado 204 (No content) no es considerado un error, aunque también se puede capturar. Eso sí, el mensaje aparece reflejado en la terminal, mientras que Postman no lo registra.