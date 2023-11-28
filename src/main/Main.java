package main;

import java.util.Date;
import carritoCompras.Horario;
import gui.JHeader;
import java.awt.EventQueue;
import paginaPrincipal.PaginaPrincipal;
import perfil.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario=new Usuario(1, "Dante", "Uchofen", "dante.uchofen@usil.pe", "72750855", "960575676", 1, new Date());		
        PaginaPrincipal pagina=new PaginaPrincipal(usuario, new Horario(new Date(), new Date(), new Date()));
        System.out.println(pagina.toString());

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JHeader(pagina).setVisible(true);
            }
        });
    }
}
