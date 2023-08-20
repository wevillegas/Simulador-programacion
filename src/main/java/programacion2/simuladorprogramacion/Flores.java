package programacion2.simuladorprogramacion;

public class Flores extends Flora {
    private String petalos;

    public Flores(String petalos, String especie, String color, String tipo, String habitat, int tamanio) {
        super(especie, color, tipo, habitat, tamanio);
        this.petalos = petalos;
    }

    public String getPetalos() {
        return petalos;
    }

    public void setPetalos(String petalos) {
        this.petalos = petalos;
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
