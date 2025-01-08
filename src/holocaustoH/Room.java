package holocaustoH;

public class Room {
    public static final int WIDE = 10;
    public static final int HEIGHT = 10;

    //Properties
    private Position entranceDoor;
    private Position exitDoor;

    private Character player;

    public Room() {
        System.out.println("Creacion de una habitacion");
    }

    public Position getEntranceDoor () {
        return entranceDoor;
    }

    public void setEntranceDoor(Position entranceDoor) {
        this.entranceDoor = entranceDoor;
    }

    public Position getExitDoor () {
        return exitDoor;
    }

    public void setExitDoor(Position exitDoor){
        this.exitDoor = exitDoor;
    }

    public void setPlayer(Character player)  {
        this.player = player;
    }

    public boolean isDoor(Position door){
        return door.isEqual(entranceDoor) || door.isEqual(exitDoor);
    }
}
