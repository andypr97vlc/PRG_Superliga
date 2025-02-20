import java.util.ArrayList;
import java.util.Comparator;

public class Equipo {
    private String nombre;
    private String tag;
    private ArrayList<Jugador> titulares = new ArrayList<>();
    private ArrayList<Jugador> reservas = new ArrayList<>();
    private Entrenador entrenador;

    public Equipo(String tag, String nombre) {
        this.tag = tag;
        this.nombre = nombre;
    }

    public Equipo(String nombre, String tag, ArrayList<Jugador> titulares, ArrayList<Jugador> reservas, Entrenador entrenador) {
        this.nombre = nombre;
        this.tag = tag;
        this.titulares = titulares;
        this.reservas = reservas;
        this.entrenador = entrenador;
    }

    public void printAlineacion() {
        // Ordenar listas de jugadores
        titulares.sort(Comparator.comparing(jugador -> jugador.getPosicion().ordinal()));
        reservas.sort(Comparator.comparing(jugador -> jugador.getPosicion().ordinal()));

        // Imprimir jugadores
        int anchoJugador = 35;
        int anchoPosicion = 5;
        System.out.println("··· " + getNombre() + " ···");
        System.out.printf("%-" + anchoJugador + "s%-" + anchoPosicion + "s%n", "JUGADORES TITULARES", "POSICIÓN");
        System.out.println("---------------------------------------------");
        for (Jugador jugador : titulares) {
            System.out.printf("%-" + anchoJugador + "s%-" + anchoPosicion + "s%n", jugador.printAllNickname(), jugador.getPosicion());
        }
        System.out.println("=============================================");
        System.out.printf("%-" + anchoJugador + "s%-" + anchoPosicion + "s%n", "JUGADORES RESERVAS", "POSICIÓN");
        System.out.println("---------------------------------------------");
        for (Jugador jugador : reservas) {
            System.out.printf("%-" + anchoJugador + "s%-" + anchoPosicion + "s%n", jugador.printAllNickname(), jugador.getPosicion());
        }
        System.out.println();
    }

    public void agregarTitulares(Jugador jugador){
        this.titulares.add(jugador);
    }

    public void agregarReservas(Jugador jugador){
        this.reservas.add(jugador);
    }

    public String printTagEquipo() {
        return "[" + this.tag + "]" + this.nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ArrayList<Jugador> getTitulares() {
        return titulares;
    }

    public void setTitulares(ArrayList<Jugador> titulares) {
        this.titulares = titulares;
    }

    public ArrayList<Jugador> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Jugador> reservas) {
        this.reservas = reservas;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }
}
