Feature: Login de usuarios

  Scenario: Login exitoso con credenciales validas
    Given el usuario abre la pagina de login
    When ingresa usuario "tomsmith" y clave "SuperSecretPassword!"
    Then debe ver el mensaje de bienvenida

  Scenario: Login fallido con credenciales invalidas
    Given el usuario abre la pagina de login
    When ingresa usuario "malo" y clave "incorrecta"
    Then debe ver un mensaje de error