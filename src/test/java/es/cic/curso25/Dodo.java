package es.cic.curso25;


//Concurrencia y singleton

public class Dodo {

    private static Dodo instancia;

    private Dodo() {

    }

    public static Dodo getInstancia() {
        if (instancia == null){
            instancia = new Dodo();
        }
        return instancia;
    }

}
