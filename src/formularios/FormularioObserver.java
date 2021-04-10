package formularios;

import observer.ClienteObservador;
import observer.EmpresaTransporteObservador;
import observer.SujetoCompra;

public class FormularioObserver {
    
    public void ejecutar(){
        
        SujetoCompra compraEnSistema = new SujetoCompra();
        compraEnSistema.setEstadoCompra("Pendiente");
        ClienteObservador cliente = new ClienteObservador(compraEnSistema);
        EmpresaTransporteObservador empresaTransporte = new EmpresaTransporteObservador(compraEnSistema);
        
        compraEnSistema.setEstadoCompra("En reparto");
        compraEnSistema.setEstadoCompra("Entregado");
    }
    
}
