/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import HandlersImagen.CopiaJpg;
import java.util.ArrayList;
import proyecto2.JPEGHandler;

/**
 *
 * @author lenovo
 */
public class HiloCopiaJpg extends Thread {
    ArrayList<String> listaImagenes;
    
    public HiloCopiaJpg(ArrayList<String> listaImagenes) {
        this.listaImagenes = listaImagenes;
    }
    
    @Override
    public void run() {

        for (int i = 0; i < listaImagenes.size(); i++) {
            CopiaJpg handlerCopiaJpg = new CopiaJpg(listaImagenes.get(i));
            try {
                JPEGHandler.runHandler(handlerCopiaJpg);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }   
}
