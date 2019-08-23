package projekt;

import greenfoot.export.GreenfootScenarioApplication;

import javax.swing.*;


/**
 * @author Lukas Fülling (lukas@k40s.net)
 */
public class DemoApp extends GreenfootScenarioApplication {
    public static int lobseternum;
    public static int crabnum;

    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Number of Crabs");
        String num2 = JOptionPane.showInputDialog("Number of Lobsters");
        crabnum = Integer.parseInt(num1);
        lobseternum = Integer.parseInt(num2);

        GreenfootScenarioApplication.launch(args);
    }
}
