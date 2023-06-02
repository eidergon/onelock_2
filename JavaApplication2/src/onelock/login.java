package onelock;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class login extends javax.swing.JFrame {

    public static String[][] listaUsuarios; // Variable estática para almacenar la lista de usuarios
    String url = "https://poliedro.comcel.com.co/LoginPoliedro/Login.aspx"; //Asignamos la direccion del poliedro en la variable url 

    public login() {
        initComponents();
        this.setLocationRelativeTo(null); //Coloca el jframe login en una ubicacion centrada 

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        use = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        usuario = new javax.swing.JLabel();
        separador_user = new javax.swing.JSeparator();
        contraseña = new javax.swing.JLabel();
        separador_pass = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        exitbtn = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N

        use.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        use.setForeground(new java.awt.Color(204, 204, 204));
        use.setText("Ingrese el usuario");
        use.setBorder(null);
        use.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                useMousePressed(evt);
            }
        });
        use.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useActionPerformed(evt);
            }
        });

        login.setBackground(new java.awt.Color(102, 102, 255));
        login.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Ingresar");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        pass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pass.setForeground(new java.awt.Color(204, 204, 204));
        pass.setText("********");
        pass.setBorder(null);
        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passMousePressed(evt);
            }
        });
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
        });

        usuario.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        usuario.setText("Usuario");

        contraseña.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        contraseña.setText("Contraseña");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo2.png"))); // NOI18N

        exitbtn.setBackground(new java.awt.Color(255, 255, 255));

        exit.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.setPreferredSize(new java.awt.Dimension(40, 40));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitbtnLayout = new javax.swing.GroupLayout(exitbtn);
        exitbtn.setLayout(exitbtnLayout);
        exitbtnLayout.setHorizontalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitbtnLayout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        exitbtnLayout.setVerticalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(use, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(separador_user)
                            .addComponent(separador_pass)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contraseña)
                                    .addComponent(usuario))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(login)
                        .addContainerGap(78, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(use, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separador_user, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contraseña)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separador_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(login)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        //evento boton login
        boolean mensajeExito = false;
        listaUsuarios = conexion.getListaUsuarios();
        String usuarioFormulario = use.getText(); //Esta variable guarda el texto que este en el campo de texto usuario del jframe
        String contraseniaFormulario = pass.getText(); //Esta variable guarda el texto que este en el campo de texto contraseña del jframe

        for (int i = 0; i < listaUsuarios.length; i++) {
            if (usuarioFormulario.equals(listaUsuarios[i][0]) && contraseniaFormulario.equals(listaUsuarios[i][1])) {
                mensajeExito = true; //Si el usuario y la contraseña son correctas la variable mensaje se vuleve verdadera   
            }
        }
        /*
          try {
            while (listaUsuarios.next()) {
                String usuarioActual = listaUsuarios.getString("usuario");
                String contraseniaActual = listaUsuarios.getString("contrasena");
                if (usuarioFormulario.equals(usuarioActual) && contraseniaFormulario.equals(contraseniaActual)) {
                    mensajeExito = true; //Si el usuario y la contraseña son correctas la variable mensaje se vuleve verdadera   
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se encontraron usuarios en la base de datos"); //Avisa que se esta ingresando al poliedro 
        }
        
        
         */

        if (mensajeExito) { //Si la variable mensaje es verdadera se empiaza a ejecuar la funcion para ingresar al poliedro
            if (java.awt.Desktop.isDesktopSupported()) {
                java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
                if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                    try {
                        JOptionPane.showMessageDialog(null, "Ingresando al poliedro"); //Avisa que se esta ingresando al poliedro 
                        java.net.URI uri = new java.net.URI(url); //Llamamos la variable url que contiene la uicacion del poliedro
                        desktop.browse(uri); //Abrira una ventana en el navegador con la direccion del poliedro
                    } catch (IOException | URISyntaxException e) {
                        JOptionPane.showMessageDialog(null, e); //Si ocurre un error lo muestra 
                    }
                }
            }
            this.dispose(); //Cierra el jframe login
        } else { //Si la variable mensaje sigue siendo falsa se mandarra el siguiente mensaje  
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto"); //Mestra el mensaje 
            use.setText(""); //El campo de texto usuario se limpia 
            pass.setText(""); //El campo de texto contraseña se limpia 

        }
    }//GEN-LAST:event_loginActionPerformed

    private void useMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_useMousePressed
        if (use.getText().equals("Ingrese el usuario")) {
            use.setText("");
            use.setForeground(Color.black);
        }
        if (String.valueOf(pass.getPassword()).isEmpty()) {
            pass.setText("********");
            pass.setForeground(Color.gray);
        }

    }//GEN-LAST:event_useMousePressed

    private void useActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0); //Al dar click se cierra el jframe login
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exitbtn.setBackground(Color.red); //Al pasar el cursor el fonfo cambia a color a rojo
        exit.setForeground(Color.white); //Al pasar el cursor la X cambia a color blanco
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exitbtn.setBackground(Color.white); //Al alejar el cursor el fondo vuelve a su color originar
        exit.setForeground(Color.black); //Al pasar el cursor la X vuelve su color original 
    }//GEN-LAST:event_exitMouseExited

    private void passMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMousePressed
        if (String.valueOf(pass.getPassword()).equals("********")) {
            pass.setText("");
            pass.setForeground(Color.black);
        }
        if (use.getText().isEmpty()) {
            use.setText("Ingrese el usuario");
            use.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passMousePressed

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        login.setBackground(new Color(253, 82, 0)); //Al pasar el cursor sobre el boton cambia a color naranja
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
        login.setBackground(new Color(102, 102, 255)); //Al alejar el cursor del boton cambia a su color original
    }//GEN-LAST:event_loginMouseExited

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

        }
    }//GEN-LAST:event_passKeyPressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField pass;
    private javax.swing.JSeparator separador_pass;
    private javax.swing.JSeparator separador_user;
    private javax.swing.JTextField use;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
