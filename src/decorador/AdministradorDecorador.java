package decorador;

import entidad.Usuario;
import interfaces.ICuentaUsuario;

public class AdministradorDecorador extends CuentaUsuarioDecorador {
    
    public AdministradorDecorador(ICuentaUsuario cuenta) {
        super(cuenta);
    }
    
    @Override
    public void creaCuentaUsuario(Usuario u){
        cuentaUsuarioDecorada.creaCuentaUsuario(u);
        this.agregarPermisosAdministrativos(u);
    }
    
    public void agregarPermisosAdministrativos(Usuario u){
        System.out.println("Se agregan permisos especiales de administracion");
    }
    
}
