package perfil;

import java.util.Date;

public class Usuario {
    private final int ID_USUARIO;
    private String nombre, apellidos, correo, dni, celular;
    private int genero;
    private Date nacimiento;

    public Usuario(int iD_USUARIO, String nombre, String apellidos, String correo, String dni, String celular,
                    int genero, Date nacimiento) {
            super();
            ID_USUARIO = iD_USUARIO;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.correo = correo;
            this.dni = dni;
            this.celular = celular;
            this.genero = genero;
            this.nacimiento = nacimiento;
    }

    public String getNombre() {
            return nombre;
    }
    public void setNombre(String nombre) {
            this.nombre = nombre;
    }
    public String getApellidos() {
            return apellidos;
    }
    public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
    }
    public String getCorreo() {
            return correo;
    }
    public void setCorreo(String correo) {
            this.correo = correo;
    }
    public String getDni() {
            return dni;
    }
    public void setDni(String dni) {
            this.dni = dni;
    }
    public String getCelular() {
            return celular;
    }
    public void setCelular(String celular) {
            this.celular = celular;
    }
    public int getGenero() {
            return genero;
    }
    public void setGenero(int genero) {
            this.genero = genero;
    }
    public Date getNacimiento() {
            return nacimiento;
    }
    public void setNacimiento(Date nacimiento) {
            this.nacimiento = nacimiento;
    }
    public int getID_USUARIO() {
            return ID_USUARIO;
    }

    @Override
    public String toString() {
            return "Usuario [ID_USUARIO=" + ID_USUARIO + ", nombre=" + nombre + ", apellidos=" + apellidos + ", correo="
                            + correo + ", dni=" + dni + ", celular=" + celular + ", genero=" + genero + ", nacimiento=" + nacimiento
                            + "]";
    }
}
