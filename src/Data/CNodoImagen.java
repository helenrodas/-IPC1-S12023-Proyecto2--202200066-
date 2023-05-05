/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author lenovo
 */
public class CNodoImagen {
    public CNodoImagen nodoSiguiente;
    public CNodoImagen nodoAnterior;
    public String imagePath;
    public String categoria;
    
    
    public CNodoImagen(String imagePath, String categoria) {
        this.imagePath = imagePath;
        this.categoria=categoria;
        this.nodoAnterior = null;
        this.nodoSiguiente = null;
    }

    public CNodoImagen getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(CNodoImagen nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }

    public CNodoImagen getNodoAnterior() {
        return nodoAnterior;
    }

    public void setNodoAnterior(CNodoImagen nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    } 
}
