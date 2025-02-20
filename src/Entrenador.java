public class Entrenador {
    private String nombre;
    private String apellido;
    private int edad;
    private String nickName;

    public Entrenador(String nombre, String apellido, int edad, String nickname){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nickName = nickname;
    }

    public String printAllNickname(){
        return this.nombre + " \"" + this.nickName + "\" " + this.apellido;
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
}
