#language:es
  #autor: mesa.cristian@gmail.com


Característica: realizar busqueda

  Antecedentes:
    Dado que el cliente se encuentra en la pagina de inicio

  @CP_3
  Esquema del escenario: Buscar hospedaje
    Cuando busca hospedaje para el destino "<ciudad>" con fechas "<check-in>" y "<check-out>"
    Entonces verá el listado de "hoteles" disponibles

    Ejemplos:
      | ciudad   | check-in | check-out |
      | Medellin | 30       | 10        |

  @CP_4
  Esquema del escenario: buscar vuelo disponible
    Cuando busca disponibilidad de vuelos con origen "<ciudadOrigen>" destino "<ciudadDestino>" y fechas "<checkIn>" y "<check-out>"
    Entonces vera el listado de "vuelos" disponibles

    Ejemplos:
      | ciudadOrigen | ciudadDestino | checkIn | check-out |
      | Medellin     | Bogota        | 30      | 10        |

    @CP_8
    Esquema del escenario: buscar paquetes
      Cuando busca paquetes con origen "<ciudadOrigen>" destino "<ciudadDestino>" y fechas "<checkIn>" y "<check-out>"
      Y selecciona el hotel mas barato


      Ejemplos:
        | ciudadOrigen | ciudadDestino | checkIn | check-out |
        | Medellin     | Bogota        | 30      | 10        |

#    Esquema del escenario: Buscar hospedaje mas barato
#      Cuando busca hospedaje para el destino "<ciudad>" con fechas "<check-in>" y "<check-out>"
#      Y selecciona el hotel mas barato
#      Ejemplos:
#        | ciudad   | check-in | check-out |
#        | Medellin | 30       | 10        |