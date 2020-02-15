package projekt.worlds;

import greenfoot.Greenfoot;
import greenfoot.World;
import projekt.DemoApp;
import projekt.actors.Block;
import projekt.actors.Leaf;
import projekt.actors.Pear;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        setUp();
    }

    private void setUp(){
        for(int i = 0; i < DemoApp.getRandom(5, 18); i++){
            addObject(new Leaf(), DemoApp.getRandom(1, 600), DemoApp.getRandom(1, 400));
        }
        for(int i = 0; i < DemoApp.getRandom(1, 8); i++){
            addObject(new Pear(), DemoApp.getRandom(1, 600), DemoApp.getRandom(1, 400));
        }
        addObject(new Pear(), DemoApp.getRandom(1, 600), 200);
        addObject(new Block(), 300, 200);
        setBackground("autumn.png");
    }
}
