package ua.com.kisit.unit_5;

public class RobotPublic {

    public double x = 0;
    public double y = 0;
    public double course = 0;
    public double distance =0;

    @Override
    public String toString() {
        return "RobotPublic{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }

    static void main() {
        RobotPublic robotPublic = new RobotPublic();
        robotPublic.x = 0.5;
        System.out.println(robotPublic);
    }
}
