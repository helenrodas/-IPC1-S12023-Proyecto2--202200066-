/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import inicio.FrmLogIn;

/**
 *
 * @author lenovo
 */

import Data.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data data = new Data();
        
        FrmLogIn inicio = new FrmLogIn(data);
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
    }
    
}
