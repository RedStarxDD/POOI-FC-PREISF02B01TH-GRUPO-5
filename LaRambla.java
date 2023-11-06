package larambla;
import java.util.ArrayList;
public class LaRambla {

		private static ArrayList<Categoria> categorias;
		
		public LaRambla() {
			this.categorias = new ArrayList<>();
		}
		
		public void agregarCategoria(Categoria categoria) {
			this.categorias.add(categoria);
		}
		
		public void mostrarCategorias() {
			for (Categoria categoria:categorias) {
				System.out.println("Nombre: "+ categoria.getNombre());
				System.out.println("Productos: "+ categoria.getProductos());
			}
		}
}

