package impl;

import entidad.Usuario;
import interfaces.ICuentaUsuario;

public class CuentaAdministrador implements ICuentaUsuario
{

    @Override
    public void creaCuentaUsuario(Usuario usuario) {
        System.out.println("Cuenta administrador creada: " + usuario.idUsuario);
    }
    
}
