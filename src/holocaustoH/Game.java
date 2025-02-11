package holocaustoH;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    final static int THROW_DADO=1;
    final static int EXIT_GAME=2;

    public Game() {
    }

    public static void printRoom(Room room){
        System.out.println("-------------------- MAPA ----------------------");

        for(int row = -1; row < Room.HEIGHT; row ++ ){
            for(int col = 0; col <= Room.WIDE; col ++){
                Position  currentPosition = new Position(col, row);

                if(room.isPlayer(currentPosition)) System.out.print("J");
                else if (row == -1 && col != Room.WIDE) System.out.print(col);
                else if (col == Room.WIDE && row != -1) System.out.print(row);
                else if (room.isDoor(currentPosition)) System.out.print(" ");
                else if(col == 0 || col == Room.WIDE - 1) System.out.print("|"); //Colum
                else if(row == 0 || row == Room.HEIGHT - 1) System.out.print("="); // Row
                else System.out.print(" "); //Map

                if(col == Room.WIDE) System.out.println();
            }
        }
    }

    public static void printMenu(){
        System.out.println("---------- Holocausto H -----------");
        System.out.println("[1] Lanzar dado de movimiento");
        System.out.println("[2] Salir");
        System.out.println("------------------------------------");
        System.out.println();
    }

    public static void solveObject() {

    }

    public static int throwDado(){
        //Generando un numero aleatorio que contempla de 1 a 6
        int dado = ThreadLocalRandom.current().nextInt(0, 7);

        System.out.println("Dado lanzado: " + dado );

        return dado;
    }





}
