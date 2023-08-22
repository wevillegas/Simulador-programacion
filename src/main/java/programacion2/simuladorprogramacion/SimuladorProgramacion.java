package programacion2.simuladorprogramacion;
import java.util.Scanner;
import java.util.Random;


public class SimuladorProgramacion {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int N = aleatorio.nextInt();
        
        // GENERACION DE ANIMALES
        // Animales Acuaticos
        AnimalesAcuaticos mantarraya = new AnimalesAcuaticos("Branquias", "Mantarraya", "Raya pinta", "Omnivora", "Gris y blanco", 120);
        AnimalesAcuaticos pezGlobo = new AnimalesAcuaticos("Branquias", "Pez", "Pez Globo", "Carnivora", "Amarillo", 30);
        AnimalesAcuaticos tiburonMartillo = new AnimalesAcuaticos("Branquias", "Tiburon", "Tiburon martillo", "Carnivoro", "Gris oscuro", 300);
        AnimalesAcuaticos delfin = new AnimalesAcuaticos("Pulmones", "Cetaceo", "Delfin", "Carnivoro", "Azul claro", 200);
        AnimalesAcuaticos estrellaDeMar = new AnimalesAcuaticos("Pápulas", "Asteroideos", "Estrella de mar", "Carnivoro", "Rosa", 10);
        AnimalesAcuaticos pezPayaso = new AnimalesAcuaticos("Branquias", "Pez", "Pez payaso", "Omnivora", "Naranja y blanco", 11);
        AnimalesAcuaticos calamar = new AnimalesAcuaticos("Branquias", "Molusco", "Calamar", "Carnivoro", "Rosa", 11);
        AnimalesAcuaticos beluga = new AnimalesAcuaticos("Pulmones", "Ballena", "Beluga", "Carnivora", "Blanco", 420);



    }
}
