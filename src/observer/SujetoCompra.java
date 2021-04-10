package observer;

import java.util.ArrayList;
import java.util.List;

public class SujetoCompra {
    
    private List<Observador> observadores = new ArrayList<Observador>();

    public String getEstadoCompra() {
        return estadoCompra;
    }

    public void setEstadoCompra(String estadoCompra) {
        this.estadoCompra = estadoCompra;
        notificar();
    }
    
    private String estadoCompra;
    
    public void agregar(Observador observador){
        observadores.add(observador);
    }
    
    public void notificar(){
        for (Observador observador : observadores){
            observador.actualizar();
        }
    }
    
}
