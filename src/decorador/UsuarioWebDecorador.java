package decorador;

import entidad.Usuario;
import interfaces.ICuentaUsuario;

public class UsuarioWebDecorador extends CuentaUsuarioDecorador {
    
    public UsuarioWebDecorador(ICuentaUsuario cuenta) {
        super(cuenta);
    }
    
    @Override
    public void creaCuentaUsuario(Usuario u){
        cuentaUsuarioDecorada.creaCuentaUsuario(u);
    }
    
}
