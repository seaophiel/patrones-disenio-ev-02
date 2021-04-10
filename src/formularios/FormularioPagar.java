package formularios;
import builder.ConstructorProductos;
import builder.ProductoOfertaBuilder;
import builder.ProductoSimilarBuilder;
import container.ProductosContainer;
import entidad.Producto;
import interfaces.IIterator;
import java.util.ArrayList;
import java.util.List;

public class FormularioPagar {
    
    public void pagar(){
        System.out.println("Utilizando patron iterador para recorrer los productos...");
        ProductosContainer contenedorProductos = new ProductosContainer();
        List<Producto> productos = new ArrayList<>();
        
        Producto prod1 = new Producto();
        prod1.setIdProducto(1);
        prod1.setNombreCategoria("Producto 1");
        
        Producto prod2 = new Producto();
        prod2.setIdProducto(2);
        prod2.setNombreCategoria("Producto 2");
        
        productos.add(prod1);
        productos.add(prod2);
        
        IIterator iteradorProductos = contenedorProductos.creaIterador(productos);
        
        boolean tieneOferta = true;
        boolean tieneSimilar = true;
        int precioOferta = 990;
        while(iteradorProductos.tieneSiguiente()){
            Producto p = (Producto) iteradorProductos.siguiente();
            //Aca logica de buscar oferta o producto similar
            //Se busca en BD si el producto tiene oferta y en caso que si se crea
            //una oferta mediante el patron builder
            ConstructorProductos consProd = new ConstructorProductos();
            
            if (tieneOferta){
                ProductoOfertaBuilder pob = new ProductoOfertaBuilder();
                consProd.setProductoBuilder(pob);
                consProd.construirProducto();
                Producto productoOferta = consProd.getProducto();
                productoOferta.setPrecio(precioOferta);
                System.out.println("se agrega oferta mediante patron builder...");
            }
            
            if (tieneSimilar){
                ProductoSimilarBuilder psb = new ProductoSimilarBuilder();
                consProd.setProductoBuilder(psb);
                consProd.construirProducto();
                Producto productoSimilar = consProd.getProducto(); 
                System.out.println("se agrega producto similar mediante patron builder...");
            }
            
            //Tanto los objetos productoOferta y productoSimilar deberan agregarse a un listado
            //aparte para que el usuario pueda elegir si los agrega o no al listado
            
            
        }
        
    }
    
}
