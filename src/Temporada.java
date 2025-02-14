import java.time.LocalDate;
import java.util.ArrayList;

public class Temporada {
    private LocalDate año;
    private String split;
    private ArrayList<Equipo> clasificacion = new ArrayList<>();
    private String[][] jornadas;

    public Temporada(LocalDate año, String split, ArrayList<Equipo> clasificacion, String[][] jornadas) {
        this.año = año;
        this.split = split;
        this.clasificacion = clasificacion;
        this.jornadas = jornadas;
    }

    public LocalDate getAño() {
        return año;
    }

    public void setAño(LocalDate año) {
        this.año = año;
    }

    public String getSplit() {
        return split;
    }

    public void setSplit(String split) {
        this.split = split;
    }

    public ArrayList<Equipo> getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(ArrayList<Equipo> clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String[][] getJornadas() {
        return jornadas;
    }

    public void setJornadas(String[][] jornadas) {
        this.jornadas = jornadas;
    }
}
