package ua.lviv.lgs.hw4.zavdania1;

public class Main {

	public static void main(String[] args) {
		
		// Завдання 1
		Robot robot = new Robot();
		CoffeRobot robot2 = new CoffeRobot();
		RobotDancer robot3 = new RobotDancer();
		RobotCoocker robot4 = new RobotCoocker();
		robot.work();
		robot2.work();
		robot3.work();
		robot4.work();

		Robot a[] = { robot, robot2, robot3, robot4 };
		for (int i = 0; i < a.length; i++) {
			a[i].work();
		}

		
	}

}
