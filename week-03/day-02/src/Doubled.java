import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt

    Path encryptedFile = Paths.get("src/assets/duplicated-chars.txt");
    System.out.println(decryptDuplicates(encryptedFile));
  }

  private static String decryptDuplicates(Path encryptedFile) {
    List<String> tempText = new ArrayList<>();
    List<String> decryptedText = new ArrayList<>();
    try {
      tempText = Files.readAllLines(encryptedFile);
    } catch (IOException e) {
      System.out.println("Could not read the file: " + encryptedFile);
      System.exit(1);
    }

    for (String s: tempText) {
      for (int i = 0; i < s.length(); i++) {
        String innerBefore = s.substring(0, i);
        String innerAfter = s.substring(i + 1);
        String innerSub = s.substring(i, i + 1);

        if (innerSub.substring(0, 0).equals(innerSub.substring(1, 1))) {
          innerSub = innerSub.substring(0, 0);
          s = innerBefore + innerSub + innerAfter;
        }
      }
      decryptedText.add(s);
    }

    Path decryptedFile = Paths.get("src/assets/duplicated-chars-decrypted.txt");
    try {
      Files.write(decryptedFile, decryptedText);
    } catch (IOException e) {
      System.out.println("Decryption failed");
    }
    return "Decryption finished, check file here: " + decryptedFile;
  }
}