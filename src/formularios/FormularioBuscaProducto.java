package formularios;

import facade.ConsultaPreciosFacade;
import java.util.List;

public class FormularioBuscaProducto {
    
    public void preciosCompetencia(){
        ConsultaPreciosFacade preciosFacade = new ConsultaPreciosFacade();
        List<Integer> precios = preciosFacade.obtenPreciosCompetencia("Disco SSD 120 GB", 992323);
        precios.forEach((precio) -> {
            System.out.println("Precio competencia: " + precio);
        });
    }
    
}
