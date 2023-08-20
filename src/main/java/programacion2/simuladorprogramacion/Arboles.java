
package programacion2.simuladorprogramacion;


public class Arboles extends Flora {
    private String hojas, fruto;

    public Arboles(String hojas, String fruto, String especie, String color, String tipo, String habitat, int tamanio) {
        super(especie, color, tipo, habitat, tamanio);
        this.hojas = hojas;
        this.fruto = fruto;
    }

    public String getHojas() {
        return hojas;
    }

    public void setHojas(String hojas) {
        this.hojas = hojas;
    }

    public String getFruto() {
        return fruto;
    }

    public void setFruto(String fruto) {
        this.fruto = fruto;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    
    
    
}
