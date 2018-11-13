public class Zookeeper {
	
	public void feed(Predator predator) {
		System.out.println("feed " + predator.getFeed());
	}
	
	public static void main(String[] args) {
		Zookeeper zookeeper = new Zookeeper();
				Predator tiger = new Tiger();
				zookeeper.feed(tiger);
		
	}

 }

