
package gui;

import domain.Region;
import FuncionesGeneral.FunRegion;
import FuncionesGeneral.FunSucursal;
import domain.JefeSucursal;
import domain.Sucursal;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class PanelMenuSucursales extends javax.swing.JPanel {
    private FramePrincipal fp = null;
    private Region region = null;
    private int id_sucursal = -1;
    
    public PanelMenuSucursales(FramePrincipal fp, int id_region) throws SQLException {
        this.fp = fp;
        this.region = FunRegion.selecRegion(id_region);
        
        initComponents();
        
        int tamano = 22;
        this.titulo.setText(region.getNombre()+" - "+Texts.SUCURSALES.getTexto());
        this.titulo.setFont(new java.awt.Font("Segoe UI", 3, tamano));
        
        while(true){
            if(this.titulo.getPreferredSize().width > 388){
                this.titulo.setFont(new java.awt.Font("Segoe UI", 3, tamano));
            }else{
                break;
            }
            tamano -= 1;
        }
        
        mostrarSucursales(FunSucursal.listarSucursales(id_region));
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
    
    public final void cargarPanel(JPanel nuevoPanel){
        this.jPanel6.removeAll();
        this.jPanel6.add(nuevoPanel);
        this.jPanel6.repaint();
        this.jPanel6.revalidate();
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
        SelectSucursal = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        tituloNombre = new javax.swing.JLabel();
        LdireccionSelect = new javax.swing.JLabel();
        LtelefonoSelect = new javax.swing.JLabel();
        LidTelefonoSelect = new javax.swing.JLabel();
        LsucursalDireccion = new javax.swing.JLabel();
        LsucursalTelefono = new javax.swing.JLabel();
        linea = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        tituloJefe = new javax.swing.JLabel();
        LnombreSelect = new javax.swing.JLabel();
        LedadSelect = new javax.swing.JLabel();
        LnombreJefe = new javax.swing.JLabel();
        LedadJefe = new javax.swing.JLabel();
        panelSinJefe = new javax.swing.JPanel();
        btnSucProductos = new javax.swing.JButton();
        btnModSucursal = new javax.swing.JButton();
        btnAgrJefe = new javax.swing.JButton();
        btnVolverSelect = new javax.swing.JButton();
        panelConJefe = new javax.swing.JPanel();
        btnSucProductos1 = new javax.swing.JButton();
        btnModSucursal1 = new javax.swing.JButton();
        btnModJefe = new javax.swing.JButton();
        btnElimJefe = new javax.swing.JButton();
        btnVolverSelect1 = new javax.swing.JButton();
        ModSucursal = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        tituloModificar = new javax.swing.JLabel();
        LnombreMod = new javax.swing.JLabel();
        textNombreMod = new javax.swing.JTextField();
        LdireccionMod = new javax.swing.JLabel();
        textDireccionMod = new javax.swing.JTextField();
        LtelefonoMod = new javax.swing.JLabel();
        LidTelefonoMod = new javax.swing.JLabel();
        textTelefonoMod = new javax.swing.JTextField();
        textErrorMod = new javax.swing.JLabel();
        btnAceptarMod = new javax.swing.JButton();
        btnCancelarMod = new javax.swing.JButton();
        AgrJefeSucursal = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        tituloAgregarJefe = new javax.swing.JLabel();
        LjefeNombre = new javax.swing.JLabel();
        textJefeNombre = new javax.swing.JTextField();
        LjefeEdad = new javax.swing.JLabel();
        textJefeEdad = new javax.swing.JTextField();
        textErrorAgrJefe = new javax.swing.JLabel();
        btnAceptarAgrJefe = new javax.swing.JButton();
        btnCancelarAgrJefe = new javax.swing.JButton();
        ModJefeSucursal = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        tituloModJefe = new javax.swing.JLabel();
        LjefeNombreMod = new javax.swing.JLabel();
        textJefeNombreMod = new javax.swing.JTextField();
        LjefeEdadMod = new javax.swing.JLabel();
        textJefeEdadMod = new javax.swing.JTextField();
        textErrorModJefe = new javax.swing.JLabel();
        btnAceptarModJefe = new javax.swing.JButton();
        btnCancelarModJefe = new javax.swing.JButton();
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

        SelectSucursal.setTitle(Texts.TITULO.getTexto());
        SelectSucursal.setMinimumSize(new java.awt.Dimension(445, 285));
        SelectSucursal.setModal(true);
        SelectSucursal.setResizable(false);

        jPanel4.setBackground(Color.decode(Colors.FONDO.getColor()));
        jPanel5.setPreferredSize(new java.awt.Dimension(404, 245));

        tituloNombre.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tituloNombre.setText(Texts.AGREGAR_CLIENTE.getTexto());
        tituloNombre.setForeground(Color.decode(Colors.TITULO.getColor()));

        LdireccionSelect.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LdireccionSelect.setText(Texts.DIRECCION.getTexto());
        LdireccionSelect.setMinimumSize(new java.awt.Dimension(60, 20));
        LdireccionSelect.setPreferredSize(new java.awt.Dimension(60, 26));
        LdireccionSelect.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LtelefonoSelect.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LtelefonoSelect.setText(Texts.TELEFONO.getTexto());
        LtelefonoSelect.setMinimumSize(new java.awt.Dimension(60, 20));
        LtelefonoSelect.setPreferredSize(new java.awt.Dimension(60, 26));
        LtelefonoSelect.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LidTelefonoSelect.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LidTelefonoSelect.setText(Texts.ID_TELEFONO.getTexto());
        LidTelefonoSelect.setMaximumSize(new java.awt.Dimension(40, 20));
        LidTelefonoSelect.setMinimumSize(new java.awt.Dimension(40, 20));
        LidTelefonoSelect.setPreferredSize(new java.awt.Dimension(40, 26));
        LidTelefonoSelect.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LsucursalDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LsucursalDireccion.setText("(Direccion sucursal)");
        LsucursalDireccion.setToolTipText("");
        LsucursalDireccion.setPreferredSize(new java.awt.Dimension(37, 26));
        LsucursalDireccion.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LsucursalTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LsucursalTelefono.setText("(Telefono sucursal)");
        LsucursalTelefono.setMaximumSize(new java.awt.Dimension(43, 26));
        LsucursalTelefono.setMinimumSize(new java.awt.Dimension(43, 26));
        LsucursalTelefono.setPreferredSize(new java.awt.Dimension(43, 26));
        LsucursalTelefono.setForeground(Color.decode(Colors.TEXTO.getColor()));

        linea.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N
        linea.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, Color.decode(Colors.BORDE.getColor())
        ));

        jPanel5.setBackground(Color.decode(Colors.FONDO.getColor()));
        jPanel6.setBackground(Color.decode(Colors.FONDO.getColor())
        );
        jPanel6.setPreferredSize(new java.awt.Dimension(173, 245));
        jPanel6.setLayout(new java.awt.CardLayout());

        tituloJefe.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tituloJefe.setForeground(Color.decode(Colors.TITULO.getColor())
        );
        tituloJefe.setText(Texts.JEFE_SUCURSAL.getTexto());
        tituloJefe.setPreferredSize(new java.awt.Dimension(231, 26));

        LnombreSelect.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LnombreSelect.setForeground(Color.decode(Colors.TEXTO.getColor())
        );
        LnombreSelect.setText(Texts.NOMBRE.getTexto());
        LnombreSelect.setMinimumSize(new java.awt.Dimension(60, 20));
        LnombreSelect.setPreferredSize(new java.awt.Dimension(60, 26));
        LdireccionSelect.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LedadSelect.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LedadSelect.setForeground(Color.decode(Colors.TEXTO.getColor()));
        LedadSelect.setText(Texts.EDAD.getTexto());
        LedadSelect.setMinimumSize(new java.awt.Dimension(60, 20));
        LedadSelect.setPreferredSize(new java.awt.Dimension(60, 26));
        LdireccionSelect.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LnombreJefe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LnombreJefe.setForeground(Color.decode(Colors.TEXTO.getColor())
        );
        LnombreJefe.setText("(Nombre Jefe)");
        LnombreJefe.setToolTipText("");
        LnombreJefe.setPreferredSize(new java.awt.Dimension(37, 26));
        LsucursalDireccion.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LedadJefe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LedadJefe.setForeground(Color.decode(Colors.TEXTO.getColor())
        );
        LedadJefe.setText("(Edad Jefe)");
        LedadJefe.setToolTipText("");
        LedadJefe.setPreferredSize(new java.awt.Dimension(37, 26));
        LsucursalDireccion.setForeground(Color.decode(Colors.TEXTO.getColor()));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LdireccionSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LsucursalDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(LtelefonoSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LidTelefonoSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LsucursalTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(linea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tituloJefe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(LedadSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LedadJefe, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(LnombreSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LnombreJefe, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tituloNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LdireccionSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LsucursalDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LtelefonoSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LidTelefonoSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LsucursalTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linea, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LnombreSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LnombreJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LedadSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LedadJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout SelectSucursalLayout = new javax.swing.GroupLayout(SelectSucursal.getContentPane());
        SelectSucursal.getContentPane().setLayout(SelectSucursalLayout);
        SelectSucursalLayout.setHorizontalGroup(
            SelectSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        SelectSucursalLayout.setVerticalGroup(
            SelectSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelSinJefe.setBackground(Color.decode(Colors.FONDO.getColor())
        );

        btnSucProductos.setBackground(Color.decode(Colors.FONDO_BOTON.getColor())
        );
        btnSucProductos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSucProductos.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnSucProductos.setText(Texts.PRODUCTOS.getTexto());
        btnSucProductos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnSucProductos.setFocusable(false);
        btnSucProductos.setMaximumSize(new java.awt.Dimension(130, 30));
        btnSucProductos.setMinimumSize(new java.awt.Dimension(130, 30));
        btnSucProductos.setPreferredSize(new java.awt.Dimension(130, 30));
        btnSucProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSucProductosActionPerformed(evt);
            }
        });

        btnModSucursal.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnModSucursal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnModSucursal.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnModSucursal.setText(Texts.MOD_SUCURSAL.getTexto());
        btnModSucursal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnModSucursal.setFocusable(false);
        btnModSucursal.setMaximumSize(new java.awt.Dimension(130, 30));
        btnModSucursal.setMinimumSize(new java.awt.Dimension(130, 30));
        btnModSucursal.setPreferredSize(new java.awt.Dimension(130, 30));
        btnModSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModSucursalActionPerformed(evt);
            }
        });

        btnAgrJefe.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnAgrJefe.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAgrJefe.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnAgrJefe.setText(Texts.AGR_JEFE.getTexto());
        btnAgrJefe.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnAgrJefe.setFocusable(false);
        btnAgrJefe.setMaximumSize(new java.awt.Dimension(130, 30));
        btnAgrJefe.setMinimumSize(new java.awt.Dimension(130, 30));
        btnAgrJefe.setPreferredSize(new java.awt.Dimension(130, 30));
        btnAgrJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrJefeActionPerformed(evt);
            }
        });

        btnVolverSelect.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnVolverSelect.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnVolverSelect.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnVolverSelect.setText(Texts.VOLVER.getTexto());
        btnVolverSelect.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnVolverSelect.setFocusable(false);
        btnVolverSelect.setMaximumSize(new java.awt.Dimension(130, 30));
        btnVolverSelect.setMinimumSize(new java.awt.Dimension(130, 30));
        btnVolverSelect.setPreferredSize(new java.awt.Dimension(130, 30));
        btnVolverSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSinJefeLayout = new javax.swing.GroupLayout(panelSinJefe);
        panelSinJefe.setLayout(panelSinJefeLayout);
        panelSinJefeLayout.setHorizontalGroup(
            panelSinJefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSinJefeLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(panelSinJefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolverSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSucProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgrJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        panelSinJefeLayout.setVerticalGroup(
            panelSinJefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSinJefeLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnSucProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgrJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVolverSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        panelConJefe.setBackground(Color.decode(Colors.FONDO.getColor())
        );

        btnSucProductos1.setBackground(Color.decode(Colors.FONDO_BOTON.getColor())
        );
        btnSucProductos1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSucProductos1.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnSucProductos1.setText(Texts.PRODUCTOS.getTexto());
        btnSucProductos1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnSucProductos1.setFocusable(false);
        btnSucProductos1.setMaximumSize(new java.awt.Dimension(130, 30));
        btnSucProductos1.setMinimumSize(new java.awt.Dimension(130, 30));
        btnSucProductos1.setPreferredSize(new java.awt.Dimension(130, 30));
        btnSucProductos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSucProductos1ActionPerformed(evt);
            }
        });

        btnModSucursal1.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnModSucursal1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnModSucursal1.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnModSucursal1.setText(Texts.MOD_SUCURSAL.getTexto());
        btnModSucursal1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnModSucursal1.setFocusable(false);
        btnModSucursal1.setMaximumSize(new java.awt.Dimension(130, 30));
        btnModSucursal1.setMinimumSize(new java.awt.Dimension(130, 30));
        btnModSucursal1.setPreferredSize(new java.awt.Dimension(130, 30));
        btnModSucursal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModSucursal1ActionPerformed(evt);
            }
        });

        btnModJefe.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnModJefe.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnModJefe.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnModJefe.setText(Texts.MOD_JEFE.getTexto());
        btnModJefe.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnModJefe.setFocusable(false);
        btnModJefe.setMaximumSize(new java.awt.Dimension(130, 30));
        btnModJefe.setMinimumSize(new java.awt.Dimension(130, 30));
        btnModJefe.setPreferredSize(new java.awt.Dimension(130, 30));
        btnModJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModJefeActionPerformed(evt);
            }
        });

        btnElimJefe.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnElimJefe.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnElimJefe.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnElimJefe.setText(Texts.ELIM_JEFE.getTexto());
        btnElimJefe.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnElimJefe.setFocusable(false);
        btnElimJefe.setMaximumSize(new java.awt.Dimension(130, 30));
        btnElimJefe.setMinimumSize(new java.awt.Dimension(130, 30));
        btnElimJefe.setPreferredSize(new java.awt.Dimension(130, 30));
        btnElimJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimJefeActionPerformed(evt);
            }
        });

        btnVolverSelect1.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnVolverSelect1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnVolverSelect1.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnVolverSelect1.setText(Texts.VOLVER.getTexto());
        btnVolverSelect1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnVolverSelect1.setFocusable(false);
        btnVolverSelect1.setMaximumSize(new java.awt.Dimension(130, 30));
        btnVolverSelect1.setMinimumSize(new java.awt.Dimension(130, 30));
        btnVolverSelect1.setPreferredSize(new java.awt.Dimension(130, 30));
        btnVolverSelect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverSelect1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelConJefeLayout = new javax.swing.GroupLayout(panelConJefe);
        panelConJefe.setLayout(panelConJefeLayout);
        panelConJefeLayout.setHorizontalGroup(
            panelConJefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConJefeLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(panelConJefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolverSelect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModSucursal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSucProductos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElimJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        panelConJefeLayout.setVerticalGroup(
            panelConJefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConJefeLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btnSucProductos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModSucursal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnElimJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVolverSelect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        ModSucursal.setTitle(Texts.TITULO.getTexto());
        ModSucursal.setMinimumSize(new java.awt.Dimension(365, 318));
        ModSucursal.setModal(true);
        ModSucursal.setResizable(false);

        jPanel3.setBackground(Color.decode(Colors.FONDO.getColor()));
        jPanel7.setBackground(Color.decode(Colors.FONDO.getColor())
        );
        jPanel7.setPreferredSize(new java.awt.Dimension(350, 350));

        tituloModificar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tituloModificar.setForeground(Color.decode(Colors.TITULO.getColor()));
        tituloModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificar.setText(Texts.MODIFICAR_SUCURSAL.getTexto());
        tituloAgregar.setForeground(Color.decode(Colors.TITULO.getColor()));

        LnombreMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LnombreMod.setForeground(Color.decode(Colors.TEXTO.getColor()));
        LnombreMod.setText(Texts.NOMBRE.getTexto());
        LnombreMod.setMaximumSize(new java.awt.Dimension(60, 26));
        LnombreMod.setMinimumSize(new java.awt.Dimension(60, 26));
        LnombreMod.setPreferredSize(new java.awt.Dimension(60, 26));
        Lnombre.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textNombreMod.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textNombreMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textNombreMod.setForeground(Color.decode(Colors.TEXTO.getColor()));
        textNombreMod.setText("(Nombre Sucursal)");
        textNombreMod.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())), javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor())
        )));
        textNombre.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textNombre.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LdireccionMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LdireccionMod.setForeground(Color.decode(Colors.TEXTO.getColor()));
        LdireccionMod.setText(Texts.DIRECCION.getTexto());
        LdireccionMod.setMinimumSize(new java.awt.Dimension(60, 20));
        LdireccionMod.setPreferredSize(new java.awt.Dimension(60, 26));
        Ldireccion.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textDireccionMod.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textDireccionMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textDireccionMod.setForeground(Color.decode(Colors.TEXTO.getColor()));
        textDireccionMod.setText("(Direccion Sucursal)");
        textDireccionMod.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())), javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor()))));
        textDireccion.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textDireccion.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LtelefonoMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LtelefonoMod.setForeground(Color.decode(Colors.TEXTO.getColor()));
        LtelefonoMod.setText(Texts.TELEFONO.getTexto());
        LtelefonoMod.setMinimumSize(new java.awt.Dimension(60, 20));
        LtelefonoMod.setPreferredSize(new java.awt.Dimension(60, 26));
        Ltelefono.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LidTelefonoMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LidTelefonoMod.setForeground(Color.decode(Colors.TEXTO.getColor()));
        LidTelefonoMod.setText(Texts.ID_TELEFONO.getTexto());
        LidTelefonoMod.setMaximumSize(new java.awt.Dimension(40, 20));
        LidTelefonoMod.setMinimumSize(new java.awt.Dimension(40, 20));
        LidTelefonoMod.setPreferredSize(new java.awt.Dimension(40, 26));
        LidTelefono.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textTelefonoMod.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textTelefonoMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textTelefonoMod.setForeground(Color.decode(Colors.TEXTO.getColor()));
        textTelefonoMod.setText("(Telefono Sucursal)");
        textTelefonoMod.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())), javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor()))));
        textTelefono.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textTelefono.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textErrorMod.setForeground(Color.decode(Colors.TEXT_ERROR.getColor()));
        textErrorMod.setText("* Posible Error");
        textErrorAgr.setForeground(Color.decode(Colors.TEXT_ERROR.getColor()));

        btnAceptarMod.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnAceptarMod.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAceptarMod.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnAceptarMod.setText(Texts.ACEPTAR.getTexto());
        btnAceptarMod.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnAceptarMod.setFocusable(false);
        btnAceptarMod.setMaximumSize(new java.awt.Dimension(110, 30));
        btnAceptarMod.setMinimumSize(new java.awt.Dimension(110, 30));
        btnAceptarMod.setPreferredSize(new java.awt.Dimension(110, 30));
        btnAceptarAgr.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnAceptarAgr.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
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
        btnCancelarAgr.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnCancelarAgr.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnCancelarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnAceptarMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textErrorMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(LnombreMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textNombreMod))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LdireccionMod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LtelefonoMod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textDireccionMod, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(LidTelefonoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textTelefonoMod)))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloModificar)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LnombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNombreMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textDireccionMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LdireccionMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LtelefonoMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LidTelefonoMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTelefonoMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textErrorMod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout ModSucursalLayout = new javax.swing.GroupLayout(ModSucursal.getContentPane());
        ModSucursal.getContentPane().setLayout(ModSucursalLayout);
        ModSucursalLayout.setHorizontalGroup(
            ModSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ModSucursalLayout.setVerticalGroup(
            ModSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );

        AgrJefeSucursal.setTitle(Texts.TITULO.getTexto());
        AgrJefeSucursal.setMinimumSize(new java.awt.Dimension(365, 280));
        AgrJefeSucursal.setModal(true);
        AgrJefeSucursal.setResizable(false);

        jPanel3.setBackground(Color.decode(Colors.FONDO.getColor()));
        jPanel8.setBackground(Color.decode(Colors.FONDO.getColor())
        );
        jPanel8.setPreferredSize(new java.awt.Dimension(350, 350));

        tituloAgregarJefe.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tituloAgregarJefe.setForeground(Color.decode(Colors.TITULO.getColor())
        );
        tituloAgregarJefe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloAgregarJefe.setText(Texts.AGREGAR_JEFE.getTexto());
        tituloAgregar.setForeground(Color.decode(Colors.TITULO.getColor()));

        LjefeNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LjefeNombre.setForeground(Color.decode(Colors.TEXTO.getColor()));
        LjefeNombre.setText(Texts.NOMBRE.getTexto());
        LjefeNombre.setMaximumSize(new java.awt.Dimension(60, 26));
        LjefeNombre.setMinimumSize(new java.awt.Dimension(60, 26));
        LjefeNombre.setPreferredSize(new java.awt.Dimension(60, 26));
        Lnombre.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textJefeNombre.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textJefeNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textJefeNombre.setForeground(Color.decode(Colors.TEXTO.getColor()));
        textJefeNombre.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())), javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor())
        )));
        textNombre.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textNombre.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LjefeEdad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LjefeEdad.setForeground(Color.decode(Colors.TEXTO.getColor()));
        LjefeEdad.setText(Texts.EDAD.getTexto());
        LjefeEdad.setMinimumSize(new java.awt.Dimension(60, 20));
        LjefeEdad.setPreferredSize(new java.awt.Dimension(60, 26));
        Ldireccion.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textJefeEdad.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textJefeEdad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textJefeEdad.setForeground(Color.decode(Colors.TEXTO.getColor()));
        textJefeEdad.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())), javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor()))));
        textDireccion.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textDireccion.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textErrorAgrJefe.setForeground(Color.decode(Colors.TEXT_ERROR.getColor()));
        textErrorAgrJefe.setText("* Posible Error");
        textErrorAgr.setForeground(Color.decode(Colors.TEXT_ERROR.getColor()));

        btnAceptarAgrJefe.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnAceptarAgrJefe.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAceptarAgrJefe.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnAceptarAgrJefe.setText(Texts.ACEPTAR.getTexto());
        btnAceptarAgrJefe.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnAceptarAgrJefe.setFocusable(false);
        btnAceptarAgrJefe.setMaximumSize(new java.awt.Dimension(110, 30));
        btnAceptarAgrJefe.setMinimumSize(new java.awt.Dimension(110, 30));
        btnAceptarAgrJefe.setPreferredSize(new java.awt.Dimension(110, 30));
        btnAceptarAgr.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnAceptarAgr.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnAceptarAgrJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarAgrJefeActionPerformed(evt);
            }
        });

        btnCancelarAgrJefe.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnCancelarAgrJefe.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCancelarAgrJefe.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnCancelarAgrJefe.setText(Texts.CANCELAR.getTexto());
        btnCancelarAgrJefe.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnCancelarAgrJefe.setFocusable(false);
        btnCancelarAgrJefe.setMaximumSize(new java.awt.Dimension(110, 30));
        btnCancelarAgrJefe.setMinimumSize(new java.awt.Dimension(110, 30));
        btnCancelarAgrJefe.setPreferredSize(new java.awt.Dimension(110, 30));
        btnCancelarAgr.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnCancelarAgr.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnCancelarAgrJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAgrJefeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnAceptarAgrJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarAgrJefe, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textErrorAgrJefe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(LjefeNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textJefeNombre))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(LjefeEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textJefeEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloAgregarJefe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloAgregarJefe)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LjefeNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textJefeNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textJefeEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LjefeEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textErrorAgrJefe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarAgrJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarAgrJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout AgrJefeSucursalLayout = new javax.swing.GroupLayout(AgrJefeSucursal.getContentPane());
        AgrJefeSucursal.getContentPane().setLayout(AgrJefeSucursalLayout);
        AgrJefeSucursalLayout.setHorizontalGroup(
            AgrJefeSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        AgrJefeSucursalLayout.setVerticalGroup(
            AgrJefeSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );

        ModJefeSucursal.setTitle(Texts.TITULO.getTexto());
        ModJefeSucursal.setMinimumSize(new java.awt.Dimension(365, 280));
        ModJefeSucursal.setModal(true);
        ModJefeSucursal.setResizable(false);

        jPanel3.setBackground(Color.decode(Colors.FONDO.getColor()));
        jPanel9.setBackground(Color.decode(Colors.FONDO.getColor())
        );
        jPanel9.setPreferredSize(new java.awt.Dimension(350, 350));

        tituloModJefe.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tituloModJefe.setForeground(Color.decode(Colors.TITULO.getColor())
        );
        tituloModJefe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModJefe.setText(Texts.MODIFICAR_JEFE.getTexto());
        tituloAgregar.setForeground(Color.decode(Colors.TITULO.getColor()));

        LjefeNombreMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LjefeNombreMod.setForeground(Color.decode(Colors.TEXTO.getColor()));
        LjefeNombreMod.setText(Texts.NOMBRE.getTexto());
        LjefeNombreMod.setMaximumSize(new java.awt.Dimension(60, 26));
        LjefeNombreMod.setMinimumSize(new java.awt.Dimension(60, 26));
        LjefeNombreMod.setPreferredSize(new java.awt.Dimension(60, 26));
        Lnombre.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textJefeNombreMod.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textJefeNombreMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textJefeNombreMod.setForeground(Color.decode(Colors.TEXTO.getColor()));
        textJefeNombreMod.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())), javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor())
        )));
        textNombre.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textNombre.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LjefeEdadMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LjefeEdadMod.setForeground(Color.decode(Colors.TEXTO.getColor()));
        LjefeEdadMod.setText(Texts.EDAD.getTexto());
        LjefeEdadMod.setMinimumSize(new java.awt.Dimension(60, 20));
        LjefeEdadMod.setPreferredSize(new java.awt.Dimension(60, 26));
        Ldireccion.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textJefeEdadMod.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textJefeEdadMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textJefeEdadMod.setForeground(Color.decode(Colors.TEXTO.getColor()));
        textJefeEdadMod.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())), javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor()))));
        textDireccion.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textDireccion.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textErrorModJefe.setForeground(Color.decode(Colors.TEXT_ERROR.getColor()));
        textErrorModJefe.setText("* Posible Error");
        textErrorAgr.setForeground(Color.decode(Colors.TEXT_ERROR.getColor()));

        btnAceptarModJefe.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnAceptarModJefe.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAceptarModJefe.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnAceptarModJefe.setText(Texts.ACEPTAR.getTexto());
        btnAceptarModJefe.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnAceptarModJefe.setFocusable(false);
        btnAceptarModJefe.setMaximumSize(new java.awt.Dimension(110, 30));
        btnAceptarModJefe.setMinimumSize(new java.awt.Dimension(110, 30));
        btnAceptarModJefe.setPreferredSize(new java.awt.Dimension(110, 30));
        btnAceptarAgr.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnAceptarAgr.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnAceptarModJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarModJefeActionPerformed(evt);
            }
        });

        btnCancelarModJefe.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnCancelarModJefe.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCancelarModJefe.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnCancelarModJefe.setText(Texts.CANCELAR.getTexto());
        btnCancelarModJefe.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnCancelarModJefe.setFocusable(false);
        btnCancelarModJefe.setMaximumSize(new java.awt.Dimension(110, 30));
        btnCancelarModJefe.setMinimumSize(new java.awt.Dimension(110, 30));
        btnCancelarModJefe.setPreferredSize(new java.awt.Dimension(110, 30));
        btnCancelarAgr.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnCancelarAgr.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnCancelarModJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarModJefeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnAceptarModJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarModJefe, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textErrorModJefe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(LjefeNombreMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textJefeNombreMod))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(LjefeEdadMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textJefeEdadMod, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloModJefe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloModJefe)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LjefeNombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textJefeNombreMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textJefeEdadMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LjefeEdadMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textErrorModJefe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarModJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarModJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout ModJefeSucursalLayout = new javax.swing.GroupLayout(ModJefeSucursal.getContentPane());
        ModJefeSucursal.getContentPane().setLayout(ModJefeSucursalLayout);
        ModJefeSucursalLayout.setHorizontalGroup(
            ModJefeSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ModJefeSucursalLayout.setVerticalGroup(
            ModJefeSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
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
        this.AgrSucursal.setLocationRelativeTo(fp);
        
        this.textNombre.setText("");
        this.textDireccion.setText("");
        this.textTelefono.setText("");
        this.textErrorAgr.setText("");
        
        this.AgrSucursal.setVisible(true);
    }//GEN-LAST:event_btnAgrSucursalActionPerformed

    private void btnElimSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimSucursalActionPerformed
        try {
            this.ItemsComboElim(FunSucursal.listarSucursales(region.getIdRegion()));
            
            this.ElimSucursal.setLocationRelativeTo(fp);
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
        try {
            List<Sucursal> sucursales = FunSucursal.listarSucursales(region.getIdRegion());
            int pos = tablaSucursales.getSelectedRow();
            
            id_sucursal = sucursales.get(pos).getIdSucursal();
            
            //iniciar datos
            int tamano = 20;
            this.tituloNombre.setText(sucursales.get(pos).getNombre());
            this.tituloNombre.setFont(new java.awt.Font("Segoe UI", 3, tamano));
        
            while(true){
                if(this.tituloNombre.getPreferredSize().width > 231){
                    this.tituloNombre.setFont(new java.awt.Font("Segoe UI", 3, tamano));
                }else{
                    break;
                }
                tamano -= 1;
            }
            
            this.LsucursalDireccion.setText(sucursales.get(pos).getDireccion());
            this.LsucursalTelefono.setText(sucursales.get(pos).getTelefono());
            
            JefeSucursal jefe = FunSucursal.selecJefe(id_sucursal);
            if(jefe == null){
                this.LnombreJefe.setText("N/a");
                this.LedadJefe.setText("N/a");
                cargarPanel(panelSinJefe);
            }else{
                this.LnombreJefe.setText(jefe.getNombre());
                this.LedadJefe.setText(""+jefe.getEdad());
                cargarPanel(panelConJefe);
            }
            
            this.SelectSucursal.setLocationRelativeTo(fp);
            this.SelectSucursal.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuSucursales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tablaSucursalesMouseClicked

//Botones Eliminar Sucursal
    private void btnAceptarElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarElimActionPerformed
        try {
            List<Sucursal> sucursales = FunSucursal.listarSucursales(region.getIdRegion());
            if(sucursales.isEmpty()){
                this.ElimSucursal.setVisible(false);
                fp.setLocationRelativeTo(null);
                return;
            }
            
            int pos = this.listaSucursalesElim.getSelectedIndex();
            FunSucursal.eliminarSucursal(sucursales.get(pos));
            
            this.mostrarSucursales(FunSucursal.listarSucursales(region.getIdRegion()));
            
            this.ElimSucursal.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuSucursales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAceptarElimActionPerformed

    private void btnCancelarElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarElimActionPerformed
        this.ElimSucursal.setVisible(false);
    }//GEN-LAST:event_btnCancelarElimActionPerformed

//Botones Seleccionar Sucursal Sin Jefe
    private void btnSucProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSucProductosActionPerformed
        try {
            this.SelectSucursal.setVisible(false);
            
            PanelMenuProductosSucursal pmps = new PanelMenuProductosSucursal(fp,id_sucursal);
            fp.cargarPanel(pmps);    
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuSucursales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSucProductosActionPerformed

    private void btnModSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModSucursalActionPerformed
        try {
            Sucursal sucursal = FunSucursal.selecSucursal(id_sucursal);
            
            //iniciar Datos
            this.textNombreMod.setText(sucursal.getNombre());
            this.textDireccionMod.setText(sucursal.getDireccion());
            this.textTelefonoMod.setText(sucursal.getTelefono());
            this.textErrorMod.setText("");
            
            this.ModSucursal.setLocationRelativeTo(SelectSucursal);
            this.ModSucursal.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuSucursales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModSucursalActionPerformed

    private void btnAgrJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrJefeActionPerformed
        this.AgrJefeSucursal.setLocationRelativeTo(SelectSucursal);
        
        this.textJefeNombre.setText("");
        this.textJefeEdad.setText("");
        this.textErrorAgrJefe.setText("");
        
        this.AgrJefeSucursal.setVisible(true);
    }//GEN-LAST:event_btnAgrJefeActionPerformed

    private void btnVolverSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverSelectActionPerformed
        this.SelectSucursal.setVisible(false);
    }//GEN-LAST:event_btnVolverSelectActionPerformed

//Botones Seleccionar Sucursal Con Jefe
    private void btnSucProductos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSucProductos1ActionPerformed
        try {
            this.SelectSucursal.setVisible(false);
            
            PanelMenuProductosSucursal pmps = new PanelMenuProductosSucursal(fp,id_sucursal);
            fp.cargarPanel(pmps);    
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuSucursales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSucProductos1ActionPerformed

    private void btnModSucursal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModSucursal1ActionPerformed
        try {
            Sucursal sucursal = FunSucursal.selecSucursal(id_sucursal);
            
            //iniciar Datos
            this.textNombreMod.setText(sucursal.getNombre());
            this.textDireccionMod.setText(sucursal.getDireccion());
            this.textTelefonoMod.setText(sucursal.getTelefono());
            this.textErrorMod.setText("");
            
            this.ModSucursal.setLocationRelativeTo(SelectSucursal);
            this.ModSucursal.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuSucursales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModSucursal1ActionPerformed

    private void btnModJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModJefeActionPerformed
        try {
            JefeSucursal jefe = FunSucursal.selecJefe(id_sucursal);
            
            
            //iniciar datos
            this.textJefeNombreMod.setText(jefe.getNombre());
            this.textJefeEdadMod.setText(""+jefe.getEdad());
            this.textErrorModJefe.setText("");
            
            this.ModJefeSucursal.setLocationRelativeTo(SelectSucursal);
            this.ModJefeSucursal.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuSucursales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModJefeActionPerformed

    private void btnElimJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimJefeActionPerformed
        try {
            FunSucursal.eliminarJefe(id_sucursal);
            
            this.LnombreJefe.setText("N/a");
            this.LedadJefe.setText("N/a");
            
            cargarPanel(panelSinJefe);
            
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuSucursales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnElimJefeActionPerformed

    private void btnVolverSelect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverSelect1ActionPerformed
        this.SelectSucursal.setVisible(false);
    }//GEN-LAST:event_btnVolverSelect1ActionPerformed

//Botones Modificar Sucursal
    private void btnAceptarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarModActionPerformed
        try {
            String ok = FunSucursal.modificarSucursal(id_sucursal, region.getIdRegion(), this.textNombreMod.getText(), this.textDireccionMod.getText(), this.textTelefonoMod.getText());
            if(ok != null){
                this.textErrorMod.setText(ok);
                return;
            }
            
            Sucursal sucursal = FunSucursal.selecSucursal(id_sucursal);
            
            //actualiza los datos del seleccionado
            int tamano = 20;
            this.tituloNombre.setText(sucursal.getNombre());
            this.tituloNombre.setFont(new java.awt.Font("Segoe UI", 3, tamano));
        
            while(true){
                if(this.tituloNombre.getPreferredSize().width > 231){
                    this.tituloNombre.setFont(new java.awt.Font("Segoe UI", 3, tamano));
                }else{
                    break;
                }
                tamano -= 1;
            }
            
            this.LsucursalDireccion.setText(sucursal.getDireccion());
            this.LsucursalTelefono.setText(sucursal.getTelefono());
            
            this.mostrarSucursales(FunSucursal.listarSucursales(region.getIdRegion()));
        
            this.ModSucursal.setVisible(false);
        } catch (SQLException ex) {
            this.textErrorMod.setText("* Error: Conexion SQL");
        }
    }//GEN-LAST:event_btnAceptarModActionPerformed

    private void btnCancelarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarModActionPerformed
        this.ModSucursal.setVisible(false);
    }//GEN-LAST:event_btnCancelarModActionPerformed

//Botones Agregar Sucursal
    private void btnCancelarAgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAgrActionPerformed
        this.AgrSucursal.setVisible(false);
    }//GEN-LAST:event_btnCancelarAgrActionPerformed
  
    private void btnAceptarAgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarAgrActionPerformed
        try {
            String ok = FunSucursal.agregarSucursal(region.getIdRegion(), this.textNombre.getText(), this.textDireccion.getText(), this.textTelefono.getText());
            if(ok != null){
                this.textErrorAgr.setText(ok);
                return;
            }

            this.mostrarSucursales(FunSucursal.listarSucursales(region.getIdRegion()));

            this.AgrSucursal.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuSucursales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAceptarAgrActionPerformed

//Botones Agregar Jefe Sucursal a la Sucursal
    private void btnAceptarAgrJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarAgrJefeActionPerformed
        try {
            String ok = FunSucursal.agregarJefe(this.textJefeNombre.getText(), this.textJefeEdad.getText(), id_sucursal);
            if(ok != null){
                this.textErrorAgrJefe.setText(ok);
                return;
            }
            
            JefeSucursal jefe = FunSucursal.selecJefe(id_sucursal);
            
            this.LnombreJefe.setText(jefe.getNombre());
            this.LedadJefe.setText(""+jefe.getEdad());
            
            cargarPanel(panelConJefe);
            
            this.AgrJefeSucursal.setVisible(false);
        } catch (SQLException ex) {
            this.textErrorAgrJefe.setText("* Error: Conexion SQL");
        }
    }//GEN-LAST:event_btnAceptarAgrJefeActionPerformed

    private void btnCancelarAgrJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAgrJefeActionPerformed
        this.AgrJefeSucursal.setVisible(false);
    }//GEN-LAST:event_btnCancelarAgrJefeActionPerformed

//Botones Modificar Jefe Sucursal de la Sucursal
    private void btnAceptarModJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarModJefeActionPerformed
        try {
            String ok = FunSucursal.agregarJefe(this.textJefeNombreMod.getText(), this.textJefeEdadMod.getText(), id_sucursal);
            if(ok != null){
                this.textErrorModJefe.setText(ok);
                return;
            }
            
            JefeSucursal jefe = FunSucursal.selecJefe(id_sucursal);
            
            this.LnombreJefe.setText(jefe.getNombre());
            this.LedadJefe.setText(""+jefe.getEdad());
            
            cargarPanel(panelConJefe);
            
            this.ModJefeSucursal.setVisible(false);
        } catch (SQLException ex) {
            this.textErrorModJefe.setText("* Error: Conexion SQL");
        }
    }//GEN-LAST:event_btnAceptarModJefeActionPerformed

    private void btnCancelarModJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarModJefeActionPerformed
        this.ModJefeSucursal.setVisible(false);
    }//GEN-LAST:event_btnCancelarModJefeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AgrJefeSucursal;
    private javax.swing.JDialog AgrSucursal;
    private javax.swing.JDialog ElimSucursal;
    private javax.swing.JLabel Ldireccion;
    private javax.swing.JLabel LdireccionMod;
    private javax.swing.JLabel LdireccionSelect;
    private javax.swing.JLabel LedadJefe;
    private javax.swing.JLabel LedadSelect;
    private javax.swing.JLabel LidTelefono;
    private javax.swing.JLabel LidTelefonoMod;
    private javax.swing.JLabel LidTelefonoSelect;
    private javax.swing.JLabel LjefeEdad;
    private javax.swing.JLabel LjefeEdadMod;
    private javax.swing.JLabel LjefeNombre;
    private javax.swing.JLabel LjefeNombreMod;
    private javax.swing.JLabel Lnombre;
    private javax.swing.JLabel LnombreJefe;
    private javax.swing.JLabel LnombreMod;
    private javax.swing.JLabel LnombreSelect;
    private javax.swing.JLabel Lsucursal;
    private javax.swing.JLabel LsucursalDireccion;
    private javax.swing.JLabel LsucursalTelefono;
    private javax.swing.JLabel Ltelefono;
    private javax.swing.JLabel LtelefonoMod;
    private javax.swing.JLabel LtelefonoSelect;
    private javax.swing.JDialog ModJefeSucursal;
    private javax.swing.JDialog ModSucursal;
    private javax.swing.JDialog SelectSucursal;
    private javax.swing.JButton btnAceptarAgr;
    private javax.swing.JButton btnAceptarAgrJefe;
    private javax.swing.JButton btnAceptarElim;
    private javax.swing.JButton btnAceptarMod;
    private javax.swing.JButton btnAceptarModJefe;
    private javax.swing.JButton btnAgrJefe;
    private javax.swing.JButton btnAgrSucursal;
    private javax.swing.JButton btnCancelarAgr;
    private javax.swing.JButton btnCancelarAgrJefe;
    private javax.swing.JButton btnCancelarElim;
    private javax.swing.JButton btnCancelarMod;
    private javax.swing.JButton btnCancelarModJefe;
    private javax.swing.JButton btnElimJefe;
    private javax.swing.JButton btnElimSucursal;
    private javax.swing.JButton btnModJefe;
    private javax.swing.JButton btnModSucursal;
    private javax.swing.JButton btnModSucursal1;
    private javax.swing.JButton btnSucProductos;
    private javax.swing.JButton btnSucProductos1;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolverSelect;
    private javax.swing.JButton btnVolverSelect1;
    private javax.swing.JLabel imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel linea;
    private javax.swing.JComboBox<String> listaSucursalesElim;
    private javax.swing.JPanel panelConJefe;
    private javax.swing.JPanel panelSinJefe;
    private javax.swing.JTable tablaSucursales;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textDireccionMod;
    private javax.swing.JLabel textErrorAgr;
    private javax.swing.JLabel textErrorAgrJefe;
    private javax.swing.JLabel textErrorMod;
    private javax.swing.JLabel textErrorModJefe;
    private javax.swing.JTextField textJefeEdad;
    private javax.swing.JTextField textJefeEdadMod;
    private javax.swing.JTextField textJefeNombre;
    private javax.swing.JTextField textJefeNombreMod;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textNombreMod;
    private javax.swing.JTextField textTelefono;
    private javax.swing.JTextField textTelefonoMod;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloAgregar;
    private javax.swing.JLabel tituloAgregarJefe;
    private javax.swing.JLabel tituloEliminar;
    private javax.swing.JLabel tituloJefe;
    private javax.swing.JLabel tituloModJefe;
    private javax.swing.JLabel tituloModificar;
    private javax.swing.JLabel tituloNombre;
    // End of variables declaration//GEN-END:variables
}