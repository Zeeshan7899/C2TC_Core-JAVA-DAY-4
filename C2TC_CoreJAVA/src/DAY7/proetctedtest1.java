package DAY7;

public class proetctedtest1 {
	protected int x=25;
	protected void display () {
		System.out.println("Access Modifiers _ Protected");
	}
public static void main (String[] args) {
	test1 t1 = new test1();
	t1.display();
	System.out.println(t1.x);
	
}

}
