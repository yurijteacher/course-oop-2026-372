package ua.com.kisit.unit_5;

public class RobotManager {

    static void main() {
        Robot robot = new Robot();
        System.out.println(robot);

        robot.x = 0;
        robot.y = 10;
        robot.course = 90;
        robot.distance = 100;

        System.out.println(robot);

        RobotPublic robotPublic = new RobotPublic();
        robotPublic.x = 0.5;
        System.out.println(robotPublic);

        RobotPrivate robotPrivate = new RobotPrivate();
       // robotPrivate.x = 0;

        RobotProtected robotProtected = new RobotProtected();
        robotProtected.x = 0;
        robotProtected.y = 0.6;
    }
}
