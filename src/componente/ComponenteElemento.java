package componente;

public class ComponenteElemento extends ComponenteGrupo
{
    private String nombre;
    private String descripcion;
    
    public ComponenteElemento(String nombre, String descripcion)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    @Override
    public String getNombre()
    {
        return nombre;
    }
 
    @Override
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
 
    @Override
    public String getDescripcion()
    {
        return descripcion;
    }
 
    @Override
    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }
}
