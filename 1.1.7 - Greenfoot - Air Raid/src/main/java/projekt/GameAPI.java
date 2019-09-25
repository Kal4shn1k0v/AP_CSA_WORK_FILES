package projekt;

import greenfoot.*;
import projekt.actors.Heinkel274;

public class GameAPI extends Actor{
    private static int mouseClickX;
    private static int mouseClickY;

    private static int mouseClickXgridResult;
    private static int mouseClickYgridResult;

    private static int placementX;
    private static int placementY;

    private static int lowerXlimit;
    private static int upperXlimit;
    private static int lowerYlimit;
    private static int upperYlimit;

    public GameAPI() { // A custom mini API.
        System.out.println("MEMES");
        System.out.println("SLAVE");
    }

    

    public static void getGrid() { //For getting original coordinates for each grid.
        Greenfoot.delay(1);
        if (Greenfoot.mouseClicked(null) && DemoApp.hasSelectedItem) {
            mouseClickX = Greenfoot.getMouseInfo().getX();
            mouseClickY = Greenfoot.getMouseInfo().getY();

            System.out.println(mouseClickX);
            System.out.println(mouseClickY);

            if (1000 > mouseClickY &&  mouseClickY > 960) {
                mouseClickYgridResult = 25;
            } else if (960 > mouseClickY && mouseClickY > 920) {
                mouseClickYgridResult = 24;
            } else if (920 > mouseClickY && mouseClickY > 880) {
                mouseClickYgridResult = 23;
            } else if (880 > mouseClickY && mouseClickY > 840) {
                mouseClickYgridResult = 22;
            } else if (840 > mouseClickY && mouseClickY > 800) {
                mouseClickYgridResult = 21;
            } else if (800 > mouseClickY && mouseClickY > 760) {
                mouseClickYgridResult = 20;
            } else if (760 > mouseClickY && mouseClickY > 720) {
                mouseClickYgridResult = 19;
            } else if (720 > mouseClickY && mouseClickY > 680) {
                mouseClickYgridResult = 18;
            } else if (680 > mouseClickY && mouseClickY > 640) {
                mouseClickYgridResult = 17;
            } else if (640 > mouseClickY && mouseClickY > 600) {
                mouseClickYgridResult = 16;
            } else if (600 > mouseClickY && mouseClickY > 560) {
                mouseClickYgridResult = 15;
            } else if (560 > mouseClickY && mouseClickY > 520) {
                mouseClickYgridResult = 14;
            } else if (520 > mouseClickY && mouseClickY > 480) {
                mouseClickYgridResult = 13;
            } else if (480 > mouseClickY && mouseClickY > 440) {
                mouseClickYgridResult = 12;
            } else if (440 > mouseClickY && mouseClickY > 400) {
                mouseClickYgridResult = 11;
            } else if (400 > mouseClickY && mouseClickY > 360) {
                mouseClickYgridResult = 10;
            } else if (360 > mouseClickY && mouseClickY > 320) {
                mouseClickYgridResult = 9;
            } else if (320 > mouseClickY && mouseClickY > 280) {
                mouseClickYgridResult = 8;
            } else if (280 > mouseClickY && mouseClickY > 240) {
                mouseClickYgridResult = 7;
            } else if (240 > mouseClickY && mouseClickY > 200) {
                mouseClickYgridResult = 6;
            } else if (200 > mouseClickY && mouseClickY > 160) {
                mouseClickYgridResult = 5;
            } else if (160 > mouseClickY && mouseClickY > 120) {
                mouseClickYgridResult = 4;
            } else if (120 > mouseClickY && mouseClickY > 80) {
                mouseClickYgridResult = 3;
            } else if (80 > mouseClickY && mouseClickY > 40) {
                mouseClickYgridResult = 2;
            } else if (40 > mouseClickY && mouseClickY > 0) {
                mouseClickYgridResult = 1;
            }

            if (1600 > mouseClickX && mouseClickX > 1560) {
                mouseClickXgridResult = 25;
            } else if (1560 > mouseClickX && mouseClickX > 1520) {
                mouseClickXgridResult = 24;
            } else if (1520 > mouseClickX && mouseClickX > 1480) {
                mouseClickXgridResult = 23;
            } else if (1480 > mouseClickX && mouseClickX > 1440) {
                mouseClickXgridResult = 22;
            } else if (1440 > mouseClickX && mouseClickX > 1400) {
                mouseClickXgridResult = 21;
            } else if (1400 > mouseClickX && mouseClickX > 1360) {
                mouseClickXgridResult = 20;
            } else if (1360 > mouseClickX && mouseClickX > 1320) {
                mouseClickXgridResult = 19;
            } else if (1320 > mouseClickX && mouseClickX > 1280) {
                mouseClickXgridResult = 18;
            } else if (1280 > mouseClickX && mouseClickX > 1240) {
                mouseClickXgridResult = 17;
            } else if (1240 > mouseClickX && mouseClickX > 1200) {
                mouseClickXgridResult = 16;
            } else if (1200 > mouseClickX && mouseClickX > 1160) {
                mouseClickXgridResult = 15;
            } else if (1160 > mouseClickX && mouseClickX > 1120) {
                mouseClickXgridResult = 14;
            } else if (1120 > mouseClickX && mouseClickX > 1080) {
                mouseClickXgridResult = 13;
            } else if (1080 > mouseClickX && mouseClickX > 1040) {
                mouseClickXgridResult = 12;
            } else if (1040 > mouseClickX && mouseClickX > 1000) {
                mouseClickXgridResult = 11;
            } else if (1000 > mouseClickX && mouseClickX > 960) {
                mouseClickXgridResult = 10;
            } else if (960 > mouseClickX && mouseClickX > 920) {
                mouseClickXgridResult = 9;
            } else if (920 > mouseClickX && mouseClickX > 880) {
                mouseClickXgridResult = 8;
            } else if (880 > mouseClickX && mouseClickX > 840) {
                mouseClickXgridResult = 7;
            } else if (840 > mouseClickX && mouseClickX > 800) {
                mouseClickXgridResult = 6;
            } else if (800 > mouseClickX && mouseClickX > 760) {
                mouseClickXgridResult = 5;
            } else if (760 > mouseClickX && mouseClickX > 720) {
                mouseClickXgridResult = 4;
            } else if (720 > mouseClickX && mouseClickX > 680) {
                mouseClickXgridResult = 3;
            } else if (680 > mouseClickX && mouseClickX > 640) {
                mouseClickXgridResult = 2;
            } else if (640 > mouseClickX && mouseClickX > 600) {
                mouseClickXgridResult = 1;
            }
        } else if (Greenfoot.isKeyDown("escape")) {
            DemoApp.hasSelectedItem = false;
        }
    }

    public static void getTargetGrid(){
        getGrid();

        if (mouseClickXgridResult >= 1 && mouseClickYgridResult >= 1) {
            System.out.println("Targeted 1,1");
            DemoApp.hasSelectedItem = false;
        }
    }
}
