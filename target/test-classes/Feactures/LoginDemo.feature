@tag
Feature: Como Gerente administravio deberia ingresar a la plataforma de RRHH Orange con mi usuario y contrase�a
  para gestionar por un Dashboard el personal del area administrativa

  @fast
  Scenario: Verificar credenciales usuario y contrase�a plataforma RRHH Orange
    Given Abrimos el navegador e ingresamos a la plataforma
    And ingresamos a la pagina de Login
    When ingresamos usuario y contrasena
    And pulsamos clic en el boton login
    Then ingresamos a la pagina de Inicio de la plataforma RRHH Orange
    And verificamos que este disponible el Dashboard

