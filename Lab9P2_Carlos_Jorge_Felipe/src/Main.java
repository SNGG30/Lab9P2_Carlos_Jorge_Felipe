/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registro = new javax.swing.JFrame();
        txt_Registro = new javax.swing.JLabel();
        btn_Register = new javax.swing.JButton();
        btn_Back = new javax.swing.JButton();
        txt_Usuario = new javax.swing.JLabel();
        txt_Contraseña = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JLabel();
        txt_Correo = new javax.swing.JLabel();
        txt_Edad = new javax.swing.JLabel();
        sp_edad = new javax.swing.JSpinner();
        tf_Nombre = new javax.swing.JTextField();
        tf_Correo = new javax.swing.JTextField();
        tf_Usuario = new javax.swing.JTextField();
        tf_Contraseña = new javax.swing.JTextField();
        BG_Login = new javax.swing.JPanel();
        txt_login = new javax.swing.JLabel();
        txt_user = new javax.swing.JLabel();
        tf_User = new javax.swing.JTextField();
        txt_pass = new javax.swing.JLabel();
        pf_pass = new javax.swing.JPasswordField();
        btn_sign = new javax.swing.JToggleButton();
        btn_reg = new javax.swing.JToggleButton();

        Registro.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Registro.setPreferredSize(new java.awt.Dimension(655, 539));
        Registro.setResizable(false);

        txt_Registro.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txt_Registro.setText("REGISTRO");

        btn_Register.setText("Registrar");
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });

        btn_Back.setText("Regresar");
        btn_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BackMouseClicked(evt);
            }
        });
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });

        txt_Usuario.setText("Usuario");

        txt_Contraseña.setText("Contraseña");

        txt_Nombre.setText("Nombre");

        txt_Correo.setText("Correo");

        txt_Edad.setText("Edad");

        tf_Contraseña.setText("jTextField2");

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro.getContentPane());
        Registro.getContentPane().setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Usuario)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addComponent(btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(txt_Registro))
                    .addComponent(txt_Nombre)
                    .addComponent(txt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_Contraseña)
                    .addComponent(txt_Correo)
                    .addComponent(tf_Correo)
                    .addComponent(tf_Contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                .addGap(71, 71, 71))
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_Registro)
                    .addComponent(btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Usuario)
                    .addComponent(txt_Contraseña))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nombre)
                    .addComponent(txt_Correo))
                .addGap(18, 18, 18)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(txt_Edad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btn_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        txt_login.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txt_login.setText("LOGIN");

        txt_user.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_user.setText("Usuario");

        txt_pass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_pass.setText("Contraseña");

        btn_sign.setText("Ingresar");
        btn_sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signActionPerformed(evt);
            }
        });

        btn_reg.setText("Registro");
        btn_reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regMouseClicked(evt);
            }
        });
        btn_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BG_LoginLayout = new javax.swing.GroupLayout(BG_Login);
        BG_Login.setLayout(BG_LoginLayout);
        BG_LoginLayout.setHorizontalGroup(
            BG_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BG_LoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_login)
                .addGap(265, 265, 265))
            .addGroup(BG_LoginLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(BG_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_pass)
                    .addComponent(txt_user)
                    .addComponent(tf_User)
                    .addComponent(pf_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BG_LoginLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btn_sign, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(btn_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        BG_LoginLayout.setVerticalGroup(
            BG_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_LoginLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txt_login)
                .addGap(111, 111, 111)
                .addComponent(txt_user)
                .addGap(27, 27, 27)
                .addComponent(tf_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(txt_pass)
                .addGap(28, 28, 28)
                .addComponent(pf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(BG_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sign, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_signActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_signActionPerformed

    private void btn_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_regActionPerformed

    private void btn_regMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regMouseClicked
        // TODO add your handling code here:
        
        Registro.pack();
        Registro.setLocationRelativeTo(this);
        Registro.setAlwaysOnTop(true);
        Registro.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_btn_regMouseClicked

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_RegisterActionPerformed

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_BackActionPerformed

    private void btn_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BackMouseClicked
        // TODO add your handling code here:
       
        
        this.pack();
        this.setLocationRelativeTo(Registro);
        this.setAlwaysOnTop(true);
        this.setVisible(true);
        
        Registro.setVisible(false);
    }//GEN-LAST:event_btn_BackMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG_Login;
    private javax.swing.JFrame Registro;
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_Register;
    private javax.swing.JToggleButton btn_reg;
    private javax.swing.JToggleButton btn_sign;
    private javax.swing.JPasswordField pf_pass;
    private javax.swing.JSpinner sp_edad;
    private javax.swing.JTextField tf_Contraseña;
    private javax.swing.JTextField tf_Correo;
    private javax.swing.JTextField tf_Nombre;
    private javax.swing.JTextField tf_User;
    private javax.swing.JTextField tf_Usuario;
    private javax.swing.JLabel txt_Contraseña;
    private javax.swing.JLabel txt_Correo;
    private javax.swing.JLabel txt_Edad;
    private javax.swing.JLabel txt_Nombre;
    private javax.swing.JLabel txt_Registro;
    private javax.swing.JLabel txt_Usuario;
    private javax.swing.JLabel txt_login;
    private javax.swing.JLabel txt_pass;
    private javax.swing.JLabel txt_user;
    // End of variables declaration//GEN-END:variables
}
