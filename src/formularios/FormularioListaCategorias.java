package formularios;


import component.CategoriaGrupo;
import component.CategoriaGrupo;
import component.CategoriasManager;
import componente.ComponenteGrupo;
import componente.ComponenteElemento;
import componente.ComponenteCategoria;

public class FormularioListaCategorias {
    
    public void listar(){
        
        ComponenteGrupo almacenamiento = new ComponenteCategoria("Almacenamiento", "");
        ComponenteGrupo ssd = new ComponenteCategoria("Memorias SSD", "");
        ComponenteGrupo ssd_1 = new ComponenteElemento("SSD 1 120 GB", "");
        ComponenteGrupo ssd_2 = new ComponenteElemento("SSD 2 250 GB", "");
        ssd.add(ssd_1);
        ssd.add(ssd_2);
        ComponenteGrupo discosSata = new ComponenteCategoria("Discos SATA", "");
        ComponenteGrupo sata_1 = new ComponenteElemento("SATA 1 TB", "");
        discosSata.add(sata_1);
        almacenamiento.add(ssd);
        almacenamiento.add(discosSata);
        
        ComponenteGrupo monitores = new ComponenteCategoria("Monitores", "");
        ComponenteGrupo lcd = new ComponenteCategoria("LCD", "");
        ComponenteGrupo lcd_1 = new ComponenteElemento("Monitor lcd 21 pulgadas", "");
        ComponenteGrupo lcd_2 = new ComponenteElemento("Monitor lcd 24 pulgadas", "");
        ComponenteGrupo plasma = new ComponenteCategoria("Plasma", "");
        ComponenteGrupo plasma_1 = new ComponenteElemento("Monitor plasma 22 pulgadas", "");
        lcd.add(lcd_1);
        lcd.add(lcd_2);
        plasma.add(plasma_1);
        monitores.add(lcd);
        monitores.add(plasma);
        
        ComponenteGrupo teclados = new ComponenteCategoria("Teclados", "");
        ComponenteGrupo gamer = new ComponenteCategoria("Gamer", "");
        ComponenteGrupo teclado_1 = new ComponenteElemento("Teclado master keys", "");
        gamer.add(teclado_1);
        teclados.add(gamer);
        
        ComponenteGrupo todos = new ComponenteCategoria("Todos", "");
        todos.add(almacenamiento);
        todos.add(monitores);
        todos.add(teclados);
        
        System.out.println(todos.getNombre());
    }
    
}
