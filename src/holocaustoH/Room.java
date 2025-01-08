package holocaustoH;

public class Room {
    public static final int WIDE = 10;
    public static final int HEIGHT = 10;

    //Properties
    private Position entranceDoor;
    private Position exitDoor;
    private Character player;

    //Constructor
    public Room(Position entranceDoor, Position exitDoor, Character player) {
        this.entranceDoor = entranceDoor;
        this.exitDoor = exitDoor;
        this.player = player;
        this.player.setPos(this.entranceDoor);
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

    public void setCharacter(Character player){

    }

    public void setPlayer(Player player)  {
        this.player = player;
    }

    public boolean isDoor(Position door){
        return door.isEqual(entranceDoor) || door.isEqual(exitDoor);
    }

    public boolean isPlayer(Position player){
        return this.player.pos.isEqual(this.player.getPos());
    }
}
