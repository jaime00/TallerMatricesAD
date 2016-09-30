/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jaime
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();

        txtNumeroColumnas.selectAll();
        txtNumeroFilas.selectAll();

        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdAutomatico, cmdManual, cmdOperacion};

        Helper.habilitarBotones(botonesD);
        Helper.deshabilitarBotones(botonesD);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroColumnas = new javax.swing.JTextField();
        txtNumeroFilas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdManual = new javax.swing.JButton();
        cmdAutomatico = new javax.swing.JButton();
        cmdOperacion = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmbOperaciones = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaFinal = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();
        txtMensaje = new javax.swing.JLabel();
        txtMensaje1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Taller Matrices AD (No. 1)"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("OPERACIONES CON MATRICES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Iniciales:"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("No. de Filas:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel3.setText("No. de Columnas:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtNumeroColumnas.setText("13");
        txtNumeroColumnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroColumnasActionPerformed(evt);
            }
        });
        jPanel2.add(txtNumeroColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 70, -1));

        txtNumeroFilas.setText("13");
        jPanel2.add(txtNumeroFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 70, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 250, 150));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Acciones:"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, -1));

        cmdManual.setText("Manual");
        cmdManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdManualActionPerformed(evt);
            }
        });
        jPanel3.add(cmdManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, -1));

        cmdAutomatico.setText("Automatico");
        cmdAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAutomaticoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        cmdOperacion.setText("Operacion");
        cmdOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionActionPerformed(evt);
            }
        });
        jPanel3.add(cmdOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 90, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 100, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 340, 150));

        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Diagonal Segundaria", "Triangular Superior", "Triangular Inferior", "Matriz Traspuesta a La Ingresada", "Letra A", "Letra Z", "Letra T", "Letra V", "Letra E", "Letra F", "Letra P", "Letra I", "Letra N", "Letra Y", "Letra X" }));
        cmbOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOperacionesActionPerformed(evt);
            }
        });
        jPanel1.add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        tblTablaFinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTablaFinal);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 360, 240));

        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblTablaInicial);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 360, 240));

        txtMensaje.setForeground(new java.awt.Color(0, 204, 0));
        txtMensaje.setText("Nota: deje 13 en las casillas para que la matriz sea mejor formada, sino editelo");
        jPanel1.add(txtMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, -1, 20));

        txtMensaje1.setForeground(new java.awt.Color(0, 204, 0));
        txtMensaje1.setText("El numero de filas y columnas deben de ser iguales");
        jPanel1.add(txtMensaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(802, 593));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
    try {
            int cont = 0;
            if (txtNumeroFilas.getText().trim().isEmpty()) {
                Helper.mensaje(this, "Digite por favor el numero de filas", 1);
                txtNumeroFilas.requestFocusInWindow();
            } else if (Integer.parseInt(txtNumeroFilas.getText()) < 5 || Integer.parseInt(txtNumeroFilas.getText()) > 13) {
                Helper.mensaje(this, "el numero de filas debe mayor a 4 y menor a 14 ", 3);
                txtNumeroFilas.requestFocusInWindow();
                txtNumeroFilas.selectAll();
            } else if (txtNumeroColumnas.getText().trim().isEmpty()) {
                Helper.mensaje(this, "Digite por favor el numero de columnas", 1);
                txtNumeroColumnas.requestFocusInWindow();
            } else if (Integer.parseInt(txtNumeroColumnas.getText()) < 5 || Integer.parseInt(txtNumeroColumnas.getText()) > 13) {
                Helper.mensaje(this, "el numero de columnas debe mayor a 4 y menor a 14 ", 3);
                txtNumeroColumnas.requestFocusInWindow();
                txtNumeroColumnas.selectAll();
            } else if ((Integer.parseInt(txtNumeroFilas.getText())) != (Integer.parseInt(txtNumeroColumnas.getText()))) {
                Helper.mensaje(this, "El numero de filas y columnas deben de ser iguales", 3);
                txtNumeroFilas.requestFocusInWindow();
                txtNumeroFilas.selectAll();
            } else if (Integer.parseInt(txtNumeroFilas.getText()) % 2 == 0) {
                cont++;
                if (cont >= 1) {
                    Helper.mensaje(this, "En esta matriz solo se permite longitudes impares", 3);
                    txtNumeroFilas.requestFocusInWindow();
                    txtNumeroFilas.selectAll();
                }
            } else if (Integer.parseInt(txtNumeroColumnas.getText()) % 2 == 0) {
                cont++;
                if (cont >= 1) {
                    Helper.mensaje(this, "En esta matriz solo se permite longitudes impares", 3);
                    txtNumeroColumnas.requestFocusInWindow();
                    txtNumeroColumnas.selectAll();
                }
            } else {
                DefaultTableModel tm = (DefaultTableModel) tblTablaInicial.getModel();
                DefaultTableModel tm2 = (DefaultTableModel) tblTablaFinal.getModel();

                int nf = Integer.parseInt(txtNumeroFilas.getText());
                int nc = Integer.parseInt(txtNumeroColumnas.getText());

                tm.setRowCount(nf);
                tm.setColumnCount(nc);

                tm2.setRowCount(nf);
                tm2.setColumnCount(nc);

                JButton botonesH[] = {cmdAutomatico, cmdManual, cmdLimpiar};
                JButton botonesD[] = {cmdCrear, cmdOperacion};

                Helper.habilitarBotones(botonesH);
                Helper.deshabilitarBotones(botonesD);

                txtNumeroColumnas.setEditable(false);
                txtNumeroFilas.setEditable(false);
                txtMensaje.setText("");
                txtMensaje1.setText("");
            }
        
        } catch (NumberFormatException e) {
            Helper.mensaje(this, "Digite un numero valido", 3);

        }
    
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdManualActionPerformed

        int nf, nc;
        int n;
        int sw, res;

        nc = tblTablaInicial.getColumnCount();
        nf = tblTablaInicial.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                do {
                    sw = 1;
                    try {
                        n = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el elmento en la posición [" + i + "]" + "[" + j + "]", 1).trim());
                        tblTablaInicial.setValueAt(n, i, j);

                    } catch (NumberFormatException e) {
                        Helper.mensaje(this, "Digite un número válido", 3);
                        sw = 0;

                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "¿Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
                        if (res == JOptionPane.YES_NO_OPTION) {
                            sw = 1;
                            i = nf;
                            j = nc;

                            JButton botonesH[] = {cmdAutomatico, cmdManual, cmdLimpiar, cmdOperacion};
                            JButton botonesD[] = {cmdOperacion, cmdCrear,};

                            Helper.habilitarBotones(botonesH);
                            Helper.deshabilitarBotones(botonesD);

                        } else {
                            sw = 0;
                        }
                    }
                } while (sw == 0);
            }
        }
        JButton botonesH[] = {cmdLimpiar, cmdOperacion};
        JButton botonesD[] = {cmdAutomatico, cmdManual, cmdCrear,};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdManualActionPerformed

    private void cmdAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAutomaticoActionPerformed
        int nf, nc, n;

        nc = tblTablaInicial.getColumnCount();
        nf = tblTablaInicial.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int) (Math.random() * 50 + 1);
                tblTablaInicial.setValueAt(n, i, j);
            }
            JButton botonesH[] = {cmdLimpiar, cmdOperacion};
            JButton botonesD[] = {cmdAutomatico, cmdManual, cmdCrear,};

            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);

        }
    }//GEN-LAST:event_cmdAutomaticoActionPerformed

    private void cmdOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionActionPerformed

        int op = cmbOperaciones.getSelectedIndex();
        Helper.limpiadoTabla(tblTablaFinal);

        switch (op) {
            case 0:
                Helper.diagonalSecundaria(tblTablaInicial, tblTablaFinal);
                break;
            case 1:
                Helper.triangularSuperior(tblTablaInicial, tblTablaFinal);
                break;
            case 2:
                Helper.triangularInferior(tblTablaInicial, tblTablaFinal);
                break;
            case 3:
                Helper.matrizTraspuesta(tblTablaInicial, tblTablaFinal);
                break;
            case 4:
                Helper.letraA(tblTablaInicial, tblTablaFinal);
                break;
            case 5:
                Helper.letraZ(tblTablaInicial, tblTablaFinal);
                break;
            case 6:
                Helper.letraT(tblTablaInicial, tblTablaFinal);
                break;
            case 7:
                Helper.letraV(tblTablaInicial, tblTablaFinal);
                break;
            case 8:
                Helper.letraE(tblTablaInicial, tblTablaFinal);
                break;
            case 9:
                Helper.letraF(tblTablaInicial, tblTablaFinal);
                break;
            case 10:
                Helper.letraP(tblTablaInicial, tblTablaFinal);
                break;
            case 11:
                Helper.letraI(tblTablaInicial, tblTablaFinal);
                break;
            case 12:
                Helper.letraN(tblTablaInicial, tblTablaFinal);
                break;
            case 13:
                Helper.letraY(tblTablaInicial, tblTablaFinal);
                break;
            case 14:
                Helper.letraX(tblTablaInicial, tblTablaFinal);
                break;
        }
        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdAutomatico, cmdManual};
    }//GEN-LAST:event_cmdOperacionActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed

        txtNumeroFilas.setText("13");
        txtNumeroColumnas.setText("13");
        txtMensaje.setText("Nota: deje 13 en las casillas para que la matriz sea mejor formada, sino cambielo");
        txtMensaje1.setText("El numero de filas y columnas deben de ser iguales");
        txtNumeroFilas.selectAll();
        txtNumeroColumnas.selectAll();

        txtNumeroFilas.requestFocusInWindow();
        cmbOperaciones.setSelectedIndex(0);

        Helper.porDefectoTabla(tblTablaInicial);
        Helper.porDefectoTabla(tblTablaFinal);

        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdManual, cmdAutomatico, cmdOperacion};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);

        txtNumeroColumnas.setEditable(true);
        txtNumeroFilas.setEditable(true);

    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmbOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOperacionesActionPerformed

    }//GEN-LAST:event_cmbOperacionesActionPerformed

    private void txtNumeroColumnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroColumnasActionPerformed

    }//GEN-LAST:event_txtNumeroColumnasActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperaciones;
    private javax.swing.JButton cmdAutomatico;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdManual;
    private javax.swing.JButton cmdOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblTablaFinal;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JLabel txtMensaje;
    private javax.swing.JLabel txtMensaje1;
    private javax.swing.JTextField txtNumeroColumnas;
    private javax.swing.JTextField txtNumeroFilas;
    // End of variables declaration//GEN-END:variables
}
