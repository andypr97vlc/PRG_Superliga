public class Jugador {
    private String nombre;
    private String apellido;
    private int edad;
    private String nickName;
    private Posicion posicion;

    public Jugador(String nombre, String apellido, int edad, String nickName, Posicion posicion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nickName = nickName;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
}
