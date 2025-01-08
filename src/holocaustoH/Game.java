package holocaustoH;

public class Game {

    public Game() {


    }


    public static void printRoom(Room room){
        for(int row = 0; row < Room.HEIGHT; row++ ){
            for(int col = 0; col < Room.WIDE; col++){
                Position  currentPosition = new Position(col, row);
                if(room.isDoor(currentPosition)) System.out.print(" ");

                else if(col == 0 || col == Room.WIDE - 1) System.out.print("|"); //Colum
                else if(row == 0 || row == Room.HEIGHT - 1) System.out.print("-"); // Row
                else System.out.print(" "); //Map


                if(col == Room.WIDE - 1) System.out.println();
            }
        }
    }


}
