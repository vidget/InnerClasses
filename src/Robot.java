
public class Robot {

	private int id;
	
	
	//innerclass
	//can be made private if only used in the class or public can be accessed in the App
	
		private class Brain{
				public void think(){
					System.out.println("Robot "+id+" is thinking.");
				}
			}
	
		//static method battery can't access class variables but can be created outside of the class in MAIN
		static class Battery {
			public void charge(){
				System.out.println("Batter charging....");
			}
		}
		

	public Robot(int id) {
		
		this.id = id;
	}
	
	
	public void start(){
		System.out.println("Starting Robot "+id);
		
		//created from inner class and calls its' method think()
		Brain brain = new Brain();
		brain.think();
		
		final String name = "Alex";
		//ANONYMOUS CLASS can only refer to data that is final
		//but can refer to instance data like id fine
		
		//the class can't be private or public and is scoped to the start() method
		class Temp{
			public void doSomething(){
				System.out.println("ID is: "+ id);
				System.out.println("My name is "+ name);
			}
		}
		
		Temp temp = new Temp();
		temp.doSomething();
		
	}
	

}
