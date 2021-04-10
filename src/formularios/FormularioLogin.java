package formularios;

import decorador.AdministradorDecorador;
import decorador.CuentaUsuarioDecorador;
import decorador.UsuarioWebDecorador;
import entidad.Usuario;
import impl.CuentaAdministrador;
import impl.CuentaUsuario;

public class FormularioLogin {
    
    public void doLogin(){
        
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(1);
        usuario.setNombre("Sebastian");
        usuario.setApellidoPaterno("Hermosilla");
        usuario.setApellidoMaterno("Ordenes");
        usuario.setEmail("sebastian1981@gmail.com");
        usuario.setPassword("111222333");
        usuario.setDireccion("Alameda 332, santiago.");
        
        System.out.println("Usuario " + usuario.getNombre() + " sera decorado como administrador...");
        
        CuentaAdministrador cuentaAdmin = new CuentaAdministrador();
        cuentaAdmin.creaCuentaUsuario(usuario);
        
        System.out.println("Usuario " + usuario.getNombre() + " sera decorado como usuario web...");
        CuentaUsuario cuentaUser = new CuentaUsuario();
        cuentaUser.creaCuentaUsuario(usuario);
    }
    
}
