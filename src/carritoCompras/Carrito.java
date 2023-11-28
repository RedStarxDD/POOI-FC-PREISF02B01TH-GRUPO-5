package carritoCompras;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<ItemCarrito> items;
    private double total;
    private Direccion direccionEntrega;
    private Horario horarioEntrega;

    public Carrito() {
        this.items = new ArrayList<ItemCarrito>();
        this.total = 0;
        this.direccionEntrega = null;
        this.horarioEntrega = null;
    }

    public List<ItemCarrito> getItems() {
        return items;
    }

    public void setItems(List<ItemCarrito> items) {
        this.items = items;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Direccion getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(Direccion direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public Horario getHorarioEntrega() {
        return horarioEntrega;
    }

    public void setHorarioEntrega(Horario horarioEntrega) {
        this.horarioEntrega = horarioEntrega;
    }

    public void agregarItem(ItemCarrito item) {
        items.add(item);
        this.total+=item.getSubtotal();
    }

    public void eliminarItem(ItemCarrito item) {
        items.remove(item);        
    }

    @Override
    public String toString() {
        return "Carrito [items=" + items + ", total=" + total + ", direccionEntrega=" + direccionEntrega + ", horarioEntrega=" + horarioEntrega
                + "]";
    }
    
    
}
