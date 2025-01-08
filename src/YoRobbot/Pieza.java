package YoRobbot;

public class Pieza {
    //Properties
    private float peso;
    private String numSerie;
    private boolean activo;

    //Constructor
    public Pieza() {
        this.peso = 0;
        this.numSerie = "";
        this.activo = true;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}
