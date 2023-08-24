package programacion2.simuladorprogramacion;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class SimuladorProgramacion {

    public static void main(String[] args) {
        //scanner
        Scanner teclado = new Scanner(System.in);
        //random
        Random aleatorio = new Random();

        //arraylist de los distintos grupos de animales
        ArrayList<AnimalesAcuaticos> Agua = new ArrayList<>();
        ArrayList<AnimalesAereos> Aire = new ArrayList<>();
        ArrayList<AnimalesTerrestres> Tierra = new ArrayList<>();

        // [GENERACION DE ANIMALES]      
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
        AnimalesAcuaticos nutria = new AnimalesAcuaticos("Pulmones", "Roedor", "Nutria", "Carnivoro", "Marron oscuro", 70);
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
        Agua.add(nutria);

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

        // Animales Terrestres
        AnimalesTerrestres leon = new AnimalesTerrestres("Panthera leo", "Mamifero", "Leon", "Carnivoro", "Amarillo", 200);
        AnimalesTerrestres oso = new AnimalesTerrestres("Ailuropoda melanoleuca", "Mamifero", "Oso", "Omnivoro", "Blanco y negro", 200);
        AnimalesTerrestres lince = new AnimalesTerrestres("Lynx spp", "  Mamifero", "Lince", "Carnivoro", "Manchas y rayas", 120);
        AnimalesTerrestres chimpance = new AnimalesTerrestres("Primate", "Pan troglodytes", "Chimpancé", "Omnivoro", "Negro", 63);
        AnimalesTerrestres guepardo = new AnimalesTerrestres("Mamifero", "Acinonyx jubatus", "Guepardo", "Carnivoro", "Amarillo", 130);
        AnimalesTerrestres puma = new AnimalesTerrestres("Mamifero", "Felino", "Puma", "Carnivoro", "Marron", 230);
        AnimalesTerrestres tapir = new AnimalesTerrestres("Mamifero", "Tapirus terrestris", "Tapir", "Herbivoro", "Gris", 200);
        AnimalesTerrestres marmota = new AnimalesTerrestres("Roedor", "Sciuridae", "Marmota", "Herbivoro", "Marron", 54);
        AnimalesTerrestres suricata = new AnimalesTerrestres("Mamifero", "Suricata suricatta", "Suricata", "Carnivoro", "Marron", 30);
        AnimalesTerrestres coyote = new AnimalesTerrestres("Mamifero", "Canis latrans", "Coyote", "Omnivoro", "Gris", 80);
        AnimalesTerrestres castor = new AnimalesTerrestres("Roedor", "Castor canadensis", "Castor", "Hervivoro", "Marron", 74);
        AnimalesTerrestres zorro = new AnimalesTerrestres("Mamifero", "Vulpes vulpes", "Zorro", "Omnivoro", "Rojizo", 45);
        AnimalesTerrestres koala = new AnimalesTerrestres("Marsupial", "Phascolarctos cinereus", "Koala", "Herbivoros", "Gris", 70);
        AnimalesTerrestres lobo = new AnimalesTerrestres("Mamifero", "Canis lupus", "Lobo", "Carnivoros", "Gris", 150);
        AnimalesTerrestres jirafa = new AnimalesTerrestres("Mamifero", "Giraffa camelopardalis", "Jirafa", "Herbivoro", "Amarillo", 420);
        //agrego los terrestres al arraylist
        Tierra.add(leon);
        Tierra.add(oso);
        Tierra.add(lince);
        Tierra.add(chimpance);
        Tierra.add(guepardo);
        Tierra.add(puma);
        Tierra.add(tapir);
        Tierra.add(marmota);
        Tierra.add(suricata);
        Tierra.add(coyote);
        Tierra.add(castor);
        Tierra.add(zorro);
        Tierra.add(koala);
        Tierra.add(lobo);
        Tierra.add(jirafa);

        // INTRODUCCION AL SIMULADOR
        System.out.println("DESCRIPCION DEL SIMULADOR");

        // opcion de hacia donde mirar
        String opcion, opcionMin;
        opcion = teclado.nextLine();
        // transormo toda la escritura del usuario a miniscula
        opcionMin = opcion.toLowerCase();

        // [APARICION DE LOS ANIMALES DE FORMA ALEATORIA]
        switch (opcionMin) {
            case "abajo":
                // cantidad random de animales acuaticos que apareceran
                int cantidadRandomAgua = aleatorio.nextInt(Agua.size()) + 1;
                // creo un array donde se guardaran los animales avistados
                AnimalesAcuaticos animalesAcuaticosAvistados[];
                animalesAcuaticosAvistados = new AnimalesAcuaticos[cantidadRandomAgua];
                
                // eleccion al azar de animales acuaticos
                for (int i = 0; i < cantidadRandomAgua; i++) {
                    int indiceAleatorioAgua = aleatorio.nextInt(Agua.size());
                    AnimalesAcuaticos animal = Agua.get(indiceAleatorioAgua);
                    // asigno un animal a cada espacio del array
                    animalesAcuaticosAvistados[i] = animal;
                }
                
                System.out.println("Decides mirar al mar que se encuentra debajo de ti, ahí avistas a los siguientes animales");
                for (int i = 0; i < cantidadRandomAgua; i++) {
                    System.out.println("Animal acuatico: " + animalesAcuaticosAvistados[i].getRaza());
                }
                
                break;
            case "arriba":
                //cantidad random de animales aereos que apareceran
                int cantidadRandomAire = aleatorio.nextInt(Aire.size()) + 1;
                // eleccion al azar de animales aereos
                for (int i = 0; i < cantidadRandomAire; i++) {
                    int indiceAleatorioAire = aleatorio.nextInt(Aire.size());
                    AnimalesAereos animal = Aire.get(indiceAleatorioAire);
                    System.out.println("Animal aire: " + animal.raza);
                }
                break;
            case "adelante":
                //cantidad random de animales terrestres que apareceran
                int cantidadRandomTierra = aleatorio.nextInt(Tierra.size()) + 1;
                // eleccion al azar de animales terrestres
                for (int i = 0; i < cantidadRandomTierra; i++) {
                    int indiceAleatorioTierra = aleatorio.nextInt(Tierra.size());
                    AnimalesTerrestres animal = Tierra.get(indiceAleatorioTierra);
                    System.out.println("Animal tierra: " + animal.raza);
                }
                break;
            default:
                System.out.println("Error al escribir, intente de nuevo");
                break;
        }

    }
}
