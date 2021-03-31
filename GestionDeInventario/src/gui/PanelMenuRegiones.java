
package gui;

import java.awt.Color;
import FuncionesGeneral.FunRegion;
import domain.Region;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PanelMenuRegiones extends javax.swing.JPanel {
    FramePrincipal fp = null;
    
    public PanelMenuRegiones( FramePrincipal fp) throws SQLException {
        this.fp = fp;
        
        initComponents();
        
        mostrarRegiones(FunRegion.listarRegiones());
    }
    
    private void mostrarRegiones(List<Region> regiones){
        String matriz[][]=new String[regiones.size()][1];
        Region region;
        
        for(int i=0; i<regiones.size(); i++){
            region = regiones.get(i);
            matriz[i][0] = "  "+region.getNombre();
        }
        
        this.tablaRegiones.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                ""
            }
        ));
    }

    private void ItemsComboElim(List<Region> regiones){
        this.listaRegionesElim.removeAllItems();
        
        if(regiones.isEmpty()){
            return;
        }
        
        regiones.forEach( region -> {
            this.listaRegionesElim.addItem(region.getNombre());
        });
        this.listaRegionesElim.setSelectedIndex(0);
    }
    
    private void ItemsComboMod(List<Region> regiones){
        this.listaRegionesMod.removeAllItems();
        
        if(regiones.isEmpty()){
            return;
        }
        
        regiones.forEach( region -> {
            this.listaRegionesMod.addItem(region.getNombre());
        });
        this.listaRegionesMod.setSelectedIndex(0);
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
        listaRegionesElim = new javax.swing.JComboBox<>();
        btnAceptarElim = new javax.swing.JButton();
        btnCancelarElim = new javax.swing.JButton();
        ModRegion = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        tituloModificar = new javax.swing.JLabel();
        LregionMod = new javax.swing.JLabel();
        listaRegionesMod = new javax.swing.JComboBox<>();
        LnombreMod = new javax.swing.JLabel();
        textNombreMod = new javax.swing.JTextField();
        textErrorMod = new javax.swing.JLabel();
        btnAceptarMod = new javax.swing.JButton();
        btnCancelarMod = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegiones = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        btnAgrRegion = new javax.swing.JButton();
        btnElimRegion = new javax.swing.JButton();
        btnModRegion = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        AgrRegion.setTitle(Texts.TITULO.getTexto());
        AgrRegion.setMinimumSize(new java.awt.Dimension(365, 240));
        AgrRegion.setModal(true);
        AgrRegion.setName("dialogAgregarRegion"); // NOI18N
        AgrRegion.setResizable(false);

        jPanel3.setBackground(Color.decode(Colors.FONDO.getColor()));

        tituloAgregar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tituloAgregar.setForeground(Color.decode(Colors.TITULO.getColor())
        );
        tituloAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloAgregar.setText(Texts.AGREGAR_REGION.getTexto());

        Lnombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lnombre.setForeground(Color.decode(Colors.TEXTO.getColor())
        );
        Lnombre.setText(Texts.NOMBRE.getTexto());
        Lnombre.setPreferredSize(new java.awt.Dimension(60, 26));

        textNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textNombre.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())
        ), javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor())
        )));
        textNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textNombre.setName(""); // NOI18N
        textNombre.setRequestFocusEnabled(false);
        textNombre.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textNombre.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textErrorAgr.setForeground(Color.decode(Colors.TEXT_ERROR.getColor()));
        textErrorAgr.setText("* Posible Error");
        textErrorAgr.setForeground(Color.decode(Colors.TEXT_ERROR.getColor()));

        btnAceptarAgr.setBackground(Color.decode(Colors.FONDO_BOTON.getColor())
        );
        btnAceptarAgr.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAceptarAgr.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnAceptarAgr.setText(Texts.ACEPTAR.getTexto());
        btnAceptarAgr.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnAceptarAgr.setFocusable(false);
        btnAceptarAgr.setMaximumSize(new java.awt.Dimension(110, 30));
        btnAceptarAgr.setMinimumSize(new java.awt.Dimension(110, 30));
        btnAceptarAgr.setPreferredSize(new java.awt.Dimension(110, 30));
        btnAceptarAgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarAgrActionPerformed(evt);
            }
        });

        btnCancelarAgr.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnCancelarAgr.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCancelarAgr.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnCancelarAgr.setText(Texts.CANCELAR.getTexto());
        btnCancelarAgr.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
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

        ElimRegion.setTitle(Texts.TITULO.getTexto());
        ElimRegion.setMinimumSize(new java.awt.Dimension(365, 240));
        ElimRegion.setModal(true);
        ElimRegion.setName("dialogEliminarRegion"); // NOI18N
        ElimRegion.setResizable(false);

        jPanel4.setBackground(Color.decode(Colors.FONDO.getColor()));

        tituloEliminar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tituloEliminar.setForeground(Color.decode(Colors.TITULO.getColor())
        );
        tituloEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEliminar.setText(Texts.ELIMINAR_REGION.getTexto());

        Lregion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lregion.setForeground(Color.decode(Colors.TEXTO.getColor()));
        Lregion.setText(Texts.REGION.getTexto());
        Lregion.setPreferredSize(new java.awt.Dimension(60, 26));

        listaRegionesElim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listaRegionesElim.setMaximumRowCount(50);
        listaRegionesElim.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())
        ));
        listaRegionesElim.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaRegionesElim.setFocusable(false);
        listaRegionesElim.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        listaRegionesElim.setForeground(Color.decode(Colors.TEXTO.getColor()));

        btnAceptarElim.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnAceptarElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAceptarElim.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnAceptarElim.setText(Texts.ACEPTAR.getTexto());
        btnAceptarElim.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnAceptarElim.setFocusable(false);
        btnAceptarElim.setMaximumSize(new java.awt.Dimension(110, 30));
        btnAceptarElim.setMinimumSize(new java.awt.Dimension(110, 30));
        btnAceptarElim.setPreferredSize(new java.awt.Dimension(110, 30));
        btnAceptarElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarElimActionPerformed(evt);
            }
        });

        btnCancelarElim.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnCancelarElim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCancelarElim.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnCancelarElim.setText(Texts.CANCELAR.getTexto());
        btnCancelarElim.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnCancelarElim.setFocusable(false);
        btnCancelarElim.setMaximumSize(new java.awt.Dimension(110, 30));
        btnCancelarElim.setMinimumSize(new java.awt.Dimension(110, 30));
        btnCancelarElim.setPreferredSize(new java.awt.Dimension(110, 30));
        btnCancelarElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarElimActionPerformed(evt);
            }
        });

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
                                .addComponent(listaRegionesElim, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(listaRegionesElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        ModRegion.setTitle(Texts.TITULO.getTexto());
        ModRegion.setMinimumSize(new java.awt.Dimension(365, 290));
        ModRegion.setModal(true);
        ModRegion.setName("dialogModificarRegion"); // NOI18N
        ModRegion.setResizable(false);

        jPanel5.setBackground(Color.decode(Colors.FONDO.getColor()));

        tituloModificar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tituloModificar.setForeground(Color.decode(Colors.TITULO.getColor())
        );
        tituloModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificar.setText(Texts.MODIFICAR_REGION.getTexto());

        LregionMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LregionMod.setForeground(Color.decode(Colors.TEXTO.getColor()));
        LregionMod.setText(Texts.REGION.getTexto());
        LregionMod.setPreferredSize(new java.awt.Dimension(60, 26));

        listaRegionesMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listaRegionesMod.setMaximumRowCount(50);
        listaRegionesMod.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        listaRegionesMod.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaRegionesMod.setFocusable(false);
        listaRegionesMod.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        listaRegionesMod.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LnombreMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LnombreMod.setForeground(Color.decode(Colors.TEXTO.getColor()));
        LnombreMod.setText(Texts.NOMBRE.getTexto());
        LnombreMod.setPreferredSize(new java.awt.Dimension(60, 26));

        textNombreMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textNombreMod.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())
        ), javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor())
        )));
        textNombreMod.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textNombreMod.setName(""); // NOI18N
        textNombreMod.setRequestFocusEnabled(false);
        textNombreMod.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textNombreMod.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textErrorMod.setForeground(Color.decode(Colors.TEXT_ERROR.getColor()));
        textErrorMod.setText("* Posible Error");
        textErrorMod.setForeground(Color.decode(Colors.TEXT_ERROR.getColor()));

        btnAceptarMod.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnAceptarMod.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAceptarMod.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnAceptarMod.setText(Texts.ACEPTAR.getTexto());
        btnAceptarMod.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnAceptarMod.setFocusable(false);
        btnAceptarMod.setMaximumSize(new java.awt.Dimension(110, 30));
        btnAceptarMod.setMinimumSize(new java.awt.Dimension(110, 30));
        btnAceptarMod.setPreferredSize(new java.awt.Dimension(110, 30));
        btnAceptarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarModActionPerformed(evt);
            }
        });

        btnCancelarMod.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnCancelarMod.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCancelarMod.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnCancelarMod.setText(Texts.CANCELAR.getTexto());
        btnCancelarMod.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnCancelarMod.setFocusable(false);
        btnCancelarMod.setMaximumSize(new java.awt.Dimension(110, 30));
        btnCancelarMod.setMinimumSize(new java.awt.Dimension(110, 30));
        btnCancelarMod.setPreferredSize(new java.awt.Dimension(110, 30));
        btnCancelarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarModActionPerformed(evt);
            }
        });

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
                            .addComponent(textErrorMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(LnombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textNombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnAceptarMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(btnCancelarMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(LregionMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(listaRegionesMod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(LregionMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaRegionesMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textNombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LnombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textErrorMod)
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

        jPanel1.setMaximumSize(new java.awt.Dimension(400, 450));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 450));
        jPanel1.setBackground(Color.decode(Colors.FONDO.getColor()));

        titulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText(Texts.REGIONES.getTexto());
        titulo.setForeground(Color.decode(Colors.TITULO.getColor()));

        jScrollPane1.getViewport().setBackground(Color.decode(Colors.FONDO.getColor()));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));

        tablaRegiones.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        tablaRegiones.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tablaRegiones.setForeground(Color.decode(Colors.TEXTO.getColor()));
        tablaRegiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaRegiones.setColumnSelectionAllowed(true);
        tablaRegiones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaRegiones.setFocusable(false);
        tablaRegiones.setGridColor(Color.decode(Colors.FONDO.getColor()));
        tablaRegiones.setIntercellSpacing(new java.awt.Dimension(5, 0));
        tablaRegiones.setRowHeight(36);
        tablaRegiones.getTableHeader().setReorderingAllowed(false);
        tablaRegiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaRegionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaRegiones);
        tablaRegiones.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

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

        btnAgrRegion.setBackground(Color.decode(Colors.FONDO_BOTON.getColor())
        );
        btnAgrRegion.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAgrRegion.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnAgrRegion.setText(Texts.AGR_REGION.getTexto());
        btnAgrRegion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnAgrRegion.setFocusable(false);
        btnAgrRegion.setMaximumSize(new java.awt.Dimension(120, 30));
        btnAgrRegion.setMinimumSize(new java.awt.Dimension(120, 30));
        btnAgrRegion.setPreferredSize(new java.awt.Dimension(120, 30));
        btnAgrRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrRegionActionPerformed(evt);
            }
        });

        btnElimRegion.setBackground(Color.decode(Colors.FONDO_BOTON.getColor())
        );
        btnElimRegion.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnElimRegion.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnElimRegion.setText(Texts.ELIM_REGION.getTexto());
        btnElimRegion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnElimRegion.setFocusable(false);
        btnElimRegion.setMaximumSize(new java.awt.Dimension(120, 30));
        btnElimRegion.setMinimumSize(new java.awt.Dimension(120, 20));
        btnElimRegion.setPreferredSize(new java.awt.Dimension(120, 30));
        btnElimRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimRegionActionPerformed(evt);
            }
        });

        btnModRegion.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnModRegion.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnModRegion.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnModRegion.setText(Texts.MOD_REGION.getTexto());
        btnModRegion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnModRegion.setFocusable(false);
        btnModRegion.setMaximumSize(new java.awt.Dimension(120, 30));
        btnModRegion.setMinimumSize(new java.awt.Dimension(120, 20));
        btnModRegion.setPreferredSize(new java.awt.Dimension(120, 30));
        btnModRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModRegionActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnElimRegion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnModRegion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgrRegion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
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

//Botones Menu Region    
    private void btnAgrRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrRegionActionPerformed
        this.AgrRegion.setLocationRelativeTo(null);
        this.textNombre.setText("");
        this.textErrorAgr.setText("");
        this.AgrRegion.setVisible(true);
    }//GEN-LAST:event_btnAgrRegionActionPerformed
    
    private void btnElimRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimRegionActionPerformed
        try {
            this.ItemsComboElim(FunRegion.listarRegiones());
            
            this.ElimRegion.setLocationRelativeTo(null);
            this.ElimRegion.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuRegiones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnElimRegionActionPerformed

    private void btnModRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModRegionActionPerformed
        try {
            this.ItemsComboMod(FunRegion.listarRegiones());
            
            this.textNombreMod.setText("");
            this.textErrorMod.setText("");
        
            this.ModRegion.setLocationRelativeTo(null);
            this.ModRegion.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuRegiones.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnModRegionActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        PanelMenuPrincipal pmp = new PanelMenuPrincipal(fp);
        fp.cargarPanel(pmp);
    }//GEN-LAST:event_btnVolverActionPerformed

//Tabla Menu Region    
    private void tablaRegionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRegionesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaRegionesMouseClicked

//Botones Agregar Region    
    private void btnAceptarAgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarAgrActionPerformed
        try {
            String ok = FunRegion.agregarRegion(this.textNombre.getText());
            if(ok != null){
                this.textErrorAgr.setText(ok);
                return;
            }
            
            this.mostrarRegiones(FunRegion.listarRegiones());
            
            this.AgrRegion.setVisible(false);
            fp.setLocationRelativeTo(null);   
        } catch (SQLException ex) {
            this.textErrorAgr.setText("* Error: Conexion SQL");
        }
    }//GEN-LAST:event_btnAceptarAgrActionPerformed

    private void btnCancelarAgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAgrActionPerformed
        this.AgrRegion.setVisible(false);
        fp.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCancelarAgrActionPerformed

//Botones Eliminar Region
    private void btnAceptarElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarElimActionPerformed
        try {
            List<Region> regiones = FunRegion.listarRegiones();
            if(regiones.isEmpty()){
                this.ElimRegion.setVisible(false);
                fp.setLocationRelativeTo(null);
                return;
            }
            
            int pos = this.listaRegionesElim.getSelectedIndex();
            FunRegion.eliminarRegion(regiones.get(pos));
            
            this.mostrarRegiones(FunRegion.listarRegiones());
            
            this.ElimRegion.setVisible(false);
            fp.setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuRegiones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAceptarElimActionPerformed

    private void btnCancelarElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarElimActionPerformed
        this.ElimRegion.setVisible(false);
        fp.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCancelarElimActionPerformed

//Botones Modificar Region    
    private void btnAceptarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarModActionPerformed
        try {
            List<Region> regiones = FunRegion.listarRegiones();
            if(regiones.isEmpty()){
                this.textErrorMod.setText("Error: No existe region para modificar");
                return;
            }
            
            int pos = this.listaRegionesMod.getSelectedIndex();
            
            String ok = FunRegion.modificarRegion(regiones.get(pos), this.textNombreMod.getText());
            if(ok != null){
                this.textErrorMod.setText(ok);
                return;
            }
            
            this.mostrarRegiones(FunRegion.listarRegiones());
            
            this.ModRegion.setVisible(false);
            fp.setLocationRelativeTo(null);   
        } catch (SQLException ex) {
            this.textErrorMod.setText("Error: Conexion SQL");
        }
    }//GEN-LAST:event_btnAceptarModActionPerformed

    private void btnCancelarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarModActionPerformed
        this.ModRegion.setVisible(false);
        fp.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCancelarModActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AgrRegion;
    private javax.swing.JDialog ElimRegion;
    private javax.swing.JLabel Lnombre;
    private javax.swing.JLabel LnombreMod;
    private javax.swing.JLabel Lregion;
    private javax.swing.JLabel LregionMod;
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
    private javax.swing.JComboBox<String> listaRegionesElim;
    private javax.swing.JComboBox<String> listaRegionesMod;
    private javax.swing.JTable tablaRegiones;
    private javax.swing.JLabel textErrorAgr;
    private javax.swing.JLabel textErrorMod;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textNombreMod;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloAgregar;
    private javax.swing.JLabel tituloEliminar;
    private javax.swing.JLabel tituloModificar;
    // End of variables declaration//GEN-END:variables
}