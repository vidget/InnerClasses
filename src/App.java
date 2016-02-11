
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot = new Robot(7);
		Robot robot2 = new Robot(6);
		robot.start();
		robot2.start();
		
		//unusually syntax just to show how the in main innerclass objects can be created and method 
		//accessed directly only if the Brain innerclass is PUBLIC. 
		//    Robot.Brain brain = robot2.new Brain();
		//    brain.think();
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
		
	}

}
