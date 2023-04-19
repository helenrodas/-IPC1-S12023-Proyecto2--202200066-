/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author lenovo
 */
public class CListaUsuarios {
    protected CNodoUsuario inicio;

    public CListaUsuarios(){
    }
    
   
    public void insertarNodo(CNodoUsuario nuevoNodo) {
    if (inicio == null) {
        inicio = nuevoNodo;
    } else {
        nuevoNodo.nodoSiguiente = inicio;
        inicio = nuevoNodo;
    }
}

   public void mostrarLista(){
        CNodoUsuario nodoActual = inicio;
        
        if( inicio == null){
            System.out.println("Lista vacia! No se encontraron nodos.");
            return;
        }
        
        while(nodoActual!=null){
            System.out.println("NombreUsuario: "+ nodoActual.getNombreUsuario());
            
            nodoActual=nodoActual.nodoSiguiente;
        }
    }
    
    public boolean VerificarUsuarioEnLista(String usuario){
        CNodoUsuario temporal = inicio;
        
        while(temporal != null ){
            if(temporal.getNombreUsuario().equals(usuario)){
                return true;
            }
  
            temporal=temporal.nodoSiguiente;
        }
        return  false;
    }
    
    public CNodoUsuario GetUsuario(String usuario){
         CNodoUsuario temporal = inicio;
        
        while(temporal != null ){
            if(temporal.getNombreUsuario().equals(usuario)){
                return temporal;
            }
  
            temporal=temporal.nodoSiguiente;
        }
        return  null;
    }
}
