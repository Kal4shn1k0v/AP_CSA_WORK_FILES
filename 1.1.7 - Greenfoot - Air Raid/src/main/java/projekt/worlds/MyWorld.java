package projekt.worlds;

import greenfoot.World;
import projekt.actors.Dornier217;
import projekt.actors.Messerschmitt262;
import projekt.buttons.AddAirfield;
import projekt.buttons.AddFactory;
import projekt.buttons.Luftflotte;

public class MyWorld extends World {
    //Global variables
    public MyWorld() {
        super(1600, 1000, 1);
        prepare();
    }

    public void act() {

    }

    private void prepare() {
        addObjects();
    }

    private void addObjects() {
        addButtons();
        addVehicles();
    }

    private void addButtons() {
        addObject(new AddAirfield(), 50, 50);
        addObject(new AddFactory(), 50, 80);
        addObject(new Luftflotte(), 72, 638);
    }

    private  void addVehicles() {
        addObject(new Dornier217(), 500, 500);
        addObject(new Messerschmitt262(), 600, 600);
    }
}
