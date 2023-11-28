/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import paginaPrincipal.PaginaPrincipal;

/**
 *
 * @author user
 */
public class Gui {
    private PaginaPrincipal pagina;
    private JHeader header;

    public Gui(){       
    }

    public PaginaPrincipal getPagina() {
        return pagina;
    }

    public void setPagina(PaginaPrincipal pagina) {
        this.pagina = pagina;
    }

    public JHeader getHeader() {
        return header;
    }

    public void setHeader(JHeader header) {
        this.header = header;
    }
    
    public void limpiarImagenes(JPanel panel){
        for (int i = 0; i < panel.getComponentCount(); i++) {
            JLabel lblImagen=(JLabel)panel.getComponent(i);
            lblImagen.setIcon(null);
        }
    }
    
    public void mostrarProductos(JLabel lbl){
        if(lbl.getName()!=null){
            JProductos productos=new JProductos(this);
            productos.mostrarImagenes(lbl);                  
        }
    }
}
