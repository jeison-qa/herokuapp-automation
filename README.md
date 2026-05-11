# QA Automation Portafolio

Proyecto de automatización de pruebas usando Serenity BDD, Cucumber y Gradle.

## Tecnologías
- Java 17
- Serenity BDD
- Cucumber
- Gradle
- Selenium WebDriver

```
src/test/
├── java/
│   └── je_serenity/
│       └── login/
│           ├── ui/                 # Elementos de la página
│           ├── tasks/              # Acciones del actor
│           ├── questions/          # Verificaciones
│           └── stepdefinitions/    # Conexión con los features
└── resources/
    └── features/
        └── login/
            └── login.feature
``` 
# Escenarios en Gherkin
|   Escenarios      | 

Login exitoso con credenciales válidas 

Login fallido con credenciales inválidas 

## Cómo correr las pruebas
```bash
gradle clean test
```
Reporte Serenity

Serenity genera un reporte HTML detallado con:
- Resultados por escenario
- Capturas de pantalla de cada paso
- Estadísticas de ejecución

El reporte se genera en `target/site/serenity/index.html`

## Autor
Jeison — QA Automation
