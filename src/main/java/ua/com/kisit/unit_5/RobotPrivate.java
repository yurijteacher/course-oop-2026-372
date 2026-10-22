package ua.com.kisit.unit_5;

public class RobotPrivate {

    private double x = 0;
    private double y = 0;
    private double course = 0;
    private double distance =0;

    @Override
    public String toString() {
        return "RobotPrivate{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }

    static void main() {
        RobotPrivate robotPrivate = new RobotPrivate();
        robotPrivate.x  = 0;
        System.out.println(robotPrivate.x);
    }
}
