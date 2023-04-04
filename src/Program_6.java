// 6. Write a Java program to retrieve an element (at a specified index) from a given array list

import java.util.ArrayList;
import java.util.List;

public class Program_6 {

    public static void main(String[] args) {

        // Create a list and some countryName to the list
        List<String> countryName = new ArrayList<>();

        countryName.add("India");
        countryName.add("UK");
        countryName.add("France");
        countryName.add("Germany");
        countryName.add("Africa");
        countryName.add("America");
        countryName.add("Australia");
        countryName.add("Poland");
        countryName.add("Spain");

        //Print the list
        System.out.println(countryName);

        // Retrieve first element from the list
        String country = countryName.get(0);
        System.out.println("\nFirst country: " + country);

        // Retrieve six element from the list
        country = countryName.get(6);
        System.out.println("Sixth country: " + country);


    }
}
