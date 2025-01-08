package holocaustoH;

public class Position {

    private int posX;
    private int posY;

    public Position(){
        this.posX = 0;
        this.posY = 0;
    }

    public Position(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public boolean isEqual(Position pos){
        return pos.posX == this.posX && pos.posY == this.posY;
    }

}
