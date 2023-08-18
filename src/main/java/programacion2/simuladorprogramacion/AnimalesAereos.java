package programacion2.simuladorprogramacion;


public class AnimalesAereos extends Animales {
    private String tamanioAlas, tamanioPico;

    public AnimalesAereos(String tamanioAlas, String tamanioPico, String especie, String raza, String alimentacion, String color, int tamanio) {
        super(especie, raza, alimentacion, color, tamanio);
        this.tamanioAlas = tamanioAlas;
        this.tamanioPico = tamanioPico;
    }

    public String getTamanioAlas() {
        return tamanioAlas;
    }

    public void setTamanioAlas(String tamanioAlas) {
        this.tamanioAlas = tamanioAlas;
    }

    public String getTamanioPico() {
        return tamanioPico;
    }

    public void setTamanioPico(String tamanioPico) {
        this.tamanioPico = tamanioPico;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    
}
