
package gui;

import java.awt.Color;
import FuncionesGeneral.FunRegion;
import domain.Region;
import java.sql.SQLException;
import java.util.List;

public class MenuRegiones extends javax.swing.JFrame {

    public MenuRegiones() throws SQLException {
        initComponents();
        
        mostrar(FunRegion.listarRegiones());
    }
    
    public void mostrar(List<Region> regiones){
        String matriz[][]=new String[regiones.size()][1];
        Region region;
        
        for(int i=0; i<regiones.size(); i++){
            region = regiones.get(i);
            matriz[i][0] = "  "+region.getNombre();
        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                ""
            }
        ));
    }
    
    public void ItemsComboElim(List<Region> regiones){
        this.listaRegiones.removeAllItems();
        
        if(regiones.isEmpty()){
            return;
        }

        for (Region region : regiones) {
            this.listaRegiones.addItem(region.getNombre());
        }
        this.listaRegiones.setSelectedIndex(0);
    }
    
    public void ItemsComboMod(List<Region> regiones){
        this.listaRegiones1.removeAllItems();
        
        if(regiones.isEmpty()){
            return;
        }

        for (Region region : regiones) {
            this.listaRegiones1.addItem(region.getNombre());
        }
        this.listaRegiones1.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgrRegion = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        tituloAgregar = new javax.swing.JLabel();
        Lnombre = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textErrorAgr = new javax.swing.JLabel();
        btnAceptarAgr = new javax.swing.JButton();
        btnCancelarAgr = new javax.swing.JButton();
        ElimRegion = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        tituloEliminar = new javax.swing.JLabel();
        Lregion = new javax.swing.JLabel();
        btnAceptarElim = new javax.swing.JButton();
        btnCancelarElim = new javax.swing.JButton();
        listaRegiones = new javax.swing.JComboBox<>();
        ModRegion = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        tituloModificar = new javax.swing.JLabel();
        Lregion1 = new javax.swing.JLabel();
        btnAceptarMod = new javax.swing.JButton();
        btnCancelarMod = new javax.swing.JButton();
        listaRegiones1 = new javax.swing.JComboBox<>();
        Lnombre1 = new javax.swing.JLabel();
        textNombre1 = new javax.swing.JTextField();
        textErrorAgr1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        btnAgrRegion = new javax.swing.JButton();
        btnElimRegion = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnModRegion = new javax.swing.JButton();

        AgrRegion.setTitle("Titulo");
        AgrRegion.setMinimumSize(new java.awt.Dimension(365, 240));
        AgrRegion.setLocationRelativeTo(null);
        AgrRegion.setModal(true);
        AgrRegion.setResizable(false);

        jPanel3.setBackground(Color.decode(Colors.FONDO.getColor()));

        tituloAgregar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tituloAgregar.setForeground(Color.decode(Colors.TITULO.getColor()));
        tituloAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloAgregar.setText("Agregar Nueva Región");

        Lnombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lnombre.setForeground(Color.decode(Colors.TEXTO.getColor()));
        Lnombre.setText("Nombre");
        Lnombre.setPreferredSize(new java.awt.Dimension(60, 26));

        textNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE_BOTON.getColor())));
        textNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textNombre.setName(""); // NOI18N
        textNombre.setRequestFocusEnabled(false);
        textNombre.setBackground(Color.decode(Colors.GRIS.getColor()));
        textNombre.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textErrorAgr.setText("* Posible Error");
        textErrorAgr.setForeground(Color.decode(Colors.TEXT_ERROR.getColor()));

        btnAceptarAgr.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAceptarAgr.setText("Aceptar");
        btnAceptarAgr.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE_BOTON.getColor())));
        btnAceptarAgr.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));

        btnAceptarAgr.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnAceptarAgr.setFocusable(false);
        btnAceptarAgr.setMaximumSize(new java.awt.Dimension(110, 30));
        btnAceptarAgr.setMinimumSize(new java.awt.Dimension(110, 30));
        btnAceptarAgr.setPreferredSize(new java.awt.Dimension(110, 30));
        btnAceptarAgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarAgrActionPerformed(evt);
            }
        });

        btnCancelarAgr.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCancelarAgr.setText("Cancelar");
        btnCancelarAgr.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE_BOTON.getColor())));
        btnCancelarAgr.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));

        btnCancelarAgr.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnCancelarAgr.setFocusable(false);
        btnCancelarAgr.setMaximumSize(new java.awt.Dimension(110, 30));
        btnCancelarAgr.setMinimumSize(new java.awt.Dimension(110, 30));
        btnCancelarAgr.setPreferredSize(new java.awt.Dimension(110, 30));
        btnCancelarAgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAgrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnAceptarAgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelarAgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textErrorAgr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Lnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloAgregar)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textErrorAgr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarAgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarAgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout AgrRegionLayout = new javax.swing.GroupLayout(AgrRegion.getContentPane());
        AgrRegion.getContentPane().setLayout(AgrRegionLayout);
        AgrRegionLayout.setHorizontalGroup(
            AgrRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AgrRegionLayout.setVerticalGroup(
            AgrRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ElimRegion.setTitle("Titulo");
        ElimRegion.setMinimumSize(new java.awt.Dimension(365, 240));
        ElimRegion.setModal(true);
        ElimRegion.setResizable(false);

        jPanel4.setBackground(Color.decode(Colors.FONDO.getColor()));

        tituloEliminar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tituloEliminar.setForeground(Color.decode(Colors.TITULO.getColor()));
        tituloEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEliminar.setText("Eliminar Región");

        Lregion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lregion.setText("Region");
        Lregion.setForeground(Color.decode(Colors.TEXTO.getColor()));
        Lregion.setPreferredSize(new java.awt.Dimension(60, 26));

        btnAceptarElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAceptarElim.setText("Aceptar");
        btnAceptarElim.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE_BOTON.getColor())));
        btnAceptarElim.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnAceptarElim.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnAceptarElim.setFocusable(false);
        btnAceptarElim.setMaximumSize(new java.awt.Dimension(110, 30));
        btnAceptarElim.setMinimumSize(new java.awt.Dimension(110, 30));
        btnAceptarElim.setPreferredSize(new java.awt.Dimension(110, 30));
        btnAceptarElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarElimActionPerformed(evt);
            }
        });

        btnCancelarElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCancelarElim.setText("Cancelar");
        btnCancelarElim.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE_BOTON.getColor())));
        btnCancelarElim.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnCancelarElim.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnCancelarElim.setFocusable(false);
        btnCancelarElim.setMaximumSize(new java.awt.Dimension(110, 30));
        btnCancelarElim.setMinimumSize(new java.awt.Dimension(110, 30));
        btnCancelarElim.setPreferredSize(new java.awt.Dimension(110, 30));
        btnCancelarElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarElimActionPerformed(evt);
            }
        });

        listaRegiones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listaRegiones.setMaximumRowCount(50);
        listaRegiones.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE_BOTON.getColor())));
        listaRegiones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaRegiones.setFocusable(false);
        listaRegiones.setBackground(Color.decode(Colors.GRIS.getColor()));
        listaRegiones.setForeground(Color.decode(Colors.TEXTO.getColor()));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnAceptarElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(btnCancelarElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Lregion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(listaRegiones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloEliminar)
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lregion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaRegiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout ElimRegionLayout = new javax.swing.GroupLayout(ElimRegion.getContentPane());
        ElimRegion.getContentPane().setLayout(ElimRegionLayout);
        ElimRegionLayout.setHorizontalGroup(
            ElimRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ElimRegionLayout.setVerticalGroup(
            ElimRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ModRegion.setTitle("Titulo");
        ModRegion.setMinimumSize(new java.awt.Dimension(365, 290));
        ModRegion.setModal(true);
        ModRegion.setResizable(false);

        jPanel5.setBackground(Color.decode(Colors.FONDO.getColor()));

        tituloModificar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tituloModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificar.setForeground(Color.decode(Colors.TITULO.getColor()));
        tituloModificar.setText("Modificar Región");

        Lregion1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lregion1.setText("Region");
        Lregion1.setForeground(Color.decode(Colors.TEXTO.getColor()));
        Lregion1.setPreferredSize(new java.awt.Dimension(60, 26));

        btnAceptarMod.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAceptarMod.setText("Aceptar");
        btnAceptarMod.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE_BOTON.getColor())));
        btnAceptarMod.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnAceptarMod.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnAceptarMod.setFocusable(false);
        btnAceptarMod.setMaximumSize(new java.awt.Dimension(110, 30));
        btnAceptarMod.setMinimumSize(new java.awt.Dimension(110, 30));
        btnAceptarMod.setPreferredSize(new java.awt.Dimension(110, 30));
        btnAceptarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarModActionPerformed(evt);
            }
        });

        btnCancelarMod.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCancelarMod.setText("Cancelar");
        btnCancelarMod.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE_BOTON.getColor())));
        btnCancelarMod.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnCancelarMod.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnCancelarMod.setFocusable(false);
        btnCancelarMod.setMaximumSize(new java.awt.Dimension(110, 30));
        btnCancelarMod.setMinimumSize(new java.awt.Dimension(110, 30));
        btnCancelarMod.setPreferredSize(new java.awt.Dimension(110, 30));
        btnCancelarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarModActionPerformed(evt);
            }
        });

        listaRegiones1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listaRegiones1.setMaximumRowCount(50);
        listaRegiones1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE_BOTON.getColor())));
        listaRegiones1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaRegiones1.setFocusable(false);
        listaRegiones1.setBackground(Color.decode(Colors.GRIS.getColor()));
        listaRegiones1.setForeground(Color.decode(Colors.TEXTO.getColor()));

        Lnombre1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lnombre1.setText("Nombre");
        Lnombre1.setForeground(Color.decode(Colors.TEXTO.getColor()));
        Lnombre1.setPreferredSize(new java.awt.Dimension(60, 26));

        textNombre1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textNombre1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE_BOTON.getColor())));
        textNombre1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textNombre1.setName(""); // NOI18N
        textNombre1.setRequestFocusEnabled(false);
        textNombre1.setBackground(Color.decode(Colors.GRIS.getColor()));
        textNombre1.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textErrorAgr1.setText("* Posible Error");
        textErrorAgr1.setForeground(Color.decode(Colors.TEXT_ERROR.getColor()));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textErrorAgr1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(Lnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(btnAceptarMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(70, 70, 70)
                                    .addComponent(btnCancelarMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(Lregion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(listaRegiones1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloModificar)
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lregion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaRegiones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textErrorAgr1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout ModRegionLayout = new javax.swing.GroupLayout(ModRegion.getContentPane());
        ModRegion.getContentPane().setLayout(ModRegionLayout);
        ModRegionLayout.setHorizontalGroup(
            ModRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ModRegionLayout.setVerticalGroup(
            ModRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Titulo");
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(400, 450));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(400, 450));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 450));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 450));
        jPanel1.setBackground(Color.decode(Colors.FONDO.getColor()));

        titulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Regiones");
        titulo.setForeground(Color.decode(Colors.TITULO.getColor()));

        jScrollPane1.getViewport().setBackground(Color.decode(Colors.FONDO.getColor()));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE_BOTON.getColor())));

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
        jTable1.setBackground(Color.decode(Colors.GRIS.getColor()));

        jTable1.setForeground(Color.decode(Colors.TEXTO.getColor()));
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setGridColor(Color.decode(Colors.FONDO.getColor()));
        jTable1.setFocusable(false);
        jTable1.setIntercellSpacing(new java.awt.Dimension(5, 0));
        jTable1.setRowHeight(35);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel2.setBackground(new java.awt.Color(204, 0, 204));

        imagen.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE_BOTON.getColor())));

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

        btnAgrRegion.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAgrRegion.setText("Agr. Región");
        btnAgrRegion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE_BOTON.getColor())));
        btnAgrRegion.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));

        btnAgrRegion.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnAgrRegion.setFocusable(false);
        btnAgrRegion.setMaximumSize(new java.awt.Dimension(120, 30));
        btnAgrRegion.setMinimumSize(new java.awt.Dimension(120, 30));
        btnAgrRegion.setPreferredSize(new java.awt.Dimension(120, 30));
        btnAgrRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrRegionActionPerformed(evt);
            }
        });

        btnElimRegion.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnElimRegion.setText("Elim. Región");
        btnElimRegion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE_BOTON.getColor())));
        btnElimRegion.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));

        btnElimRegion.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnElimRegion.setFocusable(false);
        btnElimRegion.setMaximumSize(new java.awt.Dimension(120, 30));
        btnElimRegion.setMinimumSize(new java.awt.Dimension(120, 20));
        btnElimRegion.setPreferredSize(new java.awt.Dimension(120, 30));
        btnElimRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimRegionActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE_BOTON.getColor())));
        btnVolver.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));

        btnVolver.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnVolver.setFocusable(false);
        btnVolver.setMaximumSize(new java.awt.Dimension(120, 30));
        btnVolver.setMinimumSize(new java.awt.Dimension(120, 30));
        btnVolver.setPreferredSize(new java.awt.Dimension(120, 30));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnModRegion.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnModRegion.setText("Mod. Región");
        btnModRegion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE_BOTON.getColor())));
        btnModRegion.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnModRegion.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnModRegion.setFocusable(false);
        btnModRegion.setMaximumSize(new java.awt.Dimension(120, 30));
        btnModRegion.setMinimumSize(new java.awt.Dimension(120, 20));
        btnModRegion.setPreferredSize(new java.awt.Dimension(120, 30));
        btnModRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModRegionActionPerformed(evt);
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
                                    .addComponent(btnElimRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgrRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnModRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addComponent(btnAgrRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnElimRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void btnAgrRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrRegionActionPerformed
        this.AgrRegion.setLocationRelativeTo(null);
        this.textNombre.setText("");
        this.textErrorAgr.setText("");
        this.AgrRegion.setVisible(true);
    }//GEN-LAST:event_btnAgrRegionActionPerformed

    private void btnCancelarAgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAgrActionPerformed
        this.AgrRegion.setVisible(false);
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCancelarAgrActionPerformed

    private void btnCancelarElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarElimActionPerformed
        this.ElimRegion.setVisible(false);
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCancelarElimActionPerformed

    private void btnElimRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimRegionActionPerformed
        try {
            this.ItemsComboElim(FunRegion.listarRegiones());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        this.ElimRegion.setLocationRelativeTo(null);
        this.ElimRegion.setVisible(true);
    }//GEN-LAST:event_btnElimRegionActionPerformed

    private void btnAceptarAgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarAgrActionPerformed
        String ok = null;
        try {
            ok = FunRegion.agregarRegion(this.textNombre.getText());
            if(ok != null){
                this.textErrorAgr.setText(ok);
                return;
            }
            
            this.mostrar(FunRegion.listarRegiones());
            
            this.AgrRegion.setVisible(false);
            this.setLocationRelativeTo(null);
            
        } catch (SQLException ex) {
            this.textErrorAgr.setText("* Error: Conexion SQL");
        }
    }//GEN-LAST:event_btnAceptarAgrActionPerformed

    private void btnAceptarElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarElimActionPerformed
        try {
            List<Region> regiones = FunRegion.listarRegiones();
            if(regiones.isEmpty()){
                this.ElimRegion.setVisible(false);
                this.setLocationRelativeTo(null);
                return;
            }
            
            int pos = this.listaRegiones.getSelectedIndex();
            FunRegion.eliminarRegion(regiones.get(pos));
            
            this.mostrar(FunRegion.listarRegiones());
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
   
        this.ElimRegion.setVisible(false);
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAceptarElimActionPerformed

    private void btnModRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModRegionActionPerformed
        try {
            this.ItemsComboMod(FunRegion.listarRegiones());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        this.textNombre1.setText("");
        this.textErrorAgr1.setText("");
        
        this.ModRegion.setLocationRelativeTo(null);
        this.ModRegion.setVisible(true);
    }//GEN-LAST:event_btnModRegionActionPerformed

    private void btnCancelarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarModActionPerformed
        this.ModRegion.setVisible(false);
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCancelarModActionPerformed

    private void btnAceptarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarModActionPerformed
        try {
            String ok = null;
            
            List<Region> regiones = FunRegion.listarRegiones();
            if(regiones.isEmpty()){
                this.textErrorAgr1.setText("Error: No existe region para modificar");
                return;
            }
            
            int pos = this.listaRegiones1.getSelectedIndex();
            
            
            ok = FunRegion.modificarRegion(regiones.get(pos), this.textNombre1.getText());
            if(ok != null){
                this.textErrorAgr1.setText(ok);
                return;
            }
            
            this.mostrar(FunRegion.listarRegiones());
            
            this.ModRegion.setVisible(false);
            this.setLocationRelativeTo(null);
            
        } catch (SQLException ex) {
            this.textErrorAgr1.setText("Error: Conexion SQL");
        }
    }//GEN-LAST:event_btnAceptarModActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MenuRegiones().setVisible(true);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AgrRegion;
    private javax.swing.JDialog ElimRegion;
    private javax.swing.JLabel Lnombre;
    private javax.swing.JLabel Lnombre1;
    private javax.swing.JLabel Lregion;
    private javax.swing.JLabel Lregion1;
    private javax.swing.JDialog ModRegion;
    private javax.swing.JButton btnAceptarAgr;
    private javax.swing.JButton btnAceptarElim;
    private javax.swing.JButton btnAceptarMod;
    private javax.swing.JButton btnAgrRegion;
    private javax.swing.JButton btnCancelarAgr;
    private javax.swing.JButton btnCancelarElim;
    private javax.swing.JButton btnCancelarMod;
    private javax.swing.JButton btnElimRegion;
    private javax.swing.JButton btnModRegion;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> listaRegiones;
    private javax.swing.JComboBox<String> listaRegiones1;
    private javax.swing.JLabel textErrorAgr;
    private javax.swing.JLabel textErrorAgr1;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textNombre1;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloAgregar;
    private javax.swing.JLabel tituloEliminar;
    private javax.swing.JLabel tituloModificar;
    // End of variables declaration//GEN-END:variables
}