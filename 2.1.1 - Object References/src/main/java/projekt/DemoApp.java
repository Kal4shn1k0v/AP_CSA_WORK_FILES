package projekt;

import greenfoot.export.GreenfootScenarioApplication;

import java.util.Random;

public class DemoApp extends GreenfootScenarioApplication {
    public static void main(String[] args) {
        GreenfootScenarioApplication.launch(args);
    }

    public static int getRandom(int min, int max){
        Random r = new Random();

        return r.nextInt((max - min) + 1) + min;
    }
}
