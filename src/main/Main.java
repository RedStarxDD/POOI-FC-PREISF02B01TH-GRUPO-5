package main;

import java.util.ArrayList;
import java.util.Date;

import Carritocompras.Horario;
import Carritocompras.Producto;
import Categoria.Categoria;
import Tiendas.Tienda;
import paginaPrincipal.Paginaprincipal;
import perfil.Usuario;

public class Main {
	public static void main(String[] args) {
		Producto polloFrito=new Producto(1, "Pollo frito", 29.9, "6 piezas de pollo crujiente"),
				wrapper=new Producto(2, "Wrapper", 19.9, "Tortilla de pollo frito"),
				zapatilla=new Producto(3, "Zapatilla Nike", 199.9, "Zapatillas Nike modelo 2023"),
				pantalon=new Producto(4, "Pantalón Levi's", 95, "Pantalón jean");
				
		Tienda kfc=new Tienda("KFC", "A101", new Horario(new Date(), new Date(), new Date()), new ArrayList<Producto>());
		kfc.agregarProducto(polloFrito);
		kfc.agregarProducto(wrapper);
		
		Tienda ripley=new Tienda("Ripley", "B102", new Horario(new Date(), new Date(), new Date()), new ArrayList<Producto>());
		ripley.agregarProducto(zapatilla);
		ripley.agregarProducto(pantalon);
		
		Categoria restaurantes=new Categoria(1, "Restaurantes", "Pollo, hamburguesas, etc", new ArrayList<Tienda>());
		restaurantes.agregarTienda(kfc);
		
		Categoria tiendasPorDepartamento=new Categoria(2, "Tiendas por departamento", "Tiendas de ropa, accesorios, etc", new ArrayList<Tienda>());
		tiendasPorDepartamento.agregarTienda(ripley);
		
		Usuario usuario=new Usuario(1, "Dante", "Uchofen", "dante.uchofen@usil.pe", "72750855", "960575676", 1, new Date());
		
		Paginaprincipal pagina=new Paginaprincipal(new ArrayList<Categoria>(), usuario, null, new ArrayList<Tienda>(), new Horario(new Date(), new Date(), new Date()));
		pagina.agregarCategorias(restaurantes);
		pagina.agregarCategorias(tiendasPorDepartamento);
		pagina.agregarTiendas(kfc);
		pagina.agregarTiendas(ripley);
		
		System.out.println(pagina.toString());
	}
}
