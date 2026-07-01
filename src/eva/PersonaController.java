package eva;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class PersonaController {

   public Set<Persona> filtrarYOrdenar(List<Persona> personas, int edadUmbral){
    Set<Persona> personasFiltradas = new TreeSet<>(
        (p1, p2) -> {
            int compararEdad = Integer.compare(p2.getEdad(), p1.getEdad());
            if (compararEdad != 0) {
                return 0;
            }
            return p1.getNombre().compareToIgnoreCase(p2.getNombre());
        }
    );

    for (Persona p : personas) {
        if (p.getEdad() >= edadUmbral) {
            personasFiltradas.add(p);
        }
    }

    return personasFiltradas;
}

    public Map<String,Set<String>> agruparPorEdad(List<Persona> personas){
        String nombre= "Juan Perez";
        nombre.split(" ");
        String [] palabras=nombre.split(" ");
        String primerNombre=palabras[0];

        return null;

        
    }
    
}
