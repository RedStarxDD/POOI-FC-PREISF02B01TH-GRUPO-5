package larambla;
import java.util.*;


public class Categoria {
	public int id;
	public String nombre;
	public String descripcion;
	
	    private static ArrayList<String> productos;
	    
		public Categoria(int id, String nombre, String descripcion) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.descripcion = descripcion;
			Categoria.productos=new ArrayList<>();
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

		public static ArrayList<String> getProductos() {
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

	

