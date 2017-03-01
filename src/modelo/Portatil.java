package modelo;

public class Portatil extends Equipo {

    private float peso;

    private float pantalla;
    
    public Portatil(Procesador procesador, String serial, Disco disco, int ram, float peso, String marca, float pantalla, String modelo) {
        super(procesador, serial, disco, ram, marca, modelo);
        this.peso = peso;
        this.pantalla=pantalla;
    }

    public float getPeso() {
        return peso;
    }

    public float getPantalla() {
        return pantalla;
    }

}
