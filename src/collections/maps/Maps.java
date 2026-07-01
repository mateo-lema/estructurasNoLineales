package collections.maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class Maps {

    public Map<String, Integer> construirHashMap() {
        Map<String, Integer> mapa = new HashMap();
        mapa.put("A", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put("A", 50);
        System.out.println(mapa.size());
        System.out.println(mapa);

        for (int i = 0; i < mapa.size(); i++) {
            System.out.println(mapa.values().toArray()[i]);
        }

        for (String Key : mapa.keySet()) {
            System.out.println(Key);
        }

        System.out.println(mapa.get("A"));
        System.out.println(mapa.get("C"));
        System.out.println(mapa.get("D"));

        mapa.putIfAbsent("F", 100);
        mapa.putIfAbsent("A", 200);
        return mapa;

    }

    public Map<String, Integer> construirLinkedHashMap() {
        Map<String, Integer> mapa = new HashMap();
        mapa.put("A", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put("A", 50);
        System.out.println(mapa.size());
        System.out.println(mapa);
        return mapa;

    }

      public Map<String, Integer> construirTreeHashMap() {
        Map<String, Integer> mapa = new HashMap();
        mapa.put("A", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put("A", 50);
        System.out.println(mapa.size());
        System.out.println(mapa);
        return mapa;

    }

   public Set<Contacto> ordenarUnicos(List<Contacto> contactos){

        //Retornar contactos unicos
        //Unicos -> nombre
        //Ordene segun el apellido de manera descendente

        Set<Contacto> nueva = new TreeSet<>(
            (c1,c2) -> {
                if(c1.getNombre().equals(c2.getNombre())){
                    return 0;
                }
                return c1.getApellido().compareTo(c2.getApellido());

            });

        for(Contacto contacto : contactos){
            nueva.add(contacto);
        }    

        return nueva;
    }

}
