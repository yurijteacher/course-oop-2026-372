package ua.com.kisit.unit_6;

import java.util.ArrayList;
import java.util.List;

public class RobotExt2 extends RobotExt {

    private List<RobotLine> robotLineList = new ArrayList<>();

    public List<RobotLine> getRobotLineList() {
        return robotLineList;
    }

    public void setRobotLineList(List<RobotLine> robotLineList) {
        this.robotLineList = robotLineList;
    }

    private double oldX = 0;
    private double oldY = 0;

    public double getOldX() {
        return oldX;
    }

    public void setOldX(double oldX) {
        this.oldX = oldX;
    }

    public double getOldY() {
        return oldY;
    }

    public void setOldY(double oldY) {
        this.oldY = oldY;
    }

    @Override
    public void forward(){

        oldX = super.getX();
        oldY = getY();

        super.forward();

        RobotLine robotLine = new RobotLine(oldX, oldY, getX(), y);

        robotLineList.add(robotLine);
    }

    @Override
    public String toString() {
        return "RobotExt2{" +
                super.toString()+
                ", totalDistance=" + super.getTotalDistance() +
                ", oldX=" + oldX +
                ", oldY=" + oldY +
                '}';
    }

    static void main() {
        RobotExt2 robotExt2 = new RobotExt2();
        robotExt2.setX(100);
        robotExt2.y = 100;
        robotExt2.course = 90;
        robotExt2.distance = 100;
        robotExt2.forward();

        System.out.println(robotExt2);

        robotExt2.course = 45;
        robotExt2.distance = 200;
        robotExt2.forward();

        for (RobotLine el:robotExt2.robotLineList){
            System.out.println(el);
        }



    }
}
