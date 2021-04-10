package component;

public class CategoriasManager {
    CategoriaGrupo listaCategorias;
    
    public CategoriasManager(CategoriaGrupo nuevaListaCategorias){
        listaCategorias = nuevaListaCategorias;
    }
    
    public void getListaCategorias(){
        listaCategorias.muestraInformacionCategoria();
    }
    
    
}
