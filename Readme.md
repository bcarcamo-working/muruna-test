# Muruna User API

## Estructura de Carpetas

La estructura de carpetas del proyecto sigue las mejores prácticas de organización:


# Muruna User API

## Estructura de Carpetas

La estructura de carpetas del proyecto sigue las mejores prácticas de organización:

├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com.muruna.user/
│ │ │ ├── config/
│ │ │ │ └── SecurityConfig.java
│ │ │ ├── controller/
│ │ │ │ └── UserController.java
│ │ │ ├── model/
│ │ │ │ ├── User.java
│ │ │ │ └── Phone.java 
│ │ │ ├── service/
│ │ │ │ └── UserService.java
│ │ │ └── util/
│ │ │ └── ErrorResponse.java
│ │ └── resources/
│ │ └── application.properties
│ └── test/
│ └── java/
│ └── com.muruna.user/
│ ├── controller/
│ │ └── UserControllerTest.java
│ └── service/
│ └── UserServiceTest.java
└── README.md


## Tecnologías Utilizadas

- Spring Boot 2.7.0
- Java 17
- H2 Database
- Lombok 1.18.22

## Versiones

- Spring Boot: 2.7.0
- Java: 17
- Lombok: 1.18.22

## Cómo Probar la API

1. Clona el repositorio: `https://github.com/bcarcamo-working/muruna-test.git`
2. Abre el proyecto en tu entorno de desarrollo favorito.
3. Ejecuta la aplicación.

La API estará disponible en `http://localhost:8080/api/users/register`.

## Tests

Se han proporcionado tests para verificar el correcto funcionamiento de la aplicación. Puedes ejecutarlos usando tu entorno de desarrollo o un comando como `./mvnw test`.

## Información Adicional

## Request
{
    "name": "John Doe",
    "email": "john.doe@example.com",
    "password": "password123",
    "phones": [
      {
        "number": "123456789",
        "cityCode": "1",
        "countryCode": "123"
      }
    ]
  }

## Response
{
    "id": 1,
    "name": "John Doe",
    "email": "john.doe@example.com",
    "password": "password123",
    "phones": [
        {
            "id": 2,
            "number": "123456789",
            "citycode": null,
            "countrycode": null
        }
    ],
    "created": "2024-02-23T06:45:24.7220766",
    "modified": "2024-02-23T06:45:24.7220766",
    "lastLogin": "2024-02-23T06:45:24.7220766",
    "utoken": "46d95e45-cd27-49b6-840d-b66e223c5dd6",
    "active": true
}
  


¡Disfruta usando la API Muruna User!
