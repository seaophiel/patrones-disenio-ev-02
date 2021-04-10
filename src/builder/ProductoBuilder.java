package builder;
import entidad.Producto;
//Abstract Builder
public abstract class ProductoBuilder {
    protected Producto producto;
    
    public Producto getProducto(){
        return producto;
    }
    
    public void creaProducto(){
        producto = new Producto();
    }
    
    public abstract void esOferta();
    public abstract void esSimilar();
    public abstract void setPrecioOferta(int precioOferta);
}
