package paginaweb;

public class PáginaPrincipal {
	private List<Categoria> categorias;
	private Cliente cliente;
	private Carrito carrito;
	private Horario horario;
	
	public PáginaPrincipal(List<Categoria> categorias, Cliente cliente, Carrito carrito, Horario horario) {
		this.categorias = categorias;
		this.cliente = cliente;
		this.carrito = carrito;
		this.horario = horario;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Carrito getCarrito() {
		return carrito;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}
	
	
	
}