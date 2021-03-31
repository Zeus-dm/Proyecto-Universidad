
package gui;

import domain.Region;
import FuncionesGeneral.FunRegion;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PanelMenuSucursales extends javax.swing.JPanel {
    private FramePrincipal fp = null;
    private Region region = null;
    private int id_sucursal = -1;
    
    public PanelMenuSucursales(FramePrincipal fp, int id_region) throws SQLException {
        this.fp = fp;
        this.region = FunRegion.select(id_region);
        
        initComponents();
        
        this.titulo.setText(region.getNombre()+" - "+Texts.SUCURSALES.getTexto());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSucursales = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        btnAgrSucursal = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnAgrSucursal1 = new javax.swing.JButton();

        jPanel1.setMaximumSize(new java.awt.Dimension(400, 450));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 450));
        jPanel1.setBackground(Color.decode(Colors.FONDO.getColor()));

        titulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText(Texts.SUCURSALES.getTexto());
        titulo.setForeground(Color.decode(Colors.TITULO.getColor()));

        jScrollPane1.getViewport().setBackground(Color.decode(Colors.FONDO.getColor()));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));

        tablaSucursales.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        tablaSucursales.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tablaSucursales.setForeground(Color.decode(Colors.TEXTO.getColor()));
        tablaSucursales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaSucursales.setColumnSelectionAllowed(true);
        tablaSucursales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaSucursales.setFocusable(false);
        tablaSucursales.setGridColor(Color.decode(Colors.FONDO.getColor()));
        tablaSucursales.setIntercellSpacing(new java.awt.Dimension(5, 0));
        tablaSucursales.setRowHeight(35);
        tablaSucursales.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaSucursales);

        jPanel2.setBackground(new java.awt.Color(204, 0, 204));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/chefcito_100.png"))); // NOI18N
        imagen.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        btnAgrSucursal.setBackground(Color.decode(Colors.FONDO_BOTON.getColor())
        );
        btnAgrSucursal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAgrSucursal.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnAgrSucursal.setText(Texts.AGR_SUCURSAL.getTexto());
        btnAgrSucursal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnAgrSucursal.setFocusable(false);
        btnAgrSucursal.setMaximumSize(new java.awt.Dimension(120, 30));
        btnAgrSucursal.setMinimumSize(new java.awt.Dimension(120, 30));
        btnAgrSucursal.setPreferredSize(new java.awt.Dimension(120, 30));
        btnAgrSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrSucursalActionPerformed(evt);
            }
        });

        btnVolver.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnVolver.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnVolver.setText(Texts.VOLVER.getTexto());
        btnVolver.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnVolver.setFocusable(false);
        btnVolver.setMaximumSize(new java.awt.Dimension(120, 30));
        btnVolver.setMinimumSize(new java.awt.Dimension(120, 30));
        btnVolver.setPreferredSize(new java.awt.Dimension(120, 30));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnAgrSucursal1.setBackground(Color.decode(Colors.FONDO_BOTON.getColor())
        );
        btnAgrSucursal1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAgrSucursal1.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnAgrSucursal1.setText(Texts.ELIM_SUCURSAL.getTexto());
        btnAgrSucursal1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnAgrSucursal1.setFocusable(false);
        btnAgrSucursal1.setMaximumSize(new java.awt.Dimension(120, 30));
        btnAgrSucursal1.setMinimumSize(new java.awt.Dimension(120, 30));
        btnAgrSucursal1.setPreferredSize(new java.awt.Dimension(120, 30));
        btnAgrSucursal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrSucursal1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAgrSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgrSucursal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnAgrSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgrSucursal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

//Botones Menu Sucursal    
    private void btnAgrSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgrSucursalActionPerformed

    private void btnAgrSucursal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrSucursal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgrSucursal1ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        try {
            PanelMenuRegiones pmr = new PanelMenuRegiones(fp);
            fp.cargarPanel(pmr);
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuSucursales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgrSucursal;
    private javax.swing.JButton btnAgrSucursal1;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaSucursales;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
