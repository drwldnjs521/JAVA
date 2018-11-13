
public class HouseDog extends Dog {
	public HouseDog(String name) {
		this.setName(name);
	}//constructor
	public HouseDog(int type) {
		if(type == 1) 
			this.setName("JW");
		else if(type == 2)
			this.setName("JH");
	}//constructoroverriding
	
	public void sleep() {
		System.out.println(this.name + " good nicht! ");
	}//overriding
	public void sleep(int hour) {
		System.out.println(this.name + " Good nicht! you can sleep " + hour + " hours");
	}//overloading
	public static void main(String[] args) {
		HouseDog housedog = new HouseDog(1);
		System.out.println(housedog.name);
		housedog.setName("Mozzi");
		housedog.sleep();
		housedog.sleep(4);
	}

}
