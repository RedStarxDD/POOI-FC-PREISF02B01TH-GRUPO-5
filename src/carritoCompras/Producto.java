package carritoCompras;

import tienda.Tienda;

public class Producto {

    private final int ID_PRODUCTO;
    private String nombre;
    private double precio;
    private Tienda tienda;

    public Producto(int ID_PRODUCTO, String nombre, double precio) {
        this.ID_PRODUCTO = ID_PRODUCTO;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getID_PRODUCTO() {
        return ID_PRODUCTO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "ID_PRODUCTO=" + ID_PRODUCTO +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
