package projekt.worlds;

import greenfoot.Greenfoot;
import greenfoot.World;
import projekt.DemoApp;
import projekt.actors.*;

import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

//

public class MyWorld extends World {
    //Declare walls.
    private WallSouth south;
    private WallWest west;
    private WallEast east;
    private WallNorth north;

    //Declare Actors
    private Lobster lobster;
    private Worm worm;
    private Crab crab;

    //Creates world.
    public MyWorld() {
        super(1000, 1000, 1);
        prepare();
    }

    //variables


    private void prepare() {
        addObjects();
    }

    private void addObjects() {
        //set tickspeed
        Greenfoot.setSpeed(35);

        //create walls

        south = new WallSouth();
        west = new WallWest();
        east = new WallEast();
        north = new WallNorth();

        //Walls are currently not working nor used...
        //addObject(south, 1,1000);
        //addObject(north,1,1);
        //addObject(east,1,1);
        //addObject(west, 1000, 1);

        //Create lobsters
        int lobsterloopend = DemoApp.lobsternum;
        int lobsterloop;

        //Adds lobsters in random X Y coordinates.
        for (lobsterloop = 0; lobsterloop < lobsterloopend; lobsterloop++) {
            Random xrandint = new Random();
            int xrand = xrandint.nextInt((900 - 100) + 1) + 100;

            Random yrandint = new Random();
            int yrand = yrandint.nextInt((900 - 100) + 1) + 100;

            lobster = new Lobster();
            addObject(lobster, xrand, yrand);
        }

        //Create crabs
        int crabloopend = DemoApp.crabnum;
        int crabloop;

        //Adds crabs in random X Y coordinates.
        for (crabloop = 0; crabloop < crabloopend; crabloop++) {
            Random xrandint3 = new Random();
            int xrand3 = xrandint3.nextInt((900 - 100) + 1) + 100;
                                    //CURRENTLY NOT USED.
            Random yrandint3 = new Random();
            int yrand3 = yrandint3.nextInt((900 - 100) + 1) + 100;

            crab = new Crab();
            addObject(crab, 500, 500);
        }

        //Create worms
        int wormloopend = DemoApp.wormnum;
        int wormloop;
        for (wormloop = 0; wormloop < wormloopend; wormloop++) {
            Random xrandint2 = new Random();
            int xrand2 = xrandint2.nextInt((900 - 100) + 1) + 100;

            Random yrandint2 = new Random();
            int yrand2 = yrandint2.nextInt((900 - 100) + 1) + 100;

            worm = new Worm();
            addObject(worm, xrand2, yrand2);
        }
    }
}
