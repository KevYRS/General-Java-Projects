import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

public class frmRegistro extends javax.swing.JFrame {
    
    public frmRegistro() {
        initComponents();
        
    }
    Calumno alumno[]=new Calumno[30];
    int contador = 0;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_NumeroControl = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_ApellidoPaterno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_ApellidoMaterno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_dia = new javax.swing.JTextField();
        txt_mes = new javax.swing.JTextField();
        txt_anio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_rfc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_carrera = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_mostrar = new javax.swing.JButton();
        btn_rfc = new javax.swing.JButton();
        lbl_mensaje = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_salida = new javax.swing.JTextArea();
        btn_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Instituto Tecnologico de Querétaro");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sistema de control escolar");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No. de control:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");

        txt_NumeroControl.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        txt_nombre.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido paterno:");

        txt_ApellidoPaterno.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apellido materno:");

        txt_ApellidoMaterno.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha de nacimiento:");

        txt_dia.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        txt_mes.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        txt_anio.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("RFC:");

        txt_rfc.setEditable(false);
        txt_rfc.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Carrera:");

        txt_carrera.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        btn_agregar.setBackground(new java.awt.Color(102, 102, 102));
        btn_agregar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setText("Add");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_mostrar.setBackground(new java.awt.Color(102, 102, 102));
        btn_mostrar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_mostrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_mostrar.setText("Show");
        btn_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarActionPerformed(evt);
            }
        });

        btn_rfc.setBackground(new java.awt.Color(102, 102, 102));
        btn_rfc.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_rfc.setForeground(new java.awt.Color(255, 255, 255));
        btn_rfc.setText("RFC");
        btn_rfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rfcActionPerformed(evt);
            }
        });

        lbl_mensaje.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lbl_mensaje.setForeground(new java.awt.Color(255, 255, 255));
        lbl_mensaje.setText("Mensajes");

        txt_salida.setEditable(false);
        txt_salida.setBackground(new java.awt.Color(0, 153, 153));
        txt_salida.setColumns(20);
        txt_salida.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_salida.setForeground(new java.awt.Color(255, 255, 255));
        txt_salida.setRows(5);
        jScrollPane1.setViewportView(txt_salida);

        btn_limpiar.setBackground(new java.awt.Color(102, 102, 102));
        btn_limpiar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setText("Clean");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(308, 308, 308)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(288, 288, 288)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btn_agregar)
                                            .addComponent(btn_mostrar))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addComponent(btn_rfc))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_ApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_NumeroControl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(59, 59, 59))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_ApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(txt_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txt_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel8)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txt_rfc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel9)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txt_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_anio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_NumeroControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txt_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_rfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(btn_agregar))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btn_rfc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_mostrar)
                    .addComponent(btn_limpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_mensaje)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
    
    int c=-1;
    alumno[contador]=new Calumno();
    
    if(contador==9){
        txt_NumeroControl.setEnabled(false);
        txt_nombre.setEnabled(false);
        txt_ApellidoPaterno.setEnabled(false);
        txt_ApellidoMaterno.setEnabled(false);
        txt_dia.setEnabled(false);
        txt_mes.setEnabled(false);
        txt_anio.setEnabled(false);
        txt_rfc.setEnabled(false);
        txt_carrera.setEnabled(false);
        btn_agregar.setEnabled(false);
        btn_rfc.setEnabled(false);
    }
        
        if(txt_NumeroControl.getText().length()!=8){
                lbl_mensaje.setText("El número de control debe contener 8 dígitos");
                c--;
        }
        
        try{    
            alumno[contador].setNc(Integer.parseInt(txt_NumeroControl.getText()));
            if(txt_nombre.getText().isEmpty()||txt_ApellidoPaterno.getText().isEmpty()||txt_ApellidoMaterno.getText().isEmpty()||txt_carrera.getText().isEmpty()){
                lbl_mensaje.setText("Debes llenar todos los campos");
                c--;
            }
        }
        
        catch(NumberFormatException e){
            lbl_mensaje.setText("El número de control sólo acepta números");
            c--;
        }
        
        try{
            Cfecha fecha=new Cfecha(Integer.parseInt(txt_dia.getText()),Integer.parseInt(txt_mes.getText()),Integer.parseInt(txt_anio.getText()));
            fecha.setMes(Integer.parseInt(txt_mes.getText()));
            fecha.setDia(Integer.parseInt(txt_dia.getText()));
            fecha.setAnio(Integer.parseInt(txt_anio.getText()));
            alumno[contador].setFechaNacimiento(fecha.toString());
        
        }
        
        catch(NumberFormatException e){
            lbl_mensaje.setText("El día, mes y año no pueden estar vacios");
            c--;
        }
        catch(CfechaExcepcion f){
            lbl_mensaje.setText(f.getMessage());
            c--;
        }
        
        c++;
    if(c==0){
        lbl_mensaje.setText("Alumno agregado en la posición "+contador);
        alumno[contador].setRfc(txt_rfc.getText());
        alumno[contador].setCarrera(txt_carrera.getText());
        alumno[contador].setNombre(txt_nombre.getText());
        alumno[contador].setAp(txt_ApellidoPaterno.getText());
        alumno[contador].setAm(txt_ApellidoMaterno.getText());
        contador++;
       
        String texto1="";
        if (contador==10){
            for(int i=0; i<contador; i++){
               alumno[contador]=new Calumno();
                texto1+=(i+1)+".- "+alumno[i].getCarrera()+"/"+alumno[i].getNc()+"/"+alumno[i].getNombre()+"/"+alumno[i].getAp()+"/"+alumno[i].getAm()+"/  "+alumno[i].getFechaNacimiento()+" "+alumno[i].getRfc()+"\n";
            txt_salida.setText(texto1); 
            }
            lbl_mensaje.setText("Limite de alumnos");
            
            try{
            java.io.FileOutputStream fs=new java.io.FileOutputStream("alumnos.obj");
            java.io.ObjectOutputStream os=new java.io.ObjectOutputStream (fs);
            for(int i=0;i<10;i++){
              os.writeObject(new Calumno(
                      alumno[i].getNc(),
                      alumno[i].getNombre(),
                      alumno[i].getAp(),
                      alumno[i].getAm(),
                      alumno[i].getRfc(),
                      alumno[i].getFechaNacimiento()));
                      lbl_mensaje.setText("Registros agregados");
            }
            os.close();
        }
            
            catch(IOException e){
            lbl_mensaje.setText("Error, el archivo no existe");
        }
        catch(NullPointerException e){
            lbl_mensaje.setText("El alumno no está registrado");
        }

        }
        
    }  
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_rfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rfcActionPerformed
        try{
        String rfc="";
        rfc=txt_ApellidoPaterno.getText().substring(0,2)+txt_ApellidoMaterno.getText().substring(0,1)+txt_nombre.getText().substring(0,1)+txt_anio.getText().substring(2,3)+txt_mes.getText()+txt_dia.getText();
        txt_rfc.setText(rfc);
        }
        catch(StringIndexOutOfBoundsException e){
            lbl_mensaje.setText("No pueden estar vacios campos de nombre y fecha");
        }
    }//GEN-LAST:event_btn_rfcActionPerformed

    private void btn_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarActionPerformed
        String texto="";
        
        try{
            java.io.FileInputStream fs=new java.io.FileInputStream("alumnos.obj");
            java.io.ObjectInputStream os= new java.io.ObjectInputStream(fs);
            for(int i=0;i<10;i++){
                alumno[i]=(Calumno)os.readObject();
            }
            for(int i=0; i<=contador-1; i++)
            {
                texto+=(i+1)+".- "+"/"+alumno[i].getNc()+" "+alumno[i].getNombre()+"/"+alumno[i].getAp()+"/"+alumno[i].getAm()+"/"+alumno[i].getFechaNacimiento()+"/"+alumno[i].getRfc()+"\n";
            txt_salida.setText(texto);
        }
        }
         catch(FileNotFoundException e){
             lbl_mensaje.setText("ERROR el archivo no existe");     
         }
        catch(ClassNotFoundException e){
            lbl_mensaje.setText("no existe clase objeto");
        }
        catch(NullPointerException e){
            lbl_mensaje.setText("Error al leer el arreglo");
        }
        catch(IOException e){ 
            lbl_mensaje.setText("ERROR");
        }
        
        try{
            java.io.FileInputStream fs=new java.io.FileInputStream("alumnos.obj");
            java.io.ObjectInputStream os= new java.io.ObjectInputStream(fs);
            for(int i=0;i<10;i++){
                alumno[i]=(Calumno)os.readObject();
            }
            for(int i=0;i<10;i++){
                /*txt_NumeroControl.setText(alumno[i].getNc()+"");
                txt_nombre.setText(alumno[i].getNombre()+"");
                txt_ApellidoPaterno.setText(""+alumno[i].getAp());
                txt_ApellidoMaterno.setText(""+alumno[i].getAm());
                txt_dia.setText(""+alumno[i].getFechaNacimiento());
                txt_rfc.setText(""+alumno[i].getRfc());
                txt_carrera.setText(""+alumno[i].getCarrera());
                lbl_mensaje.setText("Registro mostrado "+i);
                JOptionPane.showMessageDialog(null,"dale click","siguiente",JOptionPane.PLAIN_MESSAGE);
                */
                texto+=(i+1)+".- "+"/"+alumno[i].getNc()+" "+alumno[i].getNombre()+"/"+alumno[i].getAp()+"/"+alumno[i].getAm()+"/"+alumno[i].getFechaNacimiento()+"/"+alumno[i].getRfc()+"\n";
            }
        txt_salida.setText(texto);    
        }
         catch(FileNotFoundException e){
             lbl_mensaje.setText("ERROR el archivo no existe");     
         }
        catch(ClassNotFoundException e){
            lbl_mensaje.setText("no existe clae objeto");
        }
        catch(NullPointerException e){
            lbl_mensaje.setText("Error al leer el arreglo");
        }
        catch(IOException e){ 
            lbl_mensaje.setText("ERROR");
        }
    }//GEN-LAST:event_btn_mostrarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txt_NumeroControl.setText("");
        txt_nombre.setText("");
        txt_ApellidoPaterno.setText("");
        txt_ApellidoMaterno.setText("");
        txt_dia.setText("");
        txt_mes.setText("");
        txt_anio.setText("");
        txt_rfc.setText("");
        txt_carrera.setText("");   
        txt_salida.setText("Operación Limpiar realizada con éxito");
    }//GEN-LAST:event_btn_limpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_mostrar;
    private javax.swing.JButton btn_rfc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_mensaje;
    private javax.swing.JTextField txt_ApellidoMaterno;
    private javax.swing.JTextField txt_ApellidoPaterno;
    private javax.swing.JTextField txt_NumeroControl;
    private javax.swing.JTextField txt_anio;
    private javax.swing.JTextField txt_carrera;
    private javax.swing.JTextField txt_dia;
    private javax.swing.JTextField txt_mes;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_rfc;
    private javax.swing.JTextArea txt_salida;
    // End of variables declaration//GEN-END:variables
}
