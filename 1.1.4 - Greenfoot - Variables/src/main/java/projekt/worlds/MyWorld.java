package projekt.worlds;

import greenfoot.World;
import projekt.DemoApp;
import projekt.actors.*;

import java.util.Random;

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

    //Makes timer.
    public static int timer = 0;

    //Creates world.
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

        //Walls are currently not working nor used...
        //addObject(south, 1,1000);
        //addObject(north,1,1);
        //addObject(east,1,1);
        //addObject(west, 1000, 1);

        //create crabs

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

        //Adds worms.
        //for () {

        //}
        worm = new Worm();
        addObject(worm, 500,500);
    }
}
