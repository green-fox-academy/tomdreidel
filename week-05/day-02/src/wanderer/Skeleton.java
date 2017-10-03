package wanderer;

public class Skeleton extends PositionedImage {
  int skeletonID;

  public Skeleton(int posX, int posY, int skeletonID) {
    super("assets/skeleton.png", posX, posY);
    this.skeletonID = skeletonID;
  }

}
