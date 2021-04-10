package component;

public abstract class CategoriaComponente {
    public void  add(CategoriaComponente nuevaCategoria){
        throw new UnsupportedOperationException("oh noes");
    }
    
    public void  remove(CategoriaComponente nuevaCategoria){
        throw new UnsupportedOperationException();
    }
    
    public CategoriaComponente getComponent(int componentIndex){
        throw new UnsupportedOperationException();
    }
    
    public String getNombreCategoria(){
        throw new UnsupportedOperationException();
    }
    
    public void muestraInformacionCategoria(){
        //System.out.println("");
        throw new UnsupportedOperationException();
    }
}
