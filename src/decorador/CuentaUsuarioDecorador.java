package decorador;

import entidad.Usuario;
import interfaces.ICuentaUsuario;

public abstract class CuentaUsuarioDecorador implements ICuentaUsuario {
    
    protected ICuentaUsuario cuentaUsuarioDecorada;
    
    public CuentaUsuarioDecorador(ICuentaUsuario cuenta){
        cuentaUsuarioDecorada = cuenta;
    }
    
    @Override
    public void creaCuentaUsuario(Usuario usr){
        this.cuentaUsuarioDecorada.creaCuentaUsuario(usr);
    }
    
}
