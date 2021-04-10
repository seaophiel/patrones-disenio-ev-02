package component;
public class Categoria_ extends CategoriaComponente {

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
    private int idCategoria;
    private String nombreCategoria;
    
    public Categoria_(int nuevoIdCategoria, String nuevoNombreCategoria){
        this.idCategoria = nuevoIdCategoria;
        this.nombreCategoria = nuevoNombreCategoria;
    }
    
    public void muestraInformacionCategoria(){
        System.out.println(getIdCategoria()+ " " + getNombreCategoria() + "\n");
    }
    
    
}
