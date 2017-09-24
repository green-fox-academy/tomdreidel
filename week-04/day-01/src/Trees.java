public class Trees {

  public static void main(String[] args) {

    int trees = 5;
    int retreiveTree = 2;

    int[] treeNumber = new int[trees];
    String[] treeType = new String[trees];
    String[] treeColor = new String[trees];
    int[] treeAge = new int[trees];
    String[] treeSex = new String[trees];

    treeNumber[0] = 1;
    treeType[0] = "larch";
    treeColor[0] = "green";
    treeAge[0] = 85;
    treeSex[0] = "female";

    treeNumber[1] = 2;
    treeType[1] = "oak";
    treeColor[1] = "dark green";
    treeAge[1] = 22;
    treeSex[1] = "female";

    treeNumber[2] = 3;
    treeType[2] = "teak";
    treeColor[2] = "stale";
    treeAge[2] = 23;
    treeSex[2] = "male";

    treeNumber[3] = 4;
    treeType[3] = "birch";
    treeColor[3] = "yellow";
    treeAge[3] = 65;
    treeSex[3] = "male";

    treeNumber[4] = 5;
    treeType[4] = "maple";
    treeColor[4] = "red";
    treeAge[4] = 9;
    treeSex[4] = "female";

    System.out.println("Tree number: " + treeNumber[retreiveTree]);
    System.out.println("Tree type: " + treeType[retreiveTree]);
    System.out.println("Leaf color: " + treeColor[retreiveTree]);
    System.out.println("Tree age: " + treeAge[retreiveTree]);
    System.out.println("Tree gender: " + treeSex[retreiveTree]);
  }
}