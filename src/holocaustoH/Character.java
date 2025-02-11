package holocaustoH;

public class Character {

  private String name;
  private Position pos;

  public Character() {
    System.out.println("Creando Personaje...");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Position getPos() {
    return pos;
  }

  public void setPos(Position pos) {
    this.pos = pos;
  }

  public void movX(int x) {
    this.pos.setPosX(pos.getPosX() + x) ;
  }

  public void movY(int y){
    this.pos.setPosY(pos.getPosY() + y);
  }

}
