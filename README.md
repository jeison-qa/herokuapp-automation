# Herokuapp Automation

Proyecto de automatización de pruebas para The Internet Herokuapp usando Serenity BDD, Cucumber y Gradle.

## Tecnologías
- Java 17
- Serenity BDD
- Cucumber
- Gradle
- Selenium WebDriver

## Estructura del proyecto

```
src/test/
├── java/
│   └── je_serenity/
│       └── login/
│           ├── ui/
│           ├── tasks/
│           ├── questions/
│           └── stepdefinitions/
└── resources/
    └── features/
        └── login/
            └── login.feature
```

## Casos de prueba automatizados
| Escenario | Tags | Estado |
|---|---|---|
| Login exitoso con credenciales validas | @smoke | ✅ |
| Login fallido con credenciales invalidas | @smoke | ✅ |

## Cómo correr las pruebas

```bash
gradle clean test
```

## Reporte
🔗 https://jeison-qa.github.io/herokuapp-automation/

## Autor
Jeison Monterrosa — QA Automation