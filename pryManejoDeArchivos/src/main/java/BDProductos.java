
import java.util.LinkedList;
import java.util.StringTokenizer;
public class BDProductos {

    public LinkedList<Producto> obtener(){
        LinkedList<Producto> productos=null;
        Archivo archivo=new Archivo("productos.txt");
        LinkedList<String> lineas=archivo.obtenerTextoDelArchivo();
        if(lineas!=null){
            productos=new LinkedList();
            for(int i=0;i<lineas.size();i++){
                String linea=lineas.get(i);
                StringTokenizer tokens=new StringTokenizer(linea,";");
                String codigo=tokens.nextToken();
                String nombre=tokens.nextToken();
                String descripcion=tokens.nextToken();
                float precio=Float.parseFloat(tokens.nextToken());
                int existencias=Integer.parseInt(tokens.nextToken());                
                productos.add(new Producto(codigo,nombre,descripcion, precio, existencias));
            }
        }
        return productos;
    }
    
    public boolean registrarProducto(Producto p){
        Archivo archivo=new Archivo("productos.txt");
        return archivo.registrar(p.getCodigo() + ";"
                    + p.getNombre() + ";"
                    + p.getDescripcion() + ";"
                    + p.getPrecio() + ";" + p.getExistencias());
    }
    public void borrar(){
        Archivo archivo=new Archivo("productos.txt");
        archivo.borrarContenido();
        
    }
    
}
