
package gui;

import domain.Region;
import FuncionesGeneral.FunRegion;
import FuncionesGeneral.FunSucursal;
import domain.Sucursal;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PanelMenuSucursales extends javax.swing.JPanel {
    private FramePrincipal fp = null;
    private Region region = null;
    private int id_sucursal = -1;
    
    public PanelMenuSucursales(FramePrincipal fp, int id_region) throws SQLException {
        this.fp = fp;
        this.region = FunRegion.selectRegion(id_region);
        
        initComponents();
        
        this.titulo.setText(region.getNombre()+" - "+Texts.SUCURSALES.getTexto());
        mostrarSucursales(FunSucursal.selectLista(id_region));
    }
    
    private void mostrarSucursales(List<Sucursal> sucursales){
        String matriz[][]=new String[sucursales.size()][1];
        Sucursal sucursal;
        
        for(int i=0; i<sucursales.size(); i++){
            sucursal = sucursales.get(i);
            matriz[i][0] = "  "+sucursal.getNombre();
        }
        
        this.tablaSucursales.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                ""
            }
        ));
    }
    
    private void ItemsComboElim(List<Sucursal> sucursales){
        this.listaSucursalesElim.removeAllItems();
        
        if(sucursales.isEmpty()){
            return;
        }
        
        sucursales.forEach( sucursal -> {
            this.listaSucursalesElim.addItem(sucursal.getNombre());
        });
        this.listaSucursalesElim.setSelectedIndex(0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgrSucursal = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        tituloAgregar = new javax.swing.JLabel();
        Lnombre = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        Ldireccion = new javax.swing.JLabel();
        textDireccion = new javax.swing.JTextField();
        Ltelefono = new javax.swing.JLabel();
        LidTelefono = new javax.swing.JLabel();
        textTelefono = new javax.swing.JTextField();
        textErrorAgr = new javax.swing.JLabel();
        btnAceptarAgr = new javax.swing.JButton();
        btnCancelarAgr = new javax.swing.JButton();
        ElimSucursal = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        tituloEliminar = new javax.swing.JLabel();
        Lsucursal = new javax.swing.JLabel();
        listaSucursalesElim = new javax.swing.JComboBox<>();
        btnAceptarElim = new javax.swing.JButton();
        btnCancelarElim = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSucursales = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        btnAgrSucursal = new javax.swing.JButton();
        btnElimSucursal = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        AgrSucursal.setTitle(Texts.TITULO.getTexto());
        AgrSucursal.setMinimumSize(new java.awt.Dimension(365, 318));
        AgrSucursal.setModal(true);
        AgrSucursal.setPreferredSize(new java.awt.Dimension(350, 278));
        AgrSucursal.setResizable(false);

        jPanel3.setBackground(Color.decode(Colors.FONDO.getColor()));
        jPanel3.setPreferredSize(new java.awt.Dimension(350, 350));

        tituloAgregar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tituloAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloAgregar.setText(Texts.AGREGAR_SUCURSAL.getTexto());
        tituloAgregar.setForeground(Color.decode(Colors.TITULO.getColor()));

        Lnombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lnombre.setText(Texts.NOMBRE.getTexto());
        Lnombre.setMaximumSize(new java.awt.Dimension(60, 26));
        Lnombre.setMinimumSize(new java.awt.Dimension(60, 26));
        Lnombre.setPreferredSize(new java.awt.Dimension(60, 26));
        Lnombre.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textNombre.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())), javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor())
        )));
        textNombre.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textNombre.setForeground(Color.decode(Colors.TEXTO.getColor()));

        Ldireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ldireccion.setText(Texts.DIRECCION.getTexto());
        Ldireccion.setMinimumSize(new java.awt.Dimension(60, 20));
        Ldireccion.setPreferredSize(new java.awt.Dimension(60, 26));
        Ldireccion.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textDireccion.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())), javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor()))));
        textDireccion.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textDireccion.setForeground(Color.decode(Colors.TEXTO.getColor()));

        Ltelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ltelefono.setText(Texts.TELEFONO.getTexto());
        Ltelefono.setMinimumSize(new java.awt.Dimension(60, 20));
        Ltelefono.setPreferredSize(new java.awt.Dimension(60, 26));
        Ltelefono.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LidTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LidTelefono.setText(Texts.ID_TELEFONO.getTexto());
        LidTelefono.setMaximumSize(new java.awt.Dimension(40, 20));
        LidTelefono.setMinimumSize(new java.awt.Dimension(40, 20));
        LidTelefono.setPreferredSize(new java.awt.Dimension(40, 26));
        LidTelefono.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textTelefono.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())), javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor()))));
        textTelefono.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textTelefono.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textErrorAgr.setText("* Posible Error");
        textErrorAgr.setForeground(Color.decode(Colors.TEXT_ERROR.getColor()));

        btnAceptarAgr.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAceptarAgr.setText(Texts.ACEPTAR.getTexto());
        btnAceptarAgr.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnAceptarAgr.setFocusable(false);
        btnAceptarAgr.setMaximumSize(new java.awt.Dimension(110, 30));
        btnAceptarAgr.setMinimumSize(new java.awt.Dimension(110, 30));
        btnAceptarAgr.setPreferredSize(new java.awt.Dimension(110, 30));
        btnAceptarAgr.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnAceptarAgr.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnAceptarAgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarAgrActionPerformed(evt);
            }
        });

        btnCancelarAgr.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCancelarAgr.setText(Texts.CANCELAR.getTexto());
        btnCancelarAgr.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnCancelarAgr.setFocusable(false);
        btnCancelarAgr.setMaximumSize(new java.awt.Dimension(110, 30));
        btnCancelarAgr.setMinimumSize(new java.awt.Dimension(110, 30));
        btnCancelarAgr.setPreferredSize(new java.awt.Dimension(110, 30));
        btnCancelarAgr.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnCancelarAgr.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
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
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAceptarAgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarAgr, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textErrorAgr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Lnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textNombre))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Ldireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ltelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(LidTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textTelefono)))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(textNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ldireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ltelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LidTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textErrorAgr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarAgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarAgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout AgrSucursalLayout = new javax.swing.GroupLayout(AgrSucursal.getContentPane());
        AgrSucursal.getContentPane().setLayout(AgrSucursalLayout);
        AgrSucursalLayout.setHorizontalGroup(
            AgrSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        AgrSucursalLayout.setVerticalGroup(
            AgrSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );

        ElimSucursal.setTitle(Texts.TITULO.getTexto());
        ElimSucursal.setMinimumSize(new java.awt.Dimension(365, 240));
        ElimSucursal.setModal(true);
        ElimSucursal.setName("dialogEliminarRegion"); // NOI18N
        ElimSucursal.setResizable(false);

        jPanel4.setBackground(Color.decode(Colors.FONDO.getColor()));

        tituloEliminar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tituloEliminar.setForeground(Color.decode(Colors.TITULO.getColor())
        );
        tituloEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEliminar.setText(Texts.ELIMINAR_SUCURSAL.getTexto());

        Lsucursal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lsucursal.setForeground(Color.decode(Colors.TEXTO.getColor()));
        Lsucursal.setText(Texts.SUCURSAL.getTexto());
        Lsucursal.setPreferredSize(new java.awt.Dimension(60, 26));

        listaSucursalesElim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listaSucursalesElim.setMaximumRowCount(50);
        listaSucursalesElim.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())
        ));
        listaSucursalesElim.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaSucursalesElim.setFocusable(false);
        listaSucursalesElim.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        listaSucursalesElim.setForeground(Color.decode(Colors.TEXTO.getColor()));

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
                                .addComponent(Lsucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(listaSucursalesElim, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(Lsucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaSucursalesElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout ElimSucursalLayout = new javax.swing.GroupLayout(ElimSucursal.getContentPane());
        ElimSucursal.getContentPane().setLayout(ElimSucursalLayout);
        ElimSucursalLayout.setHorizontalGroup(
            ElimSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ElimSucursalLayout.setVerticalGroup(
            ElimSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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
        tablaSucursales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaSucursalesMouseClicked(evt);
            }
        });
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

        btnElimSucursal.setBackground(Color.decode(Colors.FONDO_BOTON.getColor())
        );
        btnElimSucursal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnElimSucursal.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnElimSucursal.setText(Texts.ELIM_SUCURSAL.getTexto());
        btnElimSucursal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnElimSucursal.setFocusable(false);
        btnElimSucursal.setMaximumSize(new java.awt.Dimension(120, 30));
        btnElimSucursal.setMinimumSize(new java.awt.Dimension(120, 30));
        btnElimSucursal.setPreferredSize(new java.awt.Dimension(120, 30));
        btnElimSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimSucursalActionPerformed(evt);
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
                                    .addComponent(btnElimSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addComponent(btnElimSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        this.AgrSucursal.setLocationRelativeTo(null);
        
        this.textNombre.setText("");
        this.textDireccion.setText("");
        this.textTelefono.setText("");
        this.textErrorAgr.setText("");
        
        this.AgrSucursal.setVisible(true);
    }//GEN-LAST:event_btnAgrSucursalActionPerformed

    private void btnElimSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimSucursalActionPerformed
        try {
            this.ItemsComboElim(FunSucursal.selectLista(region.getIdRegion()));
            
            this.ElimSucursal.setLocationRelativeTo(null);
            this.ElimSucursal.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuSucursales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnElimSucursalActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        try {
            PanelMenuRegiones pmr = new PanelMenuRegiones(fp);
            fp.cargarPanel(pmr);
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuSucursales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVolverActionPerformed

//Tabla Menu Sucursal    
    private void tablaSucursalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSucursalesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaSucursalesMouseClicked

//Botones Agregar Sucursal    
    private void btnAceptarAgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarAgrActionPerformed
        try {
            String ok = FunSucursal.agregarSucursal(region.getIdRegion(), this.textNombre.getText(), this.textDireccion.getText(), this.textTelefono.getText());
            if(ok != null){
                this.textErrorAgr.setText(ok);
                return;
            }
            
            this.mostrarSucursales(FunSucursal.selectLista(region.getIdRegion()));
            
            this.AgrSucursal.setVisible(false);
            fp.setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuSucursales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAceptarAgrActionPerformed

    private void btnCancelarAgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAgrActionPerformed
        this.AgrSucursal.setVisible(false);
        fp.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCancelarAgrActionPerformed

//Botones Eliminar Sucursal
    private void btnAceptarElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarElimActionPerformed
        try {
            List<Sucursal> sucursales = FunSucursal.selectLista(region.getIdRegion());
            if(sucursales.isEmpty()){
                this.ElimSucursal.setVisible(false);
                fp.setLocationRelativeTo(null);
                return;
            }
            
            int pos = this.listaSucursalesElim.getSelectedIndex();
            FunSucursal.eliminarSucursal(sucursales.get(pos));
            
            this.mostrarSucursales(FunSucursal.selectLista(region.getIdRegion()));
            
            this.ElimSucursal.setVisible(false);
            fp.setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuSucursales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAceptarElimActionPerformed

    private void btnCancelarElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarElimActionPerformed
        this.ElimSucursal.setVisible(false);
        fp.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCancelarElimActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AgrSucursal;
    private javax.swing.JDialog ElimSucursal;
    private javax.swing.JLabel Ldireccion;
    private javax.swing.JLabel LidTelefono;
    private javax.swing.JLabel Lnombre;
    private javax.swing.JLabel Lsucursal;
    private javax.swing.JLabel Ltelefono;
    private javax.swing.JButton btnAceptarAgr;
    private javax.swing.JButton btnAceptarElim;
    private javax.swing.JButton btnAgrSucursal;
    private javax.swing.JButton btnCancelarAgr;
    private javax.swing.JButton btnCancelarElim;
    private javax.swing.JButton btnElimSucursal;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> listaSucursalesElim;
    private javax.swing.JTable tablaSucursales;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JLabel textErrorAgr;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textTelefono;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloAgregar;
    private javax.swing.JLabel tituloEliminar;
    // End of variables declaration//GEN-END:variables
}
