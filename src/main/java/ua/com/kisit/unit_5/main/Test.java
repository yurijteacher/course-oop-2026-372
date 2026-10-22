package ua.com.kisit.unit_5.main;

import ua.com.kisit.unit_5.Robot;
import ua.com.kisit.unit_5.RobotPrivate;
import ua.com.kisit.unit_5.RobotProtected;
import ua.com.kisit.unit_5.RobotPublic;

public class Test {

    static void main() {
        Robot robot = new Robot();
        System.out.println(robot);
//        robot.x = 0;
//        robot.y = 0;

        RobotPublic robotPublic = new RobotPublic();
        robotPublic.x = 1000;
        System.out.println(robotPublic.x);

        RobotPrivate robotPrivate = new RobotPrivate();
        // robotPrivate.x = 0;

        RobotProtected robotProtected = new RobotProtected();
        // robotProtected.x = 0;
        // robotProtected.y = 0.6;
    }

}
