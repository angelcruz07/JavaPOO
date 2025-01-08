package YoRobbot;

public class Robbot {
    // Propiedades
    private float peso;

    //Piezas del robbot
    CPU cpu;
    Bateria bateria;


    // Constructor
    public Robbot(){
        this.cpu = new CPU();
        //Aplicando el concepto de herencia
        this.cpu.setNumSerie("rx2393003");
        this.bateria = new Bateria();
        this.bateria.setPeso(2.30f);
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
