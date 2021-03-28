
package gui;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        
        rsscalelabel.RSScaleLabel.setScaleLabel(imagen, "src/gui/images/chefcito_150.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnRegiones = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(Texts.TITULO.getTexto());
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(400, 450));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(400, 450));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 450));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 450));
        jPanel1.setBackground(Color.decode(Colors.FONDO.getColor()));

        titulo.setFont(new java.awt.Font("Segoe UI", 3, 34)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText(Texts.TITULO.getTexto());
        titulo.setForeground(Color.decode(Colors.TITULO.getColor()));

        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSalir.setText(Texts.SALIR.getTexto());
        btnSalir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnSalir.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));

        btnSalir.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnSalir.setFocusable(false);
        btnSalir.setMaximumSize(new java.awt.Dimension(110, 30));
        btnSalir.setMinimumSize(new java.awt.Dimension(110, 30));
        btnSalir.setPreferredSize(new java.awt.Dimension(110, 30));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnReportes.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnReportes.setText(Texts.REPORTES.getTexto());
        btnReportes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnReportes.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));

        btnReportes.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnReportes.setFocusable(false);
        btnReportes.setMaximumSize(new java.awt.Dimension(110, 30));
        btnReportes.setMinimumSize(new java.awt.Dimension(110, 30));
        btnReportes.setPreferredSize(new java.awt.Dimension(110, 30));

        btnProductos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnProductos.setText(Texts.PRODUCTOS.getTexto());
        btnProductos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnProductos.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));

        btnProductos.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnProductos.setFocusable(false);
        btnProductos.setMaximumSize(new java.awt.Dimension(110, 30));
        btnProductos.setMinimumSize(new java.awt.Dimension(110, 30));
        btnProductos.setPreferredSize(new java.awt.Dimension(110, 30));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnClientes.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnClientes.setText(Texts.CLIENTES.getTexto());
        btnClientes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnClientes.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));

        btnClientes.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnClientes.setFocusable(false);
        btnClientes.setMaximumSize(new java.awt.Dimension(110, 30));
        btnClientes.setMinimumSize(new java.awt.Dimension(110, 30));
        btnClientes.setPreferredSize(new java.awt.Dimension(110, 30));
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnRegiones.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnRegiones.setText(Texts.REGIONES.getTexto());
        btnRegiones.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnRegiones.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));

        btnRegiones.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnRegiones.setFocusable(false);
        btnRegiones.setMaximumSize(new java.awt.Dimension(110, 30));
        btnRegiones.setMinimumSize(new java.awt.Dimension(110, 30));
        btnRegiones.setPreferredSize(new java.awt.Dimension(110, 30));
        btnRegiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegionesActionPerformed(evt);
            }
        });

        jPanel2.setBackground(Color.decode(Colors.FONDO.getColor()));
        jPanel2.setPreferredSize(new java.awt.Dimension(192, 222));

        jPanel3.setBackground(new java.awt.Color(255, 0, 204));
        jPanel3.setMaximumSize(new java.awt.Dimension(151, 151));
        jPanel3.setMinimumSize(new java.awt.Dimension(151, 151));
        jPanel3.setPreferredSize(new java.awt.Dimension(151, 151));

        imagen.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        imagen.setPreferredSize(new java.awt.Dimension(151, 151));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegionesActionPerformed
        try {
            MenuRegiones mr = new MenuRegiones();
            
            this.setVisible(false);
            mr.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegionesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        try {
            MenuClientes mc = new MenuClientes();
            
            this.setVisible(false);
            mc.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        try {
            MenuProducto mp = new MenuProducto();
            
            this.setVisible(false);
            mp.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnProductosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnRegiones;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
