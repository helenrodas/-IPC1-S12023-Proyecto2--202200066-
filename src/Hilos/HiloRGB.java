/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import HandlersImagen.RgbJPG;
import java.util.ArrayList;
import proyecto2.JPEGHandler;

/**
 *
 * @author lenovo
 */
public class HiloRGB extends Thread {
    ArrayList<String> listaImagenes;
    
    public HiloRGB(ArrayList<String> listaImagenes) {
        this.listaImagenes = listaImagenes;
    }
    
    @Override
    public void run() {

        for (int i = 0; i < listaImagenes.size(); i++) {
            RgbJPG handlerRgb = new RgbJPG(listaImagenes.get(i));
            try {
                JPEGHandler.runHandler(handlerRgb);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }   
}
