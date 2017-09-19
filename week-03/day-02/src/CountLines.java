import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CountLines {

  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.

    Scanner fileScanner = new Scanner(System.in);
    System.out.println("Enter file name:");
    Path filePath = Paths.get(fileScanner.next());
    System.out.println(lineCounter(filePath));
  }

  private static int lineCounter(Path filePath) {
    int lineCounter = 0;
    List<String> fileLines;
    try {
      fileLines = Files.readAllLines(filePath);
    } catch (IOException e) {
      return 0;
    }
    for (String s: fileLines) {
      lineCounter += 1;
    }
    return lineCounter;
  }
}