
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



/**
 *
 * @author cardo
 */
public class PryManejoDeArchivos {

    public static void main(String[] args) {
        BDProductos bd=new BDProductos();
        bd.borrar();
        Producto p = new Producto("100","arroz","hecho en México",14,2);
        bd.registrarProducto(p);
        LinkedList<Producto> lista=bd.obtener();
        System.out.println(lista.get(0));
    }
}
