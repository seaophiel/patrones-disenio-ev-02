package observer;
public class EmpresaTransporteObservador extends Observador {
    
    public EmpresaTransporteObservador(SujetoCompra sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }

    @Override
    public void actualizar() {
        System.out.println("(Empresa Transporte) El estado de la compra ha cambiado a -> " + this.sujeto.getEstadoCompra());
    }
    
}
