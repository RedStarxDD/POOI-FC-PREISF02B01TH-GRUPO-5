package Carritocompras;

public class ItemCarrito {

    private Producto producto;
    private int cantidad;
    private float subtotal;

    public void Carrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        //this.subtotal = producto.getPrecio() * cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }


}
