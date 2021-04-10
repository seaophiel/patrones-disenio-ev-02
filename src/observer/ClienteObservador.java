package observer;
public class ClienteObservador extends Observador {
    
    public ClienteObservador(SujetoCompra sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }

    @Override
    public void actualizar() {
        System.out.println("(Cliente) El estado de la compra ha cambiado a -> " + this.sujeto.getEstadoCompra());
    }
    
}
