/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import HandlersImagen.ModificarJPG;
import java.util.ArrayList;
import proyecto2.JPEGHandler;

/**
 *
 * @author lenovo
 */
public class HiloModificar extends Thread {
    ArrayList<String> listaImagenes;
    
    public HiloModificar(ArrayList<String> listaImagenes) {
        this.listaImagenes = listaImagenes;
    }
    
    @Override
    public void run() {

        for (int i = 0; i < listaImagenes.size(); i++) {
            ModificarJPG handlerModificar = new ModificarJPG(listaImagenes.get(i));
            try {
                JPEGHandler.runHandler(handlerModificar);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }   
}
