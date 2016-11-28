package generadordatos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class FramePrincipal extends javax.swing.JFrame  {

   
    
    String orden="";
    
  
    public FramePrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        Generar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NombreM = new javax.swing.JCheckBox();
        NombreH = new javax.swing.JCheckBox();
        NombreHM = new javax.swing.JCheckBox();
        Apellidos = new javax.swing.JCheckBox();
        Correo = new javax.swing.JCheckBox();
        Nip = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        Caracter = new javax.swing.JTextField();
        imagen = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        opciones = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Generar.setBackground(new java.awt.Color(102, 102, 102));
        Generar.setForeground(new java.awt.Color(255, 255, 255));
        Generar.setText("Generar Documento");
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });
        getContentPane().add(Generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Que datos quiere Generar.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 160, 50));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Generador de Datos.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 170, 40));

        tipo.setBackground(new java.awt.Color(102, 102, 102));
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });
        getContentPane().add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 80, 30));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Formato del texto(.txt o.doc):");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 200, 50));

        NombreM.setBackground(new java.awt.Color(102, 102, 102));
        NombreM.setForeground(new java.awt.Color(255, 255, 255));
        NombreM.setText("Nombre Mujeres");
        NombreM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreMActionPerformed(evt);
            }
        });
        getContentPane().add(NombreM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 120, -1));

        NombreH.setBackground(new java.awt.Color(102, 102, 102));
        NombreH.setForeground(new java.awt.Color(255, 255, 255));
        NombreH.setText("Nombre Hombres");
        NombreH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreHActionPerformed(evt);
            }
        });
        getContentPane().add(NombreH, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 120, -1));

        NombreHM.setBackground(new java.awt.Color(102, 102, 102));
        NombreHM.setForeground(new java.awt.Color(255, 255, 255));
        NombreHM.setText("Nombres M & H");
        NombreHM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreHMActionPerformed(evt);
            }
        });
        getContentPane().add(NombreHM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 120, -1));

        Apellidos.setBackground(new java.awt.Color(102, 102, 102));
        Apellidos.setForeground(new java.awt.Color(255, 255, 255));
        Apellidos.setText("Apellidos.");
        Apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidosActionPerformed(evt);
            }
        });
        getContentPane().add(Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 110, -1));

        Correo.setBackground(new java.awt.Color(102, 102, 102));
        Correo.setForeground(new java.awt.Color(255, 255, 255));
        Correo.setText("Correo electronico");
        Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoActionPerformed(evt);
            }
        });
        getContentPane().add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        Nip.setBackground(new java.awt.Color(102, 102, 102));
        Nip.setForeground(new java.awt.Color(255, 255, 255));
        Nip.setText("Nip");
        Nip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NipActionPerformed(evt);
            }
        });
        getContentPane().add(Nip, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 110, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cuantos datos quiere generar:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 170, 50));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Caracter para separar los datos:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 200, 50));

        Cantidad.setBackground(new java.awt.Color(102, 102, 102));
        Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadActionPerformed(evt);
            }
        });
        getContentPane().add(Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 80, 30));

        Caracter.setBackground(new java.awt.Color(102, 102, 102));
        Caracter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaracterActionPerformed(evt);
            }
        });
        getContentPane().add(Caracter, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 80, 30));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Paisaje.jpg"))); // NOI18N
        getContentPane().add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 373, 476));

        jMenuBar2.setMaximumSize(new java.awt.Dimension(59, 600));

        opciones.setText("Opciones");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        opciones.add(jMenuItem1);

        jMenuBar2.add(opciones);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        
    }//GEN-LAST:event_tipoActionPerformed

    private void NombreMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreMActionPerformed
         
        if (NombreM.isSelected()){
        orden+= "NombreM,";
        }else{
        orden="";
        }
      
    }//GEN-LAST:event_NombreMActionPerformed

    private void CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadActionPerformed
       
    }//GEN-LAST:event_CantidadActionPerformed

    private void NombreHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreHActionPerformed
        
       if (NombreH.isSelected()){
        orden+= "NombreH,";
        }else{
        orden="";
        }
    }//GEN-LAST:event_NombreHActionPerformed

    private void NombreHMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreHMActionPerformed
        
        if (NombreHM.isSelected()){
        orden+= "NombreHM,";
        }else{
        orden="";
        }
    }//GEN-LAST:event_NombreHMActionPerformed

    private void ApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidosActionPerformed
      
        if (Apellidos.isSelected()){
        orden+= "Apellidos,";
        }else{
        orden="";
        }
    }//GEN-LAST:event_ApellidosActionPerformed

    private void CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoActionPerformed
 
        if (Correo.isSelected()){
        orden+= "Correo,";
        }else{
        orden="";
        }
    }//GEN-LAST:event_CorreoActionPerformed

    private void NipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NipActionPerformed

       if (Nip.isSelected()){
        orden+= "Nip,";
        }else{
        orden="";
        }
    }//GEN-LAST:event_NipActionPerformed

    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed
if (orden!=""){
try
{
GeneradorDatos DA=new GeneradorDatos();

JFileChooser file=new JFileChooser();
file.showSaveDialog(this);
File guarda = file.getSelectedFile();
if(guarda !=null)
{
FileWriter  save=new FileWriter(guarda+tipo.getText());

DA.Crear(save);
DA.Generar(orden,Integer.parseInt(Cantidad.getText()),Caracter.getText().charAt(0));

save.close();
JOptionPane.showMessageDialog(null,
"El archivo se a guardado Exitosamente",
"Información",JOptionPane.INFORMATION_MESSAGE);
}
}
catch(IOException ex)
{
JOptionPane.showMessageDialog(null,
"Su archivo no se ha guardado",
"Advertencia",JOptionPane.WARNING_MESSAGE);
}

}else{
JOptionPane.showMessageDialog(null,
"No ha seleccionado ninguna opcion.",
"Advertencia",JOptionPane.WARNING_MESSAGE);
}





 
    }//GEN-LAST:event_GenerarActionPerformed

    private void CaracterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaracterActionPerformed
        
    }//GEN-LAST:event_CaracterActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Apellidos;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JTextField Caracter;
    private javax.swing.JCheckBox Correo;
    private javax.swing.JButton Generar;
    private javax.swing.JCheckBox Nip;
    private javax.swing.JCheckBox NombreH;
    private javax.swing.JCheckBox NombreHM;
    private javax.swing.JCheckBox NombreM;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu opciones;
    private javax.swing.JTextField tipo;
    // End of variables declaration//GEN-END:variables
}
