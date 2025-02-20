import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Entrenador entrenador1 = new Entrenador("Jesús", "Pérez", 30, "Falco");
        Equipo equipo1 = new Equipo("Fnatic", "FNC");

        Jugador jugador1 = new Jugador("Follador", "El que folla", 26, "Faker", Posicion.MID);
        Jugador jugador2 = new Jugador("Follado", "El que le follan", 30, "Fucked", Posicion.JUNGLE);

        equipo1.agregarTitulares(jugador1);
        equipo1.agregarTitulares(jugador2);

        equipo1.printAlineacion();

    }
}
