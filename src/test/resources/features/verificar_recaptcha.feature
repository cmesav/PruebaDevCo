#language:es
  #autor: mesa.cristian@gmail.com


Característica: verificar captcha

  Antecedentes:
    Dado que el cliente se encuentra en la pagina de inicio

  @CP_10
  Esquema del escenario: crear cuenta nueva
    Cuando crea una cuenta con los datos
      | nombre   | apellido   | password   |
      | <nombre> | <apellido> | <password> |
    Entonces verá la pantalla del captcha

    Ejemplos:
      | nombre | apellido     | password |
      | Prueba | Automatizada | A123456B |

  @CP_11
  Escenario: iniciar sesion
    Cuando inicia sesion con los datos
    Entonces verá la pantalla del captcha