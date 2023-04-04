import java.util.ArrayList;

/**11. Declare following two arrylist and compare it.
 ArrayList<String> c1= new ArrayList<String>();
 c1.add("Red");
 c1.add("Green");
 c1.add("Black");
 c1.add("White");
 c1.add("Pink");
 ArrayList<String> c2= new ArrayList<String>();
 c2.add("Red");
 c2.add("Green");
 c2.add("Black");
 c2.add("Pink");
 */


public class Program_11 {

    public static void main(String[] args) {

        //First Array list
        ArrayList<String> c1 = new ArrayList<>();
        //Add elements to the arraylist
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println(c1);

        //second arrat list
        ArrayList<String> c2 = new ArrayList<>();
        //Add elements to the arraylist
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");

        c2.add("Pink");
        System.out.println(c2);

        //comparing both lists
        boolean compare = c1.equals(c2);
        System.out.println(compare);



    }





}
