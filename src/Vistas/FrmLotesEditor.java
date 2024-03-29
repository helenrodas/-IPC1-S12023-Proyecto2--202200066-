/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Data.CListaImagenes;
import Data.CListaUsuarios;
import Data.CNodoUsuario;
import Data.CNodoImagen;
import Data.Data;
import Hilos.HiloBN;
import Hilos.HiloBarra;
import Hilos.HiloCambioBmp;
import Hilos.HiloCopiaJpg;
import Hilos.HiloModificar;
import Hilos.HiloRGB;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class FrmLotesEditor extends javax.swing.JFrame {
    Data data;
    DefaultListModel modelo;
    private CListaUsuarios listaUsuarios;
    private CListaImagenes listaImagenes;
    CNodoUsuario usuarioActual;
    ArrayList<String> listaImagenesEdicion;
    
   
    /**
     * Creates new form FrmLotesEditor
     */
    public FrmLotesEditor(Data data) {
        initComponents();
        listaUsuarios=data.getListaUsuarios();
        modelo = new DefaultListModel();
        listaImagenesEdicion = new ArrayList<>();
        
        CargarUsuarios();
        this.setTitle("Lotes Editor");
        this.data=data;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OpcionesEdicion = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxUsuarios = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxCategorias = new javax.swing.JComboBox<>();
        btnMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListColaImagenes = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCheckBoxRGB = new javax.swing.JCheckBox();
        jCheckBoxJpgABmp = new javax.swing.JCheckBox();
        jCheckBoxCopiarAJpg = new javax.swing.JCheckBox();
        jCheckBoxModificarImagen = new javax.swing.JCheckBox();
        jCheckBoxBlancoNegro = new javax.swing.JCheckBox();
        btnEjecutar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        jProgressBarProceso = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextConsola = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario:");

        jComboBoxUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUsuariosActionPerformed(evt);
            }
        });

        jLabel2.setText("Categoria:");

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListColaImagenes);

        jLabel3.setText("Cola de procesamiento");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBoxRGB.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jCheckBoxRGB.setText("Rojo Verde Azul y Sepia");
        jCheckBoxRGB.setActionCommand("RGB");
        jCheckBoxRGB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxRGBActionPerformed(evt);
            }
        });

        jCheckBoxJpgABmp.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jCheckBoxJpgABmp.setText("JPG a BMP y viceversa");
        jCheckBoxJpgABmp.setActionCommand("Jpg_Bmp");
        jCheckBoxJpgABmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxJpgABmpActionPerformed(evt);
            }
        });

        jCheckBoxCopiarAJpg.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jCheckBoxCopiarAJpg.setText("Copiar a JPG");
        jCheckBoxCopiarAJpg.setActionCommand("Copiar_JPG");

        jCheckBoxModificarImagen.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jCheckBoxModificarImagen.setText("Modificar Imagen");
        jCheckBoxModificarImagen.setActionCommand("Modificar_Imagen");
        jCheckBoxModificarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxModificarImagenActionPerformed(evt);
            }
        });

        jCheckBoxBlancoNegro.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jCheckBoxBlancoNegro.setText("Blanco y Negro");
        jCheckBoxBlancoNegro.setActionCommand("Blanco_Negro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxBlancoNegro, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxCopiarAJpg, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxJpgABmp, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxModificarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(256, 256, 256))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxRGB, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBoxJpgABmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxCopiarAJpg)
                .addGap(12, 12, 12)
                .addComponent(jCheckBoxRGB)
                .addGap(12, 12, 12)
                .addComponent(jCheckBoxModificarImagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxBlancoNegro)
                .addGap(35, 35, 35))
        );

        btnEjecutar.setText("Ejecturar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        jLabel4.setText("Consola de Ejecucion");

        jProgressBarProceso.setForeground(new java.awt.Color(255, 204, 153));

        jLabel5.setText("Cantidad Procesada");

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(null);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jTextConsola.setColumns(20);
        jTextConsola.setRows(5);
        jScrollPane2.setViewportView(jTextConsola);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jLabel5))
                            .addComponent(jProgressBarProceso, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jComboBoxUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(jComboBoxCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnRegresar)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMostrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEjecutar))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(jProgressBarProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxRGBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxRGBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxRGBActionPerformed

    private void jCheckBoxJpgABmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxJpgABmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxJpgABmpActionPerformed

    private void jCheckBoxModificarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxModificarImagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxModificarImagenActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        if(evt.getSource()==btnRegresar){
            FrmLogIn Inicio = new FrmLogIn(data);
            Inicio.setDefaultCloseOperation(FrmCrearUsuario.DISPOSE_ON_CLOSE);
            Inicio.setLocationRelativeTo(null);
            Inicio.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jComboBoxUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUsuariosActionPerformed
        
        if( jComboBoxUsuarios.getSelectedItem() == null || 
                jComboBoxUsuarios.getSelectedItem().toString().contains("---")){
            return;
        }
        
        String usuario = jComboBoxUsuarios.getSelectedItem().toString();
        
        if (usuario.contains(usuario))
        
        jComboBoxCategorias.removeAllItems();
        jComboBoxCategorias.addItem("---");
        
        usuarioActual = listaUsuarios.GetUsuario(usuario);
 
        ArrayList<String> listaCategorias = usuarioActual.getListaCategorias();
        jComboBoxCategorias.removeAllItems();
        jComboBoxCategorias.addItem("---");
            
        for (String categoria : listaCategorias) {
           String nombreCategoria = categoria;
           
           jComboBoxCategorias.addItem(nombreCategoria);
        }
   
    }//GEN-LAST:event_jComboBoxUsuariosActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        if( jComboBoxUsuarios.getSelectedItem() == null || 
                jComboBoxUsuarios.getSelectedItem().toString().contains("---")){
            JOptionPane.showMessageDialog(this, "Seleccione Usuario!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if( jComboBoxCategorias.getSelectedItem() == null || 
                jComboBoxCategorias.getSelectedItem().toString().contains("---")){
            JOptionPane.showMessageDialog(this, "Seleccione Categoria!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }     
        
        String categoria = jComboBoxCategorias.getSelectedItem().toString();
        cargarImagenes(categoria);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        
        HiloBarra hiloBarra = new HiloBarra(jProgressBarProceso,listaImagenesEdicion);
            hiloBarra.start();
        
        if(jCheckBoxBlancoNegro.isSelected()){
            HiloBN hiloBN = new HiloBN(listaImagenesEdicion, jTextConsola);
            hiloBN.start();
        }
        if(jCheckBoxRGB.isSelected()){
            HiloRGB hiloRgb = new HiloRGB(listaImagenesEdicion, jTextConsola);
            hiloRgb.start();
        }
        if(jCheckBoxModificarImagen.isSelected()){
            HiloModificar hiloMod = new HiloModificar(listaImagenesEdicion, jTextConsola);
            hiloMod.start();
        }
        if(jCheckBoxModificarImagen.isSelected()){
            HiloModificar hiloMod = new HiloModificar(listaImagenesEdicion, jTextConsola);
            hiloMod.start();
        }
        if(jCheckBoxCopiarAJpg.isSelected()){
            HiloCopiaJpg hiloCopia = new HiloCopiaJpg(listaImagenesEdicion, jTextConsola);
            hiloCopia.start();
        }
        if(jCheckBoxJpgABmp.isSelected()){
            HiloCambioBmp hiloCambioBmp = new HiloCambioBmp(listaImagenesEdicion, jTextConsola);
            hiloCambioBmp.start();
        }
        
        jTextConsola.setText("");
    }//GEN-LAST:event_btnEjecutarActionPerformed

    public void CargarUsuarios() {
        jComboBoxUsuarios.removeAllItems();
        jComboBoxUsuarios.addItem("---");

        CNodoUsuario nodoUsuario = listaUsuarios.getInicio();
        while (nodoUsuario != null) {
            jComboBoxUsuarios.addItem(nodoUsuario.getNombreUsuario());
            nodoUsuario = nodoUsuario.getNodoSiguiente();
        }
    }
 
    private void cargarImagenes(String categoria){
        String path = "";
        String fileName="";
        listaImagenes = usuarioActual.getListaImagenes();
        CNodoImagen nodoImagen = listaImagenes.getInicio();

        while (nodoImagen != null) {
            if(categoria.equals(nodoImagen.getCategoria())){

                path=nodoImagen.getImagePath();
                fileName=path.substring(path.lastIndexOf("\\") + 1, path.lastIndexOf('.'));
                jListColaImagenes.setModel(modelo);
                modelo.addElement(fileName);
                listaImagenesEdicion.add(path);
            }
            if(nodoImagen.getNodoSiguiente() != null) {
                nodoImagen = nodoImagen.getNodoSiguiente(); 
            } else {
                break; 
            }
        }
    }
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup OpcionesEdicion;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JCheckBox jCheckBoxBlancoNegro;
    private javax.swing.JCheckBox jCheckBoxCopiarAJpg;
    private javax.swing.JCheckBox jCheckBoxJpgABmp;
    private javax.swing.JCheckBox jCheckBoxModificarImagen;
    private javax.swing.JCheckBox jCheckBoxRGB;
    private javax.swing.JComboBox<String> jComboBoxCategorias;
    private javax.swing.JComboBox<String> jComboBoxUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jListColaImagenes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBarProceso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextConsola;
    // End of variables declaration//GEN-END:variables
}
