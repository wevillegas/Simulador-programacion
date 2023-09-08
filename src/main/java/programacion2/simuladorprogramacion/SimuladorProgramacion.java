package programacion2.simuladorprogramacion;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class SimuladorProgramacion {

    public static void main(String[] args) {
        
        Historias historias = new Historias();
        
        // Llamar a los métodos para mostrar historias
        String historiaAgua = historias.MostrarHistoriaAgua();
        String historiaTierra = historias.MostrarHistoriaTierra();
        String historiaTierraIzquierda = historias.MostrarHistoriaTierraIzquierda();
        String historiaTierraDerecha = historias.MostrarHistoriaTierraDerecha();
        String historiaAire = historias.MostrarHistoriaAire();

        Scanner scanner = new Scanner(System.in);
        String respuesta;

            //scanner
            Scanner teclado = new Scanner(System.in);
            //random
            Random aleatorio = new Random();

            // Arraylist de los animales
            ArrayList<AnimalesAcuaticos> Agua = CreacionAgua.generadorAgua();
            ArrayList<AnimalesAereos> Aire = CreacionAire.generadorAire();
            ArrayList<AnimalesTerrestres> Tierra = CreacionTierra.generadorTierra();
            // Arraylist de las plantas
            ArrayList<Arboles> Arbol = CreacionArbol.generadorArbol();
            ArrayList<Flores> Flor = CreacionFlores.generadorFlores();
            ArrayList<FloraAcuatica> FlorAgua = CreacionFloraAcuatica.generadorFloresAcuaticas();

            // ---------- INTRODUCCION AL SIMULADOR] ----------
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("Bienvenido, usted se encuentra parado en un mirador dentro de una isla en medio de un archipielago \n"
                    + "con el objetivo de poder avistar la diversa flora y fauna de la zona. \n"
                    + "En frente de ti hay una isla grande, y puedes ver las otras islas a la izquierda y a la derecha. \n"
                    + "Arriba está el cielo y abajo el mar. Tienes unos binoculares y puedes elegir en qué dirección mirar. \n"
                    + "Con ellos, puedes ver plantas y animales interesantes en cada dirección. \n"
                    + "Es como si fueras un explorador, descubriendo todas las cosas geniales que hay en esta área.");
            /*Este primer do { es para que vuelva a preguntar la dirección a observar en el simulador*/
            do {
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("¿Hacia que direccion le gustaria mirar?");
            System.out.println("Ingrese entre las siguientes opciones: ");
                System.out.println("\t- abajo");
                System.out.println("\t- arriba");
                System.out.println("\t- adelante");
                System.out.println("\t- izquierda");
                System.out.println("\t- derecha");

            // ---------- [FILTRO DE PALABRAS INCORRECTAS] ----------
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
                        System.out.println("-------------------------------------------------------------------------------------------------");
                        System.out.println("Palabra invalida, ¿hacia que direccion le gustaria mirar?");
                        break;
                }
            }
            
            // ---------- [APARICION DE LOS ANIMALES DE FORMA ALEATORIA SEGUN A DONDE SE MIRE] ----------
            switch (opcionMin) {

                case "abajo":
                    
                    // mostrando historia abajo
                    System.out.println("Historia de Agua: " + historiaAgua);
                    /*mismo caso que el de arriba solo que se hace en cada case del switch*/
                    do {
                    // ---------- [ANIMALES] ----------
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
                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("Decides mirar al mar que se encuentra debajo de ti, allí avistas a los siguientes animales");
                    for (int i = 0; i < cantidadRandomAgua; i++) {
                        System.out.println(animalesAcuaticosAvistados[i].getRaza());
                    }
                    /*Pregunto si quiere analizar un animal o saltear el proceso*/
                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("Quiere ver con detenimiento algún animal? Escriba el nombre del animal");
                    System.out.println("o ... escriba \"no\" si desea saltear este proceso");
                    String animalAbajo;
                    animalAbajo = scanner.nextLine();
                    /*creo un int it(iteración) para que solo detalle un animal y no me genere un loop infinito de ingreso de animales*/
                    int it = 0;
                    while(!animalAbajo.equalsIgnoreCase("no") && it<=0){
                    // ---------- [MOSTRAR LOS DETALLES DEL ANIMAL ACUATICO ELEGIDO] ----------
                    // ---------- [FILTRO DE PALABRAS PARA QUE SOLO SE PUEDAN ESCRIBIR ANIMALES QUE ESTEN EN EL ARRAY DE ANIMALES AVISTADOS E IMPRESION DE DATOS] ----------
                    // creo la bandera que me servirá para la validacion de lo escrito por teclado
                    boolean banderaValidacionAnimalAcu = false;
                    // bucle que ejecuta el codigo siempre y cuando la bandera lo permita
                    while (!banderaValidacionAnimalAcu) {
                        // bandera q me permitira imprimir los datos del animal sin que se repita en caso de que aparezca mas de una vez
                        boolean banderaAnimalAVerAcu = false;
                        // bucle que buscara el animal elegido por raza para mostrar asi todas sus caracteristicas
                        for (int i = 0; i < cantidadRandomAgua; i++) {
                            if (animalesAcuaticosAvistados[i].getRaza().equalsIgnoreCase(animalAbajo) && !banderaAnimalAVerAcu) {
                                System.out.println("-------------------------------------------------------------------------------------------------");
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
                            System.out.println("-------------------------------------------------------------------------------------------------");
                            System.out.println("Ese animal no esta siendo avistado. Escoja un animal que tenga a la vista para analizarlo");
                            animalAbajo = scanner.nextLine();
                        }
                    }
                    it++;
                    }
                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("Tambien puedes ver a las siguientes plantas acuaticas");
                    for (int i = 0; i < FlorAgua.size(); i++) {
                        
                        FloraAcuatica florAgua = FlorAgua.get(i);
                        System.out.println(florAgua.getEspecie());
                        
                    }
                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("Quiere ver con detenimiento alguna planta ? Escriba el nombre de la planta");
                    System.out.println("o ... escriba \"no\" si desea saltear este proceso");
                    String florAcuatica;
                    florAcuatica = scanner.nextLine();
                    int itaf = 0;
                    while(!florAcuatica.equalsIgnoreCase("no")&& itaf<=0){
                    boolean banderaValidacionArbol = false;
                    while (!banderaValidacionArbol) {
                        for (int i = 0; i < FlorAgua.size(); i++) {                           
                            if (FlorAgua.get(i).getEspecie().equalsIgnoreCase(florAcuatica)) {
                                System.out.println("-------------------------------------------------------------------------------------------------");
                                System.out.println("La flor que observas detalladamente es un/a " + FlorAgua.get(i).getEspecie());
                                System.out.println("Color: " + FlorAgua.get(i).getColor());
                                System.out.println("Nombre cientifico: " + FlorAgua.get(i).getTipo());
                                System.out.println("Habitat: " + FlorAgua.get(i).getHabitat());
                                System.out.println("Tamaño aproximado: " + FlorAgua.get(i).getTamanio() + "cm");
                                System.out.println("Tipo: " + FlorAgua.get(i).getTipoAgua());
                                banderaValidacionArbol = true;
                            }
                        }
                        if (!banderaValidacionArbol) {
                            System.out.println("-------------------------------------------------------------------------------------------------");
                            System.out.println("Esa planta no esta siendo avistada. Escoja una planta que tenga a la vista para analizarla");
                            florAcuatica = scanner.nextLine();
                        }
                    }
                    itaf++; /*itaf (iteración arboles o flores)*/
                    }
                    
                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("¿Quiere volver a analizar el entorno? (presione \"si\" en caso afirmativo)");
                    respuesta = scanner.nextLine();
                    } while (respuesta.equalsIgnoreCase("si"));
                    break;
                    
                case "arriba":
                    
                    // Mostrando Historia aire
                    System.out.println("Historia de Aire: " + historiaAire);
                                        
                    do {
                    // ---------- [ANIMALES] ----------
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
                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("Decides levantar la cabeza para ver el cielo, allí avistas a los siguientes animales");
                    for (int i = 0; i < cantidadRandomAire; i++) {
                        System.out.println(animalesAereosAvistados[i].getRaza());
                    }
                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("Quiere ver con detenimiento algún animal? Escriba el nombre del animal)");
                    System.out.println("o ... escriba \"no\" si desea saltear este proceso");
                    String animalArriba;
                    animalArriba = scanner.nextLine();
                    int it = 0;
                    while(!animalArriba.equalsIgnoreCase("no")&& it<=0){
                    // ---------- [MOSTRAR LOS DETALLES DEL ANIMAL AEREO ELEGIDO] ----------
                    // ---------- [FILTRO DE PALABRAS PARA QUE SOLO SE PUEDAN ESCRIBIR ANIMALES QUE ESTEN EN EL ARRAY DE ANIMALES AVISTADOS E IMPRESION DE DATOS] ----------
                    // creo la bandera que me servirá para la validacion de lo escrito por teclado
                    boolean banderaValidacionAnimalAire = false;
                    // bucle que ejecuta el codigo siempre y cuando la bandera lo permita
                    while (!banderaValidacionAnimalAire) {
                        // bandera q me permitira imprimir los datos del animal sin que se repita en caso de que aparezca mas de una vez
                        boolean banderaAnimalAVerAire = false;
                        // bucle que buscara el animal elegido por raza para mostrar asi todas sus caracteristicas
                        for (int i = 0; i < cantidadRandomAire; i++) {
                            if (animalesAereosAvistados[i].getRaza().equalsIgnoreCase(animalArriba) && !banderaAnimalAVerAire) {
                                System.out.println("-------------------------------------------------------------------------------------------------");
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
                            System.out.println("-------------------------------------------------------------------------------------------------");
                            System.out.println("Ese animal no esta siendo avistado. Escoja un animal que tenga a la vista para analizarlo");
                            animalArriba = scanner.nextLine();
                        }
                    }
                    it++;
                    }
                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("¿Quiere volver a analizar el entorno? (presione \"si\" en caso afirmativo)");
                    respuesta = scanner.nextLine();
                    } while (respuesta.equalsIgnoreCase("si"));
                    break;
                case "adelante":
                    // Mostrando historia tierra
                    System.out.println("Historia de Tierra: " + historiaTierra);            
                    do {
                    // ---------- [ANIMALES] ----------
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
                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("Decides mirar adelante, donde se encuentra la isla más grande del archipielago, allí avistas a los siguientes animales");
                    for (int i = 0; i < cantidadRandomTierra; i++) {
                        System.out.println(animalesTerrestresAvistados[i].getRaza());
                    }
                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("Quiere ver con detenimiento algún animal? Escriba el nombre del animal)");
                    System.out.println("o ... escriba \"no\" si desea saltear este proceso");
                    String animalAdelante;
                    animalAdelante = scanner.nextLine();
                    int it = 0;
                    while(!animalAdelante.equalsIgnoreCase("no")&& it<=0){
                    // ---------- [MOSTRAR LOS DETALLES DEL ANIMAL TERRESTRE ELEGIDO] ----------
                    // ---------- [FILTRO DE PALABRAS PARA QUE SOLO SE PUEDAN ESCRIBIR ANIMALES QUE ESTEN EN EL ARRAY DE ANIMALES AVISTADOS E IMPRESION DE DATOS] ----------
                    // creo la bandera que me servirá para la validacion de lo escrito por teclado
                    boolean banderaValidacionAnimalTierra = false;
                    // bucle que ejecuta el codigo siempre y cuando la bandera lo permita
                    while (!banderaValidacionAnimalTierra) {
                        // bandera q me permitira imprimir los datos del animal sin que se repita en caso de que aparezca mas de una vez
                        boolean banderaAnimalAVerTierra = false;
                        // bucle que buscara el animal elegido por raza para mostrar asi todas sus caracteristicas
                        for (int i = 0; i < cantidadRandomTierra; i++) {
                            if (animalesTerrestresAvistados[i].getRaza().equalsIgnoreCase(animalAdelante) && !banderaAnimalAVerTierra) {
                                System.out.println("-------------------------------------------------------------------------------------------------");
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
                            System.out.println("-------------------------------------------------------------------------------------------------");
                            System.out.println("Ese animal no esta siendo avistado. Escoja un animal que tenga a la vista para analizarlo");
                            animalAdelante = scanner.nextLine();
                        }
                    }
                    it++;
                    }

                    // ---------- [ARBOLES Y FLORES] ----------
                    // MISMA LOGICA USADA EN ANIMALES PERO APLICADA A LAS PLANTAS
                    Arboles arbolesAvistados[];
                    arbolesAvistados = new Arboles[4];

                    Flores floresAvistadas[];
                    floresAvistadas = new Flores[4];

                    for (int i = 0; i < arbolesAvistados.length; i++) {
                        Arboles arbol = Arbol.get(i);
                        arbolesAvistados[i] = arbol;
                    }

                    for (int i = 0; i < floresAvistadas.length; i++) {
                        Flores flor = Flor.get(i);
                        floresAvistadas[i] = flor;
                    }

                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("Tambien puedes ver a las siguientes plantas");
                    for (int i = 0; i < arbolesAvistados.length; i++) {
                        System.out.println(arbolesAvistados[i].getEspecie());
                    }
                    for (int i = 0; i < floresAvistadas.length; i++) {
                        System.out.println(floresAvistadas[i].getEspecie());
                    }
                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("Quiere ver con detenimiento algún árbol o flor? Escriba el nombre de la planta");
                    System.out.println("o ... escriba \"no\" si desea saltear este proceso");
                    String plantaAdelante;
                    plantaAdelante = scanner.nextLine();
                    int itaf = 0;
                    while(!plantaAdelante.equalsIgnoreCase("no")&& itaf<=0){
                    boolean banderaValidacionArbol = false;
                    while (!banderaValidacionArbol) {
                        for (int i = 0; i < arbolesAvistados.length; i++) {
                            if (arbolesAvistados[i].getEspecie().equalsIgnoreCase(plantaAdelante)) {
                                System.out.println("-------------------------------------------------------------------------------------------------");
                                System.out.println("El árbol que observas detalladamente es un/a " + arbolesAvistados[i].getEspecie());
                                System.out.println("Color: " + arbolesAvistados[i].getColor());
                                System.out.println("Nombre cientifico: " + arbolesAvistados[i].getTipo());
                                System.out.println("Habitat:" + arbolesAvistados[i].getHabitat());
                                System.out.println("Tamaño aproximado: " + arbolesAvistados[i].getTamanio() + "m");
                                System.out.println("Hojas: " + arbolesAvistados[i].getHojas());
                                System.out.println("Fruto: " + arbolesAvistados[i].getFruto());
                                banderaValidacionArbol = true;
                            }
                            if (floresAvistadas[i].getEspecie().equalsIgnoreCase(plantaAdelante)) {
                                System.out.println("-------------------------------------------------------------------------------------------------");
                                System.out.println("La flor que observas detalladamente es un/a " + floresAvistadas[i].getEspecie());
                                System.out.println("Color: " + floresAvistadas[i].getColor());
                                System.out.println("Nombre cientifico: " + floresAvistadas[i].getTipo());
                                System.out.println("Habitat: " + floresAvistadas[i].getHabitat());
                                System.out.println("Tamaño aproximado: " + floresAvistadas[i].getTamanio() + "cm");
                                System.out.println("Petalos: " + floresAvistadas[i].getPetalos());
                                banderaValidacionArbol = true;
                            }
                        }
                        if (!banderaValidacionArbol) {
                            System.out.println("-------------------------------------------------------------------------------------------------");
                            System.out.println("Esa planta no esta siendo avistada. Escoja una planta que tenga a la vista para analizarla");
                            plantaAdelante = scanner.nextLine();
                        }
                    }
                    itaf++; /*itaf (iteración arboles o flores)*/
                    }
                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("¿Quiere volver a analizar el entorno? (presione \"si\" en caso afirmativo)");
                    respuesta = scanner.nextLine();
                    } while (respuesta.equalsIgnoreCase("si"));
                    break;
                case "izquierda":
                    
                    // Mostrando historia tierra
                    System.out.println("Historia de Tierra: " + historiaTierraIzquierda);
                                    
                    do {
                    //cantidad random de animales terrestres que apareceran
                    int cantidadRandomTierraIzq = aleatorio.nextInt(Tierra.size()) + 1;
                    // creo un array donde se guardaran los animales avistados
                    AnimalesTerrestres animalesTerrestresAvistadosIzq[];
                    animalesTerrestresAvistadosIzq = new AnimalesTerrestres[cantidadRandomTierraIzq];
                    // eleccion al azar de animales terrestres
                    for (int i = 0; i < cantidadRandomTierraIzq; i++) {
                        int indiceAleatorioTierraIzq = aleatorio.nextInt(Tierra.size());
                        AnimalesTerrestres animal = Tierra.get(indiceAleatorioTierraIzq);
                        animalesTerrestresAvistadosIzq[i] = animal;
                    }
                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("Decides mirar hacia la izquierda, donde se encuentra una de las grandes islas del archipielago, allí avistas a los siguientes animales");
                    for (int i = 0; i < cantidadRandomTierraIzq; i++) {
                        System.out.println(animalesTerrestresAvistadosIzq[i].getRaza());
                    }
                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("Quiere ver con detenimiento algún animal? Escriba el nombre del animal");
                    System.out.println("o ... escriba \"no\" si desea saltear este proceso");
                    String animalIzquierda;
                    animalIzquierda = scanner.nextLine();
                    int it = 0;
                    while(!animalIzquierda.equalsIgnoreCase("no")&& it<=0){
                    // ---- [FILTRO DE PALABRAS PARA QUE SOLO SE PUEDAN ESCRIBIR ANIMALES QUE ESTEN EN EL ARRAY DE ANIMALES AVISTADOS E IMPRESION DE DATOS] ----
                    // creo la bandera que me servirá para la validacion de lo escrito por teclado
                    boolean banderaValidacionAnimalTierraIzq = false;
                    // bucle que ejecuta el codigo siempre y cuando la bandera lo permita
                    while (!banderaValidacionAnimalTierraIzq) {
                        // bandera q me permitira imprimir los datos del animal sin que se repita en caso de que aparezca mas de una vez
                        boolean banderaAnimalAVerTierraIzq = false;
                        // bucle que buscara el animal elegido por raza para mostrar asi todas sus caracteristicas
                        for (int i = 0; i < cantidadRandomTierraIzq; i++) {
                            if (animalesTerrestresAvistadosIzq[i].getRaza().equalsIgnoreCase(animalIzquierda) && !banderaAnimalAVerTierraIzq) {
                                System.out.println("-------------------------------------------------------------------------------------------------");
                                // imprimo todos los datos
                                System.out.println("El animal que observas detalladamente es un/a " + animalesTerrestresAvistadosIzq[i].getRaza());
                                System.out.println("Especie: " + animalesTerrestresAvistadosIzq[i].getEspecie());
                                System.out.println("Alimentacion: " + animalesTerrestresAvistadosIzq[i].getAlimentacion());
                                System.out.println("Color: " + animalesTerrestresAvistadosIzq[i].getColor());
                                System.out.println("Tamaño aproximado: " + animalesTerrestresAvistadosIzq[i].getTamanio() + "cm");
                                System.out.println("Clasificacion: " + animalesTerrestresAvistadosIzq[i].getClasificacion());
                                // paso la bandera a true para q no se repita el animal
                                banderaAnimalAVerTierraIzq = true;
                                // paso la bandera a true para validar la palabra escrita por el usuario
                                banderaValidacionAnimalTierraIzq = true;
                            }
                        }
                        // si la palabra no es correcta, se mandará este mensaje
                        if (!banderaValidacionAnimalTierraIzq) {
                            System.out.println("-------------------------------------------------------------------------------------------------");
                            System.out.println("Ese animal no esta siendo avistado. Escoja un animal que tenga a la vista para analizarlo");
                            animalIzquierda = scanner.nextLine();
                        }
                    }
                    it++;
                    }
                    // ---------- [ARBOLES Y FLORES] ----------
                    // MISMA LOGICA USADA EN ANIMALES PERO APLICADA A LAS PLANTAS
                    Arboles arbolesAvistadosIzq[];
                    arbolesAvistadosIzq = new Arboles[3];

                    Flores floresAvistadasIzq[];
                    floresAvistadasIzq = new Flores[3];

                    for (int i = 0; i < arbolesAvistadosIzq.length; i++) {
                        Arboles arbol = Arbol.get(4 + i);
                        arbolesAvistadosIzq[i] = arbol;
                    }

                    for (int i = 0; i < floresAvistadasIzq.length; i++) {
                        Flores flor = Flor.get(4 + i);
                        floresAvistadasIzq[i] = flor;
                    }

                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("Tambien ves a las siguientes plantas");
                    for (int i = 0; i < arbolesAvistadosIzq.length; i++) {
                        System.out.println(arbolesAvistadosIzq[i].getEspecie());
                    }
                    for (int i = 0; i < floresAvistadasIzq.length; i++) {
                        System.out.println(floresAvistadasIzq[i].getEspecie());
                    }
                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("Quiere ver con detenimiento algún árbol o flor? Escriba el nombre de la planta");
                    System.out.println("o ... escriba \"no\" si desea saltear este proceso");
                    String plantaIzquierda;
                    plantaIzquierda = scanner.nextLine();
                    int itaf = 0;
                    while(!plantaIzquierda.equalsIgnoreCase("no")&& itaf<=0){
                    boolean banderaValidacionArbolIzq = false;
                    while (!banderaValidacionArbolIzq) {
                        for (int i = 0; i < arbolesAvistadosIzq.length; i++) {
                            if (arbolesAvistadosIzq[i].getEspecie().equalsIgnoreCase(plantaIzquierda)) {
                                System.out.println("-------------------------------------------------------------------------------------------------");
                                System.out.println("El arbol que observas detalladamente es un/a " + arbolesAvistadosIzq[i].getEspecie());
                                System.out.println("Color: " + arbolesAvistadosIzq[i].getColor());
                                System.out.println("Nombre cientifico: " + arbolesAvistadosIzq[i].getTipo());
                                System.out.println("Habitat:" + arbolesAvistadosIzq[i].getHabitat());
                                System.out.println("Tamaño aproximado: " + arbolesAvistadosIzq[i].getTamanio() + "m");
                                System.out.println("Hojas: " + arbolesAvistadosIzq[i].getHojas());
                                System.out.println("Fruto: " + arbolesAvistadosIzq[i].getFruto());
                                banderaValidacionArbolIzq = true;
                            }
                            if (floresAvistadasIzq[i].getEspecie().equalsIgnoreCase(plantaIzquierda)) {
                                System.out.println("-------------------------------------------------------------------------------------------------");
                                System.out.println("La flor que observas detalladamente es un/a " + floresAvistadasIzq[i].getEspecie());
                                System.out.println("Color: " + floresAvistadasIzq[i].getColor());
                                System.out.println("Nombre cientifico: " + floresAvistadasIzq[i].getTipo());
                                System.out.println("Habitat: " + floresAvistadasIzq[i].getHabitat());
                                System.out.println("Tamaño aproximado: " + floresAvistadasIzq[i].getTamanio() + "cm");
                                System.out.println("Petalos: " + floresAvistadasIzq[i].getPetalos());
                                banderaValidacionArbolIzq = true;
                            }
                        }
                        if (!banderaValidacionArbolIzq) {
                            System.out.println("-------------------------------------------------------------------------------------------------");
                            System.out.println("Esa planta no esta siendo avistada. Escoja una planta que tenga a la vista para analizarla");
                            plantaIzquierda = scanner.nextLine();
                        }
                    }
                    itaf++;
                    }
                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("¿Quiere volver a analizar el entorno? (presione \"si\" en caso afirmativo)");
                    respuesta = scanner.nextLine();
                    } while (respuesta.equalsIgnoreCase("si"));
                    break;
                case "derecha":
                                 
                    // Mostrando historia tierra
                    System.out.println("Historia de Tierra: " + historiaTierraDerecha);
                    
                    do {
                    //cantidad random de animales terrestres que apareceran
                    int cantidadRandomTierraDer = aleatorio.nextInt(Tierra.size()) + 1;
                    // creo un array donde se guardaran los animales avistados
                    AnimalesTerrestres animalesTerrestresAvistadosDer[];
                    animalesTerrestresAvistadosDer = new AnimalesTerrestres[cantidadRandomTierraDer];
                    // eleccion al azar de animales terrestres
                    for (int i = 0; i < cantidadRandomTierraDer; i++) {
                        int indiceAleatorioTierraDer = aleatorio.nextInt(Tierra.size());
                        AnimalesTerrestres animal = Tierra.get(indiceAleatorioTierraDer);
                        animalesTerrestresAvistadosDer[i] = animal;
                    }
                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("Decides mirar hacia la derecha, donde se encuentra una de las grandes islas del archipielago, allí avistas a los siguientes animales y plantas");
                    for (int i = 0; i < cantidadRandomTierraDer; i++) {
                        System.out.println(animalesTerrestresAvistadosDer[i].getRaza());
                    }
                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("Quiere ver con detenimiento algún animal? Escriba el nombre del animal");
                    System.out.println("o ... escriba \"no\" si desea saltear este proceso");
                    String animalDerecha;
                    animalDerecha = scanner.nextLine();
                    int it = 0;
                    while(!animalDerecha.equalsIgnoreCase("no")&& it <=0){

                    // ---- [FILTRO DE PALABRAS PARA QUE SOLO SE PUEDAN ESCRIBIR ANIMALES QUE ESTEN EN EL ARRAY DE ANIMALES AVISTADOS E IMPRESION DE DATOS] ----
                    // creo la bandera que me servirá para la validacion de lo escrito por teclado
                    boolean banderaValidacionAnimalTierraDer = false;
                    // bucle que ejecuta el codigo siempre y cuando la bandera lo permita
                    while (!banderaValidacionAnimalTierraDer) {
                        // bandera q me permitira imprimir los datos del animal sin que se repita en caso de que aparezca mas de una vez
                        boolean banderaAnimalAVerTierraDer = false;
                        // bucle que buscara el animal elegido por raza para mostrar asi todas sus caracteristicas
                        for (int i = 0; i < cantidadRandomTierraDer; i++) {
                            if (animalesTerrestresAvistadosDer[i].getRaza().equalsIgnoreCase(animalDerecha) && !banderaAnimalAVerTierraDer) {
                                System.out.println("-------------------------------------------------------------------------------------------------");
                                // imprimo todos los datos
                                System.out.println("El animal que observas detalladamente es un/a " + animalesTerrestresAvistadosDer[i].getRaza());
                                System.out.println("Especie: " + animalesTerrestresAvistadosDer[i].getEspecie());
                                System.out.println("Alimentacion: " + animalesTerrestresAvistadosDer[i].getAlimentacion());
                                System.out.println("Color: " + animalesTerrestresAvistadosDer[i].getColor());
                                System.out.println("Tamaño aproximado: " + animalesTerrestresAvistadosDer[i].getTamanio() + "cm");
                                System.out.println("Clasificacion: " + animalesTerrestresAvistadosDer[i].getClasificacion());
                                // paso la bandera a true para q no se repita el animal
                                banderaAnimalAVerTierraDer = true;
                                // paso la bandera a true para validar la palabra escrita por el usuario
                                banderaValidacionAnimalTierraDer = true;
                            }
                        }
                        // si la palabra no es correcta, se mandará este mensaje
                        if (!banderaValidacionAnimalTierraDer) {
                            System.out.println("-------------------------------------------------------------------------------------------------");
                            System.out.println("Ese animal no esta siendo avistado. Escoja un animal que tenga a la vista para analizarlo");
                            animalDerecha = scanner.nextLine();
                        }
                    }
                    it++;
                    }

                    // ---------- [ARBOLES Y FLORES] ----------
                    // MISMA LOGICA USADA EN ANIMALES PERO APLICADA A LAS PLANTAS
                    Arboles arbolesAvistadosDer[];
                    arbolesAvistadosDer = new Arboles[3];

                    Flores floresAvistadasDer[];
                    floresAvistadasDer = new Flores[3];

                    for (int i = 0; i < arbolesAvistadosDer.length; i++) {
                        Arboles arbol = Arbol.get(7 + i);
                        arbolesAvistadosDer[i] = arbol;
                    }

                    for (int i = 0; i < floresAvistadasDer.length; i++) {
                        Flores flor = Flor.get(7 + i);
                        floresAvistadasDer[i] = flor;
                    }

                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("Tambien ves a las siguientes plantas");
                    for (int i = 0; i < arbolesAvistadosDer.length; i++) {
                        System.out.println(arbolesAvistadosDer[i].getEspecie());
                    }
                    for (int i = 0; i < floresAvistadasDer.length; i++) {
                        System.out.println(floresAvistadasDer[i].getEspecie());
                    }
                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("Quiere ver con detenimiento algún árbol o flor? Escriba el nombre de la planta");
                    System.out.println("o ... escriba \"no\" si desea saltear este proceso");
                    String plantaDerecha;
                    plantaDerecha = scanner.nextLine();
                    int itaf = 0;
                    while(!plantaDerecha.equalsIgnoreCase("no") && itaf <= 0){
                    boolean banderaValidacionArbolDer = false;
                    while (!banderaValidacionArbolDer) {
                        for (int i = 0; i < arbolesAvistadosDer.length; i++) {
                            if (arbolesAvistadosDer[i].getEspecie().equalsIgnoreCase(plantaDerecha)) {
                                System.out.println("-------------------------------------------------------------------------------------------------");
                                System.out.println("El arbol que observas detalladamente es un/a " + arbolesAvistadosDer[i].getEspecie());
                                System.out.println("Color: " + arbolesAvistadosDer[i].getColor());
                                System.out.println("Nombre cientifico: " + arbolesAvistadosDer[i].getTipo());
                                System.out.println("Habitat:" + arbolesAvistadosDer[i].getHabitat());
                                System.out.println("Tamaño aproximado: " + arbolesAvistadosDer[i].getTamanio() + "m");
                                System.out.println("Hojas: " + arbolesAvistadosDer[i].getHojas());
                                System.out.println("Fruto: " + arbolesAvistadosDer[i].getFruto());
                                banderaValidacionArbolDer = true;
                            }
                            if (floresAvistadasDer[i].getEspecie().equalsIgnoreCase(plantaDerecha)) {
                                System.out.println("-------------------------------------------------------------------------------------------------");
                                System.out.println("La flor que observas detalladamente es un/a " + floresAvistadasDer[i].getEspecie());
                                System.out.println("Color: " + floresAvistadasDer[i].getColor());
                                System.out.println("Nombre cientifico: " + floresAvistadasDer[i].getTipo());
                                System.out.println("Habitat: " + floresAvistadasDer[i].getHabitat());
                                System.out.println("Tamaño aproximado: " + floresAvistadasDer[i].getTamanio() + "cm");
                                System.out.println("Petalos: " + floresAvistadasDer[i].getPetalos());
                                banderaValidacionArbolDer = true;
                            }
                        }
                        if (!banderaValidacionArbolDer) {
                            System.out.println("-------------------------------------------------------------------------------------------------");
                            System.out.println("Esa planta no esta siendo avistada. Escoja una planta que tenga a la vista para analizarla");
                            plantaDerecha = scanner.nextLine();
                        }
                    }
                    itaf++;
                    }
                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("¿Quiere volver a analizar el entorno? (presione \"si\" en caso afirmativo)");
                    respuesta = scanner.nextLine();
                    } while (respuesta.equalsIgnoreCase("si"));
                    break;
                default:
                    System.out.println("Error al escribir, intente de nuevo");
                    break;
            }

            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("Quiere volver a la posición inicial? (escriba 'si' para volver hasta allí)");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));
        scanner.close();
        
    }
}
