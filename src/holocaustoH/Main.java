package holocaustoH;

public class Main {
    public static void main(String[] args) {
        Room initialRoom = new Room();

        Position entranceDoor = new Position();
        initialRoom.setEntranceDoor(entranceDoor);

        Position exitDoor = new Position(5, Room.HEIGHT - 1);
        initialRoom.setExitDoor(exitDoor);

        Character player = new Character();
        initialRoom.setPlayer(player);

        Game.printRoom(initialRoom);
    }
}
