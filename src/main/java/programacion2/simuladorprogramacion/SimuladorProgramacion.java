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
        System.out.println("Bienvenido, usted se encuentra parado en un mirador dentro de una isla en medio de un archipielago \n"
                + "con el objetivo de poder avistar la diversa flora y fauna de la zona. \n"
                + "En frente de ti hay una isla grande, y puedes ver las otras islas a la izquierda y a la derecha. \n"
                + "Arriba está el cielo y abajo el mar. Tienes unos binoculares y puedes elegir en qué dirección mirar. \n"
                + "Con ellos, puedes ver plantas y animales interesantes en cada dirección. \n"
                + "Es como si fueras un explorador, descubriendo todas las cosas geniales que hay en esta área.");
        System.out.println("¿Hacia que direccion le gustaria mirar?");
        
        // [FILTRO DE PALABRAS INCORRECTAS]
        //genero un booleano como bandera para que al ingresar una palabra legal ejecute el codigo
        boolean entradaValida = false;
        // inicializo la variable donde se guardara lo que escriba el usuario
        String opcionMin = "";

        // bucle while que filtra las palabras para que sean invalidas
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
                    System.out.println("Palabra invalida, ¿hacia que direccion le gustaria mirar?");
                    break;
            }
        }

        // [APARICION DE LOS ANIMALES DE FORMA ALEATORIA SEGUN A DONDE SE MIRE]
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
                System.out.println("Decides mirar al mar que se encuentra debajo de ti, allí avistas a los siguientes animales");
                for (int i = 0; i < cantidadRandomAgua; i++) {
                    System.out.println(animalesAcuaticosAvistados[i].getRaza());
                }

                // ----- [MOSTRAR LOS DETALLES DEL ANIMAL ACUATICO ELEGIDO] -----
                System.out.println("¿Que animal deseas ver con mas detenimiento?");

                // ----- [FILTRO DE PALABRAS PARA QUE SOLO SE PUEDAN ESCRIBIR ANIMALES QUE ESTEN EN EL ARRAY DE ANIMALES AVISTADOS E IMPRESION DE DATOS] -----
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
                            System.out.println("Especie: " + animalesAcuaticosAvistados[i].getEspecie());
                            System.out.println("Alimentacion: " + animalesAcuaticosAvistados[i].getAlimentacion());
                            System.out.println("Color: " + animalesAcuaticosAvistados[i].getColor());
                            System.out.println("Tamaño aproximado: " + animalesAcuaticosAvistados[i].getTamanio() + "cm");
                            System.out.println("Respiracion: " + animalesAcuaticosAvistados[i].getRespiracion());
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
                System.out.println("Decides levantar la cabeza para ver el cielo, allí avistas a los siguientes animales");
                for (int i = 0; i < cantidadRandomAire; i++) {
                    System.out.println(animalesAereosAvistados[i].getRaza());
                }

                // ----- [MOSTRAR LOS DETALLES DEL ANIMAL AEREO ELEGIDO] -----
                System.out.println("¿Que animal deseas ver con mas detenimiento?");

                // ---- [FILTRO DE PALABRAS PARA QUE SOLO SE PUEDAN ESCRIBIR ANIMALES QUE ESTEN EN EL ARRAY DE ANIMALES AVISTADOS E IMPRESION DE DATOS] ----
                // creo la string que tendra el valor ingresado por teclado
                String animalAVerAire = teclado.nextLine();
                // creo la bandera que me servirá para la validacion de lo escrito por teclado
                boolean banderaValidacionAnimalAire = false;
                // bucle que ejecuta el codigo siempre y cuando la bandera lo permita
                while (!banderaValidacionAnimalAire) {
                    // bandera q me permitira imprimir los datos del animal sin que se repita en caso de que aparezca mas de una vez
                    boolean banderaAnimalAVerAire = false;
                    // bucle que buscara el animal elegido por raza para mostrar asi todas sus caracteristicas
                    for (int i = 0; i < cantidadRandomAire; i++) {
                        if (animalesAereosAvistados[i].getRaza().equals(animalAVerAire) && !banderaAnimalAVerAire) {
                            // imprimo todos los datos
                            System.out.println("El animal que observas detalladamente es un/a " + animalesAereosAvistados[i].getRaza());
                            System.out.println("Especie: " + animalesAereosAvistados[i].getEspecie());
                            System.out.println("Alimentacion: " + animalesAereosAvistados[i].getAlimentacion());
                            System.out.println("Color: " + animalesAereosAvistados[i].getColor());
                            System.out.println("Tamaño aproximado " + animalesAereosAvistados[i].getTamanio() + "cm");
                            System.out.println("Tamaño de alas aproximado: " + animalesAereosAvistados[i].getTamanioAlas() + "cm");
                            System.out.println("Tamaño de pico aproximado " + animalesAereosAvistados[i].getTamanioPico() + "cm");
                            // paso la bandera a true para q no se repita el animal
                            banderaAnimalAVerAire = true;
                            // paso la bandera a true para validar la palabra escrita por el usuario
                            banderaValidacionAnimalAire = true;
                        }
                    }
                    // si la palabra no es correcta, se mandará este mensaje
                    if (!banderaValidacionAnimalAire) {
                        System.out.println("Ese animal no esta siendo avistado. Escoja un animal que tenga a la vista para analizarlo");
                        animalAVerAire = teclado.nextLine();
                    }
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
                    System.out.println(animalesTerrestresAvistados[i].getRaza());
                }
                
                System.out.println("¿Que animal deseas ver con mas detenimiento?");

                // ---- [FILTRO DE PALABRAS PARA QUE SOLO SE PUEDAN ESCRIBIR ANIMALES QUE ESTEN EN EL ARRAY DE ANIMALES AVISTADOS E IMPRESION DE DATOS] ----
                // creo la string que tendra el valor ingresado por teclado
                String animalAVerTierra = teclado.nextLine();
                // creo la bandera que me servirá para la validacion de lo escrito por teclado
                boolean banderaValidacionAnimalTierra = false;
                // bucle que ejecuta el codigo siempre y cuando la bandera lo permita
                while (!banderaValidacionAnimalTierra) {
                    // bandera q me permitira imprimir los datos del animal sin que se repita en caso de que aparezca mas de una vez
                    boolean banderaAnimalAVerTierra = false;
                    // bucle que buscara el animal elegido por raza para mostrar asi todas sus caracteristicas
                    for (int i = 0; i < cantidadRandomTierra; i++) {
                        if (animalesTerrestresAvistados[i].getRaza().equals(animalAVerTierra) && !banderaAnimalAVerTierra) {
                            // imprimo todos los datos
                            System.out.println("El animal que observas detalladamente es un/a " + animalesTerrestresAvistados[i].getRaza());
                            System.out.println("Especie: " + animalesTerrestresAvistados[i].getEspecie());
                            System.out.println("Alimentacion: " + animalesTerrestresAvistados[i].getAlimentacion());
                            System.out.println("Color: " + animalesTerrestresAvistados[i].getColor());
                            System.out.println("Tamaño aproximado: " + animalesTerrestresAvistados[i].getTamanio() + "cm");
                            System.out.println("Clasificacion: " + animalesTerrestresAvistados[i].getClasificacion());
                            // paso la bandera a true para q no se repita el animal
                            banderaAnimalAVerTierra = true;
                            // paso la bandera a true para validar la palabra escrita por el usuario
                            banderaValidacionAnimalTierra = true;
                        }
                    }
                    // si la palabra no es correcta, se mandará este mensaje
                    if (!banderaValidacionAnimalTierra) {
                        System.out.println("Ese animal no esta siendo avistado. Escoja un animal que tenga a la vista para analizarlo");
                        animalAVerTierra = teclado.nextLine();
                    }
                }
                break;
            default:
                System.out.println("Error al escribir, intente de nuevo");
                break;
        }

    }
}
