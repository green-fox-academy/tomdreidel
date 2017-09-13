import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));
        ArrayList<String> order = new ArrayList<>();

        // Join the two lists by matching one girl with one boy in the order list
        // Expected output: "Eve", "Joe", "Ashley", "Fred"...

        for (int i = 0; i < girls.size(); i++) {
            order.add(order.size(), girls.get(i));
            order.add(order.size(), boys.get(i));
        }
        System.out.println(order);
    }
}