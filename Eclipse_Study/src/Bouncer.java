
public class Bouncer {
	public void barkAnimal(Barkable animal) {
		animal.bark();
	}
	
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		
		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(tiger);
		if(tiger.isPredator())
			System.out.println("TRUE");
		
	

}

}
