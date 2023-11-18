package carritoCompras;

import java.util.ArrayList;
import java.util.List;

public class Carritodecompras {

    private List<ItemCarrito> items;
    private double total;
    private Direccion direccionEntrega;
    private Horario horarioEntrega;

    public Carritodecompras(double total, Direccion direccionEntrega, Horario horarioEntrega) {
        this.items = new ArrayList<ItemCarrito>();
        this.total = total;
        this.direccionEntrega = direccionEntrega;
        this.horarioEntrega = horarioEntrega;
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
        calcularTotal();
    }

    private void calcularTotal() {
		// TODO Auto-generated method stub
		
	}

	public void eliminarItem(ItemCarrito item) {
        items.remove(item);
        calcularTotal();
    }
		
	} 