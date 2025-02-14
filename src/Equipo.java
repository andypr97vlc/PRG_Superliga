import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String tag;
    private ArrayList<Jugador> titulares = new ArrayList<>();
    private ArrayList<Jugador> reservas = new ArrayList<>();
    private Entrenador entrenador;

    public Equipo(String nombre, String tag, ArrayList<Jugador> titulares, ArrayList<Jugador> reservas, Entrenador entrenador) {
        this.nombre = nombre;
        this.tag = tag;
        this.titulares = titulares;
        this.reservas = reservas;
        this.entrenador = entrenador;
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
