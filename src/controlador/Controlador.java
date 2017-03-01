/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Disco;
import modelo.MiPc;
import modelo.Portatil;
import modelo.Procesador;


/**
 *
 * @author augustosalazar
 */
public class Controlador {
    
    private MiPc miPc;

    public Controlador(MiPc miPc) {
        this.miPc = miPc; 
    }

    public void agregarPB(int idBodega, String serialPortaril, String serialProcesador, int velocidadprocesador, float peso, Disco disco, int ram, String marca, float pantalla, String modelo) {
        Portatil p = new Portatil(new Procesador(serialProcesador, velocidadprocesador), serialPortaril, disco, ram, peso, marca, pantalla, modelo);
        miPc.agregarPortatil(miPc.getBodega(idBodega), p);
    }
    
}
