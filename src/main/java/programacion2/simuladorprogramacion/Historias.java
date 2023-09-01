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
            "Historia agua 1",
            "Historia agua 2",
            "Historia agua 3",
            "Historia agua 4",
            "Historia agua 5"
        };

        int indice = random.nextInt(historiasAgua.length);
        return historiasAgua[indice];
    }

    public String MostrarHistoriaTierra() {
        String[] historiasTierra = {
            "Historia tierra 1",
            "Historia tierra 2",
            "Historia tierra 3",
            "Historia tierra 4",
            "Historia tierra 5"
        };

        int indice = random.nextInt(historiasTierra.length);
        return historiasTierra[indice];
    }

    public String MostrarHistoriaAire() {
        String[] historiasAire = {
            "Historia aire 1",
            "Historia aire 2",
            "Historia aire 3",
            "Historia aire 4",
            "Historia aire 5"
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
