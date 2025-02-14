import java.sql.Time;

public class Partido {
    private int id;
    private Equipo zonaAzul;
    private Equipo zonaRoja;
    private Equipo equipoGanador;
    private Time hora;
    private String mvp;

    public Partido(int id, Equipo zonaAzul, Equipo zonaRoja, Equipo equipoGanador, Time hora, String mvp) {
        this.id = id;
        this.zonaAzul = zonaAzul;
        this.zonaRoja = zonaRoja;
        this.equipoGanador = equipoGanador;
        this.hora = hora;
        this.mvp = mvp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Equipo getZonaAzul() {
        return zonaAzul;
    }

    public void setZonaAzul(Equipo zonaAzul) {
        this.zonaAzul = zonaAzul;
    }

    public Equipo getZonaRoja() {
        return zonaRoja;
    }

    public void setZonaRoja(Equipo zonaRoja) {
        this.zonaRoja = zonaRoja;
    }

    public Equipo getEquipoGanador() {
        return equipoGanador;
    }

    public void setEquipoGanador(Equipo equipoGanador) {
        this.equipoGanador = equipoGanador;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getMvp() {
        return mvp;
    }

    public void setMvp(String mvp) {
        this.mvp = mvp;
    }
}
