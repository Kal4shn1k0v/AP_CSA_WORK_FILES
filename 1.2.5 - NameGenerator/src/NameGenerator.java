import jdk.internal.util.xml.impl.Input;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class NameGenerator {
    public static void main(String[] args) {
        System.out.println("Welcome to the name generator!");
        System.out.println("For the best results, please do not lie.");
        System.out.println("Please answer the following questions to get your name:");

        System.out.println("What is your first name?");
        String firstName = getInput();

        System.out.println("What is your last name?");
        String lastName = getInput();

        System.out.println("What city were you born in?");
        String city = getInput();

        System.out.println("What previous school did you attend?");
        String school = getInput();

        System.out.println("What is the first name of a random relative");
        String relativeName = getInput();

        String output = "Guten Morgen, " + genFirstName(firstName) + " " + genLastName(lastName) + " von " + genLocation(city, school, relativeName) + ". Wilkommen!";
        System.out.println(output);
    }

    public static String getInput(){
        Scanner in = new Scanner(System.in);
        return in.next();
    }

    public static String genFirstName(String firstName){
        String result = firstName;

        return result;
    }

    public static String genLastName(String lastName){
        String result = lastName;

        return result;
    }

    public static String genLocation(String city, String school, String location){
        String result = city;

        return result;
    }
}
