package wanderer;

public class Boss extends PositionedImage {


  public Boss(String fileName, int posX, int posY) {
    super("assets/boss.png", posX, posY);
    }
  }

//  public void bossMove() {
//      int temp = (int) (Math.random() * 4);
//      if (temp == 0) {
//    if (this.posX > 0 && !myMap.isWall(this.posX - 1, posY)) {
//      this.posX --;
//    }
//      }
//      else if (temp == 1) {
//    if (this.posX < 9 && !myMap.isWall(this.posX + 1, posY)) {
//      this.posX ++;
//    }
//      }
//      else if (temp == 2) {
//    if (this.posY < 9 && !myMap.isWall(this.posX, posY + 1)) {
//      this.posX ++;
//    }
//      }
//      else {
//    if (this.posY > 0 && !myMap.isWall(this.posX, posY - 1)) {
//      this.posY --;
//    }
//      }
//    }
