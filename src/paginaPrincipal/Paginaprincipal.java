package paginaPrincipal;

import java.util.ArrayList;

import carritocompras.Carritodecompras;
import carritocompras.Horario;
import categoria.Categoria;
import tiendas.Tienda;
import perfil.Usuario;

public class Paginaprincipal {
	
	private ArrayList<Categoria> categorias;
	private Usuario usuario;
	private Carritodecompras carrito;
	private ArrayList<Tienda> tiendas;
	private Horario horario;
	
	public Paginaprincipal(ArrayList<Categoria> categorias, Usuario usuario, Carritodecompras carrito,
			ArrayList<Tienda> tienda, Horario horario) {
		super();
		this.categorias = categorias;
		this.usuario = usuario;
		this.carrito = carrito;
		this.tiendas = tienda;
		this.horario = horario;
	}

	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Carritodecompras getCarrito() {
		return carrito;
	}

	public void setCarrito(Carritodecompras carrito) {
		this.carrito = carrito;
	}

	public ArrayList<Tienda> getTienda() {
		return tiendas;
	}

	public void setTienda(ArrayList<Tienda> tienda) {
		this.tiendas = tienda;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}
	
	public void agregarCategorias(Categoria categoria) {
		categorias.add(categoria);
	}
	
	public void agregarTiendas(Tienda tienda) {
		tiendas.add(tienda);
	}

	@Override
	public String toString() {
		return "Paginaprincipal [categorias=" + categorias + ",\nusuario=" + usuario + ",\ncarrito=" + carrito
				+ ",\ntiendas=" + tiendas + ",\nhorario=" + horario + "]";
	}
	
	
}

