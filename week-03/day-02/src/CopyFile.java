import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFile {

  public static void main(String[] args) {
    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful

    Scanner inputScanner = new Scanner(System.in);
    System.out.println("Please enter the source file with path:");
    String sourceFile = inputScanner.next();
    System.out.println("Please enter the destination file with path:");
    String destinationFile = inputScanner.next();

    System.out.println(copyMachine(sourceFile, destinationFile));
  }

  private static boolean copyMachine(String sourceFile, String destinationFile) {
    List<String> clipBoard = new ArrayList<>();
    List<String> clipBoardCheck = new ArrayList<>();

    Path source = Paths.get(sourceFile);
    Path destination = Paths.get(destinationFile);

    try {
      clipBoard = Files.readAllLines(source);
      Files.write(destination, clipBoard);

      clipBoardCheck = Files.readAllLines(destination);

      if (clipBoardCheck.containsAll(clipBoard)) {
        return true;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return false;
  }
}