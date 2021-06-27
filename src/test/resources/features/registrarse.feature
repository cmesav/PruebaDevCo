#language:es
  #autor: mesa.cristian@gmail.com


Característica: verificar formulario de registro

  Antecedentes:
    Dado que el cliente se encuentra en la pagina de inicio

  @CP_10
  Esquema del escenario: verificar captcha
    Cuando crea una cuenta con los datos
      | nombre   | apellido   | password   |
      | <nombre> | <apellido> | <password> |
    Entonces verá la pantalla del captcha

    Ejemplos:
      | nombre | apellido     | password |
      | Prueba | Automatizada | A123456B |