import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {

  public static void main(String[] args) {
    // Create a function that takes 3 parameters: a path, a word and a number,
    // than it should write to a file.
    // The path parameter should be a string, that describes the location of the file.
    // The word parameter should be a string, that will be written to the file as lines
    // The number parameter should describe how many lines the file should have.
    // So if the word is "apple" and the number is 5, than it should write 5 lines
    // to the file and each line should be "apple"
    // The function should not raise any error if it could not write the file.

    Scanner inputScanner = new Scanner(System.in);
    System.out.println("Enter a new file name:");
    String fileName = inputScanner.next();
    System.out.println("Enter a word:");
    String fillWord = inputScanner.next();
    System.out.println("Enter the number of lines:");
    int totalLines = inputScanner.nextInt();

    fileFactory(fileName, fillWord, totalLines);
  }

  private static void fileFactory(String fileName, String fillWord, int totalLines) {
    Path createPath = Paths.get("src/assets/" + fileName);
    List<String> filler = new ArrayList<>();
    for (int i = 0; i < totalLines; i++) {
      filler.add(fillWord);
    }
    try {
        Files.write(createPath, filler);
    } catch (IOException e) {
      }
  }
}