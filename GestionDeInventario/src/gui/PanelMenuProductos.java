
package gui;

import FuncionesGeneral.FunProducto;
import FuncionesGeneral.FunSucursalProducto;
import FuncionesGeneral.FunSucursal;
import domain.Producto;
import domain.Sucursal;
import domain.SucursalProducto;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PanelMenuProductos extends javax.swing.JPanel {
    private FramePrincipal fp = null;
    private int id_producto = -1;
    
    public PanelMenuProductos(FramePrincipal fp) throws SQLException {
        this.fp = fp;
        
        initComponents();
        mostrarProductos(FunProducto.listarProductos());
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

    private void mostrarSucursalStock(List<SucursalProducto> sucursalProductos) throws SQLException{
        String matriz[][]=new String[sucursalProductos.size()][2];
        SucursalProducto sp;
        Sucursal sucursal;
        
        for(int i=0; i<sucursalProductos.size(); i++){
            sp = sucursalProductos.get(i);
            sucursal = FunSucursal.selecSucursal(sp.getIdSucursal());
            matriz[i][0] = " "+sucursal.getNombre();
            matriz[i][1] = " "+sp.getStock();
        }
        
        tablaSucursalStock.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Sucursal", "Stock"
            }
        )
        {   
            @Override
            public boolean isCellEditable(int row, int column){return false;}}
        );
        
        if (tablaSucursalStock.getColumnModel().getColumnCount() > 0) {
            tablaSucursalStock.getColumnModel().getColumn(0).setResizable(false);
            tablaSucursalStock.getColumnModel().getColumn(0).setPreferredWidth(110);
            tablaSucursalStock.getColumnModel().getColumn(1).setResizable(false);
            tablaSucursalStock.getColumnModel().getColumn(1).setPreferredWidth(41);
        }       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaSucursalStock = new javax.swing.JTable();
        btnModProducto = new javax.swing.JButton();
        btnSelectVolver = new javax.swing.JButton();
        ModProducto = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        tituloModificar = new javax.swing.JLabel();
        LnombreMod = new javax.swing.JLabel();
        textNombreMod = new javax.swing.JTextField();
        LbarCodeMod = new javax.swing.JLabel();
        textBarCodeMod = new javax.swing.JTextField();
        LprecioMod = new javax.swing.JLabel();
        textPrecioMod = new javax.swing.JTextField();
        LdescripcionMod = new javax.swing.JLabel();
        textErrorMod = new javax.swing.JLabel();
        btnAceptarMod = new javax.swing.JButton();
        btnCancelarMod = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        textDescripcionMod = new javax.swing.JTextPane();
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

        SelectProducto.setTitle(Texts.TITULO.getTexto());
        SelectProducto.setMinimumSize(new java.awt.Dimension(445, 363));
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
        LstockTotalSelect.setText(Texts.STOCK_TOTAL.getTexto());
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
        LselectStock.setText("(Stock Total Prod)");
        LselectStock.setMaximumSize(new java.awt.Dimension(43, 26));
        LselectStock.setMinimumSize(new java.awt.Dimension(43, 26));
        LselectStock.setPreferredSize(new java.awt.Dimension(43, 26));
        LselectStock.setForeground(Color.decode(Colors.TEXTO.getColor()));

        jScrollPane3.getViewport().setBackground(Color.decode(Colors.FONDO.getColor()));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        jScrollPane3.setBackground(Color.decode(Colors.FONDO.getColor())
        );

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

        jScrollPane2.getViewport().setBackground(Color.decode(Colors.FONDO.getColor()));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        jScrollPane2.setBackground(Color.decode(Colors.FONDO.getColor())
        );
        jScrollPane2.setPreferredSize(new java.awt.Dimension(153, 196));

        tablaSucursalStock.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor())
        );
        tablaSucursalStock.setForeground(Color.decode(Colors.TEXTO.getColor())
        );
        tablaSucursalStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sucursal", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaSucursalStock.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablaSucursalStock.setFocusable(false);
        tablaSucursalStock.setGridColor(Color.decode(Colors.FONDO.getColor())
        );
        tablaSucursalStock.setRowHeight(25);
        tablaSucursalStock.setRowSelectionAllowed(false);
        tablaSucursalStock.getTableHeader().setReorderingAllowed(false);
        tablaSucursalStock.getTableHeader().setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        tablaSucursalStock.getTableHeader().setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        tablaSucursalStock.getTableHeader().setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode(Colors.BORDE.getColor())));
        jScrollPane2.setViewportView(tablaSucursalStock);

        btnModProducto.setBackground(Color.decode(Colors.FONDO_BOTON.getColor())
        );
        btnModProducto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnModProducto.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor())
        );
        btnModProducto.setText(Texts.MOD_PRODUCTO.getTexto());
        btnModProducto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())
        ));
        btnModProducto.setFocusable(false);
        btnModProducto.setMaximumSize(new java.awt.Dimension(89, 30));
        btnModProducto.setMinimumSize(new java.awt.Dimension(89, 30));
        btnModProducto.setPreferredSize(new java.awt.Dimension(140, 30));
        btnModProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModProductoActionPerformed(evt);
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
        btnSelectVolver.setMaximumSize(new java.awt.Dimension(140, 30));
        btnSelectVolver.setMinimumSize(new java.awt.Dimension(140, 30));
        btnSelectVolver.setPreferredSize(new java.awt.Dimension(140, 30));
        btnSelectVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnModProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSelectVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(LdescripcionSelect, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(LstockTotalSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(LPrecioSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(LbarCodeSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LselectBarCode, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LselectPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LselectStock, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(tituloNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSelectVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tituloNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
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
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(btnModProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout SelectProductoLayout = new javax.swing.GroupLayout(SelectProducto.getContentPane());
        SelectProducto.getContentPane().setLayout(SelectProductoLayout);
        SelectProductoLayout.setHorizontalGroup(
            SelectProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        SelectProductoLayout.setVerticalGroup(
            SelectProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ModProducto.setTitle(Texts.TITULO.getTexto());
        ModProducto.setMinimumSize(new java.awt.Dimension(365, 394));
        ModProducto.setModal(true);
        ModProducto.setResizable(false);

        jPanel6.setBackground(Color.decode(Colors.FONDO.getColor()));
        jPanel6.setPreferredSize(new java.awt.Dimension(350, 350));

        tituloModificar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tituloModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificar.setText(Texts.MODIFICAR_PRODUCTO.getTexto());
        tituloModificar.setForeground(Color.decode(Colors.TITULO.getColor()));

        LnombreMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LnombreMod.setText(Texts.NOMBRE.getTexto());
        LnombreMod.setMaximumSize(new java.awt.Dimension(60, 26));
        LnombreMod.setMinimumSize(new java.awt.Dimension(60, 26));
        LnombreMod.setPreferredSize(new java.awt.Dimension(70, 26));
        LnombreMod.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textNombreMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textNombreMod.setText("(Nombre Producto)");
        textNombreMod.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())), javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor()))));
        textNombreMod.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textNombreMod.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LbarCodeMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LbarCodeMod.setText(Texts.BARCODE.getTexto());
        LbarCodeMod.setMinimumSize(new java.awt.Dimension(60, 20));
        LbarCodeMod.setPreferredSize(new java.awt.Dimension(70, 26));
        LbarCodeMod.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textBarCodeMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textBarCodeMod.setText("(BarCode Producto)");
        textBarCodeMod.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())), javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor()))));
        textBarCodeMod.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textBarCodeMod.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LprecioMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LprecioMod.setText(Texts.PRECIO.getTexto());
        LprecioMod.setMinimumSize(new java.awt.Dimension(60, 20));
        LprecioMod.setPreferredSize(new java.awt.Dimension(70, 26));
        LprecioMod.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textPrecioMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textPrecioMod.setText("(Precio Producto)");
        textPrecioMod.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())), javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor()))));
        textPrecioMod.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textPrecioMod.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LdescripcionMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LdescripcionMod.setText(Texts.DESCRIPCION.getTexto());
        LdescripcionMod.setMaximumSize(new java.awt.Dimension(70, 20));
        LdescripcionMod.setMinimumSize(new java.awt.Dimension(70, 20));
        LdescripcionMod.setPreferredSize(new java.awt.Dimension(70, 26));
        LdescripcionMod.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textErrorMod.setText("* Posible Error");
        textErrorMod.setForeground(Color.decode(Colors.TEXT_ERROR.getColor()));

        btnAceptarMod.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAceptarMod.setText(Texts.ACEPTAR.getTexto());
        btnAceptarMod.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnAceptarMod.setFocusable(false);
        btnAceptarMod.setMaximumSize(new java.awt.Dimension(110, 30));
        btnAceptarMod.setMinimumSize(new java.awt.Dimension(110, 30));
        btnAceptarMod.setPreferredSize(new java.awt.Dimension(110, 30));
        btnAceptarMod.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnAceptarMod.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnAceptarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarModActionPerformed(evt);
            }
        });

        btnCancelarMod.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCancelarMod.setText(Texts.CANCELAR.getTexto());
        btnCancelarMod.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnCancelarMod.setFocusable(false);
        btnCancelarMod.setMaximumSize(new java.awt.Dimension(110, 30));
        btnCancelarMod.setMinimumSize(new java.awt.Dimension(110, 30));
        btnCancelarMod.setPreferredSize(new java.awt.Dimension(110, 30));
        btnCancelarMod.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnCancelarMod.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnCancelarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarModActionPerformed(evt);
            }
        });

        jScrollPane4.getViewport().setBackground(Color.decode(Colors.FONDO.getColor()));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        jScrollPane4.setBackground(Color.decode(Colors.FONDO.getColor()));
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setPreferredSize(new java.awt.Dimension(212, 64));

        textDescripcionMod.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor())
        );
        textDescripcionMod.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 1, Color.decode(Colors.TEXTO_FONDO.getColor())
        )));
        textDescripcionMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textDescripcionMod.setForeground(Color.decode(Colors.TEXTO.getColor())
        );
        textDescripcionMod.setText("(Descripcion Producto)");
        jScrollPane4.setViewportView(textDescripcionMod);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textErrorMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(LbarCodeMod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(LprecioMod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(LdescripcionMod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(textBarCodeMod)
                                                    .addComponent(textPrecioMod)
                                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(LnombreMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(textNombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(24, 24, 24)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnAceptarMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelarMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloModificar)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LnombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNombreMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbarCodeMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBarCodeMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textPrecioMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LprecioMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LdescripcionMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textErrorMod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout ModProductoLayout = new javax.swing.GroupLayout(ModProducto.getContentPane());
        ModProducto.getContentPane().setLayout(ModProductoLayout);
        ModProductoLayout.setHorizontalGroup(
            ModProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ModProductoLayout.setVerticalGroup(
            ModProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

//Botones Menu Productos
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        PanelMenuPrincipal pmp = new PanelMenuPrincipal(fp);
        fp.cargarPanel(pmp);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            this.mostrarProductos(FunProducto.listarProductos(this.textPrecioMin.getText(), this.textPrecioMax.getText(), this.textBuscar.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenuProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

//Tabla Menu Productos 
    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        try {
            Map<String,Producto> productos = FunProducto.listarProductos(this.textPrecioMin.getText(), this.textPrecioMax.getText(), this.textBuscar.getText());
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
            this.LselectStock.setText(""+producto.getStockTotal());
            this.LselectDescripcion.setText(producto.getDescripcion());
            
            this.mostrarSucursalStock(FunSucursalProducto.listarSucursalProducto(id_producto));

            this.SelectProducto.setLocationRelativeTo(fp);
            this.SelectProducto.setVisible(true);
        } catch(SQLException ex){
            Logger.getLogger(PanelMenuProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tablaProductosMouseClicked

//Botones Seleccionar Producto
    private void btnSelectVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectVolverActionPerformed
        this.SelectProducto.setVisible(false);
    }//GEN-LAST:event_btnSelectVolverActionPerformed

    private void btnModProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModProductoActionPerformed
        try {
            Producto producto = FunProducto.selecProducto(id_producto);
            
            //iniciar Datos
            this.textNombreMod.setText(producto.getNombre());
            this.textBarCodeMod.setText(producto.getBarCode());
            this.textPrecioMod.setText(""+producto.getPrecio());
            this.textDescripcionMod.setText(producto.getDescripcion());
            this.textErrorMod.setText("");
            
            this.ModProducto.setLocationRelativeTo(SelectProducto);
            this.ModProducto.setVisible(true);
        } catch(SQLException ex){
            Logger.getLogger(PanelMenuProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModProductoActionPerformed

//Botones Modificar Producto
    private void btnCancelarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarModActionPerformed
        this.ModProducto.setVisible(false);
    }//GEN-LAST:event_btnCancelarModActionPerformed

    private void btnAceptarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarModActionPerformed
        try {
            String ok = FunProducto.modificarProducto(id_producto, this.textNombreMod.getText(), this.textBarCodeMod.getText(), this.textPrecioMod.getText(), this.textDescripcionMod.getText());
            if(ok != null){
                this.textErrorMod.setText(ok);
                return;
            }
            
            Producto producto = FunProducto.selecProducto(id_producto);
            
            //actualiza los datos del seleccionado
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
            this.LselectStock.setText(""+producto.getStockTotal());
            this.LselectDescripcion.setText(producto.getDescripcion());
            
            this.mostrarSucursalStock(FunSucursalProducto.listarSucursalProducto(id_producto));
            
            this.mostrarProductos(FunProducto.listarProductos());
            
            this.ModProducto.setVisible(false);
        } catch(SQLException ex){
            this.textErrorMod.setText("* Error: Conexion SQL");
        }
    }//GEN-LAST:event_btnAceptarModActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LPrecioSelect;
    private javax.swing.JLabel LbarCodeMod;
    private javax.swing.JLabel LbarCodeSelect;
    private javax.swing.JLabel LdescripcionMod;
    private javax.swing.JLabel LdescripcionSelect;
    private javax.swing.JLabel Lmax;
    private javax.swing.JLabel Lmin;
    private javax.swing.JLabel LnombreMod;
    private javax.swing.JLabel Lprecio;
    private javax.swing.JLabel LprecioMod;
    private javax.swing.JLabel LselectBarCode;
    private javax.swing.JTextPane LselectDescripcion;
    private javax.swing.JLabel LselectPrecio;
    private javax.swing.JLabel LselectStock;
    private javax.swing.JLabel LstockTotalSelect;
    private javax.swing.JDialog ModProducto;
    private javax.swing.JDialog SelectProducto;
    private javax.swing.JButton btnAceptarMod;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarMod;
    private javax.swing.JButton btnModProducto;
    private javax.swing.JButton btnSelectVolver;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTable tablaSucursalStock;
    private javax.swing.JTextField textBarCodeMod;
    private javax.swing.JTextField textBuscar;
    private javax.swing.JTextPane textDescripcionMod;
    private javax.swing.JLabel textErrorMod;
    private javax.swing.JTextField textNombreMod;
    private javax.swing.JTextField textPrecioMax;
    private javax.swing.JTextField textPrecioMin;
    private javax.swing.JTextField textPrecioMod;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloModificar;
    private javax.swing.JLabel tituloNombre;
    // End of variables declaration//GEN-END:variables
}
