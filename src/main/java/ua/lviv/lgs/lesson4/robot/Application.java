package ua.lviv.lgs.lesson4.robot;

public class Application {
    public static void main(String[] args) {
        Robot robot = new Robot();
        CoffeeRobot coffeeRobot = new CoffeeRobot();
        RobotDancer robotDancer = new RobotDancer();
        RobotCooker robotCooker = new RobotCooker();

        //Object of each class created, work() method called on them
        robot.work();
        coffeeRobot.work();
        robotDancer.work();
        robotCooker.work();

        //Create Robot array and call work() method on each of them
        Robot [] robots = new Robot[] {new Robot(), new RobotDancer(), new RobotCooker(), new Robot(), new CoffeeRobot(), new RobotCooker()};
        for (Robot element : robots) {
            element.work();
        }
    }
}
