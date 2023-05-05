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
    public CListaUsuarios ListaUsuarios;
    public CListaImagenes ListaImagenes;
    
    public Data(){
        ListaUsuarios = new CListaUsuarios();
        ListaImagenes = new CListaImagenes();
    }

    public CListaUsuarios getListaUsuarios() {
        return ListaUsuarios;
    }

    public void setListaUsuarios(CListaUsuarios ListaUsuarios) {
        this.ListaUsuarios = ListaUsuarios;
    }

    public CListaImagenes getListaImagenes() {
        return ListaImagenes;
    }

    public void setListaImagenes(CListaImagenes ListaImagenes) {
        this.ListaImagenes = ListaImagenes;
    }    
}
