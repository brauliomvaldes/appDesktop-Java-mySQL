/**
 * fecha de creacion: junio de 2018
 * nombre: FParametros
 * Su función mantenedor parametros
 * entrada parametros 
 * salida null
 * @author: braulio valdes 
 */
package vista;

import controlador.ControladorParametros;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import modelo.Parametros;
import static vista.MenuPrincipalBiblioteca.esNumero;

/**
 *
 * @author BRAULIOMARIANO
 */
public class FParametros extends javax.swing.JFrame {

    /**
     * Creates new form FCategoria
     */
    
    
    
    public FParametros() {
        initComponents();
        //this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        poblarParametros();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAgrega = new javax.swing.JButton();
        txtImpuestoIva = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        txtMultaAtrasoDiario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescuentoEspecial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMontoMinimoDescuento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("< PARAMETROS GENERALES >");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 22, -1, -1));

        jLabel2.setText("IMPUESTO IVA                                            %");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 71, 230, -1));

        btnAgrega.setText("Grabar");
        btnAgrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 237, 204, 35));

        txtImpuestoIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImpuestoIvaActionPerformed(evt);
            }
        });
        getContentPane().add(txtImpuestoIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 65, 67, 27));

        btnCancelar.setText("Cerrar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 237, 67, 35));

        txtMultaAtrasoDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMultaAtrasoDiarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtMultaAtrasoDiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 103, 67, 27));

        jLabel3.setText("MULTA DIARIA POR ATRASO                  %");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 109, 230, -1));

        txtDescuentoEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuentoEspecialActionPerformed(evt);
            }
        });
        getContentPane().add(txtDescuentoEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 141, 67, 27));

        jLabel4.setText("DESCUENTO ESPECIAL VENTAS         %");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 147, 230, -1));

        txtMontoMinimoDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoMinimoDescuentoActionPerformed(evt);
            }
        });
        getContentPane().add(txtMontoMinimoDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 179, 67, 28));

        jLabel5.setText("VENTA MINIMA APLICA DESCUENTO   $");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 186, 230, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 0, 0));
        jLabel27.setText("*");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 20, 10));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 0, 0));
        jLabel28.setText("*");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 20, 10));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 0, 0));
        jLabel29.setText("*");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 20, 10));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 0, 0));
        jLabel30.setText("*");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 20, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregaActionPerformed
        // TODO add your handling code here:
        // aqui agrega autores
        if (txtImpuestoIva.getText().isEmpty() || txtMultaAtrasoDiario.getText().isEmpty() ||
                 txtDescuentoEspecial.getText().isEmpty() || txtMontoMinimoDescuento.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Atención!, No puede dejar parámetros sin datos", "",1);
        }else{
            if(!esNumero(txtImpuestoIva.getText()) || !esNumero(txtMultaAtrasoDiario.getText()) ||
                 !esNumero(txtDescuentoEspecial.getText()) || !esNumero(txtMontoMinimoDescuento.getText())){
                    JOptionPane.showMessageDialog(null, "Atención!, los parámetros deben ser numéricos y positivos", "",1);
            }else{    
                int i = Integer.parseInt(txtImpuestoIva.getText());
                int m = Integer.parseInt(txtMultaAtrasoDiario.getText());
                int d1 = Integer.parseInt(txtDescuentoEspecial.getText());
                int d2 = Integer.parseInt(txtMontoMinimoDescuento.getText());
                ControladorParametros c = new ControladorParametros();
                Parametros parametros = new Parametros(1,i,m,d1,d2);
                if(c.modificar(parametros)){
                    JOptionPane.showMessageDialog(null, "Parametros registrados exitosamente", "",1);
                    poblarParametros();
                }else{
                    JOptionPane.showMessageDialog(null, "Parametros no registrados", "",1);
                }
            }
        }
    }//GEN-LAST:event_btnAgregaActionPerformed

    private void poblarParametros(){
        ControladorParametros c = new ControladorParametros();
        Parametros p = c.leer(1);
        if(p==null){
            c.agregar();
        }else{
            txtImpuestoIva.setText(String.valueOf(p.getImpuesto_iva()));
            txtMultaAtrasoDiario.setText(String.valueOf(p.getMulta_atraso_diario()));
            txtDescuentoEspecial.setText(String.valueOf(p.getDescuento_especial()));
            txtMontoMinimoDescuento.setText(String.valueOf(p.getMonto_minimo_descuento()));
        }
    }
    
    private void txtImpuestoIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImpuestoIvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImpuestoIvaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtMultaAtrasoDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMultaAtrasoDiarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMultaAtrasoDiarioActionPerformed

    private void txtDescuentoEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuentoEspecialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescuentoEspecialActionPerformed

    private void txtMontoMinimoDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoMinimoDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoMinimoDescuentoActionPerformed

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
            java.util.logging.Logger.getLogger(FParametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FParametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FParametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FParametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FParametros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgrega;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtDescuentoEspecial;
    private javax.swing.JTextField txtImpuestoIva;
    private javax.swing.JTextField txtMontoMinimoDescuento;
    private javax.swing.JTextField txtMultaAtrasoDiario;
    // End of variables declaration//GEN-END:variables
}
