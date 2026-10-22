package ua.com.kisit.unit_6;

import static java.lang.Math.*;

public class Robot {

    private double x = 0;
    protected double y= 0;
    double course = 90;
    public double distance = 100;


    public void forward(){
        x +=distance* cos(course* PI/180);
        y +=distance* sin(course* PI/180);
    }

    public void setX(double x){
       this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }

    public double getCourse() {
        return course;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }

    static void main() {

        Robot robot = new Robot();
        robot.x = 0;
        robot.setX(0.5);

        System.out.println(robot);

        robot.x = 0;
        robot.y = 0;
        robot.distance = 1000;
        robot.course = 90;

        robot.forward();

        System.out.println(robot);

        robot.course = 45;
        robot.distance = 2000;

        robot.forward();

        System.out.println(robot);

    }
}
