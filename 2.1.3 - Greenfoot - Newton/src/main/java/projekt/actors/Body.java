package projekt.actors;

import greenfoot.Color;
import greenfoot.GreenfootImage;
import projekt.Vector;

public class Body extends SmoothMover {
    // constants
    private static final double GRAVITY = 5.8;
    private static final Color defaultColor = new Color(255, 216, 0);

    // fields
    private double mass;

    //Construct a Body with default size, mass, velocity and color.
    public Body() {
        this(20, 300, new Vector(0, 1.0), defaultColor);
    }

    //Construct a Body with a specified size, mass, velocity and color.
    public Body(int size, double mass, Vector velocity, Color color) {
        this.mass = mass;
        addToVelocity(velocity);
        GreenfootImage image = new GreenfootImage(size, size);
        image.setColor(color);
        image.fillOval(0, 0, size - 1, size - 1);
        setImage(image);
    }

    //Act. That is: apply  the gravitation forces from all other bodies around, and then move.
    public void act() {
        // To be done - not yet implemented
    }

    //Return the mass of this body.
    public double getMass() {
        return mass;
    }
}
