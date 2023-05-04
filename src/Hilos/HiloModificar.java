/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import HandlersImagen.ModificarJPG;
import java.util.ArrayList;
import javax.swing.JTextArea;
import proyecto2.JPEGHandler;

/**
 *
 * @author lenovo
 */
public class HiloModificar extends Thread {
    ArrayList<String> listaImagenes;
    JTextArea jTextConsola;
    
    public HiloModificar(ArrayList<String> listaImagenes, JTextArea consola) {
        this.listaImagenes = listaImagenes;
        this.jTextConsola =  consola;
    }
    
    @Override
    public void run() {
        
        
        for (int i = 0; i < listaImagenes.size(); i++) {
            String path = "";
            String fileName="";
            ModificarJPG handlerModificar = new ModificarJPG(listaImagenes.get(i));
            path=listaImagenes.get(i);
            fileName=path.substring(path.lastIndexOf("\\") + 1, path.lastIndexOf('.'));
            jTextConsola.append("\nImagen: " + fileName + " filtro: Modificar");
            try {
                JPEGHandler.runHandler(handlerModificar);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }   
}
