package paginaPrincipal;

public class Paginaprincipal {
	
	private List <Categoria> categorias;
	private Cliente cliente;
	private Carrito carrito;
	private List <Tienda> tienda;
	private Horario horario;
	
	public Paginaprincipal(List<Categoria> categorias, Cliente cliente, Carrito carrito, List <Tienda> tienda, Horario horario) {
		this.categorias = categorias;
		this.cliente = cliente;
		this.carrito = carrito;
		this.tienda= tienda;
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
	public List<Tienda> getTienda() {
		return tienda;
	}
	public void setTienda(List<Tienda> tienda) {
		this.tienda = tienda;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	}

