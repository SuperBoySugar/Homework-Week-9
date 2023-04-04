import java.util.HashMap;
import java.util.Scanner;

/**10. Write the programme that tell you which line pass through particular stations.
 Just use Zone 1 stations name.
 */

public class Program_10 {

    public static void main(String[] args) {
        char result;

        System.out.println("London Underground Zone 1 station: ");
        System.out.println("Marble Arch, Bond Street, Green Park, Piccadilly Circus, Leicester Square, Old Stree, Westminster Knightbridge, Holland Park");

        // HashMap object for zone
        HashMap<String, String> zone = new HashMap<>();

        zone.put("Marble Arch", "Central line");
        zone.put("Bond Street", "Central line & jubile line");
        zone.put("Green Park", "Victoria line & Picadilly line & jubilee line");
        zone.put("Piccadilly Circus", "Piccadilly line & Piccadilly line");
        zone.put("Leicester Square", "Northern line & Piccadilly line");
        zone.put("Old Street", "Norther line");
        zone.put("Knightbridge", "Piccadilly line");
        zone.put("Holland", "Central line");
        zone.put("Westminster", "Jubilee line, Circle line, District line");

       do {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Enter any station name: ");
           String stationName = scanner.nextLine();

           //for-each loop to display station name and tube lines
           for (String str : zone.keySet())
           {
               if (stationName.equals(str))
               {
                   System.out.println("Tube Lines: " + zone.get(str));
               }
           }
           System.out.println(" ");
           System.out.println("Do you want to try again 'Y' or 'N': ");
           result = scanner.next().charAt(0);

       }while (result == 'Y' || result == 'Y');





    }

}
