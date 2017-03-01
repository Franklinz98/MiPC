/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public abstract class Equipo {

    private Procesador procesador;

    private String serial;

    private Bodega bodega;

    private Disco disco;

    private float ram;

    private String marca;

    private String modelo;

    public Equipo(Procesador procesador, String serial, Disco disco, int ram, String marca, String modelo) {
        this.procesador = procesador;
        this.serial = serial;
        this.disco = disco;
        this.ram = ram;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Disco getDisco() {
        return disco;
    }

    public void setDisco(Disco disco) {
        this.disco = disco;
    }

    public float getRam() {
        return ram;
    }

    public void setRam(float ram) {
        this.ram = ram;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Bodega getBodega() {
        return bodega;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }

}
