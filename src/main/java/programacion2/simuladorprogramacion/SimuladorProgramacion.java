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

        // Arraylist de los animales
        ArrayList<AnimalesAcuaticos> Agua = CreacionAgua.generadorAgua();
        ArrayList<AnimalesAereos> Aire = CreacionAire.generadorAire();
        ArrayList<AnimalesTerrestres> Tierra = CreacionTierra.generadorTierra();

        // INTRODUCCION AL SIMULADOR]
        System.out.println("DESCRIPCION DEL SIMULADOR");

        // [FILTRO DE PALABRAS INCORRECTAS]
        //genero un booleano como bandera para que al ingresar una palabra legal ejecute el codigo
        boolean entradaValida = false;
        // inicializo la variable donde se guardara lo que escriba el usuario
        String opcionMin = "";

        // bucle while que filtra las palabras para que sean validas
        while (!entradaValida) {
            // opcion de hacia donde mirar
            opcionMin = teclado.nextLine().toLowerCase();
            switch (opcionMin) {
                case "abajo":
                case "arriba":
                case "adelante":
                case "izquierda":
                case "derecha":
                    entradaValida = true;
                    break;
                default:
                    System.out.println("Palabra invalida, ¿hacia que lugar desea ver?");
                    break;
            }
        }

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

                // [MOSTRAR LOS DETALLES DEL ANIMAL ACUATICO ELEGIDO]
                System.out.println("¿Que animal deseas ver con mas detenimiento?");

                // ---- [FILTRO DE PALABRAS PARA QUE SOLO SE PUEDAN ESCRIBIR ANIMALES QUE ESTEN EN EL ARRAY DE ANIMALES AVISTADOS] ----
                // creo la string que tendra el valor ingresado por teclado
                String animalAVerAcu = teclado.nextLine();
                // creo la bandera que me servirá para la validacion de lo escrito por teclado
                boolean banderaValidacionAnimalAcu = false;
                // bucle que ejecuta el codigo siempre y cuando la bandera lo permita
                while (!banderaValidacionAnimalAcu) {
                    // bandera q me permitira imprimir los datos del animal sin que se repita en caso de que aparezca mas de una vez
                    boolean banderaAnimalAVerAcu = false;
                    // bucle que buscara el animal elegido por raza para mostrar asi todas sus caracteristicas
                    for (int i = 0; i < cantidadRandomAgua; i++) {
                        if (animalesAcuaticosAvistados[i].getRaza().equals(animalAVerAcu) && !banderaAnimalAVerAcu) {
                            // imprimo todos los datos
                            System.out.println("El animal que observas detalladamente es un/a " + animalesAcuaticosAvistados[i].getRaza());
                            System.out.println("Es de la especie de los " + animalesAcuaticosAvistados[i].getEspecie());
                            System.out.println("Es un animal " + animalesAcuaticosAvistados[i].getAlimentacion());
                            System.out.println("Respira a traves de " + animalesAcuaticosAvistados[i].getRespiracion());
                            System.out.println("Mide aproximadamente " + animalesAcuaticosAvistados[i].getTamanio() + "cm");
                            // paso la bandera a true para q no se repita el animal
                            banderaAnimalAVerAcu = true;
                            // paso la bandera a true para validar la palabra escrita por el usuario
                            banderaValidacionAnimalAcu = true;
                        }
                    }
                    // si la palabra no es correcta, se mandará este mensaje
                    if (!banderaValidacionAnimalAcu) {
                        System.out.println("Ese animal no esta siendo avistado. Escoja un animal que tenga a la vista para analizarlo");
                        animalAVerAcu = teclado.nextLine();
                    }
                }
                break;

            case "arriba":
                //cantidad random de animales aereos que apareceran
                int cantidadRandomAire = aleatorio.nextInt(Aire.size()) + 1;
                // creo un array donde se guardaran los animales avistados
                AnimalesAereos animalesAereosAvistados[];
                animalesAereosAvistados = new AnimalesAereos[cantidadRandomAire];
                // eleccion al azar de animales aereos
                for (int i = 0; i < cantidadRandomAire; i++) {
                    int indiceAleatorioAire = aleatorio.nextInt(Aire.size());
                    AnimalesAereos animal = Aire.get(indiceAleatorioAire);
                    animalesAereosAvistados[i] = animal;
                }
                System.out.println("Decides mirar al cielo que se encuentra arriba de ti, ahí avistas a los siguientes animales");
                for (int i = 0; i < cantidadRandomAire; i++) {
                    System.out.println("Animal aereo: " + animalesAereosAvistados[i].getRaza());
                }
                break;
            case "adelante":
                //cantidad random de animales terrestres que apareceran
                int cantidadRandomTierra = aleatorio.nextInt(Tierra.size()) + 1;
                // creo un array donde se guardaran los animales avistados
                AnimalesTerrestres animalesTerrestresAvistados[];
                animalesTerrestresAvistados = new AnimalesTerrestres[cantidadRandomTierra];
                // eleccion al azar de animales terrestres
                for (int i = 0; i < cantidadRandomTierra; i++) {
                    int indiceAleatorioTierra = aleatorio.nextInt(Tierra.size());
                    AnimalesTerrestres animal = Tierra.get(indiceAleatorioTierra);
                    animalesTerrestresAvistados[i] = animal;
                }
                System.out.println("Decides mirar adelante, donde se encuentra la isla mas grande, allí avistas a los siguientes animales");
                for (int i = 0; i < cantidadRandomTierra; i++) {
                    System.out.println("Animal terrestre: " + animalesTerrestresAvistados[i].getRaza());
                }
                break;
            default:
                System.out.println("Error al escribir, intente de nuevo");
                break;
        }

    }
}
