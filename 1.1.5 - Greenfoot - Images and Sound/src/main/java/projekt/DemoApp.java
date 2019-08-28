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
    public static int wormnum;
    public static int crabnum;

    public static void main(String[] args) {
        /*User input for # of lobsters.
        String count = JOptionPane.showInputDialog("Number of Lobsters");
        if ((count != null) && (count.length() > 0)) {
            //System.exit(1);
        }                       CURRENTLY IGNORED.

        //User input for timer
        String count2 = JOptionPane.showInputDialog("Time interval for worms to spawn");
        if ((count2 != null) && (count2.length() > 0)) {
            //System.exit(1);
        } */

        //Sets global variable
        lobsternum = 1;
        wormnum = 10;
        crabnum = 1;

        //Launches program
        GreenfootScenarioApplication.launch(args);
    }
}
