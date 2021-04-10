package proxies;
import apis_externas.WsStockLegacy;
import interfaces.IStock;
public class StockProxy implements IStock {
    private WsStockLegacy wsStock;

    @Override
    public int obtenStock(int idProducto) {
        if (wsStock == null){
            wsStock = new WsStockLegacy();
            return wsStock.obtenStock(idProducto);
        }
        else{
            return wsStock.obtenStock(idProducto);
        }
    }
}
