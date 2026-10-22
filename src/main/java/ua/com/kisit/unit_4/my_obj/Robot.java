package ua.com.kisit.unit_4.my_obj;

public class Robot {

    String name = "T1000";
    private double x = 0;
    public double y = 0;
    protected double course = 90;
    private double distance = 100;
    private double totalDistance = 0;
    private int age = 1;

    double oldX = 0;
    double oldY = 0;

    public void forward(){
        // x= x + del x;
        oldX = x;
        x = x + distance * Math.cos(course*Math.PI/180);
        // y= y + del y
        oldY = y;
        y = y + distance * Math.sin(course  * Math.PI/180);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                ", totalDistance=" + totalDistance +
                ", age=" + age +
                ", oldX=" + oldX +
                ", oldY=" + oldY +
                '}';
    }

    public Robot() {}

    static void main() {

        Robot robot;
        robot = new Robot();

        Robot robot1 = new Robot();

        System.out.println(robot1);


        robot1.course = 90;
        robot1.distance = 200;

        robot1.forward();
        System.out.println(robot1);


    }



}
