/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import login.control.InterfaceValidacion2;
import modelo.Fondo;

/**
 *
 * @author Edwin Vasquez
 */
public class JFinicio extends javax.swing.JFrame {

    private InterfaceValidacion2 intervalidacion;

    public JFinicio(InterfaceValidacion2 intervalidacion) {
        initComponents();
        setVisible(true);
        Fondo fondo = new Fondo();
        this.add(fondo);
        setExtendedState(JFinicio.MAXIMIZED_BOTH);
        ImageIcon ImageIcon = new ImageIcon(getClass().getResource("../imagenes/logo.png"));
        Image Image = ImageIcon.getImage();
        this.setIconImage(Image);
        setTitle("Reconstruccion-Centro historico de memoria");
        this.intervalidacion = intervalidacion;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpContenedor = new javax.swing.JDesktopPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpRegistro = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t_nombre = new javax.swing.JTextField();
        t_correo1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t_correo2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        t_usuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu15 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dpContenedor.setEnabled(false);
        dpContenedor.setFocusCycleRoot(false);
        dpContenedor.setFocusable(false);
        dpContenedor.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Año2017 By Politecnico Gran Colombiano.derechos reservados.");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nombre_juego_2.png"))); // NOI18N
        jLabel2.setFocusable(false);
        jLabel2.setInheritsPopupMenu(false);

        jLabel3.setText("Usuario");

        jLabel4.setText("Correo");

        t_nombre.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                t_nombreCaretUpdate(evt);
            }
        });

        t_correo1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                t_correo1CaretUpdate(evt);
            }
        });

        jLabel5.setText("Confirmacion correo");

        t_correo2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                t_correo2CaretUpdate(evt);
            }
        });

        jButton2.setText("Registrarse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/centro_memoria_historica.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setDefaultCapable(false);
        jButton9.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Registro");

        javax.swing.GroupLayout jpRegistroLayout = new javax.swing.GroupLayout(jpRegistro);
        jpRegistro.setLayout(jpRegistroLayout);
        jpRegistroLayout.setHorizontalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRegistroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(129, 129, 129))
            .addGroup(jpRegistroLayout.createSequentialGroup()
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRegistroLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jpRegistroLayout.createSequentialGroup()
                                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpRegistroLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(73, 73, 73))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRegistroLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(t_nombre)
                                        .addComponent(t_correo1)
                                        .addComponent(t_correo2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))))))
                    .addGroup(jpRegistroLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jButton9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpRegistroLayout.setVerticalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistroLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t_correo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(t_correo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButton2)
                .addGap(40, 40, 40)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registro", jpRegistro);

        t_usuario.setToolTipText("");
        t_usuario.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                t_usuarioCaretUpdate(evt);
            }
        });
        t_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_usuarioActionPerformed(evt);
            }
        });

        jLabel7.setText("Usuario:");

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/centro_memoria_historica.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setDefaultCapable(false);
        jButton8.setFocusable(false);

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("¿Olvidaste tu nombre de usuario? ingresa Aquí");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(t_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inicio de sesión", jPanel1);

        dpContenedor.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(jTabbedPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dpContenedorLayout = new javax.swing.GroupLayout(dpContenedor);
        dpContenedor.setLayout(dpContenedorLayout);
        dpContenedorLayout.setHorizontalGroup(
            dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpContenedorLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dpContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        dpContenedorLayout.setVerticalGroup(
            dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dpContenedorLayout.createSequentialGroup()
                .addGroup(dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dpContenedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dpContenedorLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Registro");

        jMenuBar1.setMaximumSize(new java.awt.Dimension(150, 32769));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(100, 21));

        jMenu15.setText("Galeria");
        jMenuBar1.add(jMenu15);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpContenedor)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpContenedor, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String correo1, correo2;
        correo1 = t_correo1.getText();
        correo2 = t_correo2.getText();

        if (correo1.equals(correo2)) {
            intervalidacion.AccionRegistrar();
        } else {
            JOptionPane.showMessageDialog(null, "Confirmacion de correo incorrecta");

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void t_usuarioCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_t_usuarioCaretUpdate
        intervalidacion.RecibeUsuario(t_usuario.getText());
    }//GEN-LAST:event_t_usuarioCaretUpdate

    private void t_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_usuarioActionPerformed

    }//GEN-LAST:event_t_usuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        intervalidacion.AccionEntrar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t_nombreCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_t_nombreCaretUpdate
        intervalidacion.InsertaUsuario(t_nombre.getText());
    }//GEN-LAST:event_t_nombreCaretUpdate

    private void t_correo1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_t_correo1CaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_t_correo1CaretUpdate

    private void t_correo2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_t_correo2CaretUpdate
        intervalidacion.RecibeCorreo(t_correo2.getText());
    }//GEN-LAST:event_t_correo2CaretUpdate

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new JFinicio().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpContenedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpRegistro;
    private javax.swing.JTextField t_correo1;
    private javax.swing.JTextField t_correo2;
    private javax.swing.JTextField t_nombre;
    private javax.swing.JTextField t_usuario;
    // End of variables declaration//GEN-END:variables
}
