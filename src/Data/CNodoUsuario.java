/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class CNodoUsuario {
   
    public CNodoUsuario nodoSiguiente;
    public String nombreUsuario;
    public CListaImagenes ListaImagenes;
    private ArrayList<String> ListaCategorias;
    
    public CNodoUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
        ListaCategorias=new ArrayList<>();
        ListaImagenes=new CListaImagenes();
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

    public CListaImagenes getListaImagenes() {
        return ListaImagenes;
    }

    public void setListaImagenes(CListaImagenes ListaImagenes) {
        this.ListaImagenes = ListaImagenes;
    }
    

    public void eliminarCategoria(String categoria){
        
        for (int i = 0; i < ListaCategorias.size(); i++) {
            if(categoria.equals(ListaCategorias.get(i))){
            ListaCategorias.remove(i);
            }
        }
    }
   
    public boolean GetCategoria(String categoria){
        
        for (int i = 0; i < ListaCategorias.size(); i++) {
            if(categoria.equals(ListaCategorias.get(i))){
                return true;
            }
        }
      return false;
    }
}
