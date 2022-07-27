package inter_face;
interface Vehicle{
	int a =5;
	
	static int engine() {
		return a ;
	}
}
interface Coolant extends Vehicle{
	void coolant();
}
class Dio implements Coolant{
	public void engine() {
		System.out.println("!00 cc engine cpacity  "+a);
		
	}
public void coolant() {
	System.out.println("Water based in built coolant");
}
	}

public class interrr1 {
public static void main(String args[]) {
	Dio d = new Dio();
	d.coolant();
	d.engine();

}
}
