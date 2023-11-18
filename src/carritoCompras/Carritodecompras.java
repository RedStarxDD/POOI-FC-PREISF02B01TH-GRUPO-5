package carritoCompras;

import java.util.ArrayList;
import java.util.List;

public class Carritodecompras {

    private List<ItemCarrito> items;
    private double total;
    private Dirección direccionEntrega;
    private Horario horarioEntrega;

    public void Carrito() {
        this.items = new ArrayList<>();
        this.total = 0.0;
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

    public Dirección getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(Dirección direccionEntrega) {
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