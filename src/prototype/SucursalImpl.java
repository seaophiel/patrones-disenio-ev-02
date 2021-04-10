package prototype;

public class SucursalImpl implements ISucursal {

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    private String nombreSucursal;
    private int idSucursal;
    
    @Override
    public ISucursal clonar() {
        SucursalImpl sucursal = null;
        
        try{
            sucursal = (SucursalImpl) clone();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        
        System.out.println("Se clono la sucursal");
        return sucursal;
    }
    
    @Override
    public String toString(){
        return "Nombre sucursal: " + this.nombreSucursal + ", Id sucursal: " + this.idSucursal;
    }    
}
