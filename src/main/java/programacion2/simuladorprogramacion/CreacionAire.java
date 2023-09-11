
package programacion2.simuladorprogramacion;

import java.util.ArrayList;

public class CreacionAire {
    
    public static ArrayList<AnimalesAereos> generadorAire() {
        ArrayList<AnimalesAereos> Aire = new ArrayList<>();
        // Animales Aereos
        AnimalesAereos cardenal = new AnimalesAereos(25, 2, "Ave", "Cardenal", "Omnivoro", "Rojo", 22);
        AnimalesAereos paloma = new AnimalesAereos(28, 3, "Ave", "Paloma", "Omnivoro", "Azul grisaseo", 27);
        AnimalesAereos condor = new AnimalesAereos(300, 10, "Ave", "Condor", "Caroñero", "Blaco negro", 130);
        AnimalesAereos tucan = new AnimalesAereos(70, 20, "Ave", "Tucan", "Omnivora", "Negro", 65);
        AnimalesAereos buho = new AnimalesAereos(70, 4, "Ave", "Buho", "Rapiñas", "Marron", 62);
        AnimalesAereos aguila = new AnimalesAereos(100, 8, "Ave", "Aguila", "Carnivoro", "Blanco y marron", 80);
        AnimalesAereos loro = new AnimalesAereos(40, 5, "Ave", "Loro", "Omnivoro", "Verde", 35);
        AnimalesAereos colibri = new AnimalesAereos(10, 3, "Ave", "Colibri", "Nectar", "Morado", 7);
        AnimalesAereos cacatua = new AnimalesAereos(70, 6, "Ave", "Cacatua", "Omnivoro", "Blanco", 60);
        AnimalesAereos canario = new AnimalesAereos(10, 2, "Ave", "Canario", "Omnivoro", "Amarillo", 11);
        // agrego los aereos al arraylist
        Aire.add(cardenal);
        Aire.add(paloma);
        Aire.add(condor);
        Aire.add(tucan);
        Aire.add(buho);
        Aire.add(aguila);
        Aire.add(loro);
        Aire.add(colibri);
        Aire.add(cacatua);
        Aire.add(canario);
        return Aire;
    }
}
