/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import HandlersImagen.CambioJpgBmp;
import java.util.ArrayList;
import javax.swing.JTextArea;
import proyecto2.JPEGHandler;

/**
 *
 * @author lenovo
 */
public class HiloCambioBmp extends Thread {
    ArrayList<String> listaImagenes;
    JTextArea jTextConsola;
    
    public HiloCambioBmp(ArrayList<String> listaImagenes, JTextArea consola) {
        this.listaImagenes = listaImagenes;
        this.jTextConsola =  consola;
    }
    
    @Override
    public void run() {
        

        for (int i = 0; i < listaImagenes.size(); i++) {
            String path = "";
            String fileName="";
            CambioJpgBmp handlerCambioBmp = new CambioJpgBmp(listaImagenes.get(i));
            path=listaImagenes.get(i);
            fileName=path.substring(path.lastIndexOf("\\") + 1, path.lastIndexOf('.'));
            jTextConsola.append("\nImagen: " + fileName + " filtro: Cambio JPG a BMP y viceversa");
            try {
                JPEGHandler.runHandler(handlerCambioBmp);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }  
}
