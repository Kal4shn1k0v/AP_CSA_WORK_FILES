package projekt;

import greenfoot.Greenfoot;
import greenfoot.export.GreenfootScenarioApplication;

import javax.swing.*;

public class DemoApp extends GreenfootScenarioApplication {
    //Global variables
    public static int mouseClickXLeft;
    public static int mouseClickYLeft;

    public static int mouseClickXRight;
    public static int mouseClickYRight;

    public static boolean canDetectXY = false;

    public static int clickSide;

    public static void main(String[] args) {


        resolution();

        GreenfootScenarioApplication.launch(args);
    }

    private static void resolution() {

        //1920 X 1080", "1680 X 1050", "1536 X 864
    }
}
