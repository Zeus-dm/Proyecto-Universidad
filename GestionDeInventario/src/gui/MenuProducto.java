
package gui;

import java.awt.Color;
import java.sql.SQLException;


public class MenuProducto extends javax.swing.JFrame {
    private int id_cliente = -1;
            
    public MenuProducto() throws SQLException {
        initComponents();
        
        rsscalelabel.RSScaleLabel.setScaleLabel(imagen, "src/gui/images/chefcito_100.png");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        textBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        Lprecio = new javax.swing.JLabel();
        Lmin = new javax.swing.JLabel();
        textPrecioMin = new javax.swing.JTextField();
        Lmax = new javax.swing.JLabel();
        textPrecioMax = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
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

        titulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText(Texts.PRODUCTOS.getTexto());
        titulo.setForeground(Color.decode(Colors.TITULO.getColor()));

        jScrollPane1.getViewport().setBackground(Color.decode(Colors.FONDO.getColor()));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(250, 340));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));

        jTable1.setForeground(Color.decode(Colors.TEXTO.getColor()));
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setGridColor(Color.decode(Colors.FONDO.getColor()));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setFocusable(false);
        jTable1.setIntercellSpacing(new java.awt.Dimension(5, 0));
        jTable1.setRowHeight(35);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnVolver.setBackground(Color.decode(Colors.FONDO_BOTON.getColor())
        );
        btnVolver.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnVolver.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor())
        );
        btnVolver.setText(Texts.VOLVER.getTexto());
        btnVolver.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnVolver.setFocusable(false);
        btnVolver.setMaximumSize(new java.awt.Dimension(75, 30));
        btnVolver.setMinimumSize(new java.awt.Dimension(75, 30));
        btnVolver.setPreferredSize(new java.awt.Dimension(102, 29));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        textBuscar.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor())
        );
        textBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textBuscar.setForeground(Color.decode(Colors.TEXTO.getColor())
        );
        textBuscar.setToolTipText(""); // NOI18N
        textBuscar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())
        ), javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor())
        )));
        textBuscar.setPreferredSize(new java.awt.Dimension(79, 30));

        btnBuscar.setBackground(Color.decode(Colors.FONDO_BOTON.getColor())
        );
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnBuscar.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor())
        );
        btnBuscar.setText(Texts.BUSCAR.getTexto());
        btnBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnBuscar.setFocusable(false);
        btnBuscar.setMaximumSize(new java.awt.Dimension(76, 30));
        btnBuscar.setMinimumSize(new java.awt.Dimension(76, 30));
        btnBuscar.setPreferredSize(new java.awt.Dimension(72, 30));

        Lprecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lprecio.setForeground(Color.decode(Colors.TEXTO.getColor())
        );
        Lprecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lprecio.setText(Texts.PRECIO.getTexto());
        Lprecio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode(Colors.BORDE.getColor())));
        Lprecio.setMaximumSize(new java.awt.Dimension(37, 22));
        Lprecio.setMinimumSize(new java.awt.Dimension(37, 22));
        Lprecio.setPreferredSize(new java.awt.Dimension(37, 22));

        Lmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lmin.setForeground(Color.decode(Colors.TEXTO.getColor())
        );
        Lmin.setText(Texts.MIN.getTexto());
        Lmin.setMaximumSize(new java.awt.Dimension(24, 22));
        Lmin.setMinimumSize(new java.awt.Dimension(24, 22));
        Lmin.setPreferredSize(new java.awt.Dimension(30, 22));

        textPrecioMin.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor())
        );
        textPrecioMin.setForeground(Color.decode(Colors.TEXTO.getColor())
        );
        textPrecioMin.setText("0");
        textPrecioMin.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())), javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor()))));
        textPrecioMin.setPreferredSize(new java.awt.Dimension(64, 23));

        Lmax.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lmax.setForeground(Color.decode(Colors.TEXTO.getColor())
        );
        Lmax.setText(Texts.MAX.getTexto());
        Lmax.setMaximumSize(new java.awt.Dimension(23, 22));
        Lmax.setMinimumSize(new java.awt.Dimension(23, 22));
        Lmax.setPreferredSize(new java.awt.Dimension(30, 22));

        textPrecioMax.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor())
        );
        textPrecioMax.setForeground(Color.decode(Colors.TEXTO.getColor())
        );
        textPrecioMax.setText("0");
        textPrecioMax.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())
        ), javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor())
        )));
        textPrecioMax.setPreferredSize(new java.awt.Dimension(64, 23));

        jPanel2.setBackground(new java.awt.Color(204, 0, 204));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Lmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textPrecioMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Lmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textPrecioMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(Lprecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 2, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(textBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Lprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPrecioMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPrecioMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))))
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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuPrincipal mp = new MenuPrincipal();
        this.setVisible(false);
        mp.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

//Main
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new MenuProducto().setVisible(true);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lmax;
    private javax.swing.JLabel Lmin;
    private javax.swing.JLabel Lprecio;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textBuscar;
    private javax.swing.JTextField textPrecioMax;
    private javax.swing.JTextField textPrecioMin;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}