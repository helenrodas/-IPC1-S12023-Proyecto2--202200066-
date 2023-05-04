/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import HandlersImagen.BlancoYNegroJPG;
import java.util.ArrayList;
import proyecto2.JPEGHandler;

/**
 *
 * @author lenovo
 */
public class HiloBN extends Thread {
     ArrayList<String> listaImagenes;

    public HiloBN(ArrayList<String> listaImagenes) {
        this.listaImagenes = listaImagenes;
    }

    @Override
    public void run() {

        for (int i = 0; i < listaImagenes.size(); i++) {
            BlancoYNegroJPG handlerBn = new BlancoYNegroJPG(listaImagenes.get(i));
            try {
                JPEGHandler.runHandler(handlerBn);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }   
}
