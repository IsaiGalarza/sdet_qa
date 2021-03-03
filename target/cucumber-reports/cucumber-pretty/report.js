$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feactures/LoginDemo.feature");
formatter.feature({
  "line": 2,
  "name": "Como Gerente administravio deberia ingresar a la plataforma de RRHH Orange con mi usuario y contrase�a",
  "description": "para gestionar por un Dashboard el personal del area administrativa",
  "id": "como-gerente-administravio-deberia-ingresar-a-la-plataforma-de-rrhh-orange-con-mi-usuario-y-contrase�a",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Verificar credenciales usuario y contrase�a plataforma RRHH Orange",
  "description": "",
  "id": "como-gerente-administravio-deberia-ingresar-a-la-plataforma-de-rrhh-orange-con-mi-usuario-y-contrase�a;verificar-credenciales-usuario-y-contrase�a-plataforma-rrhh-orange",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@fast"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Abrimos el navegador e ingresamos a la plataforma",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "ingresamos a la pagina de Login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "ingresamos usuario y contrasena",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "pulsamos clic en el boton login",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "ingresamos a la pagina de Inicio de la plataforma RRHH Orange",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "verificamos que este disponible el Dashboard",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});