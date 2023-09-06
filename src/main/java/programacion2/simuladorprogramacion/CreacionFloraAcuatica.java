package programacion2.simuladorprogramacion;

import java.util.ArrayList;

public class CreacionFloraAcuatica{

    public static ArrayList<FloraAcuatica> generadorFloresAcuaticas() {
        ArrayList<FloraAcuatica> FloresAcuaticas = new ArrayList<>();
        // Flora Acuatica
        //tipoAgua, especie, color, tipo, habitat, tamaño
        FloraAcuatica aurea = new FloraAcuatica("Flotante", "Aurea", "Amarilla", "Utriculari", "Agua", 2);
        FloraAcuatica lirioAcuatico = new FloraAcuatica("Aguas profundas", "Lirio acuatico", "Violeta", "Eichhornia crassipes", "Agua", 30);
        FloraAcuatica cabomba = new FloraAcuatica("Oxigenadora", "Cabomba", "Verde", "Cabombaceae", "Agua", 3);
        FloraAcuatica sagittariaAcuatica = new FloraAcuatica("Ribera", "Sagittaria acuatica", "Blanca", "Alismataceae", "Agua", 20);
        FloraAcuatica anubias = new FloraAcuatica("Ribera", "Anubias", "Verde", "Araceae", "Agua", 13);
        FloraAcuatica elodea = new FloraAcuatica("Oxigenadora", "Elodea", "Verde", "Hydrocharitaceae", "Agua", 2);
        FloraAcuatica vallisneria = new FloraAcuatica("Aguas profundas", "Vallisneria", "Verde", "Hydrocharitaceae", "Agua", 80);
        FloraAcuatica aldrovanda  = new FloraAcuatica("Flotante", "Aldrovanda", "Verde", "Droseraceae", "Agua", 3);
        // agrego las flores acuaticas al arraylist
        FloresAcuaticas.add(aurea);
        FloresAcuaticas.add(lirioAcuatico);
        FloresAcuaticas.add(cabomba);
        FloresAcuaticas.add(sagittariaAcuatica);
        FloresAcuaticas.add(anubias);
        FloresAcuaticas.add(elodea);
        FloresAcuaticas.add(vallisneria);
        FloresAcuaticas.add(aldrovanda );
        return FloresAcuaticas;
    }

}