package programacion2.simuladorprogramacion;
import java.util.ArrayList;


public class CreacionTierra {
    public static ArrayList<AnimalesTerrestres> generadorTierra() {
        ArrayList<AnimalesTerrestres> Tierra = new ArrayList<>();
        // Animales Aereos
        // Animales Terrestres
        AnimalesTerrestres leon = new AnimalesTerrestres( "Mamifero","Panthera leo", "Leon", "Carnivoro", "Amarillo", 200);
        AnimalesTerrestres oso = new AnimalesTerrestres( "Mamifero", "Ailuropoda melanoleuca","Oso", "Omnivoro", "Blanco y negro", 200);
        AnimalesTerrestres lince = new AnimalesTerrestres( "Mamifero","Lynx spp", "Lince", "Carnivoro", "Manchas y rayas", 120);
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
        AnimalesTerrestres perro = new AnimalesTerrestres("Mamifero","Canis lupus familiaris","Perro","Carnivoro","Amarillo",40);
        AnimalesTerrestres gato = new AnimalesTerrestres("Mamifero","Felis catus","Gato","Carnivoro","Blanco y marron",25);
        AnimalesTerrestres conejo = new AnimalesTerrestres("Mamifero","Oryctolagus cuniculus","Conejo","Hervivioro","Marron",20);
        AnimalesTerrestres elefante = new AnimalesTerrestres("Mamifero","Elephas","Elefante","Hervivioro","Gris",300);
        AnimalesTerrestres avestruz = new AnimalesTerrestres("Mamifero","Struthio camelus","Avestruz","Omnivoro","Negro y blanco",200);
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
        Tierra.add(perro);
        Tierra.add(gato);
        Tierra.add(conejo);
        Tierra.add(elefante);
        Tierra.add(avestruz);
        return Tierra;
    }
}
