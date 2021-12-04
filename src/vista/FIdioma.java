/**
 * fecha de creacion: junio de 2018
 * nombre: FIdioma
 * Su función mantenedor idioma
 * entrada nombre idioma
 * salida null
 * @author: braulio valdes 
 */
package vista;

import controlador.ControladorAutores;
import controlador.ControladorIdioma;
import controlador.ControladorLibros;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Autores;
import modelo.Idioma;
import modelo.Libros;

/**
 *
 * @author BRAULIOMARIANO
 */
public class FIdioma extends javax.swing.JFrame {

    /**
     * Creates new form FCategoria
     */
    
    DefaultComboBoxModel comboIdioma = new DefaultComboBoxModel();
    
    public FIdioma() {
        initComponents();
        //this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        poblarIdioma();
        //btnBorrar.setEnabled(false);
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
        txtNombre = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnCancela1 = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        cmbIdioma = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("MANTENEDOR IDIOMAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 11, -1, -1));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 46, -1, -1));

        btnAgrega.setText("Agrega");
        btnAgrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 74, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 43, 331, -1));

        btnModificar.setText("Renombra");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 74, -1, -1));

        btnCancela1.setText("Cerrar");
        btnCancela1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancela1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancela1, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 74, -1, -1));

        btnBorrar.setText("Cambia estado");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 74, -1, -1));

        cmbIdioma.setDoubleBuffered(true);
        cmbIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIdiomaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 115, 331, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 0, 0));
        jLabel27.setText("*");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 20, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregaActionPerformed
        // TODO add your handling code here:
        
        // aqui agrega autores
        if (txtNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe ingresa idioma", "Error de Ingreso", 1);
        }else{
            String nombre = txtNombre.getText();      
            ControladorIdioma c = new ControladorIdioma();
            Idioma idioma = c.leer(nombre); //recupera objeto categoria si lo encuentra
            if (idioma != null) {
                JOptionPane.showMessageDialog(null, "Idioma existente", "Error de Ingreso", 1);
            }else{
                if(c.agregar(nombre)){
                    JOptionPane.showMessageDialog(null, "Idioma creada exitosamente", "Ingreso Válido",1);
                    poblarIdioma();
                }else{
                    JOptionPane.showMessageDialog(null, "Idioma no fue creada", "Ingreso No Válido",1);
                }
            }
            txtNombre.setText("");
        }
    }//GEN-LAST:event_btnAgregaActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
     
        if (txtNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe ingresa idioma", "Error de Ingreso", 1);
        }else{
            String nombre = txtNombre.getText();      
            ControladorIdioma c = new ControladorIdioma();
            Idioma idioma = c.leer(nombre); //recupera objeto idioma si lo encuentra
            if (idioma != null) {
                JOptionPane.showMessageDialog(null, "Moficación ya existe, no se registró cambio", "Error", 1);
            }else{
                // se modifica el autor
                String a = cmbIdioma.getItemAt(cmbIdioma.getSelectedIndex());
                int id_idioma = Integer.parseInt(a.substring(a.indexOf("(") + 1, a.indexOf(")")));
               
                Idioma id = new Idioma(id_idioma,nombre,true);
                if(c.modificar(id)){
                        JOptionPane.showMessageDialog(null, "Idioma modificada exitosamente", "Ingreso Válido",1);
                        poblarIdioma();
                    }else{
                        JOptionPane.showMessageDialog(null, "Idioma no fue modificada", "Modificación No Válida",1);
                    }
            }
        }        
     
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCancela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancela1ActionPerformed
        // TODO add your handling code here:
        
        dispose();
    }//GEN-LAST:event_btnCancela1ActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        if (txtNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe ingresa idioma", "Error de Ingreso", 1);
        }else{
            String nombre = txtNombre.getText();      
            ControladorIdioma c = new ControladorIdioma();
            //busca el autor
            Idioma idioma = c.leer(nombre); //recupera objeto idioma si lo encuentra
            if (idioma != null) {
                //busca el autor si esta utilizado en algún libro
                ControladorLibros lib = new ControladorLibros();
                //JOptionPane.showMessageDialog(null, "Autor a eliminar"+autores.getId_autor(), "Ingreso Válido",0);
                Libros libros = lib.leerIdiomaEnLibro(idioma.getId_idioma()); 
                //recupera objeto libro si encuentra el autor
                if(libros!=null){
                    JOptionPane.showMessageDialog(null, "No es posible cambiar estado, esta vinculado a un libro", "no procesado",1);
                }else{
                    if(c.cambiaEstado(idioma.getId_idioma(),!(idioma.isEstado()))){
                        if(idioma.isEstado()){
                            JOptionPane.showMessageDialog(null, "Se cambio estado a "+"borrado", "Procesado",1);
                        }else{
                            JOptionPane.showMessageDialog(null, "Se cambio estado a "+"vigente", "Procesado",1);
                        }
                        poblarIdioma();
                       }
                    }
            }else{
                JOptionPane.showMessageDialog(null, "Idioma no existe", "Error de proceso", 1);
            }
            txtNombre.setText("");
        }    
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void cmbIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIdiomaActionPerformed
        // TODO add your handling code here:
        
        String idi = cmbIdioma.getItemAt(cmbIdioma.getSelectedIndex());
        try{
            String i = idi.substring(0,idi.indexOf("("));
            txtNombre.setText(i);
        }catch(NullPointerException e){
            txtNombre.setText("");
        }

        
    }//GEN-LAST:event_cmbIdiomaActionPerformed

    private void poblarIdioma(){
        ControladorIdioma c = new ControladorIdioma();
        ArrayList<Idioma> idioma = c.consultarTodo();
        comboIdioma = new DefaultComboBoxModel();
        String estado;
        for (Idioma i : idioma) {
          if(i.isEstado()){
             estado = "vigente"; 
          }else{
             estado = "borrado"; 
          }  
          comboIdioma.addElement(i.getNombre()+"("+i.getId_idioma()+")"+"["+estado+"]");
          cmbIdioma.setModel(comboIdioma);
        }
    }
    
    
    
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
            java.util.logging.Logger.getLogger(FIdioma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FIdioma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FIdioma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FIdioma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FIdioma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgrega;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancela1;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbIdioma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
