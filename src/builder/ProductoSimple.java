package builder;

public class ProductoSimple extends ProductoBuilder{

    @Override
    public void esOferta() {
        producto.setEsOferta(false);
    }

    @Override
    public void esSimilar() {
        producto.setEsOferta(false);
    }

    @Override
    public void setPrecioOferta(int precioOferta) {
        producto.setPrecioOferta(0);
    }
    
}
