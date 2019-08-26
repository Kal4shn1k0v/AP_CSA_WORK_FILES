/*
    @author:
    @version: 0.
*/

package projekt;

import greenfoot.export.GreenfootScenarioApplication;

import javax.swing.*;

//Launches program

public class DemoApp extends GreenfootScenarioApplication {
    //Creates global variables.
    public static int lobsternum;
    public static int timeinterval;

    public static void main(String[] args) {
        //User input for # of lobsters.
        String count = JOptionPane.showInputDialog("Number of Crabs");
        if ((count != null) && (count.length() > 0)) {
            //System.exit(1);
        }

        //User input for


        //Sets global variable
        lobsternum = Integer.parseInt(count);
        timeinterval = 0;

        //Launches program
        GreenfootScenarioApplication.launch(args);
    }
}
