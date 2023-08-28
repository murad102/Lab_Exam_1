package Problem_2;

import java.awt.*;

public class Robot_run {
    public static void main(String[] args) {
        Point point = new Point();
        Robot robot = new Robot();
        robot.turnLeft();
        robot.move();


        System.out.println("Present Location "+robot.getPresentLocation());
        System.out.println("Correct point is "+ robot.getPoint().getX()+" "+robot.getPoint().getY());
    }

}
