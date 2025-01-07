package holocaustoH;

public class Personaje {
    //Propiedades
    private String nombre;
    Posicion pos;

    public Personaje(){
        System.out.println("Creando Personaje...");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Posicion getPos() {
        return pos;
    }

    public void setPos(Posicion pos) {
        this.pos = pos;
    }
}
