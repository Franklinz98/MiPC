package modelo;

public class Servidor extends Equipo {

    int numcpus;
    
    int numhdds;
    
    int numlcards;
    
    public Servidor(Procesador procesador, String serial, Disco disco, int ram, String marca, String modelo, int cpus, int hdds, int lcards) {
        super(procesador, serial, disco, ram, marca, modelo);
        this.numcpus=cpus;
        this.numhdds=hdds;
        this.numlcards=lcards;
    }

    public int getNumcpus() {
        return numcpus;
    }

    public int getNumhdds() {
        return numhdds;
    }

    public int getNumlcards() {
        return numlcards;
    }

}
