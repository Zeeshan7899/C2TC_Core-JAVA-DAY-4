package Abstract;
abstract class Animals{
	abstract void eat();
}
class Herbevore extends Animals{
	void eat(){
		System.out.println("I only eat vegetartian food");
	}
}
class Carnivore extends Animals{
	void eat(){
		System.out.println("I eat meat and veg food whem im hungry");
	}
}

public class absr1 {
	public static void main(String args[]) {
		Animals giraffe = new Herbevore();
		Animals lion = new Carnivore();
		giraffe.eat();
		lion.eat();
		
	}

}
