
package gui;

import FuncionesGeneral.FunCliente;
import domain.Cliente;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuClientes extends javax.swing.JFrame {

    public MenuClientes() throws SQLException {
        initComponents();
        
        rsscalelabel.RSScaleLabel.setScaleLabel(imagen, "src/gui/images/chefcito_100.png");
        mostrar(FunCliente.listarClientes());
    }
    
    public void mostrar(List<Cliente> clientes){
        String matriz[][]=new String[clientes.size()][1];
        Cliente cliente;
        
        for(int i=0; i<clientes.size(); i++){
            cliente = clientes.get(i);
            matriz[i][0] = "  "+cliente.getNombre();
        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                ""
            }
        ));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgrCliente = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        tituloAgregar = new javax.swing.JLabel();
        Lnombre = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        Ledad = new javax.swing.JLabel();
        textEdad = new javax.swing.JTextField();
        Ldireccion = new javax.swing.JLabel();
        textDireccion = new javax.swing.JTextField();
        Ltelefono = new javax.swing.JLabel();
        LidTelefono = new javax.swing.JLabel();
        textTelefono = new javax.swing.JTextField();
        Lemail = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        textErrorAgr = new javax.swing.JLabel();
        btnAceptarAgr = new javax.swing.JButton();
        btnCancelarAgr = new javax.swing.JButton();
        SelectCliente = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        tituloNombre = new javax.swing.JLabel();
        LedadSelect = new javax.swing.JLabel();
        LdireccionSelect = new javax.swing.JLabel();
        LtelefonoSelect = new javax.swing.JLabel();
        LidTelefonoSelect = new javax.swing.JLabel();
        LemailSelect = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnElimCliente = new javax.swing.JButton();
        btnModCliente = new javax.swing.JButton();
        btnVolverSelect = new javax.swing.JButton();
        LuserEdad = new javax.swing.JLabel();
        LuserDireccion = new javax.swing.JLabel();
        LuserTelefono = new javax.swing.JLabel();
        LuserEmail = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        btnAgrCliente = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        AgrCliente.setTitle(Texts.TITULO.getTexto());
        AgrCliente.setMinimumSize(new java.awt.Dimension(365, 394));
        AgrCliente.setModal(true);
        AgrCliente.setResizable(false);

        jPanel3.setBackground(Color.decode(Colors.FONDO.getColor()));
        jPanel3.setPreferredSize(new java.awt.Dimension(350, 350));

        tituloAgregar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tituloAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloAgregar.setText(Texts.AGREGAR_CLIENTE.getTexto());
        tituloAgregar.setForeground(Color.decode(Colors.TITULO.getColor()));

        Lnombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lnombre.setText(Texts.NOMBRE.getTexto());
        Lnombre.setMaximumSize(new java.awt.Dimension(60, 26));
        Lnombre.setMinimumSize(new java.awt.Dimension(60, 26));
        Lnombre.setPreferredSize(new java.awt.Dimension(60, 26));
        Lnombre.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        textNombre.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textNombre.setForeground(Color.decode(Colors.TEXTO.getColor()));

        Ledad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ledad.setText(Texts.EDAD.getTexto());
        Ledad.setMinimumSize(new java.awt.Dimension(60, 20));
        Ledad.setPreferredSize(new java.awt.Dimension(60, 26));
        Ledad.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textEdad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textEdad.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        textEdad.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textEdad.setForeground(Color.decode(Colors.TEXTO.getColor()));

        Ldireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ldireccion.setText(Texts.DIRECCION.getTexto());
        Ldireccion.setMinimumSize(new java.awt.Dimension(60, 20));
        Ldireccion.setPreferredSize(new java.awt.Dimension(60, 26));
        Ldireccion.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textDireccion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
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
        textTelefono.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        textTelefono.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textTelefono.setForeground(Color.decode(Colors.TEXTO.getColor()));

        Lemail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lemail.setText(Texts.EMAIL.getTexto());
        Lemail.setMinimumSize(new java.awt.Dimension(60, 20));
        Lemail.setPreferredSize(new java.awt.Dimension(60, 26));
        Lemail.setForeground(Color.decode(Colors.TEXTO.getColor()));

        textEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        textEmail.setBackground(Color.decode(Colors.TEXTO_FONDO.getColor()));
        textEmail.setForeground(Color.decode(Colors.TEXTO.getColor()));

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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textErrorAgr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Lemail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Ledad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Ldireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Ltelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(textEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(LidTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(textTelefono)))
                                                .addGap(24, 24, 24))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Lnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnAceptarAgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelarAgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))))
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ledad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textEdad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ldireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ltelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LidTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textErrorAgr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarAgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarAgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout AgrClienteLayout = new javax.swing.GroupLayout(AgrCliente.getContentPane());
        AgrCliente.getContentPane().setLayout(AgrClienteLayout);
        AgrClienteLayout.setHorizontalGroup(
            AgrClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        AgrClienteLayout.setVerticalGroup(
            AgrClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );

        SelectCliente.setTitle(Texts.TITULO.getTexto());
        SelectCliente.setMinimumSize(new java.awt.Dimension(445, 245));
        SelectCliente.setModal(true);
        SelectCliente.setResizable(false);

        jPanel4.setBackground(Color.decode(Colors.FONDO.getColor()));
        jPanel4.setPreferredSize(new java.awt.Dimension(404, 205));

        tituloNombre.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tituloNombre.setText(Texts.AGREGAR_CLIENTE.getTexto());
        tituloNombre.setForeground(Color.decode(Colors.TITULO.getColor()));

        LedadSelect.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LedadSelect.setText(Texts.EDAD.getTexto());
        LedadSelect.setMinimumSize(new java.awt.Dimension(60, 20));
        LedadSelect.setPreferredSize(new java.awt.Dimension(60, 26));
        LedadSelect.setForeground(Color.decode(Colors.TEXTO.getColor()));

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

        LemailSelect.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LemailSelect.setText(Texts.EMAIL.getTexto());
        LemailSelect.setMinimumSize(new java.awt.Dimension(60, 20));
        LemailSelect.setPreferredSize(new java.awt.Dimension(60, 26));
        LemailSelect.setForeground(Color.decode(Colors.TEXTO.getColor()));

        jPanel5.setBackground(Color.decode(Colors.FONDO.getColor()));

        btnElimCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnElimCliente.setText("Elim. Cliente");
        btnElimCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnElimCliente.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnElimCliente.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnElimCliente.setFocusable(false);
        btnElimCliente.setMaximumSize(new java.awt.Dimension(130, 30));
        btnElimCliente.setMinimumSize(new java.awt.Dimension(130, 30));
        btnElimCliente.setPreferredSize(new java.awt.Dimension(130, 30));
        btnElimCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimClienteActionPerformed(evt);
            }
        });

        btnModCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnModCliente.setText("Mod. Cliente");
        btnModCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnModCliente.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnModCliente.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnModCliente.setFocusable(false);
        btnModCliente.setMaximumSize(new java.awt.Dimension(130, 30));
        btnModCliente.setMinimumSize(new java.awt.Dimension(130, 30));
        btnModCliente.setPreferredSize(new java.awt.Dimension(130, 30));
        btnModCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModClienteActionPerformed(evt);
            }
        });

        btnVolverSelect.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnVolverSelect.setText("Volver");
        btnVolverSelect.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnVolverSelect.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));
        btnVolverSelect.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnVolverSelect.setFocusable(false);
        btnVolverSelect.setMaximumSize(new java.awt.Dimension(130, 30));
        btnVolverSelect.setMinimumSize(new java.awt.Dimension(130, 30));
        btnVolverSelect.setPreferredSize(new java.awt.Dimension(130, 30));
        btnVolverSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnElimCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolverSelect, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnElimCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVolverSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LuserEdad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LuserEdad.setText("(Edad Usuario)");
        LuserEdad.setMaximumSize(new java.awt.Dimension(43, 26));
        LuserEdad.setMinimumSize(new java.awt.Dimension(43, 26));
        LuserEdad.setPreferredSize(new java.awt.Dimension(43, 26));
        LuserEdad.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LuserDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LuserDireccion.setText("(Edad Direccion)");
        LuserDireccion.setToolTipText("");
        LuserDireccion.setPreferredSize(new java.awt.Dimension(37, 26));
        LuserDireccion.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LuserTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LuserTelefono.setText("(User Telefono)");
        LuserTelefono.setMaximumSize(new java.awt.Dimension(43, 26));
        LuserTelefono.setMinimumSize(new java.awt.Dimension(43, 26));
        LuserTelefono.setPreferredSize(new java.awt.Dimension(43, 26));
        LuserTelefono.setForeground(Color.decode(Colors.TEXTO.getColor()));

        LuserEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LuserEmail.setText("(User E-mail)");
        LuserEmail.setMaximumSize(new java.awt.Dimension(43, 26));
        LuserEmail.setMinimumSize(new java.awt.Dimension(43, 26));
        LuserEmail.setPreferredSize(new java.awt.Dimension(43, 26));
        LuserEmail.setForeground(Color.decode(Colors.TEXTO.getColor()));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(LdireccionSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LuserDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(LedadSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LuserEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(LtelefonoSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LidTelefonoSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LuserTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(LemailSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LuserEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tituloNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LedadSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(LuserEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LdireccionSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LuserDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LtelefonoSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LidTelefonoSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LuserTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LemailSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LuserEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout SelectClienteLayout = new javax.swing.GroupLayout(SelectCliente.getContentPane());
        SelectCliente.getContentPane().setLayout(SelectClienteLayout);
        SelectClienteLayout.setHorizontalGroup(
            SelectClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        SelectClienteLayout.setVerticalGroup(
            SelectClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
        titulo.setText(Texts.CLIENTES.getTexto());
        titulo.setForeground(Color.decode(Colors.TITULO.getColor()));

        jScrollPane1.getViewport().setBackground(Color.decode(Colors.FONDO.getColor()));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));

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
        jTable1.setFocusable(false);
        jTable1.setIntercellSpacing(new java.awt.Dimension(5, 0));
        jTable1.setRowHeight(35);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

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

        btnAgrCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAgrCliente.setText(Texts.AGR_CLIENTE.getTexto());
        btnAgrCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
        btnAgrCliente.setBackground(Color.decode(Colors.FONDO_BOTON.getColor()));

        btnAgrCliente.setForeground(Color.decode(Colors.TEXTO_BOTON.getColor()));
        btnAgrCliente.setFocusable(false);
        btnAgrCliente.setMaximumSize(new java.awt.Dimension(120, 30));
        btnAgrCliente.setMinimumSize(new java.awt.Dimension(120, 30));
        btnAgrCliente.setPreferredSize(new java.awt.Dimension(120, 30));
        btnAgrCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrClienteActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnVolver.setText(Texts.VOLVER.getTexto());
        btnVolver.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode(Colors.BORDE.getColor())));
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
                                    .addComponent(btnAgrCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addComponent(btnAgrCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

//Botones Menu Clientes
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuPrincipal mp = new MenuPrincipal();
        this.setVisible(false);
        mp.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgrClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrClienteActionPerformed
        this.AgrCliente.setLocationRelativeTo(null);
        
        this.textNombre.setText("");
        this.textEdad.setText("");
        this.textDireccion.setText("");
        this.textTelefono.setText("");
        this.textEmail.setText("");
        this.textErrorAgr.setText("");
        
        this.AgrCliente.setVisible(true);
    }//GEN-LAST:event_btnAgrClienteActionPerformed

//Botones Agregar Cliente
    private void btnCancelarAgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAgrActionPerformed
        this.AgrCliente.setVisible(false);
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCancelarAgrActionPerformed

    private void btnAceptarAgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarAgrActionPerformed
        String ok = null;
        try {
            ok = FunCliente.agregarCliente(this.textNombre.getText(), this.textEdad.getText(), this.textDireccion.getText(), this.textTelefono.getText(), this.textEmail.getText());
            if(ok != null){
                this.textErrorAgr.setText(ok);
                return;
            }
            
            this.mostrar(FunCliente.listarClientes());
            
            this.AgrCliente.setVisible(false);
            this.setLocationRelativeTo(null);
            
        } catch (SQLException ex) {
            this.textErrorAgr.setText("* Error: Conexion SQL");
        }
    }//GEN-LAST:event_btnAceptarAgrActionPerformed

//Tabla
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            List<Cliente> clientes = FunCliente.listarClientes();
            int pos = jTable1.getSelectedRow();
            
            //inicia los datos del seleccionado
            this.tituloNombre.setText(clientes.get(pos).getNombre());
            this.LuserEdad.setText(""+clientes.get(pos).getEdad());
            this.LuserDireccion.setText(clientes.get(pos).getDireccion());
            this.LuserTelefono.setText(""+clientes.get(pos).getTelefono());
            this.LuserEmail.setText(clientes.get(pos).getEmail());
            
            this.SelectCliente.setLocationRelativeTo(null);
            this.SelectCliente.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

//Botones de cuando seleccionas 1
    private void btnElimClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnElimClienteActionPerformed

    private void btnModClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModClienteActionPerformed

    private void btnVolverSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverSelectActionPerformed
    
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new MenuClientes().setVisible(true);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AgrCliente;
    private javax.swing.JLabel Ldireccion;
    private javax.swing.JLabel LdireccionSelect;
    private javax.swing.JLabel Ledad;
    private javax.swing.JLabel LedadSelect;
    private javax.swing.JLabel Lemail;
    private javax.swing.JLabel LemailSelect;
    private javax.swing.JLabel LidTelefono;
    private javax.swing.JLabel LidTelefonoSelect;
    private javax.swing.JLabel Lnombre;
    private javax.swing.JLabel Ltelefono;
    private javax.swing.JLabel LtelefonoSelect;
    private javax.swing.JLabel LuserDireccion;
    private javax.swing.JLabel LuserEdad;
    private javax.swing.JLabel LuserEmail;
    private javax.swing.JLabel LuserTelefono;
    private javax.swing.JDialog SelectCliente;
    private javax.swing.JButton btnAceptarAgr;
    private javax.swing.JButton btnAgrCliente;
    private javax.swing.JButton btnCancelarAgr;
    private javax.swing.JButton btnElimCliente;
    private javax.swing.JButton btnModCliente;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolverSelect;
    private javax.swing.JLabel imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textEdad;
    private javax.swing.JTextField textEmail;
    private javax.swing.JLabel textErrorAgr;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textTelefono;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloAgregar;
    private javax.swing.JLabel tituloNombre;
    // End of variables declaration//GEN-END:variables
}