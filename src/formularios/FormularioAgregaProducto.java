package formularios;
import proxies.StockProxy;

public class FormularioAgregaProducto {
    
    public void validaStock(){
        int idProducto = 111;
        StockProxy sp = new StockProxy();
        int stock = sp.obtenStock(idProducto);
        if (stock <= 0){
            System.out.println("No hay Stock.");
        }
        else{
            System.out.println("Hay " + stock + " unidades de producto.");
        }
    }
    
}
