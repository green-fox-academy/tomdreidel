import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // Thw first number represents the number of girls that comes to a party, the
        // second the boys
        // It should print: The party is excellent!
        // If the the number of girls and boys are equal and there are more people coming than 20
        //
        // It should print: Quite cool party!
        // It there are more than 20 people coming but the girl - boy ratio is not 1-1
        //
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people

        Scanner headCounter = new Scanner(System.in);

        System.out.println("How many girls are coming to the party?");
        int girls = headCounter.nextInt();

        System.out.println("How many boys are coming to the party?");
        int boys = headCounter.nextInt();
        
        int people = girls + boys;

        if (girls < 1) {
            System.out.println("Sausage party");
        }
        else if(girls == boys && people > 20) {
            System.out.println("The party is excellent!");
        }
        else if(girls != boys && people > 20) {
            System.out.println("Quite cool party!");
        }
        else if(people <= 20) { // exactly 20 ppl was not covered in the text so I included it here
            System.out.println("Average party...");
        }
    }
}