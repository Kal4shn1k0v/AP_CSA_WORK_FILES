import jdk.internal.util.xml.impl.Input;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class NameGenerator {
    public static void main(String[] args) {
        System.out.println("Welcome to the name generator!");
        System.out.println("For the best results, please do not make up words.");
        System.out.println("Please answer the following questions in order to get your name:");

        System.out.println("What is your first name?");
        String firstName = getInput();

        System.out.println("What is your last name?");
        String lastName = getInput();

        System.out.println("What city were you born in?");
        String city = getInput();

        System.out.println("What is your best friend's name?");
        String friend = getInput();

        System.out.println("What is the first name of a random relative");
        String relativeName = getInput();

        String output = "Guten Morgen, " + genTitle() + " " + genFirstName(firstName, lastName) + " " + genLastName(city, relativeName) + " von " + genLocation(city, friend, relativeName) + "; Wilkommen!";
        System.out.println(output);

        System.out.println();
        System.out.println("That you very much for using this program!");
    }

    public static String getInput(){
        Scanner in = new Scanner(System.in);
        return in.next();
    }

    public static int getRandom(int min, int max){
        int random = ThreadLocalRandom.current().nextInt(min, max + 1);;

        return random;
    }

    public static String genFirstName(String firstName, String lastname){
        List<Character> list = new ArrayList<Character>();
        for(char c : (firstName + lastname).toCharArray()) {
            list.add(c);
        }
        Collections.shuffle(list);
        StringBuilder builder = new StringBuilder();
        for(char c : list) {
            builder.append(c);
        }
        String result = builder.toString();

        result.toLowerCase();
        result = result.substring(0, 1).toUpperCase() + result.substring(1);

        return result;
    }

    public static String genLastName(String city, String relative){
        String result = city.substring(0, 2) + relative.substring(0,3);

        //result = result + RandomStringUtils.randomAlphabetic(stringLength);

        result.toLowerCase();
        result = result.substring(0, 1).toUpperCase() + result.substring(1);

        return result;
    }

    public static String genLocation(String city, String friend, String relative){
        String result = city;
        String pre1 = relative.substring(getRandom(1, relative.length()), relative.length());
        String pre2 = friend.substring(1,getRandom(2, friend.length()));

        (result + pre1 + pre2).toLowerCase();
        result = result.substring(0, 1).toUpperCase() + result.substring(1);

        return result;
    }

    public  static String genTitle(){
        String titles[] = new String[20];
        titles[0] = "Admiral"; titles[1] = "Colonel"; titles[2] = "General"; titles[3] = "Moff"; titles[4] = "Dark Lord"; titles[5] = "Officer"; titles[6] = "Plebian"; titles[7] = "Citizen"; titles[8] = "Commoner";

        String result = titles[getRandom(0, 8)];

        return result;
    }
}
