package modelo;

public class Procesador {

    private String Marca;

    private String Modelo;

    private int Velocidad;

    private String Serial;

    public Procesador(String serial, int velocidad) {
        this.Velocidad = velocidad;
        this.Serial = serial;
    }

}
