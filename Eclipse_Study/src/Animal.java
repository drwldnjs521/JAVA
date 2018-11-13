
public class Animal {
	
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		Animal dog = new Animal();
		dog.setName("Mozzi");
		System.out.println(dog.name);
		
	}

}
