import java.util.ArrayList;

/**4. Write a Java program to create a new array list, add some colours (string) and
 printout the collection using for each loop.
 */
public class Program_4 {



    public static void main(String[] args) {

        ArrayList<String> colours = new ArrayList<>();

        colours.add("Blue");
        colours.add("Green");
        colours.add("White");
        colours.add("Red");
        colours.add("Yellow");
        colours.add("Grey");
        colours.add("Orange");

        for (String data : colours) {
            System.out.println(data);


    }

    }

}
