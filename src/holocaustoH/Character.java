package holocaustoH;

public class Character {
    //Propiedades
    private String nombre;
    Position pos;

    public Character(){
        System.out.println("Creando Personaje...");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }
}
