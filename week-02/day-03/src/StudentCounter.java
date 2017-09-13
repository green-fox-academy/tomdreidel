import java.util.*;

public class StudentCounter{
    public static void main(String... args){
        ArrayList<Map<String, Object>> map = new ArrayList<>();

        // Given this list of hashmaps...

        Map<String, Object> row0 = new HashMap<>();
        row0.put("name", "Rezso");
        row0.put("age", 9.5);
        row0.put("candies", 2);
        map.add( row0 );

        Map<String, Object> row1 = new HashMap<>();
        row1.put("name", "Gerzson");
        row1.put("age", 10);
        row1.put("candies", 1);
        map.add( row1 );

        Map<String, Object> row2 = new HashMap<>();
        row2.put("name", "Aurel");
        row2.put("age", 7);
        row2.put("candies", 3);
        map.add( row2 );

        Map<String, Object> row3 = new HashMap<>();
        row3.put("name", "Zsombor");
        row3.put("age", 12);
        row3.put("candies", 5);
        map.add( row3 );

        Map<String, Object> row4 = new HashMap<>();
        row4.put("name", "Olaf");
        row4.put("age", 12);
        row4.put("candies", 7);
        map.add( row4 );

        Map<String, Object> row5 = new HashMap<>();
        row5.put("name", "Teodor");
        row5.put("age", 3);
        row5.put("candies", 2);
        map.add( row5 );

        // Display the following things:
        //  - Who has got more candies than 4 candies
        //  - Sum the age of people who have lass than 5 candies

        ArrayList<String> candyKings = new ArrayList<>();
        double ageAggregator = 0;

        for (int i = 0; i < map.size(); i++) {
            if ((int) map.get(i).get("candies") > 4) {
                candyKings.add((String) map.get(i).get("name"));
            }
        }

        for (int i = 0; i < map.size(); i++) {
            if ((int) map.get(i).get("candies") < 5) {
               ageAggregator += Double.parseDouble(String.valueOf(map.get(i).get("age")));
            }
        }

        System.out.println("--------------------------------");
        System.out.println("People with more than 4 candies:");
        System.out.println(candyKings);
        System.out.println("--------------------------------");
        System.out.println("Sum of age of people with less than 5 candies:");
        System.out.println(ageAggregator);
    }
}