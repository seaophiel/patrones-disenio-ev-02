package formularios;

import prototype.SucursalImpl;

public class FormularioPrototype {
    
    public void ejecutar(){
        SucursalImpl sucursal = new SucursalImpl();
        sucursal.setIdSucursal(1);
        sucursal.setNombreSucursal("Santiago");
        
        SucursalImpl sucursalClonada = (SucursalImpl)sucursal.clonar();
        System.out.println(sucursal.toString());
        System.out.println(sucursalClonada.toString());
        
        if (sucursal == sucursalClonada){
            System.out.println("Error. Apuntan al mismo espacio de memoria");
        }
        else{
            if (sucursal.getIdSucursal() == sucursalClonada.getIdSucursal() && sucursal.getNombreSucursal() == sucursalClonada.getNombreSucursal()){
                System.out.println("Tienen los mismos valores, pero no ocupan el mismo espacio de memoria");
            }
            else{
                System.out.println("Error. Objetos no comparten los mismos valores...");
            }
        }
    }    
}
