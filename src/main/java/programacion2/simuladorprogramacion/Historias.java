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
            "Bajo la inmensidad del cielo, las olas rompen suavemente en la playa. La marea está calma y serena. Llenando de tranquilidad el ambiente",
            "El agua azul cristalina del océano brindan un contexto ideal para visualizar y descubrir la inmensidad de la vida marítima.",
            "El viento sopla generando una agradable y satisfactoria brisa. El mismo viento genera un calmo movimiento en las aguas del mar.",
            "Al observar el mar, ves a un pescador lanzando su red al agua, esperando con paciencia. Su serenidad contagia hasta al mismo océano.",
            "En el océano se refleja el intenso sol. El agradable clima propicia un ambiente ideal para descubrir a la flora y fauna marina."
        };

        int indice = random.nextInt(historiasAgua.length);
        return historiasAgua[indice];
    }

        public String MostrarHistoriaAire() {
        String[] historiasAire = {
            "El cielo azul genera un lienzo de azul profundo adornado con nubes blancas como algodón que flotaban en la brisa tropical, donde las aves vuelan libremente",
            "El cielo resplandeciente es el escenario perfecto para que las aves puedan volar libremente en él",
            "El cielo despejado permite que el sol ilumine el día, dejando avistar a las maravillosas aves que recorren las alturas"
        };

        int indice = random.nextInt(historiasAire.length);
        return historiasAire[indice];
    }
    
    public String MostrarHistoriaTierra() {
        String[] historiasTierra = {
            "Al frente se encuentra la isla más grande del archipielago. Su inmensidad genera asombro por la gran cantidad de flora y fauna.",
            "El cielo resplandece alrededor de la gran isla a la que avistas. Nubes blancas crean un gran contraste con el celeste del cielo",
            "La gran extensión y belleza de la isla más grande del archipielago te invita a observar la diversa vida que en ella reside"
        };

        int indice = random.nextInt(historiasTierra.length);
        return historiasTierra[indice];
    }
    
    public String MostrarHistoriaTierraIzquierda(){
        String [] historiasTierraIzquierda = {
        "Hacia la izquierda apuntando al oeste, se encuentra una de las grandes islas del archipielago cuya magnificiencia natural genera sentimientos a cualquiera que la vea",
        "Hacia el oeste, emerge una de las islas destacadas del archipiélago, su impresionante belleza natural inspira asombro",
        "El sol ilumina y da vida a una de las islas más bellas del archipielago, las de aguas cristalinas rompen contra las arenas de su playa"
        };
        
        int indice = random.nextInt(historiasTierraIzquierda.length);
        return historiasTierraIzquierda[indice];
    }
    
        public String MostrarHistoriaTierraDerecha(){
        String [] historiasTierraDerecha = {
        "En la isla que se ubica al este se encuentra un paraíso natural inmaculado, donde la vida silvestre florece y la belleza prístina de la naturaleza reina supremamente",
        "Hacia el este avistamos una de las grandes islas donde la vida y la naturaleza se entrelazan en un equilibrio delicado generando belleza en su estado más puro",
        "Apuntando al este se encuentra una de las islas más imponentes, donde la tierra y el agua se fusionan para crear un mundo aparte, donde la vida florece en armonía con los elementos"
        };
        
        int indice = random.nextInt(historiasTierraDerecha.length);
        return historiasTierraDerecha[indice];
    }
}
