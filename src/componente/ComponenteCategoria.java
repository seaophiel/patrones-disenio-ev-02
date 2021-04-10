package componente;
import java.util.ArrayList;

public class ComponenteCategoria extends ComponenteGrupo
{
    private ArrayList listaRecambios;
    private String nombre;
    private String descripcion;
 
    public ComponenteCategoria(String nombre, String descripcion)
    {
        listaRecambios = new ArrayList();
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
 
    @Override
    public void add(ComponenteGrupo componente)
    {
        listaRecambios.add(componente);
    }
 
    @Override
    public void remove(ComponenteGrupo componente)
    {
        listaRecambios.remove(componente);
    }
 
    @Override
    public ComponenteGrupo getElemento(int indice)
    {
        return (ComponenteGrupo)listaRecambios.get(indice);
    }
    
    @Override
    public String getNombre()
    {
        String nombreCompleto = this.nombre + "\n";
        for (int x = 0; x < listaRecambios.size(); x++){
            ComponenteGrupo rec = (ComponenteGrupo)listaRecambios.get(x);
            //nombreCompleto = nombreCompleto + " " + rec.getNombre();
            nombreCompleto += rec.getNombre() + "\n";
        }

        return nombreCompleto;
    }

    @Override
    public String getDescripcion()
    {
        String descripcionCompleta = this.descripcion + "\n";
        return descripcionCompleta;
    }
    
    @Override
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    @Override
    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }
} 
