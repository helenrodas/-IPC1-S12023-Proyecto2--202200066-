/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;


import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;


/**
 *
 * @author lenovo
 */
public class HiloBarra extends Thread {
    JProgressBar jProgressBarProceso;
    ArrayList<String> listaImagenes;
    
     public HiloBarra(JProgressBar barra, ArrayList<String> listaImagenes) {
        this.jProgressBarProceso = barra;
        this.listaImagenes = listaImagenes;
    }
     
     @Override
    public void run() {
        int i =0;
        
        for (i = 0; i < 100; i++) {
            jProgressBarProceso.setValue(i);

            try {
                sleep(listaImagenes.size()*5);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloBarra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (i == 100) {
            JOptionPane.showMessageDialog(null, "Fin de Ejecucion!");
            return;
       }

    }
     
}
