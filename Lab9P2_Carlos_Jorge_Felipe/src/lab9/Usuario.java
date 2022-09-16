
package lab9;

public class Usuario {
    
    private int id;
    private String username;
    private String nombre;
    private String password;
    private int edad;
    private String correo;

    public Usuario() {
    }

    public Usuario(int id, String username, String nombre, String password, int edad, String correo) {
        this.id = id;
        this.username = username;
        this.nombre = nombre;
        this.password = password;
        this.edad = edad;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return username;
    }
    
    
    
}
