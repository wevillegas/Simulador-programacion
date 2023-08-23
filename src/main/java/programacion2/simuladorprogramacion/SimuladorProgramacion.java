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
        ArrayList <AnimalesAcuaticos> Agua = new ArrayList<AnimalesAcuaticos>();
        ArrayList <AnimalesAereos> Aire = new ArrayList<AnimalesAereos>();
        ArrayList <AnimalesTerrestres> Tierra = new ArrayList<AnimalesTerrestres>();
        
        
        
        // [GENERACION DE ANIMALES]
        
        // Animales Acuaticos
        AnimalesAcuaticos mantarraya = new AnimalesAcuaticos("Branquias", "Mantarraya", "Raya pinta", "Omnivora", "Gris y blanco", 120);
        AnimalesAcuaticos pezGlobo = new AnimalesAcuaticos("Branquias", "Pez", "Pez Globo", "Carnivora", "Amarillo", 30);
        AnimalesAcuaticos tiburonMartillo = new AnimalesAcuaticos("Branquias", "Tiburon", "Tiburon martillo", "Carnivoro", "Gris oscuro", 300);
        AnimalesAcuaticos delfin = new AnimalesAcuaticos("Pulmones", "Cetaceo", "Delfin", "Carnivoro", "Azul claro", 200);
        AnimalesAcuaticos estrellaDeMar = new AnimalesAcuaticos("Pápulas", "Asteroideos", "Estrella de mar", "Carnivoro", "Rosa", 10);
        AnimalesAcuaticos pezPayaso = new AnimalesAcuaticos("Branquias", "Pez", "Pez payaso", "Omnivora", "Naranja y blanco", 11);
        AnimalesAcuaticos calamar = new AnimalesAcuaticos("Branquias", "Molusco", "Calamar", "Carnivoro", "Rosa", 11);
        AnimalesAcuaticos beluga = new AnimalesAcuaticos("Pulmones", "Ballena", "Beluga", "Carnivora", "Blanco", 420);
        // agrego los acuaticos al arraylist
        Agua.add(mantarraya);
        Agua.add(pezGlobo);
        Agua.add(tiburonMartillo);
        Agua.add(delfin );
        Agua.add(estrellaDeMar);
        Agua.add(pezPayaso);
        Agua.add(calamar);
        Agua.add(beluga);

        // Animales Aereos (ejemplos solamente, despues se pueden borrar)
        AnimalesAereos pajaro = new AnimalesAereos(10, 10, "ave", "pajarraco", "omnivoro", "marron", 10);
        // agrego los aereos al arraylist
        Aire.add(pajaro);
        
        
        // Animales Terrestres (ejemplos solamente, despues se pueden borrar)
        AnimalesTerrestres leon = new AnimalesTerrestres("Panthera leo", "mamifero", "leon africano", "carnivoro", "amarillo", 200);
        //agrego los terrestres al arraylist
        Tierra.add(leon);
        
        
        // APARICION DE LOS ANIMALES DE FORMA ALEATORIA
        
        // cantidad random de animales acuaticos que apareceran
       int cantidadRandomAgua = aleatorio.nextInt(Agua.size()) + 1;
       // eleccion al azar de animales acuaticos
       for (int i = 0; i < cantidadRandomAgua; i++) {
            int indiceAleatorioAgua = aleatorio.nextInt(Agua.size());
            AnimalesAcuaticos animal = Agua.get(indiceAleatorioAgua);
            System.out.println("Animal agua: " + animal.raza); 
        }
       
       //cantidad random de animales aereos que apareceran
       int cantidadRandomAire = aleatorio.nextInt(Aire.size()) + 1;
       // eleccion al azar de animales aereos
       for (int i = 0; i < cantidadRandomAire; i++) {
            int indiceAleatorioAire = aleatorio.nextInt(Aire.size());
            AnimalesAereos animal = Aire.get(indiceAleatorioAire);
            System.out.println("Animal aire: " + animal.raza); 
        }
        
       //cantidad random de animales terrestres que apareceran
       int cantidadRandomTierra = aleatorio.nextInt(Tierra.size()) + 1;
       // eleccion al azar de animales terrestres
       for (int i = 0; i < cantidadRandomTierra; i++) {
            int indiceAleatorioTierra = aleatorio.nextInt(Tierra.size());
            AnimalesTerrestres animal = Tierra.get(indiceAleatorioTierra);
            System.out.println("Animal tierra: " + animal.raza); 
        }
       
    

    }
}
