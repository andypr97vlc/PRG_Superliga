# Diagrama UML de las clases

```plantuml
@startuml
!theme cyborg-outline
class Jugador {
    - String nombre
    - String apellido
    - int edad
    - String nickName
    - enum posicion
}

enum Posicion {
    TOP
    JUNGLE
    MID
    ADC
    SUPPORT
}

class Equipo {
    - String nombre
    - String tag
    - ArrayList<Jugador> titulares
    - ArrayList<Jugador> reservas
    - Entrenador entrenador
}

class Entrenador {
    - String nombre
    - String apellido
    - int edad
    - String nickName
}

class Partido {
    - Equipo zonaAzul
    - Equipo zonaRoja
    - String resultado
    - String fecha
}

class Playoffs {
    - ArrayList<Partido> partidos
    - ArrayList<Equipo> equipos
    - String fecha
}

class Jornada {
    - ArrayList<Partido> partidos
    - String fecha
}

class Clasificacion {
    - ArrayList<Equipo> equipos
    - ArrayList<Jugador> jugadores
}

class Liga {
    - ArrayList<Jornada> jornadas
    - ArrayList<Equipo> equipos
    - ArrayList<Jugador> jugadores
    - ArrayList<Partido> playoffs
    - ArrayList<Classificacion> clasificaciones
    - String fechaInicio
    - String fechaFin
}

Jugador -down-> "5" Equipo : titulares
Jugador -down-> "*" Equipo : reservas
Jugador -right-> "1" Posicion : posicion
Jugador -right-> Clasificacion : clasifican

Equipo -down-> Partido : juega
Equipo "1" <-down- Entrenador : entrena
Equipo -right-> Clasificacion : clasifican

Partido -down- Playoffs : pueden ser
Partido -left-> Jornada : pertenece

Liga -right-> Jornada : tiene
Liga -right-> Partido : tiene
Liga <-right- Jugador : juegan
Liga <-right- Equipo : juegan

@enduml
```
