package ua.com.kisit.unit_5;

public class RobotProtected {

    protected double x = 0;
    protected double y = 0;
    protected double course = 0;
    protected double distance =0;

    @Override
    public String toString() {
        return "RobotProtected{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }

    static void main() {
        RobotProtected robotProtected = new RobotProtected();
        robotProtected.x = 0;
    }
}
