package YoRobbot;

public class Robbot {
    // Propiedades

    //Publica
    // public float peso;
    private float peso;

    // Constructor
    public Robbot(){

    }

    //Setters y Getters
    public void setPeso(float peso){
        if(this.peso <= 0) peso = 0;
        else this.peso = peso;
    }

    public float getPeso() {
         return peso;
    }
}
