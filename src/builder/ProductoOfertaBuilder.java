package builder;
public class ProductoOfertaBuilder extends ProductoBuilder{

    @Override
    public void esOferta() {
        producto.setEsOferta(true);
    }

    @Override
    public void esSimilar() {
        producto.setEsOferta(false);
    }

    @Override
    public void setPrecioOferta(int precioOferta) {
        producto.setPrecioOferta(precioOferta);
    }    
}
