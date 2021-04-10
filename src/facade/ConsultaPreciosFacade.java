package facade;
import apis_externas.ApiPrecios1;
import apis_externas.ApiPrecios2;
import java.util.ArrayList;
import java.util.List;

public class ConsultaPreciosFacade {
    private final ApiPrecios1 api1;
    private final ApiPrecios2 api2;
    
    public ConsultaPreciosFacade(){
        api1 = new ApiPrecios1();
        api2 = new ApiPrecios2();
    }
    
    public List<Integer> obtenPreciosCompetencia(String nombeProducto, int codigoProducto){
        //Consulto todas las api y retorno listado con los precios
        List<Integer> precios = new ArrayList<>();
        precios.add(api1.buscaPrecio(nombeProducto, codigoProducto));
        precios.add(api2.buscaPrecio(nombeProducto, codigoProducto));
        return precios;
    }
}
