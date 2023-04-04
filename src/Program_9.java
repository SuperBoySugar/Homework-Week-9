import java.util.HashMap;

/**9. Create a HashMap object called people that will store String keys and Integer values:
        And use for each loop to iterate the value from Map.
 */

public class Program_9 {

    public static void main(String[] args) {

        //HashMap object called people
        HashMap<String, Integer> people = new HashMap<>();

        // Add keys and Values (Players name and runs
        people.put("Kohli", 9);
        people.put("Sachin" ,7);
        people.put("Rohit", 6);
        people.put("Chahar", 5);
        people.put("Jadeja", 4);

        for (String i : people.keySet()){
            System.out.println("Key: " + i + " value: " + people.get(i));
        }

    }
}
