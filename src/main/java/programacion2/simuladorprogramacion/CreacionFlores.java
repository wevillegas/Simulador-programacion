package programacion2.simuladorprogramacion;

import java.util.ArrayList;


public class CreacionFlores {
    
    public static ArrayList<Flores> generadorFlores() {
        ArrayList<Flores> Flores = new ArrayList<>();
        // Animales Acuaticos
        Flores rosa = new Flores("Ovalados", "Rosa", "Rojo", "Rosaceae", "Jardines", 10);
        Flores girasol = new Flores("Forma de disco", "Girasol", "Amarillo y marron", "Helianthus annuus", "Suelos fertiles", 10);
        Flores tulipan = new Flores("Puntiagudos", "Tulipan", "Blanco", "Tulipa", "Suelos secos", 10);
        Flores margarita = new Flores("Alargados", "Margarita", "Rosa", "Bellis perennis", "Campos", 5);
        Flores lirio = new Flores("Forma de trompeta", "Lirio", "Purpura", "Lilim", "Diverso", 20);
        Flores orquidea = new Flores("Formas variadas", "Orquidea", "Naranja", "Orchidaceae", "Varia segun especie", 15);
        Flores amapola = new Flores("Grandes y vistosos", "Amapola", "Rojo", "Papaver", "Campos", 6);
        Flores clavel = new Flores("Dentados", "Clavel", "Amarillo", "Dianthus", "Jardines", 6);
        Flores narciso = new Flores("Forman una corona", "Narciso", "Blanco", "Narcissus", "Suelo fertil", 12);
        Flores dalia = new Flores("Varian segun el tipo", "Dalia", "Lavanda", "Dahlia", "Jardines", 30);
        // agrego los acuaticos al arraylist
        Flores.add(rosa);
        Flores.add(girasol);
        Flores.add(tulipan);
        Flores.add(margarita);
        Flores.add(lirio);
        Flores.add(orquidea);
        Flores.add(amapola);
        Flores.add(clavel);
        Flores.add(narciso);
        Flores.add(dalia);
        return Flores;
    }

}
