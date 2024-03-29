/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import categoria.Categoria;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import tienda.Tienda;

/**
 *
 * @author user
 */
public class JCategoria extends javax.swing.JFrame {

    /**
     * Creates new form JTest
     */
    
    private Gui gui;
    
    public JCategoria(Gui g) {
        initComponents();
        this.gui=g;
    }
    
    public void mostrarImagenes(Categoria categoria){
        lblTitulo.setText(categoria.getNombre());
            
        gui.limpiarImagenes(panelImagenes);
        int componentIndex=0;
        
        for (Tienda t : categoria.getTiendas()) {
            if(componentIndex<panelImagenes.getComponentCount()){
                JLabel lblImagen=(JLabel)panelImagenes.getComponent(componentIndex);
                try {
                    ImageIcon img=new ImageIcon(getClass().getResource("/resources/tiendas/"+t.getID_TIENDA()+".png"));                  
                    if(img!=null) lblImagen.setIcon(img);
                    lblImagen.setName(Integer.toString(t.getID_TIENDA()));
                } catch (Exception e) {
                    System.out.println("No se encontró la img de la tienda con el id: "+t.getID_TIENDA());
                }
                componentIndex++;                                   
            }
        }

        gui.getHeader().mostrarPanel(content);
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panelImagenes = new javax.swing.JPanel();
        lblImagen1 = new javax.swing.JLabel();
        lblImagen2 = new javax.swing.JLabel();
        lblImagen3 = new javax.swing.JLabel();
        lblImagen4 = new javax.swing.JLabel();
        lblImagen5 = new javax.swing.JLabel();
        lblImagen6 = new javax.swing.JLabel();
        lblImagen7 = new javax.swing.JLabel();
        lblImagen8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        content.setPreferredSize(new java.awt.Dimension(720, 382));
        content.setVerifyInputWhenFocusTarget(false);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        panelImagenes.setBackground(new java.awt.Color(255, 204, 204));
        panelImagenes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen1.setPreferredSize(new java.awt.Dimension(130, 130));
        lblImagen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagen1MouseClicked(evt);
            }
        });
        panelImagenes.add(lblImagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblImagen2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen2.setPreferredSize(new java.awt.Dimension(130, 130));
        lblImagen2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagen2MouseClicked(evt);
            }
        });
        panelImagenes.add(lblImagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        lblImagen3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen3.setPreferredSize(new java.awt.Dimension(130, 130));
        lblImagen3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagen3MouseClicked(evt);
            }
        });
        panelImagenes.add(lblImagen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        lblImagen4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen4.setPreferredSize(new java.awt.Dimension(130, 130));
        lblImagen4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagen4MouseClicked(evt);
            }
        });
        panelImagenes.add(lblImagen4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        lblImagen5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen5.setPreferredSize(new java.awt.Dimension(130, 130));
        lblImagen5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagen5MouseClicked(evt);
            }
        });
        panelImagenes.add(lblImagen5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        lblImagen6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen6.setPreferredSize(new java.awt.Dimension(130, 130));
        lblImagen6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagen6MouseClicked(evt);
            }
        });
        panelImagenes.add(lblImagen6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        lblImagen7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen7.setPreferredSize(new java.awt.Dimension(130, 130));
        lblImagen7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagen7MouseClicked(evt);
            }
        });
        panelImagenes.add(lblImagen7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        lblImagen8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen8.setPreferredSize(new java.awt.Dimension(130, 130));
        lblImagen8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagen8MouseClicked(evt);
            }
        });
        panelImagenes.add(lblImagen8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, -1, -1));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelImagenes, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE))
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelImagenes, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblImagen1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagen1MouseClicked
        // TODO add your handling code here:
        gui.mostrarProductos(lblImagen1);
    }//GEN-LAST:event_lblImagen1MouseClicked

    private void lblImagen2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagen2MouseClicked
        // TODO add your handling code here:
        gui.mostrarProductos(lblImagen2);
    }//GEN-LAST:event_lblImagen2MouseClicked

    private void lblImagen3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagen3MouseClicked
        // TODO add your handling code here:
        gui.mostrarProductos(lblImagen3);
    }//GEN-LAST:event_lblImagen3MouseClicked

    private void lblImagen4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagen4MouseClicked
        // TODO add your handling code here:
        gui.mostrarProductos(lblImagen4);
    }//GEN-LAST:event_lblImagen4MouseClicked

    private void lblImagen5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagen5MouseClicked
        // TODO add your handling code here:
        gui.mostrarProductos(lblImagen5);
    }//GEN-LAST:event_lblImagen5MouseClicked

    private void lblImagen6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagen6MouseClicked
        // TODO add your handling code here:
        gui.mostrarProductos(lblImagen6);
    }//GEN-LAST:event_lblImagen6MouseClicked

    private void lblImagen7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagen7MouseClicked
        // TODO add your handling code here:
        gui.mostrarProductos(lblImagen7);
    }//GEN-LAST:event_lblImagen7MouseClicked

    private void lblImagen8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagen8MouseClicked
        // TODO add your handling code here:
        gui.mostrarProductos(lblImagen8);
    }//GEN-LAST:event_lblImagen8MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new JCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblImagen3;
    private javax.swing.JLabel lblImagen4;
    private javax.swing.JLabel lblImagen5;
    private javax.swing.JLabel lblImagen6;
    private javax.swing.JLabel lblImagen7;
    private javax.swing.JLabel lblImagen8;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelImagenes;
    // End of variables declaration//GEN-END:variables
}
