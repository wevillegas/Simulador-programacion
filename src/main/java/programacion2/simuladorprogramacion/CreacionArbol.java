package programacion2.simuladorprogramacion;

import java.util.ArrayList;

public class CreacionArbol{

    public static ArrayList<Arboles> generadorArbol() {
        ArrayList<Arboles> Arbol = new ArrayList<>();
        // Árboles
        Arboles arce = new Arboles("Varias puntas","Semillas aladas","Arce","Marrón oscuro","Acer saccharinum","Tierras aridas",23);
        Arboles adansonia = new Arboles("Dentados","Baya seca","Adansonia","Blanquecino","Adansonia grandidieri","Suelo arenoso",21);
        Arboles abedul = new Arboles("Romboidales","Sámaras","Abedul","Grisáceo","Betula populifolia","Suelo humedado",8);
        Arboles croton = new Arboles("Naranjas","Cápsula de 3 lóbulos","Croton","Marrón claro","Croton sylvaticus","Laderas rocosas",30);
        Arboles sauce = new Arboles("Linear-lanceoladas","Cápsula cónica","Sauce","Marrón oscuro","Salix babylonica","Suelo humedo",12);
        Arboles ficus = new Arboles("Ovaladas","Higo peludo","Ficus","Griseáceo y anaranjado","Ficus sycomorus","Montañoso",9);
        Arboles ilex = new Arboles("Estrechas y elípticas","Baya esferica","Ilex","Marrón claro","Ilex mitis","Húmedo",28);
        Arboles pino = new Arboles("Verde oscura","Piñones","Pino","Marrón oscuro","Pinus pinea","Suelo arenoso",48);
        Arboles caoba = new Arboles("Paripinadas","Capsula leñosa","Caoba","Caoba","Swietenia macrophylla","Suelos profundos",32);
        Arboles palmera = new Arboles("Palmas","Coco","Palmera","Marrón claro","Arecaceae","Tropical",15);
        // agrego los árboles al arraylist
        Arbol.add(abedul);
        Arbol.add(adansonia);
        Arbol.add(arce);
        Arbol.add(caoba);
        Arbol.add(croton);
        Arbol.add(ficus);
        Arbol.add(ilex);
        Arbol.add(palmera);
        Arbol.add(pino);
        Arbol.add(sauce);

        return Arbol;
    }

}