package programacion2.simuladorprogramacion;

import java.util.Random;

/**
 *
 * @author salu
 */
public class Historias {

    private Random random;

    public Historias() {
        this.random = new Random();
    }

    public String MostrarHistoriaAgua() {
        String[] historiasAgua = {
            "Bajo la inmensidad del cielo, las olas rompen suavemente en la playa. La marea esta calma y serena. Llenando de tranquilidad el ambiente",
            "El agua azul cristalina del océano brindan un contexto ideal para visualizar y descubrir la inmensidad de la vida marítima.",
            "El viento sopla generando una agradable y satisfactoria brisa. El mismo viento genera un calmo movimiento en las aguas del mar.",
            "Al observar el mar, ves a un pescador lanzando su red al agua, esperando con paciencia. Su serenidad contagia hasta al mismo océano.",
            "En el océano se refleja el intenso sol. El agradable clima propicia un ambiente ideal para descubrir a la fauna y flora marina."
        };

        int indice = random.nextInt(historiasAgua.length);
        return historiasAgua[indice];
    }

    public String MostrarHistoriaTierra() {
        String[] historiasTierra = {
            "Al frente tuyo se encuentra la isla más grande del archipielago. Su inmensidad genera asombro por la gran cantidad de flora y fauna.",
            "El cielo resplandece alrededor de la gran isla a la que avistas. Nubes blancas crean un gran contraste al celeste del cielo",
            "dedo",
        };

        int indice = random.nextInt(historiasTierra.length);
        return historiasTierra[indice];
    }
    
    public String MostrarHistoriaTierraIzquierda(){
        String [] historiasTierraIzquierda = {
        "dedo"
        };
        
        int indice = random.nextInt(historiasTierraIzquierda.length);
        return historiasTierraIzquierda[indice];
    }
          /*  "Un excursionista observa un río serpenteante desde lo alto de una montaña. La vida terrestre fluye con un ritmo eterno que nos recuerda la constancia de la naturaleza.",
            "Un leñador tala un árbol con respeto y gratitud. La vida terrestre nos enseña que, aunque tomemos de la naturaleza, debemos hacerlo con consideración.",
            "Una familia se relaja junto a un río, escuchando el murmullo del agua. La vida terrestre fluye como un río, siempre cambiante y siempre en movimiento.",
            "En un campo de lavanda, las abejas zumban en busca de néctar. La vida terrestre es un concierto de sonidos y aromas que celebra la diversidad de la Tierra.",
            "Un grupo de amigos monta una tienda de campaña en la montaña. La vida terrestre es una invitación a la aventura y a conectar con la esencia de la naturaleza.",
            "Un corredor se sumerge en un bosque en la madrugada, sintiendo la frescura del aire. La vida terrestre es un recordatorio de la vitalidad y la belleza de la naturaleza.",
            "Un guía turístico comparte historias sobre la vida silvestre. La vida terrestre nos conecta con el pasado y el futuro de nuestro planeta."
        };*/
    
        public String MostrarHistoriaTierraDerecha(){
        String [] historiasTierraDerecha = {
        "dedos"
        };
        
        int indice = random.nextInt(historiasTierraDerecha.length);
        return historiasTierraDerecha[indice];
    }

    public String MostrarHistoriaAire() {
        String[] historiasAire = {
            "En el cielo matinal, los pájaros despiertan con melodías que alegran al mundo. Sus cantos, como rayos de sol, iluminan nuestros corazones.",
            "Al atardecer, los pájaros forman figuras en el cielo con sus vuelos sincronizados, pintando un cuadro efímero de belleza natural.",
            "En una mañana brumosa, los pájaros emergen de la niebla como susurros alados. El cielo se llena de misterio y maravilla cuando revelan sus siluetas.",
            "Un sol radiante ilumina el cielo, mientras los pájaros migratorios cruzan continentes en un ballet celestial. Sus viajes reflejan la persistencia y la esperanza en medio de vastos horizontes.",
            "En un rincón del cielo, un águila majestuosa surca los vientos con su presa en garras. La naturaleza se muestra implacable, pero también sublime, en esta danza de cazador y presa."
        };

        int indice = random.nextInt(historiasAire.length);
        return historiasAire[indice];
    }

    public static void historia() {
        Historias historias = new Historias();

        // Llamar a los métodos para mostrar historias
        String historiaAgua = historias.MostrarHistoriaAgua();
        String historiaTierra = historias.MostrarHistoriaTierra();
        String historiaTierraIzquierda = historias.MostrarHistoriaTierraIzquierda();
        String historiaTierraDerecha = historias.MostrarHistoriaTierraDerecha();
        String historiaAire = historias.MostrarHistoriaAire();

        // Mostrar las historias en la consola
        System.out.println("Historia de Agua: " + historiaAgua);
        System.out.println("Historia de Tierra: " + historiaTierra);
        System.out.println("Historia de Aire: " + historiaAire);
    }
}
