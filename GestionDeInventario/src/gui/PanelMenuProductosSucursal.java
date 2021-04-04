
package gui;

import FuncionesGeneral.FunProducto;
import FuncionesGeneral.FunSucursal;
import FuncionesGeneral.FunSucursalProducto;
import domain.Producto;
import java.awt.Color;
import domain.Sucursal;
import domain.SucursalProducto;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PanelMenuProductosSucursal extends javax.swing.JPanel {
    FramePrincipal fp = null;
    Sucursal sucursal = null;
    int id_producto = -1;
    
    public PanelMenuProductosSucursal(FramePrincipal fp, int id_sucursal) throws SQLException {
        this.fp = fp;
        this.sucursal = FunSucursal.selecSucursal(id_sucursal);
        
        initComponents();
        
        int tamano = 22;
        this.titulo.setText(sucursal.getNombre()+" - "+Texts.SUCURSALES.getTexto());
        this.titulo.setFont(new java.awt.Font("Segoe UI", 3, tamano));
        
        while(true){
            if(this.titulo.getPreferredSize().width > 388){
                this.titulo.setFont(new java.awt.Font("Segoe UI", 3, tamano));
            }else{
                break;
            }
            tamano -= 1;
        }
        
        mostrarProductos(FunProducto.listarProductos(id_sucursal));
    }

    private void mostrarProductos(Map<String,Producto> productos){
        String matriz[][]=new String[productos.size()][1];
        
        int i = 0;
        for (Producto producto : productos.values()) {
            matriz[i][0] = "  "+producto.getNombre()+"    $"+producto.getPrecio();
            i++;
        }
        
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                ""
            }
        ));
    }
    
    private void ItemsComboAgr(Map<String,Producto> productos){
        this.listaProductosExist.removeAllItems();
        
        if(productos.isEmpty()){
            return;
        }
        
        productos.values().forEach(producto -> {
            this.listaProductosExist.addItem(producto.getNombre());
        });

        this.listaProductosExist.setSelectedIndex(0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuAgregarProducto = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        tituloAgregar = new javax.swing.JLabel();
        btnAgrNuevo = new javax.swing.JButton();
        btnAgrVolver = new javax.swing.JButton();
        btnAgrExistente = new javax.swing.JButton();
        AgrProducto = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        tituloAgr = new javax.swing.JLabel();
        LnombreAgr = new javax.swing.JLabel();
        textNombreAgr = new javax.swing.JTextField();
        LbarCodeAgr = new javax.swing.JLabel();
        textBarCodeAgr = new javax.swing.JTextField();
        LPrecioAgr = new javax.swing.JLabel();
        textPrecioAgr = new javax.swing.JTextField();
        LStockAgr = new javax.swing.JLabel();
        textStockAgr = new javax.swing.JTextField();
        LdescripcionAgr = new javax.swing.JLabel();
        textErrorAgr = new javax.swing.JLabel();
        btnAceptarAgr = new javax.swing.JButton();
        btnCancelarAgr = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        textDescripcionAgr = new javax.swing.JTextPane();
        AgrExistProducto = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        tituloModificar = new javax.swing.JLabel();
        LproductoExist = new javax.swing.JLabel();
        listaProductosExist = new javax.swing.JComboBox<>();
        LstockExist = new javax.swing.JLabel();
        textStockExist = new javax.swing.JTextField();
        textErrorExist = new javax.swing.JLabel();
        btnAceptarAgrExist = new javax.swing.JButton();
        btnCancelarAgrExist = new javax.swing.JButton();
        SelectProducto = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        tituloNombre = new javax.swing.JLabel();
        LbarCodeSelect = new javax.swing.JLabel();
        LPrecioSelect = new javax.swing.JLabel();
        LstockTotalSelect = new javax.swing.JLabel();
        LdescripcionSelect = new javax.swing.JLabel();
        LselectBarCode = new javax.swing.JLabel();
        LselectPrecio = new javax.swing.JLabel();
        LselectStock = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        LselectDescripcion = new javax.swing.JTextPane();
        jPanel7 = new javax.swing.JPanel();
        btnElimProducto = new javax.swing.JButton();
        btnModStock = new javax.swing.JButton();
        btnSelectVolver = new javax.swing.JButton();
        ModStockProducto = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        tituloModificarStock = new javax.swing.JLabel();
        LproductoExistStock = new javax.swing.JLabel();
        LstockExistStock = new javax.swing.JLabel();
        textStockExistMod = new javax.swing.JTextField();
        textErrorStock = new javax.swing.JLabel();
        btnAceptarModStock = new javax.swing.JButton();
        btnCancelarModStock = new javax.swing.JButton();
        textnombreExistMod = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        textBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        Lprecio = new javax.swing.JLabel();
        Lmin = new javax.swing.JLabel();
        textPrecioMin = new javax.swing.JTextField();
        Lmax = new javax.swing.JLabel();
        textPrecioMax = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        btnAgrProducto = new javax.swing.JButton();

        menuAgregarProducto.setTitle(Texts.TITULO.getTexto());
        menuAgregarProducto.setMinimumSize(new java.awt.Dimension(365, 240));
        menuAgregarProducto.setModal(true);
        menuAgregarProducto.setName("dialogAgregarRegion"); // NOI18N
        menuAgregarProducto.setResizable(false);

        jPanel3.setBackground(Color.decode(Colors.FONDO.getColor()));

        tituloAgregar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tituloAgregar.setForeground(Color.decode(Colors.TITULO.getColor())
        );
        tituloAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloAgregar.setText(Texts.AGREGAR_PRODUCTO.getTexto());

        btnAgrNuevo.setBackground(Color.decode(Colors.FONDO_BOTON.getColor())
        );
        btnAgrNuevo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAgrNuevo.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnAgrNuevo.setText(Texts.NUEVO.getTexto());
        btnAgrNuevo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnAgrNuevo.setFocusable(false);
        btnAgrNuevo.setMaximumSize(new java.awt.Dimension(110, 30));
        btnAgrNuevo.setMinimumSize(new java.awt.Dimension(110, 30));
        btnAgrNuevo.setPreferredSize(new java.awt.Dimension(110, 30));
        btnAgrNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrNuevoActionPerformed(evt);
            }
        });

        btnAgrVolver.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnAgrVolver.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAgrVolver.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnAgrVolver.setText(Texts.VOLVER.getTexto());
        btnAgrVolver.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnAgrVolver.setFocusable(false);
        btnAgrVolver.setMaximumSize(new java.awt.Dimension(110, 30));
        btnAgrVolver.setMinimumSize(new java.awt.Dimension(110, 30));
        btnAgrVolver.setPreferredSize(new java.awt.Dimension(110, 30));
        btnAgrVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrVolverActionPerformed(evt);
            }
        });

        btnAgrExistente.setBackground(Color.decode(Colors.FONDO_BOTON.getColor())
        );
        btnAgrExistente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAgrExistente.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnAgrExistente.setText(Texts.EXISTENTE.getTexto());
        btnAgrExistente.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnAgrExistente.setFocusable(false);
        btnAgrExistente.setMaximumSize(new java.awt.Dimension(110, 30));
        btnAgrExistente.setMinimumSize(new java.awt.Dimension(110, 30));
        btnAgrExistente.setPreferredSize(new java.awt.Dimension(110, 30));
        btnAgrExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrExistenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAgrExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgrNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgrVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgrNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgrExistente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgrVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuAgregarProductoLayout = new javax.swing.GroupLayout(menuAgregarProducto.getContentPane());
        menuAgregarProducto.getContentPane().setLayout(menuAgregarProductoLayout);
        menuAgregarProductoLayout.setHorizontalGroup(
            menuAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuAgregarProductoLayout.setVerticalGroup(
            menuAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        AgrProducto.setTitle(Texts.TITULO.getTexto());
        AgrProducto.setMinimumSize(new java.awt.Dimension(365, 432));
        AgrProducto.setModal(true);
        AgrProducto.setResizable(false);

        jPanel6.setBackground(Color.decode(Colors.FONDO.getColor()));
        jPanel6.setPreferredSize(new java.awt.Dimension(350, 350));

        tituloAgr.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tituloAgr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloAgr.setText(Texts.AGREGAR_NUEVO_PRODUCTO.getTexto());
        tituloAgr.setForeground(Color.decode(Colors.TITULO.getColor()));

        LnombreAgr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LnombreAgr.setText(Texts.NOMBRE.getTexto());
        LnombreAgr.setMaximumSize(new java.awt.Dimension(60, 26));
        LnombreAgr.setMinimumSize(new java.awt.Dimension(60, 26));
        LnombreAgr.setPreferredSize(new java.awt.Dimension(70, 26));
        LnombreAgr.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textNombreAgr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textNombreAgr.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())), javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor()))));
        textNombreAgr.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textNombreAgr.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LbarCodeAgr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LbarCodeAgr.setText(Texts.BARCODE.getTexto());
        LbarCodeAgr.setMinimumSize(new java.awt.Dimension(60, 20));
        LbarCodeAgr.setPreferredSize(new java.awt.Dimension(70, 26));
        LbarCodeAgr.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textBarCodeAgr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textBarCodeAgr.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())), javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor()))));
        textBarCodeAgr.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textBarCodeAgr.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LPrecioAgr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LPrecioAgr.setText(Texts.PRECIO.getTexto());
        LPrecioAgr.setMinimumSize(new java.awt.Dimension(60, 20));
        LPrecioAgr.setPreferredSize(new java.awt.Dimension(70, 26));
        LPrecioAgr.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textPrecioAgr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textPrecioAgr.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())), javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor()))));
        textPrecioAgr.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textPrecioAgr.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LStockAgr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LStockAgr.setForeground(Color.decode(Colors.TEXTO.getColor())
        );
        LStockAgr.setText(Texts.STOCK.getTexto());
        LStockAgr.setMinimumSize(new java.awt.Dimension(60, 20));
        LStockAgr.setPreferredSize(new java.awt.Dimension(70, 26));
        LPrecioAgr.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textStockAgr.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor())
        );
        textStockAgr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textStockAgr.setForeground(Color.decode(Colors.TEXTO.getColor())
        );
        textStockAgr.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())), javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor()))));
        textPrecioAgr.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textPrecioAgr.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LdescripcionAgr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LdescripcionAgr.setText(Texts.DESCRIPCION.getTexto());
        LdescripcionAgr.setMaximumSize(new java.awt.Dimension(70, 20));
        LdescripcionAgr.setMinimumSize(new java.awt.Dimension(70, 20));
        LdescripcionAgr.setPreferredSize(new java.awt.Dimension(70, 26));
        LdescripcionAgr.setForeground(Color.decode(Colors.TEXTO.getColor()));

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

        jScrollPane4.getViewport().setBackground(Color.decode(Colors.FONDO.getColor()));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        jScrollPane4.setBackground(Color.decode(Colors.FONDO.getColor()));
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setPreferredSize(new java.awt.Dimension(212, 64));

        textDescripcionAgr.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor())
        );
        textDescripcionAgr.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor())
        )));
        textDescripcionAgr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textDescripcionAgr.setForeground(Color.decode(Colors.TEXTO.getColor())
        );
        jScrollPane4.setViewportView(textDescripcionAgr);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloAgr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnAceptarAgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelarAgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textErrorAgr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(LbarCodeAgr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(LPrecioAgr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(LdescripcionAgr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(LStockAgr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(textBarCodeAgr)
                                                .addComponent(textPrecioAgr)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textStockAgr)))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addComponent(LnombreAgr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(textNombreAgr, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 14, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloAgr)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LnombreAgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNombreAgr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbarCodeAgr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBarCodeAgr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textPrecioAgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LPrecioAgr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LStockAgr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textStockAgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LdescripcionAgr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textErrorAgr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarAgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarAgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout AgrProductoLayout = new javax.swing.GroupLayout(AgrProducto.getContentPane());
        AgrProducto.getContentPane().setLayout(AgrProductoLayout);
        AgrProductoLayout.setHorizontalGroup(
            AgrProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AgrProductoLayout.setVerticalGroup(
            AgrProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
        );

        AgrExistProducto.setTitle(Texts.TITULO.getTexto());
        AgrExistProducto.setMinimumSize(new java.awt.Dimension(365, 290));
        AgrExistProducto.setModal(true);
        AgrExistProducto.setName("dialogModificarRegion"); // NOI18N
        AgrExistProducto.setResizable(false);

        jPanel5.setBackground(Color.decode(Colors.FONDO.getColor()));

        tituloModificar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tituloModificar.setForeground(Color.decode(Colors.TITULO.getColor())
        );
        tituloModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificar.setText(Texts.AGREGAR_EXISTENTE.getTexto());

        LproductoExist.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LproductoExist.setForeground(Color.decode(Colors.TEXTO.getColor()));
        LproductoExist.setText(Texts.PRODUCTO.getTexto());
        LproductoExist.setPreferredSize(new java.awt.Dimension(60, 26));

        listaProductosExist.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listaProductosExist.setMaximumRowCount(50);
        listaProductosExist.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        listaProductosExist.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaProductosExist.setFocusable(false);
        listaProductosExist.setMinimumSize(new java.awt.Dimension(212, 26));
        listaProductosExist.setPreferredSize(new java.awt.Dimension(212, 26));
        listaProductosExist.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        listaProductosExist.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LstockExist.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LstockExist.setForeground(Color.decode(Colors.TEXTO.getColor()));
        LstockExist.setText(Texts.STOCK.getTexto());
        LstockExist.setPreferredSize(new java.awt.Dimension(60, 26));

        textStockExist.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textStockExist.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())
        ), javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor())
        )));
        textStockExist.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textStockExist.setName(""); // NOI18N
        textStockExist.setRequestFocusEnabled(false);
        textStockExist.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textStockExist.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textErrorExist.setForeground(Color.decode(Colors.TEXT_ERROR.getColor()));
        textErrorExist.setText("* Posible Error");
        textErrorExist.setForeground(Color.decode(Colors.TEXT_ERROR.getColor()));

        btnAceptarAgrExist.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnAceptarAgrExist.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAceptarAgrExist.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnAceptarAgrExist.setText(Texts.ACEPTAR.getTexto());
        btnAceptarAgrExist.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnAceptarAgrExist.setFocusable(false);
        btnAceptarAgrExist.setMaximumSize(new java.awt.Dimension(110, 30));
        btnAceptarAgrExist.setMinimumSize(new java.awt.Dimension(110, 30));
        btnAceptarAgrExist.setPreferredSize(new java.awt.Dimension(110, 30));
        btnAceptarAgrExist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarAgrExistActionPerformed(evt);
            }
        });

        btnCancelarAgrExist.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnCancelarAgrExist.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCancelarAgrExist.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnCancelarAgrExist.setText(Texts.CANCELAR.getTexto());
        btnCancelarAgrExist.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnCancelarAgrExist.setFocusable(false);
        btnCancelarAgrExist.setMaximumSize(new java.awt.Dimension(110, 30));
        btnCancelarAgrExist.setMinimumSize(new java.awt.Dimension(110, 30));
        btnCancelarAgrExist.setPreferredSize(new java.awt.Dimension(110, 30));
        btnCancelarAgrExist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAgrExistActionPerformed(evt);
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
                            .addComponent(textErrorExist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(LstockExist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textStockExist, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnAceptarAgrExist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(btnCancelarAgrExist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(LproductoExist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(listaProductosExist, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(LproductoExist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaProductosExist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textStockExist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LstockExist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textErrorExist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarAgrExist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarAgrExist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout AgrExistProductoLayout = new javax.swing.GroupLayout(AgrExistProducto.getContentPane());
        AgrExistProducto.getContentPane().setLayout(AgrExistProductoLayout);
        AgrExistProductoLayout.setHorizontalGroup(
            AgrExistProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AgrExistProductoLayout.setVerticalGroup(
            AgrExistProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SelectProducto.setTitle(Texts.TITULO.getTexto());
        SelectProducto.setMinimumSize(new java.awt.Dimension(445, 313));
        SelectProducto.setModal(true);
        SelectProducto.setResizable(false);

        jPanel4.setBackground(Color.decode(Colors.FONDO.getColor()));
        jPanel4.setPreferredSize(new java.awt.Dimension(404, 323));

        tituloNombre.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tituloNombre.setText(Texts.AGREGAR_CLIENTE.getTexto());
        tituloNombre.setForeground(Color.decode(Colors.TITULO.getColor()));

        LbarCodeSelect.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LbarCodeSelect.setText(Texts.BARCODE.getTexto());
        LbarCodeSelect.setMinimumSize(new java.awt.Dimension(60, 20));
        LbarCodeSelect.setPreferredSize(new java.awt.Dimension(70, 26));
        LbarCodeSelect.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LPrecioSelect.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LPrecioSelect.setText(Texts.PRECIO.getTexto());
        LPrecioSelect.setMinimumSize(new java.awt.Dimension(60, 20));
        LPrecioSelect.setPreferredSize(new java.awt.Dimension(80, 26));
        LPrecioSelect.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LstockTotalSelect.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LstockTotalSelect.setText(Texts.STOCK.getTexto());
        LstockTotalSelect.setMinimumSize(new java.awt.Dimension(60, 20));
        LstockTotalSelect.setPreferredSize(new java.awt.Dimension(80, 26));
        LstockTotalSelect.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LdescripcionSelect.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LdescripcionSelect.setText(Texts.DESCRIPCION.getTexto());
        LdescripcionSelect.setMinimumSize(new java.awt.Dimension(60, 20));
        LdescripcionSelect.setPreferredSize(new java.awt.Dimension(70, 26));
        LdescripcionSelect.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LselectBarCode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LselectBarCode.setText("(BarCode Producto)");
        LselectBarCode.setMaximumSize(new java.awt.Dimension(43, 26));
        LselectBarCode.setMinimumSize(new java.awt.Dimension(43, 26));
        LselectBarCode.setPreferredSize(new java.awt.Dimension(43, 26));
        LselectBarCode.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LselectPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LselectPrecio.setText("(Precio Producto)");
        LselectPrecio.setToolTipText("");
        LselectPrecio.setPreferredSize(new java.awt.Dimension(37, 26));
        LselectPrecio.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LselectStock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LselectStock.setText("(Stock en Tienda Prod)");
        LselectStock.setMaximumSize(new java.awt.Dimension(43, 26));
        LselectStock.setMinimumSize(new java.awt.Dimension(43, 26));
        LselectStock.setPreferredSize(new java.awt.Dimension(43, 26));
        LselectStock.setForeground(Color.decode(Colors.TEXTO.getColor()));

        jScrollPane3.getViewport().setBackground(Color.decode(Colors.FONDO.getColor()));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        jScrollPane3.setBackground(Color.decode(Colors.FONDO.getColor())
        );
        jScrollPane3.setMinimumSize(new java.awt.Dimension(231, 16));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(231, 26));

        LselectDescripcion.setEditable(false);
        LselectDescripcion.setBackground(Color.decode(Colors.FONDO.getColor())
        );
        LselectDescripcion.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.FONDO.getColor())
        )));
        LselectDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LselectDescripcion.setForeground(Color.decode(Colors.TEXTO.getColor())
        );
        LselectDescripcion.setText("(Descripcion Producto)");
        LselectDescripcion.setCaretPosition(0);
        jScrollPane3.setViewportView(LselectDescripcion);

        jPanel7.setBackground(Color.decode(Colors.FONDO.getColor())
        );

        btnElimProducto.setBackground(Color.decode(Colors.FONDO_BOTON.getColor())
        );
        btnElimProducto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnElimProducto.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor())
        );
        btnElimProducto.setText(Texts.ELIM_PRODUCTO.getTexto());
        btnElimProducto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())
        ));
        btnElimProducto.setFocusable(false);
        btnElimProducto.setMaximumSize(new java.awt.Dimension(89, 30));
        btnElimProducto.setMinimumSize(new java.awt.Dimension(89, 30));
        btnElimProducto.setPreferredSize(new java.awt.Dimension(140, 30));
        btnElimProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimProductoActionPerformed(evt);
            }
        });

        btnModStock.setBackground(Color.decode(Colors.FONDO_BOTON.getColor())
        );
        btnModStock.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnModStock.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor())
        );
        btnModStock.setText(Texts.MOD_STOCK.getTexto());
        btnModStock.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())
        ));
        btnModStock.setFocusable(false);
        btnModStock.setMaximumSize(new java.awt.Dimension(89, 30));
        btnModStock.setMinimumSize(new java.awt.Dimension(89, 30));
        btnModStock.setPreferredSize(new java.awt.Dimension(140, 30));
        btnModStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModStockActionPerformed(evt);
            }
        });

        btnSelectVolver.setBackground(Color.decode(Colors.FONDO_BOTON.getColor())
        );
        btnSelectVolver.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSelectVolver.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor())
        );
        btnSelectVolver.setText(Texts.VOLVER.getTexto());
        btnSelectVolver.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())
        ));
        btnSelectVolver.setFocusable(false);
        btnSelectVolver.setMaximumSize(new java.awt.Dimension(89, 30));
        btnSelectVolver.setMinimumSize(new java.awt.Dimension(89, 30));
        btnSelectVolver.setPreferredSize(new java.awt.Dimension(140, 30));
        btnSelectVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnElimProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnElimProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSelectVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LdescripcionSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LstockTotalSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LPrecioSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LbarCodeSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LselectBarCode, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LselectPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LselectStock, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tituloNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tituloNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LbarCodeSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(LselectBarCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LPrecioSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LselectPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LstockTotalSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LselectStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LdescripcionSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout SelectProductoLayout = new javax.swing.GroupLayout(SelectProducto.getContentPane());
        SelectProducto.getContentPane().setLayout(SelectProductoLayout);
        SelectProductoLayout.setHorizontalGroup(
            SelectProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        SelectProductoLayout.setVerticalGroup(
            SelectProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
        );

        ModStockProducto.setTitle(Texts.TITULO.getTexto());
        ModStockProducto.setMinimumSize(new java.awt.Dimension(365, 290));
        ModStockProducto.setModal(true);
        ModStockProducto.setName("dialogModificarRegion"); // NOI18N
        ModStockProducto.setResizable(false);

        jPanel5.setBackground(Color.decode(Colors.FONDO.getColor()));
        jPanel8.setBackground(Color.decode(Colors.FONDO.getColor())
        );

        tituloModificarStock.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tituloModificarStock.setForeground(Color.decode(Colors.TITULO.getColor())
        );
        tituloModificarStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificarStock.setText(Texts.MODIFICAR_STOCK.getTexto());

        LproductoExistStock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LproductoExistStock.setForeground(Color.decode(Colors.TEXTO.getColor()));
        LproductoExistStock.setText(Texts.PRODUCTO.getTexto());
        LproductoExistStock.setPreferredSize(new java.awt.Dimension(60, 26));

        LstockExistStock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LstockExistStock.setForeground(Color.decode(Colors.TEXTO.getColor()));
        LstockExistStock.setText(Texts.STOCK.getTexto());
        LstockExistStock.setPreferredSize(new java.awt.Dimension(60, 26));

        textStockExistMod.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor())
        );
        textStockExistMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textStockExistMod.setForeground(Color.decode(Colors.TEXTO.getColor())
        );
        textStockExistMod.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())
        ), javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor())
        )));
        textStockExistMod.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textStockExistMod.setName(""); // NOI18N
        textStockExistMod.setRequestFocusEnabled(false);
        textStockExist.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textStockExist.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textErrorStock.setForeground(Color.decode(Colors.TEXT_ERROR.getColor()));
        textErrorStock.setText("* Posible Error");
        textErrorExist.setForeground(Color.decode(Colors.TEXT_ERROR.getColor()));

        btnAceptarModStock.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnAceptarModStock.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAceptarModStock.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnAceptarModStock.setText(Texts.ACEPTAR.getTexto());
        btnAceptarModStock.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnAceptarModStock.setFocusable(false);
        btnAceptarModStock.setMaximumSize(new java.awt.Dimension(110, 30));
        btnAceptarModStock.setMinimumSize(new java.awt.Dimension(110, 30));
        btnAceptarModStock.setPreferredSize(new java.awt.Dimension(110, 30));
        btnAceptarModStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarModStockActionPerformed(evt);
            }
        });

        btnCancelarModStock.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnCancelarModStock.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCancelarModStock.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnCancelarModStock.setText(Texts.CANCELAR.getTexto());
        btnCancelarModStock.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnCancelarModStock.setFocusable(false);
        btnCancelarModStock.setMaximumSize(new java.awt.Dimension(110, 30));
        btnCancelarModStock.setMinimumSize(new java.awt.Dimension(110, 30));
        btnCancelarModStock.setPreferredSize(new java.awt.Dimension(110, 30));
        btnCancelarModStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarModStockActionPerformed(evt);
            }
        });

        textnombreExistMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textnombreExistMod.setForeground(Color.decode(Colors.TEXTO.getColor())
        );
        textnombreExistMod.setText(" (Nombre Producto)");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloModificarStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textErrorStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(LstockExistStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textStockExistMod, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(btnAceptarModStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(btnCancelarModStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(LproductoExistStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textnombreExistMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloModificarStock)
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LproductoExistStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textnombreExistMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textStockExistMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LstockExistStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textErrorStock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarModStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarModStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout ModStockProductoLayout = new javax.swing.GroupLayout(ModStockProducto.getContentPane());
        ModStockProducto.getContentPane().setLayout(ModStockProductoLayout);
        ModStockProductoLayout.setHorizontalGroup(
            ModStockProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ModStockProductoLayout.setVerticalGroup(
            ModStockProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBackground(Color.decode(Colors.FONDO.getColor()));

        titulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText(Texts.PRODUCTOS.getTexto());
        titulo.setForeground(Color.decode(Colors.TITULO.getColor()));

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
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jScrollPane1.getViewport().setBackground(Color.decode(Colors.FONDO.getColor()));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));

        tablaProductos.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor())
        );
        tablaProductos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tablaProductos.setForeground(Color.decode(Colors.TEXTO.getColor())
        );
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaProductos.setColumnSelectionAllowed(true);
        tablaProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaProductos.setFocusable(false);
        tablaProductos.setGridColor(Color.decode(Colors.FONDO.getColor())
        );
        tablaProductos.setIntercellSpacing(new java.awt.Dimension(5, 0));
        tablaProductos.setRowHeight(35);
        tablaProductos.getTableHeader().setReorderingAllowed(false);
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos);

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
        textPrecioMin.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())), javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor()))));
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
        ), javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor())
        )));
        textPrecioMax.setPreferredSize(new java.awt.Dimension(64, 23));

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

        btnAgrProducto.setBackground(Color.decode(Colors.FONDO_BOTON.getColor())
        );
        btnAgrProducto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAgrProducto.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor())
        );
        btnAgrProducto.setText(Texts.AGR_PRODUCTO.getTexto());
        btnAgrProducto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnAgrProducto.setFocusable(false);
        btnAgrProducto.setMaximumSize(new java.awt.Dimension(75, 30));
        btnAgrProducto.setMinimumSize(new java.awt.Dimension(75, 30));
        btnAgrProducto.setPreferredSize(new java.awt.Dimension(102, 29));
        btnAgrProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgrProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(textBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgrProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

//Botones Menu Productos Sucursal
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        try {
            PanelMenuSucursales pms = new PanelMenuSucursales(fp, sucursal.getIdRegion());
            fp.cargarPanel(pms);
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuProductosSucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgrProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrProductoActionPerformed
        this.menuAgregarProducto.setLocationRelativeTo(fp);
        this.menuAgregarProducto.setVisible(true);
    }//GEN-LAST:event_btnAgrProductoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            this.mostrarProductos(FunProducto.listarProductos(sucursal.getIdSucursal(), this.textPrecioMin.getText(), this.textPrecioMax.getText(), this.textBuscar.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuProductosSucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

//Botones Menu Agregar Producto
    private void btnAgrNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrNuevoActionPerformed
        this.AgrProducto.setLocationRelativeTo(fp);
        
        //iniciar datos
        this.textNombreAgr.setText("");
        this.textBarCodeAgr.setText("");
        this.textPrecioAgr.setText("");
        this.textStockAgr.setText("");
        this.textDescripcionAgr.setText("");
        this.textErrorAgr.setText("");
        
        this.menuAgregarProducto.setVisible(false);
        this.AgrProducto.setVisible(true);
    }//GEN-LAST:event_btnAgrNuevoActionPerformed

    private void btnAgrExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrExistenteActionPerformed
        try {
            this.AgrExistProducto.setLocationRelativeTo(fp);
            
            //iniciar datos
            this.ItemsComboAgr(FunProducto.listarProductosExist(sucursal.getIdSucursal()));
            this.textStockExist.setText("");
            this.textErrorExist.setText("");
        
            this.menuAgregarProducto.setVisible(false);
            this.AgrExistProducto.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuProductosSucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgrExistenteActionPerformed

    private void btnAgrVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrVolverActionPerformed
        this.menuAgregarProducto.setVisible(false);
    }//GEN-LAST:event_btnAgrVolverActionPerformed

//Tabla Menu Productos en Sucursal
    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        try {
            Map<String,Producto> productos = FunProducto.listarProductos(sucursal.getIdSucursal(), this.textPrecioMin.getText(), this.textPrecioMax.getText(), this.textBuscar.getText());
            int pos = tablaProductos.getSelectedRow();
            int cont = 0;
            for (Producto producto : productos.values()) {
                id_producto = producto.getIdProducto();
                if(cont == pos){
                    break;
                }
                cont++;
            }
            
            Producto producto = FunProducto.selecProducto(id_producto);
            
            //iniciar Datos
            int tamano = 20;
            
            this.tituloNombre.setText(producto.getNombre());
            this.tituloNombre.setFont(new java.awt.Font("Segoe UI", 3, tamano));
            while(true){
                if(this.tituloNombre.getPreferredSize().width > 231){
                    this.tituloNombre.setFont(new java.awt.Font("Segoe UI", 3, tamano));
                }else{
                    break;
                }
                tamano -= 1;
            }
            
            this.LselectBarCode.setText("#"+producto.getBarCode());
            this.LselectPrecio.setText("$"+producto.getPrecio());
            
            SucursalProducto sp = FunSucursalProducto.selectSP(id_producto, sucursal.getIdSucursal());
            
            this.LselectStock.setText(""+sp.getStock());
            this.LselectDescripcion.setText(producto.getDescripcion());
        
            this.SelectProducto.setLocationRelativeTo(fp);
            this.SelectProducto.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuProductosSucursal.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_tablaProductosMouseClicked

//Botones Agregar Nuevo Producto
    private void btnAceptarAgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarAgrActionPerformed
        try {
            String ok = FunProducto.agregarProducto(sucursal.getIdSucursal(), id_producto, this.textNombreAgr.getText(), this.textBarCodeAgr.getText(), this.textPrecioAgr.getText(), this.textStockAgr.getText(), this.textDescripcionAgr.getText());
            if(ok != null){
                this.textErrorAgr.setText(ok);
                return;
            }
            
            this.mostrarProductos(FunProducto.listarProductos(sucursal.getIdSucursal(),this.textPrecioMin.getText(), this.textPrecioMax.getText(), this.textBuscar.getText()));
            
            this.AgrProducto.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuProductosSucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAceptarAgrActionPerformed

    private void btnCancelarAgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAgrActionPerformed
        this.AgrProducto.setVisible(false);
    }//GEN-LAST:event_btnCancelarAgrActionPerformed

//Botones Agregar Producto Existente    
    private void btnAceptarAgrExistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarAgrExistActionPerformed
        try {
            Map<String,Producto> productos = FunProducto.listarProductosExist(sucursal.getIdSucursal());
            if(productos.isEmpty()){
                this.AgrExistProducto.setVisible(false);
                return;
            }
            
            int pos = this.listaProductosExist.getSelectedIndex();
            int cont = 0;
            for (Producto producto : productos.values()) {
                id_producto = producto.getIdProducto();
                if(cont == pos){
                    break;
                }
                cont++;
            }
            
            String ok = FunProducto.agregarproducto(sucursal.getIdSucursal(), id_producto, this.textStockExist.getText());
            if(ok != null){
                this.textErrorExist.setText(ok);
                return;
            }
            
            this.mostrarProductos(FunProducto.listarProductos(sucursal.getIdSucursal(),this.textPrecioMin.getText(), this.textPrecioMax.getText(), this.textBuscar.getText()));
            
            this.AgrExistProducto.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuProductosSucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAceptarAgrExistActionPerformed

    private void btnCancelarAgrExistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAgrExistActionPerformed
        this.AgrExistProducto.setVisible(false);
    }//GEN-LAST:event_btnCancelarAgrExistActionPerformed

//Botones Seleccionar Producto
    private void btnElimProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimProductoActionPerformed
        try {
            FunProducto.eliminarProducto(id_producto, sucursal.getIdSucursal());
            
            this.mostrarProductos(FunProducto.listarProductos(sucursal.getIdSucursal(),this.textPrecioMin.getText(), this.textPrecioMax.getText(), this.textBuscar.getText()));
            
            this.SelectProducto.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuProductosSucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnElimProductoActionPerformed

    private void btnModStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModStockActionPerformed
        try {
            this.ModStockProducto.setLocationRelativeTo(SelectProducto);
            
            Producto producto = FunProducto.selecProducto(id_producto);
            SucursalProducto sp = FunSucursalProducto.selectSP(id_producto, sucursal.getIdSucursal());
            
            //Iniciar datos
            this.textnombreExistMod.setText(producto.getNombre());
            this.textStockExistMod.setText(""+sp.getStock());
            this.textErrorStock.setText("");
        
            this.ModStockProducto.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuProductosSucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModStockActionPerformed

    private void btnSelectVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectVolverActionPerformed
        this.SelectProducto.setVisible(false);
    }//GEN-LAST:event_btnSelectVolverActionPerformed

//Botones Modificar Stock en Tienda
    private void btnAceptarModStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarModStockActionPerformed
        try {
            String ok = FunProducto.modificarStockEnTienda(sucursal.getIdSucursal(), id_producto, this.textStockExistMod.getText());
            if(ok != null){
                this.textErrorStock.setText(ok);
                return;
            }
            
            SucursalProducto sp = FunSucursalProducto.selectSP(id_producto, sucursal.getIdSucursal());
            
            this.LselectStock.setText(""+sp.getStock());
            
            this.ModStockProducto.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuProductosSucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAceptarModStockActionPerformed

    private void btnCancelarModStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarModStockActionPerformed
        this.ModStockProducto.setVisible(false);
    }//GEN-LAST:event_btnCancelarModStockActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AgrExistProducto;
    private javax.swing.JDialog AgrProducto;
    private javax.swing.JLabel LPrecioAgr;
    private javax.swing.JLabel LPrecioSelect;
    private javax.swing.JLabel LStockAgr;
    private javax.swing.JLabel LbarCodeAgr;
    private javax.swing.JLabel LbarCodeSelect;
    private javax.swing.JLabel LdescripcionAgr;
    private javax.swing.JLabel LdescripcionSelect;
    private javax.swing.JLabel Lmax;
    private javax.swing.JLabel Lmin;
    private javax.swing.JLabel LnombreAgr;
    private javax.swing.JLabel Lprecio;
    private javax.swing.JLabel LproductoExist;
    private javax.swing.JLabel LproductoExistStock;
    private javax.swing.JLabel LselectBarCode;
    private javax.swing.JTextPane LselectDescripcion;
    private javax.swing.JLabel LselectPrecio;
    private javax.swing.JLabel LselectStock;
    private javax.swing.JLabel LstockExist;
    private javax.swing.JLabel LstockExistStock;
    private javax.swing.JLabel LstockTotalSelect;
    private javax.swing.JDialog ModStockProducto;
    private javax.swing.JDialog SelectProducto;
    private javax.swing.JButton btnAceptarAgr;
    private javax.swing.JButton btnAceptarAgrExist;
    private javax.swing.JButton btnAceptarModStock;
    private javax.swing.JButton btnAgrExistente;
    private javax.swing.JButton btnAgrNuevo;
    private javax.swing.JButton btnAgrProducto;
    private javax.swing.JButton btnAgrVolver;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarAgr;
    private javax.swing.JButton btnCancelarAgrExist;
    private javax.swing.JButton btnCancelarModStock;
    private javax.swing.JButton btnElimProducto;
    private javax.swing.JButton btnModStock;
    private javax.swing.JButton btnSelectVolver;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox<String> listaProductosExist;
    private javax.swing.JDialog menuAgregarProducto;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField textBarCodeAgr;
    private javax.swing.JTextField textBuscar;
    private javax.swing.JTextPane textDescripcionAgr;
    private javax.swing.JLabel textErrorAgr;
    private javax.swing.JLabel textErrorExist;
    private javax.swing.JLabel textErrorStock;
    private javax.swing.JTextField textNombreAgr;
    private javax.swing.JTextField textPrecioAgr;
    private javax.swing.JTextField textPrecioMax;
    private javax.swing.JTextField textPrecioMin;
    private javax.swing.JTextField textStockAgr;
    private javax.swing.JTextField textStockExist;
    private javax.swing.JTextField textStockExistMod;
    private javax.swing.JLabel textnombreExistMod;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloAgr;
    private javax.swing.JLabel tituloAgregar;
    private javax.swing.JLabel tituloModificar;
    private javax.swing.JLabel tituloModificarStock;
    private javax.swing.JLabel tituloNombre;
    // End of variables declaration//GEN-END:variables

    private SucursalProducto FunSucursalProducto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}