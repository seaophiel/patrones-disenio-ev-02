package cursopatrones_01;

import formularios.FormularioAgregaProducto;
import formularios.FormularioBuscaProducto;
import formularios.FormularioListaCategorias;
import formularios.FormularioLogin;
import formularios.FormularioObserver;
import formularios.FormularioPagar;
import formularios.FormularioPrototype;

public class CursoPatrones_01 {
    
    public static void main(String[] args) {
        System.out.println("Ejecutando punto 1 con patron decorador");
        FormularioLogin formLogin = new FormularioLogin();
        formLogin.doLogin();
        
        System.out.println("Ejecutando punto 2 con patron fachada");
        FormularioBuscaProducto formBuscar = new FormularioBuscaProducto();
        formBuscar.preciosCompetencia();
        
        
        
        System.out.println("Ejecutando punto 3 con patrones iterador y builder");
        FormularioPagar formPagar = new FormularioPagar();
        formPagar.pagar();
        
        System.out.println("Ejecutando punto 4 con patrones proxy");
        FormularioAgregaProducto formStock = new FormularioAgregaProducto();
        formStock.validaStock();
        
        System.out.println("Ejecutando punto 5 con patron composite");
        FormularioListaCategorias formCategorias = new FormularioListaCategorias();
        formCategorias.listar();
        
        System.out.println("Ejecutando punto 6 con patron observer");
        FormularioObserver formObs = new FormularioObserver();
        formObs.ejecutar();
        
        System.out.println("Ejecutando punto 7 con patron prototype");
        FormularioPrototype formProto = new FormularioPrototype();
        formProto.ejecutar();
        
       
        
        /*
        System.out.println("Ejecutando formulario de agregar productos");
        FormularioPagar formPagar = new FormularioPagar();
        formPagar.ConsultaStock();
        */
        
        
    }
    
}
