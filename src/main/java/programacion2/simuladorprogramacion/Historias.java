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
            "Bajo la luna llena, las olas rompen suavemente en la playa desierta. El mar susurra historias antiguas, llenando de misterio la noche tranquila.",
            "Una pareja de ancianos camina de la mano a lo largo del paseo marítimo.",
            "Una madre lleva a su hijo a ver el océano por primera vez. El niño observa con ojos asombrados, sintiendo la inmensidad y la eternidad del mar.",
            "Un pescador lanza su red al agua, esperando con paciencia. El mar le enseña que la recompensa llega a quienes perseveran, con la abundancia de sus aguas.",
            "En la oscuridad de la noche, las luciérnagas del mar iluminan las aguas. Su resplandor crea un espectáculo mágico que deja a los observadores maravillados por la belleza oculta del océano."
        };

        int indice = random.nextInt(historiasAgua.length);
        return historiasAgua[indice];
    }

    public String MostrarHistoriaTierra() {
        String[] historiasTierra = {
            "Un grupo de amigos excursiona por las montañas, enfrentando desafíos naturales. Se encuentran tal animal...",
            "Mariposas y abejas comparten néctar de flores. Su danza simbiótica destaca la interdependencia en la vida terrestre y el papel vital de cada ser en el ecosistema.",
            "Una pareja camina de la mano por un sendero, encontrando serenidad en la naturaleza. La vida terrestre ofrece refugio y sanación a quienes buscan la tranquilidad.",
            "Un excursionista observa un río serpenteante desde lo alto de una montaña. La vida terrestre fluye con un ritmo eterno que nos recuerda la constancia de la naturaleza.",
            "Un leñador tala un árbol con respeto y gratitud. La vida terrestre nos enseña que, aunque tomemos de la naturaleza, debemos hacerlo con consideración.",
            "Una familia se relaja junto a un río, escuchando el murmullo del agua. La vida terrestre fluye como un río, siempre cambiante y siempre en movimiento.",
            "En un campo de lavanda, las abejas zumban en busca de néctar. La vida terrestre es un concierto de sonidos y aromas que celebra la diversidad de la Tierra.",
            "Un grupo de amigos monta una tienda de campaña en la montaña. La vida terrestre es una invitación a la aventura y a conectar con la esencia de la naturaleza.",
            "Un corredor se sumerge en un bosque en la madrugada, sintiendo la frescura del aire. La vida terrestre es un recordatorio de la vitalidad y la belleza de la naturaleza.",
            "Un guía turístico comparte historias sobre la vida silvestre. La vida terrestre nos conecta con el pasado y el futuro de nuestro planeta."
        };

        int indice = random.nextInt(historiasTierra.length);
        return historiasTierra[indice];
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

    public static void main(String[] args) {
        Historias historias = new Historias();

        // Llamar a los métodos para mostrar historias
        String historiaAgua = historias.MostrarHistoriaAgua();
        String historiaTierra = historias.MostrarHistoriaTierra();
        String historiaAire = historias.MostrarHistoriaAire();

        // Mostrar las historias en la consola
        System.out.println("Historia de Agua: " + historiaAgua);
        System.out.println("Historia de Tierra: " + historiaTierra);
        System.out.println("Historia de Aire: " + historiaAire);
    }
}
