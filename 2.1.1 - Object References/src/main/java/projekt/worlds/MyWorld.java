package projekt.worlds;

import greenfoot.Greenfoot;
import greenfoot.World;
import projekt.actors.Block;


public class MyWorld extends World {

    public MyWorld() {
        super(600, 400, 1);
        setUp();
    }

    private void setUp()
    {
        addObject(new Block(), 300, 200);
    }

}
