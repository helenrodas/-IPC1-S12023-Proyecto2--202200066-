/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author lenovo
 */
public class CListaImagenes {
    private CNodoImagen inicio;
    
    public CListaImagenes(){
        this.inicio = null;
    }
    
    public void agregar(String imagePath, String categoria){
        CNodoImagen nuevoNodo = new CNodoImagen(imagePath, categoria);
        
        if(this.inicio == null){
            this.inicio=nuevoNodo;
        }else{
            CNodoImagen temporal = this.inicio;
            while(temporal.getNodoSiguiente()!= null){
                temporal = temporal.getNodoSiguiente();                
            }
            temporal.setNodoSiguiente(nuevoNodo);
            nuevoNodo.setNodoAnterior(temporal);            
        }        
    }
    
    public CNodoImagen getFinListaImagenes(){
        CNodoImagen temporal = this.inicio;
        while(temporal.getNodoSiguiente()!= null){
                temporal = temporal.getNodoSiguiente();                
        }
        return temporal;
    }
    
    public void setInicio(CNodoImagen inicio){
        this.inicio = inicio;
    }
    
    public CNodoImagen getInicio(){
        return inicio;
    }
    
}
