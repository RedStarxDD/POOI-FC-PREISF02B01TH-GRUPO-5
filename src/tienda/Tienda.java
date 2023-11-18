package tienda;

import java.util.List;

import carritoCompras.Horario;
import carritoCompras.Producto;
import java.util.ArrayList;

public class Tienda {

    private final int ID_TIENDA;
    private String nombre;
    private String pasillo;
    private Horario horario;
    private ArrayList<Producto> productos;

    public Tienda(int ID_TIENDA, String nombre, String pasillo, Horario horario) {
        this.ID_TIENDA = ID_TIENDA;
        this.nombre = nombre;
        this.pasillo = pasillo;
        this.horario = horario;
        this.productos = new ArrayList<Producto>();
    }

    public int getID_TIENDA() {
        return ID_TIENDA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasillo() {
        return pasillo;
    }

    public void setPasillo(String pasillo) {
        this.pasillo = pasillo;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto item) {
        productos.add(item);
    }

    public void eliminarProducto(Producto item) {
        productos.remove(item);
    }

    @Override
    public String toString() {
        return "Tienda [nombre=" + nombre + ", pasillo=" + pasillo + ", horario=" + horario + ", productos=" + productos
                + "]";
    }

}
