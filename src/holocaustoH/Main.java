package holocaustoH;

public class Main {
    public static void main(String[] args) {

        Posicion posInicial = new Posicion(6,6);
        posInicial.setPosX(6);
        posInicial.setPosY(6);

        Habitacion habitacion1 = new Habitacion();
        Personaje jugador = new Personaje();

        jugador.setPos(posInicial);

        Juego.pintarHabitacion(habitacion1);
    }
}
