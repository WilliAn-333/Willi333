package ec.edu.espoch.willi333.vista;

import ec.edu.espoch.willi333.controlador.Controlador;




public class Principal extends javax.swing.JFrame {
    private Controlador controlador;
    private Listar listar;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.listar = new Listar();
        this.controlador = new Controlador(this, listar);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Groupo1 = new javax.swing.ButtonGroup();
        textApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbdEstadoTarea = new javax.swing.JLabel();
        rbtPendiente = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textEdad = new javax.swing.JTextArea();
        rbtCompleta1 = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lbdTitulo = new javax.swing.JLabel();
        lbdError = new javax.swing.JLabel();
        lbdNombre = new javax.swing.JLabel();
        jmenuSalir = new javax.swing.JButton();
        textNombre = new javax.swing.JTextField();
        lbdApellido = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmenuTarea = new javax.swing.JMenu();
        menuItemListar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        textApellido.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        textApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textApellidoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Edad");

        lbdEstadoTarea.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbdEstadoTarea.setText("Estado ");

        Groupo1.add(rbtPendiente);
        rbtPendiente.setFont(new java.awt.Font("Algerian", 3, 12)); // NOI18N
        rbtPendiente.setText("No Disponible");
        rbtPendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtPendienteActionPerformed(evt);
            }
        });

        textEdad.setColumns(20);
        textEdad.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        textEdad.setRows(5);
        jScrollPane1.setViewportView(textEdad);

        Groupo1.add(rbtCompleta1);
        rbtCompleta1.setFont(new java.awt.Font("Algerian", 3, 12)); // NOI18N
        rbtCompleta1.setText("Disponible");

        btnGuardar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lbdTitulo.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        lbdTitulo.setText("Gestión de Personas");

        lbdError.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbdError.setText("----------------------");

        lbdNombre.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lbdNombre.setText("Persona");

        jmenuSalir.setFont(new java.awt.Font("Wide Latin", 3, 12)); // NOI18N
        jmenuSalir.setText("Salir");
        jmenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuSalirActionPerformed(evt);
            }
        });

        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });

        lbdApellido.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lbdApellido.setText("Apellido");

        jMenuBar1.setBackground(new java.awt.Color(51, 102, 255));

        jmenuTarea.setText("Personas");
        jmenuTarea.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        menuItemListar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        menuItemListar.setText("Lista de Personas");
        menuItemListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarActionPerformed(evt);
            }
        });
        jmenuTarea.add(menuItemListar);

        jMenuBar1.add(jmenuTarea);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbdTitulo)
                .addGap(243, 243, 243))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbdNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbdApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar)
                    .addComponent(lbdEstadoTarea, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbdError)
                                .addGap(27, 27, 27)
                                .addComponent(jmenuSalir))
                            .addComponent(rbtPendiente)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(rbtCompleta1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbdTitulo)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbdNombre)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbdApellido))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jmenuSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(lbdError))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbdEstadoTarea)
                                    .addComponent(rbtCompleta1)
                                    .addComponent(rbtPendiente))
                                .addGap(4, 4, 4)
                                .addComponent(btnGuardar)))
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textApellidoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textApellidoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        this.controlador.agregarPersona();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void menuItemListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarActionPerformed
        // TODO add your handling code here:
        listar.setVisible(true);
        controlador.listarTarea();    
    }//GEN-LAST:event_menuItemListarActionPerformed

    private void jmenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuSalirActionPerformed
        // TODO add your handling code here:
        System.exit(WIDTH);
    }//GEN-LAST:event_jmenuSalirActionPerformed

    private void rbtPendienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtPendienteActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rbtPendienteActionPerformed

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed


    public String getNombre() {
        return textNombre.getText();
    }

    public String getApellido() {
        return textApellido.getText();
    }

    public String getEdad() {
        return textEdad.getText(); // Cambiado para obtener el texto de un JTextField
    }

    public void error(String text) {
        lbdError.setText(text);
    }

    public void limpiar() {
        textNombre.setText("");
        textApellido.setText("");
        textEdad.setText(""); // Asegúrate de limpiar el campo de edad
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Groupo1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jmenuSalir;
    private javax.swing.JMenu jmenuTarea;
    private javax.swing.JLabel lbdApellido;
    private javax.swing.JLabel lbdError;
    private javax.swing.JLabel lbdEstadoTarea;
    private javax.swing.JLabel lbdNombre;
    private javax.swing.JLabel lbdTitulo;
    private javax.swing.JMenuItem menuItemListar;
    private javax.swing.JRadioButton rbtCompleta1;
    private javax.swing.JRadioButton rbtPendiente;
    private javax.swing.JTextField textApellido;
    private javax.swing.JTextArea textEdad;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables

}
