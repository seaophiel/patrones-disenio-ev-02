package builder;
import entidad.Producto;
public class ConstructorProductos {
    private ProductoBuilder productoBuilder;
    
    public void setProductoBuilder(ProductoBuilder pb){
        this.productoBuilder = pb;
    }
    
    public Producto getProducto(){
        return this.productoBuilder.getProducto();
    }
    
    public void construirProducto(){
        productoBuilder.creaProducto();
        productoBuilder.esOferta();
        productoBuilder.esSimilar();
        productoBuilder.setPrecioOferta(0);
    }
    
}
