package paginaPrincipal;

import java.util.ArrayList;

import carritoCompras.Carritodecompras;
import carritoCompras.Horario;
import carritoCompras.Producto;
import categoria.Categoria;
import tienda.Tienda;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
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
        cargarArchivo("categorias", 1);
        cargarArchivo("tiendas", 2);
        cargarArchivo("productos", 3);
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

    public ArrayList<Tienda> getTiendas() {
        return tiendas;
    }

    public void setTiendas(ArrayList<Tienda> tienda) {
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

    private void readFromInputStream(InputStream inputStream, int pos) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String linea;
        while ((linea = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(linea, ";");
            switch (pos) {
                case 1:
                    crearCategoria(st);
                    break;
                case 2:
                    crearTienda(st);
                    break;
                case 3:
                    crearProducto(st);
                    break;
                default:
                    throw new AssertionError();
            }
        }
        br.close();
    }

    // M�todo que a�adir a los estudiantes del archivo .txt en el arrayList estudiantes.
    private void crearCategoria(StringTokenizer st) {
        int id = Integer.parseInt(st.nextToken().strip());
        String nombre = st.nextToken().strip();
        String descripcion = st.nextToken().strip();

        Categoria categoria = new Categoria(id, nombre, descripcion);
        categorias.add(categoria);
    }

    private void crearTienda(StringTokenizer st) {
        int id = Integer.parseInt(st.nextToken().strip());
        String nombre = st.nextToken().strip();
        int idCategoria=Integer.parseInt(st.nextToken().strip());

        Tienda tienda = new Tienda(id, nombre, null);
        agregarTiendas(tienda);
        
        for (Categoria c : categorias) {
            if(c.getId()==idCategoria){
                c.agregarTienda(tienda);
            }
        }
    }

    private void crearProducto(StringTokenizer st) {
        int id = Integer.parseInt(st.nextToken().strip());
        String nombre = st.nextToken().strip();
        double precio = Double.parseDouble(st.nextToken().strip());
        String descripcion = st.nextToken().strip();
        String tienda = st.nextToken().strip();

        Producto producto = new Producto(id, nombre, precio, descripcion);
        for (Tienda t : tiendas) {
            if (t.getNombre().equalsIgnoreCase(tienda)) {
                t.agregarProducto(producto);
            }
        }
    }

    // M�todos para manipular el archivo de texto
    private void cargarArchivo(String nombre, int pos) {
        try {
            File file = new File("./src/" + nombre + ".txt");
            Class<Paginaprincipal> clazz = Paginaprincipal.class;
            InputStream inputStream = clazz.getResourceAsStream("/" + nombre + ".txt");
            if (file.exists()) {
                readFromInputStream(inputStream, pos);
            } else {
                JOptionPane.showMessageDialog(null,
                        "El archivo txt no existe");
            }
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "Se produjo un error= " + x);
        }
    }

}
