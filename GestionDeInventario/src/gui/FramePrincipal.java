
package gui;

import FuncionesGeneral.FunIniciar;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;


public class FramePrincipal extends javax.swing.JFrame {
    
    public FramePrincipal() throws SQLException {
        FunIniciar.iniciar();
        
        initComponents();
        
        PanelMenuPrincipal pmp = new PanelMenuPrincipal(this);
        cargarPanel(pmp);
    }
    
    public final void cargarPanel(JPanel nuevoPanel){
        this.panelPrincipal.removeAll();
        this.panelPrincipal.add(nuevoPanel);
        this.panelPrincipal.repaint();
        this.panelPrincipal.revalidate();
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("gui/images/chefcito_icon_80.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(Texts.TITULO.getTexto());
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(400, 450));
        setName("framePrincipal"); // NOI18N
        setResizable(false);

        panelPrincipal.setMaximumSize(new java.awt.Dimension(400, 450));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(400, 450));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(400, 450));
        panelPrincipal.setBackground(Color.decode(Colors.FONDO.getColor()));
        panelPrincipal.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new FramePrincipal().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}