package projekt.worlds;

import greenfoot.Greenfoot;
import greenfoot.World;
import projekt.actors.Cat;
//import projekt.actors.*;

/**
 *
 */
public class MyWorld extends World {

    public MyWorld() {

        super(600, 400, 1);

        Cat cat = new Cat();
        this.addObject(cat, 200, 200);
        cat.playPiano();
    }
}
