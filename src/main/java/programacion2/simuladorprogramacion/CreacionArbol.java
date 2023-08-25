package programacion2.simuladorprogramacion;

import java.util.ArrayList;

public class CreacionArbol{

    public static ArrayList<Arboles> generadorArbol() {
        ArrayList<Arboles> Arbol = new ArrayList<>();
        // Árboles
        Arboles arce = new Arboles("palmeadas","semillas aladas","arce","marrón oscuro","acer saccharinum","tierras aridas",23);
        Arboles adansonia = new Arboles("dentados","baya seca","adansonia","blanquecino","adansonia grandidieri","suelo arenoso",21);
        Arboles bachystegia = new Arboles("parapinadas","vaina plana","bachystegia","rojizo amarronado","brachystegia boehmii","suelo rocoso",25);
        Arboles croton = new Arboles("naranjas","cápsula de 3 lóbulos","croton","marrón claro","croton sylvaticus","laderas rocosas",30);
        Arboles erythrina = new Arboles("trifoliadas","vaina cilíndrica","erythrina","grisáceo","erythrina caffra","húmedos",16);
        Arboles ficus = new Arboles("ovaladas","higo peludo","ficus","griseáceo y anaranjado","ficus sycomorus","montañoso",9);
        Arboles ilex = new Arboles("estrechas y elípticas","baya esferica","ilex","marrón claro","ilex mitis","húmedo",28);
        Arboles pino = new Arboles("verde oscura","piñones","pino","marrón oscuro","pinus pinea","suelo arenoso",48);
        Arboles caoba = new Arboles("","capsula leñosa","caoba","caoba","swietenia macrophylla","suelos profundos",32);
        Arboles palmera = new Arboles("palmas","coco","palmera","marrón claro","arecaceae","tropical",15);
        // agrego los árboles al arraylist
        Arbol.add(arce);
        Arbol.add(adansonia);
        Arbol.add(bachystegia);
        Arbol.add(croton);
        Arbol.add(erythrina);
        Arbol.add(ficus);
        Arbol.add(ilex);
        Arbol.add(pino);
        Arbol.add(caoba);
        Arbol.add(palmera);
        return Arbol;
    }

}