import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        System.out.println("What is your user name?");
        Scanner usernameScanner = new Scanner(System.in);
        String username = usernameScanner.next();
        System.out.println("Hello, " + username + "!");
    }
}
