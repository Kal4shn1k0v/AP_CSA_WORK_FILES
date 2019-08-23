package projekt.worlds;

import greenfoot.Greenfoot;
import greenfoot.World;
import projekt.DemoApp;
import projekt.actors.Crab;

import java.util.Random;


public class MyWorld extends World {

    private Crab crab;

    public MyWorld() {
        super(1000, 1000, 1);
        prepare();
    }

    private void prepare() {
        addObjects();
    }

    private void addObjects() {
        int crabloopend = DemoApp.crabnum;
        int crabloop;
        int lobsterloopend = DemoApp.crabnum;
        int lobsterloop;



        System.out.println(crabloopend);

        for (crabloop = 0; crabloop < crabloopend; crabloop++) {
            Random xrandint = new Random();
            int xrand = xrandint.nextInt((900 - 100) + 1) + 100;

            Random yrandint = new Random();
            int yrand = yrandint.nextInt((900 - 100) + 1) + 100;

            crab = new Crab();
            addObject(crab, xrand, yrand);
        }

        for (lobsterloop = 0; lobsterloop < lobsterloopend; lobsterloop++) {
            Random xrandint = new Random();
            int xrand = xrandint.nextInt((900 - 100) + 1) + 100;

            Random yrandint = new Random();
            int yrand = yrandint.nextInt((900 - 100) + 1) + 100;

            crab = new Crab();
            addObject(crab, xrand, yrand);
        }
    }
}
