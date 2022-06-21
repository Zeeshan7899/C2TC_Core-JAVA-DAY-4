package DAY7;

public class test1 {
	public int x=25;
	public void display () {
		System.out.println("Access Modifiers");
	}
public static void main (String[] args) {
	test1 t1 = new test1();
	t1.display();
	System.out.println(t1.x);
	
}
}
