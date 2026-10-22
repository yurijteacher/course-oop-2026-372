package ua.com.kisit.unit_6;

public class RobotExt extends Robot{

    private double totalDistance = 0;

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    @Override
    public void forward(){
        super.forward();
        totalDistance += super.getDistance();
    }

    static void main() {
        RobotExt robotExt = new RobotExt();
        robotExt.setX(100);
        robotExt.y = 100;
        robotExt.course = 200;
        robotExt.distance = 300;

        robotExt.forward();

        System.out.println(robotExt.toString() + ", totalDistance=" + robotExt.totalDistance);
    }

}
