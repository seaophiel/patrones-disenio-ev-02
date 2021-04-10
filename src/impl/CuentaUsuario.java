package impl;

import entidad.Usuario;
import interfaces.ICuentaUsuario;

public class CuentaUsuario implements ICuentaUsuario {

    @Override
    public void creaCuentaUsuario(Usuario usuario) {
        System.out.println("Cuenta usuario creada: " + usuario.idUsuario);
    }
    
}
