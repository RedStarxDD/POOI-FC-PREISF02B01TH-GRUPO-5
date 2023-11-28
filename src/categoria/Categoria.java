package categoria;

import java.util.*;

import tienda.Tienda;

public class Categoria {

    private final int ID_CATEGORIA;
    private String nombre;
    private ArrayList<Tienda> tiendas;

    public Categoria(int id, String nombre) {
        super();
        this.ID_CATEGORIA = id;
        this.nombre = nombre;
        this.tiendas = new ArrayList<Tienda>();
    }

    public int getID_CATEGORIA() {
        return ID_CATEGORIA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Tienda> getTiendas() {
        return tiendas;
    }

    public void setTiendas(ArrayList<Tienda> tiendas) {
        this.tiendas = tiendas;
    }

    public void agregarTienda(Tienda tienda) {
        this.tiendas.add(tienda);
    }

    @Override
    public String toString() {
        return "Categoria [id=" + ID_CATEGORIA + ", nombre=" + nombre + ", tiendas=" + tiendas
                + "]";
    }
}
