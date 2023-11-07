package Carritocompras;

public class Producto {

    private int ID_PRODUCTO;
    private String nombre;
    private float precio;
    private String descripción;

    public Producto(int ID_PRODUCTO, String nombre, float precio, String descripción) {
        this.ID_PRODUCTO = ID_PRODUCTO;
        this.nombre = nombre;
        this.precio = precio;
        this.descripción = descripción;
    }

    public int getID_PRODUCTO() {
        return ID_PRODUCTO;
    }

    public void setID_PRODUCTO(int ID_PRODUCTO) {
        this.ID_PRODUCTO = ID_PRODUCTO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "ID_PRODUCTO=" + ID_PRODUCTO +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", descripción='" + descripción + '\'' +
                '}';
    }
}
