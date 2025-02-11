package holocaustoH;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int optionGame = -1;

        Position entranceDoor = new Position(0, 3);
        Position exitDoor = new Position(5, Room.HEIGHT -1);

        Player player = new Player();
        Room initialRoom = new Room(entranceDoor, exitDoor, player);



        while(optionGame != Game.EXIT_GAME){
            try{
                Game.printRoom(initialRoom);
                Game.printMenu();
                optionGame = sc.nextInt();

                switch(optionGame){
                    case Game.THROW_DADO:
                        int numMov = Game.throwDado();
                        System.out.print("[MOVIMIENTO COLUMNAS/X] ¿Cuantas columnas quieres moverte? Tienes "+ numMov +" movimientos");
                        int numRows = sc.nextInt();
                        player.movX(numRows);
                        numMov -= numRows;

                        System.out.print("[MOVIMIENTO FILAS/Y] ¿Cuantas filas quieres moverte? Tienes "+numRows+" movimientos");
                        int numCols = sc.nextInt();
                        player.movY(numCols);

                        break;
                    default:
                        System.out.println("Opcion invalida");

                }
            } catch (Exception e){
                System.out.println("Por favor ingrese una opcion valida");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
