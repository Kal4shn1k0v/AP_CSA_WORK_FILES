package projekt;

import greenfoot.export.GreenfootScenarioApplication;

import javax.swing.*;

public class DemoApp extends GreenfootScenarioApplication {
    public static int crabnum;

    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Number of Crabs");
        if ((num1 != null) && (num1.length() > 0)) {
            //System.exit(1);
        }

        crabnum = Integer.parseInt(num1);

        GreenfootScenarioApplication.launch(args);
    }
}
