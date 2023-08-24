package programacion2.simuladorprogramacion;

import java.util.ArrayList;

public class CreacionAgua {

    public static ArrayList<AnimalesAcuaticos> generadorAgua() {
        ArrayList<AnimalesAcuaticos> Agua = new ArrayList<>();
        // Animales Acuaticos
        AnimalesAcuaticos mantarraya = new AnimalesAcuaticos("Branquias", "Mantarraya", "Raya pinta", "Omnivora", "Gris y blanco", 120);
        AnimalesAcuaticos pezGlobo = new AnimalesAcuaticos("Branquias", "Pez", "Pez Globo", "Carnivora", "Amarillo", 30);
        AnimalesAcuaticos tiburonMartillo = new AnimalesAcuaticos("Branquias", "Tiburon", "Tiburon martillo", "Carnivoro", "Gris oscuro", 300);
        AnimalesAcuaticos delfin = new AnimalesAcuaticos("Pulmones", "Cetaceo", "Delfin", "Carnivoro", "Azul claro", 200);
        AnimalesAcuaticos estrellaDeMar = new AnimalesAcuaticos("Pápulas", "Asteroideos", "Estrella de mar", "Carnivoro", "Rosa", 10);
        AnimalesAcuaticos pezPayaso = new AnimalesAcuaticos("Branquias", "Pez", "Pez payaso", "Omnivoro", "Naranja y blanco", 11);
        AnimalesAcuaticos calamar = new AnimalesAcuaticos("Branquias", "Molusco", "Calamar", "Carnivoro", "Rosa", 11);
        AnimalesAcuaticos beluga = new AnimalesAcuaticos("Pulmones", "Ballena", "Beluga", "Carnivoro", "Blanco", 420);
        AnimalesAcuaticos loboMarino = new AnimalesAcuaticos("Pulmones", "Mamifero", "Lobo marino", "Carnivoro", "Negro", 210);
        AnimalesAcuaticos besugo = new AnimalesAcuaticos("Branquias", "Pez", "Besugo", "Omnivoro", "Azul celeste", 41);
        // agrego los acuaticos al arraylist
        Agua.add(mantarraya);
        Agua.add(pezGlobo);
        Agua.add(tiburonMartillo);
        Agua.add(delfin);
        Agua.add(estrellaDeMar);
        Agua.add(pezPayaso);
        Agua.add(calamar);
        Agua.add(beluga);
        Agua.add(loboMarino);
        Agua.add(besugo);
        return Agua;
    }

}
