package main;

import carritoCompras.Carritodecompras;
import carritoCompras.Direccion;
import java.util.ArrayList;
import java.util.Date;

import carritoCompras.Horario;
import carritoCompras.ItemCarrito;
import gui.JCarrito;
import carritoCompras.Producto;
import categoria.Categoria;
import tienda.Tienda;
import java.awt.EventQueue;
import gui.JPaginaPrincipal;
import paginaPrincipal.Paginaprincipal;
import gui.JPerfil;
import perfil.Usuario;
import tienda.Tiendass;

public class Main {
	public static void main(String[] args) {
		/*Producto polloFrito=new Producto(1, "Pollo frito", 29.9, "6 piezas de pollo crujiente"),
				wrapper=new Producto(2, "Wrapper", 19.9, "Tortilla de pollo frito"),
				zapatilla=new Producto(3, "Zapatilla Nike", 199.9, "Zapatillas Nike modelo 2023"),
				pantalon=new Producto(4, "Pantalón Levi's", 95, "Pantalón jean");
				
		Tienda kfc=new Tienda("KFC", "A101", new Horario(new Date(), new Date(), new Date()), new ArrayList<Producto>());
		kfc.agregarProducto(polloFrito);
		kfc.agregarProducto(wrapper);
		
		Tienda ripley=new Tienda("Ripley", "B102", new Horario(new Date(), new Date(), new Date()), new ArrayList<Producto>());
		ripley.agregarProducto(zapatilla);
		ripley.agregarProducto(pantalon);
		
		pagina.agregarCategorias(restaurantes);
		pagina.agregarCategorias(tiendasPorDepartamento);
		pagina.agregarTiendas(kfc);
		pagina.agregarTiendas(ripley);
		
                ItemCarrito item=new ItemCarrito(polloFrito, 2);
                Direccion dir=new Direccion("calle", "Lima", "15432");
                Horario hor=new Horario(new Date(), new Date(), new Date());
                Carritodecompras carrito=new Carritodecompras(0, dir, hor);*/
                
   		Usuario usuario=new Usuario(1, "Dante", "Uchofen", "dante.uchofen@usil.pe", "72750855", "960575676", 1, new Date());		
		Paginaprincipal pagina=new Paginaprincipal(new ArrayList<Categoria>(), usuario, null, new ArrayList<Tienda>(), new Horario(new Date(), new Date(), new Date()));
  		System.out.println(pagina.toString());
                           
                EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        //new JPaginaPrincipal(pagina).setVisible(true);
                        new JPaginaPrincipal(pagina).setVisible(true);
                    }
            });
	}
}
