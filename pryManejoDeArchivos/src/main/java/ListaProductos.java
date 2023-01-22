/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cardo
 */
import java.util.LinkedList;

/**
 *
 * @author "el profe Ariel"
 */
public class ListaProductos {
    private LinkedList<Producto> productos;

    public ListaProductos() {
        productos=new LinkedList();
    }
    
    public void agregar(Producto a){
        productos.add(a);
    }
    
    public void eliminar(int indice){
        productos.remove(indice);
    }           
    
    public int total(){
        return productos.size();
    }
    
    public Producto obtener(int indice){
        return productos.get(indice);
    }
    
    public void cargarProductos(){
        productos.add(new Producto("100","gansito","pastelito",15,100));
        productos.add(new Producto("200","pinguino","pastelito",20,200));
        productos.add(new Producto("300","sabritas","pastelito",17,300));
        productos.add(new Producto("400","frijol","pastelito",33,150));
        productos.add(new Producto("500","azucar","pastelito",20,250));
    }

}
