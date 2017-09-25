class PostIt {

  String backgroundColor;
  String textColor;
  String text;

  public PostIt() {
  }

  public PostIt(String backgroundColor, String textColor, String text) {
    this.backgroundColor = backgroundColor;
    this.textColor = textColor;
    this.text = text;
  }

  public static void main(String[] args) {

    PostIt firstStickie = new PostIt("orange", "brown", "Idea 1");
    PostIt secondStickie = new PostIt("pink", "black",null);
    PostIt thirdStickie = new PostIt();

    firstStickie.textColor = "blue";

    secondStickie.text = "Awesome";

    thirdStickie.backgroundColor = "yellow";
    thirdStickie.textColor = "green";
    thirdStickie.text = "Superb";

    System.out.println(firstStickie.backgroundColor);
    System.out.println(firstStickie.textColor);
    System.out.println(firstStickie.text);

    System.out.println(secondStickie.backgroundColor);
    System.out.println(secondStickie.textColor);
    System.out.println(secondStickie.text);

    System.out.println(thirdStickie.backgroundColor);
    System.out.println(thirdStickie.textColor);
    System.out.println(thirdStickie.text);
  }
}