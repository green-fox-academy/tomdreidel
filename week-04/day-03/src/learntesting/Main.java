package learntesting;

import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

    String test = "kezek";
    System.out.println(test.replaceAll("[aeouiAEOUI] /g \$&v$&"));


  }
}