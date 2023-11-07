package Categoria;
import java.util.*;


public class Categoria {
	private int id;
	private String nombre;
	private String descripcion;
	
    private ArrayList<Productos> productos;
    

	public Categoria(int id, String nombre, String descripcion, ArrayList<Productos> productos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.productos = productos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public static ArrayList<Productos> getProductos() {
		return productos;
	}

	public void agregarProducto(String producto) {
		this.productos.add(producto);
	}

	@Override
	public String toString () {
		
		return "Categoria[id=" +getId()+ ",nombre"+ getNombre()+ ",descriopcion="+getDescripcion()+ "]";
	}
}
	}

	

