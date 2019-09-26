package projekt.worlds;

import greenfoot.Greenfoot;
import greenfoot.MouseInfo;
import greenfoot.World;
import projekt.actors.Dornier217;
import projekt.actors.Messerschmitt262;
import projekt.buttons.AddAirfield;
import projekt.buttons.AddFactory;
import projekt.buttons.Luftflotte;

public class MyWorld extends World {
    final int btnNONE = 0, btnLEFT = 1, btnRIGHT = 3;

    public MyWorld() {
        super(1600, 1000, 1);
        prepare();
    }

    public void act() {
        /*
        MouseInfo mi = Greenfoot.getMouseInfo();
        if (Greenfoot.mousePressed(null)) {
            int button = mi.getButton();
            if (button == btnLEFT) {
                System.out.println("Left");
            }
            if (button == btnRIGHT) {
                System.out.println("Right");
            }
        }
        if (Greenfoot.mouseClicked(null)) {
            int button = mi.getButton();
            if (button == btnLEFT) {
                System.out.println("No left");
            }
            if (button == btnRIGHT) {
                System.out.println("No right");
            }
        } */
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
