package ua.com.kisit.unit_5;

public class Robot {

    double x = 0;
    double y = 0;
    double course = 0;
    double distance =0;

    public String toString(){
        return "Robot{x= "+x+", y= "+y+", course= "+course+", distance= "+distance+"}";
    }


    static void main() {
        Robot robot = new Robot();
        System.out.println(robot.toString());
    }


}
