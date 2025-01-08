package holocaustoH;

public class Main {
    public static void main(String[] args) {

        Position entranceDoor = new Position(0, 3);
        Position exitDoor = new Position(5, Room.HEIGHT -1);

        Player player = new Player();
        Room initialRoom = new Room(entranceDoor, exitDoor, player);

        Game.printRoom(initialRoom);
    }
}
