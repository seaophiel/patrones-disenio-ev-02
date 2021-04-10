package container;
import entidad.Producto;
import interfaces.IContainer;
import interfaces.IIterator;
import java.util.ArrayList;
import java.util.List;
public class ProductosContainer implements IContainer  {    
    private List<Producto> listaProductos = new ArrayList();
   
    @Override
    public IIterator creaIterador(List<Producto> productos) {
        ProductosIterator resultado = new ProductosIterator();
        listaProductos = productos;
        return resultado;
    }
    
    private class ProductosIterator implements IIterator{        
        private int pos = 0;
        @Override
        public boolean tieneSiguiente() {
            return listaProductos.size() > pos;
        }

        @Override
        public Object siguiente() {
            if (this.tieneSiguiente())
            {
                Producto p = listaProductos.get(pos);
                pos++;
                return p;
            }
            else
            {
                return null;
            }
        }

        @Override
        public void agregar(Object o) {
            Producto p = (Producto)o;
            listaProductos.add(p);
        }
    }
}
