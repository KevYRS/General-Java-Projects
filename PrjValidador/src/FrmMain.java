
import com.sun.awt.AWTUtilities;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class FrmMain extends javax.swing.JFrame {

    int x,y;
    public FrmMain() {
        initComponents();
//        AWTUtilities.setWindowOpaque(this,false);
       
        this.setLocationRelativeTo(null); //centrar el fomulario
        jlbResultado.setVisible(false);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlbMove = new javax.swing.JLabel();
        jtxtCadena = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jlbResultado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlbDescripcion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(240, 152, 114));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Validar String");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(100, 20, 200, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Delete_36px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2);
        jLabel2.setBounds(360, 0, 36, 40);

        jlbMove.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jlbMove.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jlbMoveMouseDragged(evt);
            }
        });
        jlbMove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbMoveMousePressed(evt);
            }
        });
        jPanel2.add(jlbMove);
        jlbMove.setBounds(0, 0, 360, 80);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 410, 80);
        jPanel1.add(jtxtCadena);
        jtxtCadena.setBounds(90, 130, 220, 30);

        jButton1.setBackground(new java.awt.Color(244, 96, 96));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Validar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(140, 170, 120, 30);

        jlbResultado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconAceptar.png"))); // NOI18N
        jlbResultado.setText("Aceptada");
        jPanel1.add(jlbResultado);
        jlbResultado.setBounds(140, 220, 130, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Expresion");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(160, 100, 90, 30);

        jlbDescripcion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jlbDescripcion);
        jlbDescripcion.setBounds(20, 270, 360, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 400, 300);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jlbResultado.setVisible(false);
        jlbDescripcion.setText("");
        Object opcion = JOptionPane.showInputDialog(null,"Opcion a Validar","Validar",JOptionPane.QUESTION_MESSAGE,null,
                new Object[]{"Variable","Constante","Numero Entero","Numero Real","Expresion Aritmetica"},"Selecionar");
        
        if(opcion=="Variable"){
            variable();
        }if(opcion=="Constante"){
            constante();
        }if(opcion=="Numero Entero"){
            entero();
        }if(opcion=="Numero Real"){
           real();
        }if(opcion=="Expresion Aritmetica"){
            aritmetica();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jlbMoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbMoveMousePressed
         x = evt.getX();
         y = evt.getY();
    }//GEN-LAST:event_jlbMoveMousePressed

    private void jlbMoveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbMoveMouseDragged
        this.setLocation(this.getLocation().x+evt.getX()-x,this.getLocation().y+evt.getY()-y);
    }//GEN-LAST:event_jlbMoveMouseDragged

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }
    
    public void variable(){
        Pattern pat = Pattern.compile("^[a-z][a-zA-Z0-9_]*");
        Matcher mat = pat.matcher(jtxtCadena.getText());
        
        if(mat.matches()){
            jlbResultado.setVisible(true);
            jlbResultado.setText("Aceptada");
            jlbResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconAceptar.png")));
            jlbDescripcion.setText("Cumple: "+"^[a-z][a-zA-Z0-9_]*");
        }else{
            jlbResultado.setVisible(true);
            jlbResultado.setText("Rechazada");
            jlbResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconRechazar.png")));
            jlbDescripcion.setText("No Cumple: "+"^[a-z][a-zA-Z0-9_]*");
        }
       
    }
    public void constante(){
        Pattern pat = Pattern.compile("^[A-Z][A-Z|0-9]*");
        Matcher mat = pat.matcher(jtxtCadena.getText());
        if(mat.matches()){
            jlbResultado.setVisible(true);
            jlbResultado.setText("Aceptada");
            jlbResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconAceptar.png")));
            jlbDescripcion.setText("Cumple:  "+"^[A-Z][A-Z|0-9]*");
        }else{
            jlbResultado.setVisible(true);
            jlbResultado.setText("Rechazada");
            jlbResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconRechazar.png")));
            jlbDescripcion.setText("No Cumple:  "+"^[A-Z][A-Z|0-9]*");
        }
    }
    public void entero(){
        Pattern pat = Pattern.compile("^[0-9(-|+)][0-9]*");
        Matcher mat = pat.matcher(jtxtCadena.getText());
         if(mat.matches()){
            jlbResultado.setVisible(true);
            jlbResultado.setText("Aceptada");
            jlbResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconAceptar.png")));
            jlbDescripcion.setText("Cumple:  "+"^[0-9(-|+)][0-9]*");
        }else{
            jlbResultado.setVisible(true);
            jlbResultado.setText("Rechazada");
            jlbResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconRechazar.png")));
             jlbDescripcion.setText("No Cumple:  "+"^[0-9(-|+)][0-9]*");
        }
    }
    public void real(){
        Pattern pat = Pattern.compile("^[0-9|\\-|+][,]*[0-9]+");
        Matcher mat = pat.matcher(jtxtCadena.getText());
        if(mat.matches()){
            jlbResultado.setVisible(true);
            jlbResultado.setText("Aceptada");
            jlbResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconAceptar.png")));
            jlbDescripcion.setText("Cumple:   " +"^[0-9|-|+][,]*[0-9]+");
        }else{
            jlbResultado.setVisible(true);
            jlbResultado.setText("Rechazada");
            jlbResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconRechazar.png")));
            jlbDescripcion.setText("No Cumple:   " +"^[0-9|-|+][,]*[0-9]+");
        }
    }
    public void aritmetica(){
        Pattern pat = Pattern.compile("[a-zA-Z0-9|+|-|_]+[,]*[a-zA-Z0-9|+|-|_]+[%|+|\\-|*|/]+[a-zA-Z0-9|+|-|_]+[,]*[a-zA-Z0-9|+|-|_]+");
        Matcher mat = pat.matcher(jtxtCadena.getText());
        if(mat.matches()){
           jlbResultado.setVisible(true);
            jlbResultado.setText("Aceptada");
            jlbResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconAceptar.png")));
             jlbDescripcion.setText("Cumple:  "+"[a-zA-Z0-9|+|-|_]+[,]*[a-zA-Z0-9|+|-|_]+[%|+|\\\\-|*|/]+[a-zA-Z0-9|+|-|_]+[,]*[a-zA-Z0-9|+|-|_]+");
        }else{
            jlbResultado.setVisible(true);
            jlbResultado.setText("Rechazada");
            jlbResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconRechazar.png")));
            jlbDescripcion.setText("No Cumple: "+"[a-zA-Z0-9|+|-|_]+[,]*[a-zA-Z0-9|+|-|_]+[%|+|\\\\-|*|/]+[a-zA-Z0-9|+|-|_]+[,]*[a-zA-Z0-9|+|-|_]+");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlbDescripcion;
    private javax.swing.JLabel jlbMove;
    private javax.swing.JLabel jlbResultado;
    private javax.swing.JTextField jtxtCadena;
    // End of variables declaration//GEN-END:variables
}
