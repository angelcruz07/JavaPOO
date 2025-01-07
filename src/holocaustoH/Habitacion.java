package holocaustoH;

public class Habitacion {
    // Tamaño de habitacion - Constantes
    public static final int ANCHO = 6;
    public static final int ALTO = 6;

    //Propiedades
    private Posicion puertaEntrada;

    public Habitacion(){
        System.out.println("Iniciando habitacion");
    }

    public Posicion getPuertaEntrada() {
        return puertaEntrada;
    }

    public void setPuertaEntrada(Posicion puertaEntrada) {
        this.puertaEntrada = puertaEntrada;
    }
}
