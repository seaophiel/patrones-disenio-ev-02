package component;

import java.util.ArrayList;
import java.util.Iterator;

public class CategoriaGrupo extends CategoriaComponente {
    ArrayList categoriaComponentes = new ArrayList();

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
    
    int idCategoria;
    String nombreCategoria;
    
    public CategoriaGrupo(int nuevoIdCategoria, String nuevoNombreCategoria){
        this.idCategoria = nuevoIdCategoria;
        this.nombreCategoria = nuevoNombreCategoria;
    }
    
    @Override
    public void add(CategoriaComponente nuevaCategoriaComponente){
        categoriaComponentes.add(nuevaCategoriaComponente);
    }
    
    @Override
    public void remove(CategoriaComponente nuevaCategoriaComponente){
        categoriaComponentes.remove(nuevaCategoriaComponente);
    }
    
    public CategoriaComponente getComponente(int index){
        return (CategoriaComponente) categoriaComponentes.get(index);
    }
    
    @Override
    public void muestraInformacionCategoria(){
        System.out.println(getIdCategoria()+ " " + getNombreCategoria() + "\n");
        
        Iterator iteradorCategorias = categoriaComponentes.iterator();
        while (iteradorCategorias.hasNext()){
            CategoriaGrupo cat = (CategoriaGrupo) iteradorCategorias.next();
            cat.muestraInformacionCategoria();
        }
    }
}
