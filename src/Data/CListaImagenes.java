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
    private CNodoImagen ultimo;
    
    public CListaImagenes(){
        this.inicio = null;
        this.ultimo=null;
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
    
//    public void EliminarImagen(String path, String categoria) {
//        CNodoImagen actual = new CNodoImagen(path, categoria);
//        CNodoImagen anterior = new CNodoImagen(path, categoria);
//
//        actual = inicio;
//        anterior = ultimo;
//
//        while (actual != null) {
//            if (actual.imagePath==path) {
//                if (actual == inicio) {
//                    inicio = inicio.nodoSiguiente;
//                    inicio.nodoAnterior=null;
//                } else if (actual == ultimo) {
//                    anterior.nodoSiguiente = null;
//                    ultimo = anterior;
//                } else {
//                    anterior.nodoSiguiente = actual.nodoSiguiente;
//                    actual.nodoSiguiente.nodoAnterior= actual.nodoSiguiente;
//                }
//            }
//            anterior = actual;
//            actual = actual.nodoSiguiente;
//        }
//    }
    
    public void EliminarImagen(String path, String categoria){
        CNodoImagen temporal= inicio;
        boolean encontrado = false;
        while(temporal != null && !encontrado){
            encontrado= temporal.getImagePath()==path;
            if(!encontrado){
                temporal=temporal.getNodoSiguiente();
            }
        }
        if(encontrado){
            if(temporal==inicio)
                inicio=temporal.getNodoSiguiente();
            else{
                temporal.getNodoAnterior().setNodoSiguiente(temporal.getNodoSiguiente());
                if(temporal.getNodoSiguiente() != null){
                    temporal.getNodoSiguiente().setNodoAnterior(temporal.getNodoAnterior());
                }
            }
            temporal= null;
            
            if(temporal.getNodoAnterior()==null && temporal.getNodoSiguiente()==null){
                temporal=null;
            }
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
