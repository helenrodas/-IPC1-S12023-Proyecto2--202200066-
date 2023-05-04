/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import HandlersImagen.CambioJpgBmp;
import java.util.ArrayList;
import proyecto2.JPEGHandler;

/**
 *
 * @author lenovo
 */
public class HiloCambioBmp extends Thread {
    ArrayList<String> listaImagenes;
    
    public HiloCambioBmp(ArrayList<String> listaImagenes) {
        this.listaImagenes = listaImagenes;
    }
    
    @Override
    public void run() {

        for (int i = 0; i < listaImagenes.size(); i++) {
            CambioJpgBmp handlerCambioBmp = new CambioJpgBmp(listaImagenes.get(i));
            try {
                JPEGHandler.runHandler(handlerCambioBmp);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }  
}
