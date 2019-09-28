package projekt;

import greenfoot.*;
import projekt.actors.Heinkel274;

public class GameAPI extends Actor{


    public static int mouseClickXgridResult;
    public static int mouseClickYgridResult;

    public static int placementX;
    public static int placementY;

    public GameAPI() { // A custom mini API for the game.
        System.out.println("MEME");
        System.out.println("BRUH");
    }



    public static void XYtoGrid(int X, int Y) { //Converts coordinates into grids.
        int coordXLeft = X;
        int coordYLeft = Y;

        if (1000 > coordYLeft &&  coordYLeft > 960) {
            mouseClickYgridResult = 25;
        } else if (960 > coordYLeft && coordYLeft > 920) {
            mouseClickYgridResult = 24;
        } else if (920 > coordYLeft && coordYLeft > 880) {
            mouseClickYgridResult = 23;
        } else if (880 > coordYLeft && coordYLeft > 840) {
            mouseClickYgridResult = 22;
        } else if (840 > coordYLeft && coordYLeft > 800) {
            mouseClickYgridResult = 21;
        } else if (800 > coordYLeft && coordYLeft > 760) {
            mouseClickYgridResult = 20;
        } else if (760 > coordYLeft && coordYLeft > 720) {
            mouseClickYgridResult = 19;
        } else if (720 > coordYLeft && coordYLeft > 680) {
            mouseClickYgridResult = 18;
        } else if (680 > coordYLeft && coordYLeft > 640) {
            mouseClickYgridResult = 17;
        } else if (640 > coordYLeft && coordYLeft > 600) {
            mouseClickYgridResult = 16;
        } else if (600 > coordYLeft && coordYLeft > 560) {
            mouseClickYgridResult = 15;
        } else if (560 > coordYLeft && coordYLeft > 520) {
            mouseClickYgridResult = 14;
        } else if (520 > coordYLeft && coordYLeft > 480) {
            mouseClickYgridResult = 13;
        } else if (480 > coordYLeft && coordYLeft > 440) {
            mouseClickYgridResult = 12;
        } else if (440 > coordYLeft && coordYLeft > 400) {
            mouseClickYgridResult = 11;
        } else if (400 > coordYLeft && coordYLeft > 360) {
            mouseClickYgridResult = 10;
        } else if (360 > coordYLeft && coordYLeft > 320) {
            mouseClickYgridResult = 9;
        } else if (320 > coordYLeft && coordYLeft > 280) {
            mouseClickYgridResult = 8;
        } else if (280 > coordYLeft && coordYLeft > 240) {
            mouseClickYgridResult = 7;
        } else if (240 > coordYLeft && coordYLeft > 200) {
            mouseClickYgridResult = 6;
        } else if (200 > coordYLeft && coordYLeft > 160) {
            mouseClickYgridResult = 5;
        } else if (160 > coordYLeft && coordYLeft > 120) {
            mouseClickYgridResult = 4;
        } else if (120 > coordYLeft && coordYLeft > 80) {
            mouseClickYgridResult = 3;
        } else if (80 > coordYLeft && coordYLeft > 40) {
            mouseClickYgridResult = 2;
        } else if (40 > coordYLeft && coordYLeft > 0) {
            mouseClickYgridResult = 1;
        }

        if (1600 > coordXLeft && coordXLeft > 1560) {
            mouseClickXgridResult = 32;
        } else if (1560 > coordXLeft && coordXLeft > 1520) {
            mouseClickXgridResult = 31;
        } else if (1520 > coordXLeft && coordXLeft > 1480) {
            mouseClickXgridResult = 30;
        } else if (1480 > coordXLeft && coordXLeft > 1440) {
            mouseClickXgridResult = 29;
        } else if (1440 > coordXLeft && coordXLeft > 1400) {
            mouseClickXgridResult = 28;
        } else if (1400 > coordXLeft && coordXLeft > 1360) {
            mouseClickXgridResult = 27;
        } else if (1360 > coordXLeft && coordXLeft > 1320) {
            mouseClickXgridResult = 26;
        } else if (1320 > coordXLeft && coordXLeft > 1280) {
            mouseClickXgridResult = 25;
        } else if (1280 > coordXLeft && coordXLeft > 1240) {
            mouseClickXgridResult = 24;
        } else if (1240 > coordXLeft && coordXLeft > 1200) {
            mouseClickXgridResult = 23;
        } else if (1200 > coordXLeft && coordXLeft > 1160) {
            mouseClickXgridResult = 22;
        } else if (1160 > coordXLeft && coordXLeft > 1120) {
            mouseClickXgridResult = 21;
        } else if (1120 > coordXLeft && coordXLeft > 1080) {
            mouseClickXgridResult = 20;
        } else if (1080 > coordXLeft && coordXLeft > 1040) {
            mouseClickXgridResult = 19;
        } else if (1040 > coordXLeft && coordXLeft > 1000) {
            mouseClickXgridResult = 18;
        } else if (1000 > coordXLeft && coordXLeft > 960) {
            mouseClickXgridResult = 17;
        } else if (960 > coordXLeft && coordXLeft > 920) {
            mouseClickXgridResult = 16;
        } else if (920 > coordXLeft && coordXLeft > 880) {
            mouseClickXgridResult = 15;
        } else if (880 > coordXLeft && coordXLeft > 840) {
            mouseClickXgridResult = 14;
        } else if (840 > coordXLeft && coordXLeft > 800) {
            mouseClickXgridResult = 13;
        } else if (800 > coordXLeft && coordXLeft > 760) {
            mouseClickXgridResult = 12;
        } else if (760 > coordXLeft && coordXLeft > 720) {
            mouseClickXgridResult = 11;
        } else if (720 > coordXLeft && coordXLeft > 680) {
            mouseClickXgridResult = 10;
        } else if (680 > coordXLeft && coordXLeft > 640) {
            mouseClickXgridResult = 9;
        } else if (640 > coordXLeft && coordXLeft > 600) {
            mouseClickXgridResult = 8;
        } else if (600 > coordXLeft && coordXLeft > 560) {
            mouseClickXgridResult = 7;
        } else if (560 > coordXLeft && coordXLeft > 520) {
            mouseClickXgridResult = 6;
        } else if (520 > coordXLeft && coordXLeft > 480) {
            mouseClickXgridResult = 5;
        } else if (480 > coordXLeft && coordXLeft > 440) {
            mouseClickXgridResult = 4;
        } else if (440 > coordXLeft && coordXLeft > 400) {
            mouseClickXgridResult = 3;
        } else if (400 > coordXLeft && coordXLeft > 360) {
            mouseClickXgridResult = 2;
        } else if (360 > coordXLeft && coordXLeft > 320) {
            mouseClickXgridResult = 1;
        }

        //System.out.println(mouseClickXgridResult); // Debug data
        //System.out.println(mouseClickYgridResult);
    }

    public static void GridToXY(int GridX, int GridY) { // Converts grids to coordinates for placement
        if (GridX == 1) {
            placementX = 340;
        } else if (GridX == 2) {
            placementX = 380;
        } else if (GridX == 3) {
            placementX = 420;
        } else if (GridX == 4) {
            placementX = 460;
        } else if (GridX == 5) {
            placementX = 500;
        } else if (GridX == 6) {
            placementX = 540;
        } else if (GridX == 7) {
            placementX = 580;
        } else if (GridX == 8) {
            placementX = 620;
        } else if (GridX == 9) {
            placementX = 660;
        } else if (GridX == 10) {
            placementX = 700;
        } else if (GridX == 11) {
            placementX = 740;
        } else if (GridX == 12) {
            placementX = 780;
        } else if (GridX == 13) {
            placementX = 820;
        } else if (GridX == 14) {
            placementX = 860;
        } else if (GridX == 15) {
            placementX = 900;
        } else if (GridX == 16) {
            placementX = 940;
        } else if (GridX == 17) {
            placementX = 980;
        } else if (GridX == 18) {
            placementX = 1020;
        } else if (GridX == 19) {
            placementX = 1060;
        } else if (GridX == 20) {
            placementX = 1100;
        }


        if (GridY == 1) {
            placementY = 20;
        } else if (GridY == 2) {
            placementY = 60;
        } else if (GridY == 3) {
            placementY = 100;
        } else if (GridY == 4) {
            placementY = 140;
        } else if (GridY == 5) {
            placementY = 180;
        } else if (GridY == 6) {
            placementY = 220;
        } else if (GridY == 7) {
            placementY = 260;
        } else if (GridY == 8) {
            placementY = 300;
        } else if (GridY == 9) {
            placementY = 340;
        } else if (GridY == 10) {
            placementY = 380;
        } else if (GridY == 11) {
            placementY = 420;
        } else if (GridY == 12) {
            placementY = 460;
        } else if (GridY == 13) {
            placementY = 500;
        } else if (GridY == 14) {
            placementY = 540;
        } else if (GridY == 15) {
            placementY = 580;
        }

        System.out.println("(" + GridX + ", " + GridY + ")");
    }

    public static void constructBuilding(int GridX, int GridY) { // Places buildings in marked grids.

    }

    public static void moveAnimation() {
        
    }
}
