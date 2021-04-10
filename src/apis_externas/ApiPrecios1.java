package apis_externas;
import interfaces.IApiExterna;

public class ApiPrecios1 implements IApiExterna {    
    @Override
    public int buscaPrecio(String nombreProducto, int codigoProducto){
        //Esta API busca por nombre y retorna 3500
        return 35000; 
    }
}
