/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author lenovo
 */
public class Data {
    private CListaUsuarios ListaUsuarios;
    
    public Data(){
        ListaUsuarios = new CListaUsuarios();
    }

    public CListaUsuarios getListaUsuarios() {
        return ListaUsuarios;
    }

    public void setListaUsuarios(CListaUsuarios ListaUsuarios) {
        this.ListaUsuarios = ListaUsuarios;
    }
    
 
    
}
