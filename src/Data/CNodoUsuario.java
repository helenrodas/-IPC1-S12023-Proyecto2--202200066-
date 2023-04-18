/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class CNodoUsuario {
   
    public CNodoUsuario nodoSiguiente;
    public String nombreUsuario;
    private ArrayList<String> ListaCategorias;
    
    public CNodoUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
        ListaCategorias=new ArrayList<>();
        ListaCategorias.add("General");
    }

    public CNodoUsuario getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(CNodoUsuario nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    public ArrayList<String> getListaCategorias() {
        return ListaCategorias;
    }

    public void setListaCategorias(ArrayList<String> ListaCategorias) {
        this.ListaCategorias = ListaCategorias;
    }
    
    public void AgregarCategoria(String categoria){
        ListaCategorias.add(categoria);
    }
    
//    public CNodoUsuario GetNodoUsuario(String usuario){
//         CNodoUsuario temporal = nodoNuevo;
//        
//        while(temporal != null ){
//            if(temporal.nodoNuevo.equals(usuario)){
//                return temporal;
//            }
//  
//            temporal=temporal.nodoSiguiente;
//        }
//        return  null;
//    }
    
//    public String GetNombreUsuario(CNodoUsuario nodoUsuario){
//        CNodoUsuario temporal=nodoNuevo;
//        
//        while(temporal != null ){
//            if(temporal.nombreUsuario.equals(nodoUsuario.GetNombreUsuario(nodoUsuario))){
//                return nombreUsuario;
//            }
//  
//            temporal=temporal.nodoSiguiente;
//        }
//        return  null;
//    }
    
}
