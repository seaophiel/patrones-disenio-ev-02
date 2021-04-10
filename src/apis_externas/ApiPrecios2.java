package apis_externas;
import interfaces.IApiExterna;

public class ApiPrecios2 implements IApiExterna {    
    @Override
    public int buscaPrecio(String nombreProducto, int codigoProducto){
        //Esta API busca por codigo y retorna 4200
        return 42000; 
    }
}
