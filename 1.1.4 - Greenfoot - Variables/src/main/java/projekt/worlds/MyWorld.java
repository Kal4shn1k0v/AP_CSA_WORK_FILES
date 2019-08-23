package projekt.worlds;

import greenfoot.World;
import projekt.DemoApp;
import projekt.actors.*;

import java.util.Random;
//import projekt.actors.*;

/**
 *
 */
public class MyWorld extends World {
    private WallSouth south;
    private WallWest west;
    private WallEast east;
    private WallNorth north;

    private Crab crab;

    public MyWorld() {
        super(1000, 1000, 1);
        prepare();
    }

    private void prepare() {
        addObjects();
    }

    private void addObjects() {
        //create walls

        south = new WallSouth();
        west = new WallWest();
        east = new WallEast();
        north = new WallNorth();

        addObject(south, 1,1000);
        addObject(north,1,1);
        addObject(east,1,1);
        addObject(west, 1000, 1);

        //create crabs

        int crabloopend = DemoApp.crabnum;
        int crabloop;

        for (crabloop = 0; crabloop < crabloopend; crabloop++) {
            Random xrandint = new Random();
            int xrand = xrandint.nextInt((900 - 100) + 1) + 100;

            Random yrandint = new Random();
            int yrand = yrandint.nextInt((900 - 100) + 1) + 100;

            crab = new Crab();
            addObject(crab, xrand, yrand);
        }
    }
}
