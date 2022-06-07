package DAY5;

public class task2 {
String name;
public static void main(String[] args) {
	task2 c1 = new task2();
	c1.name =  "C2TC";
	task2 c2 = c1;
	c1 = null;
	System.out.println(c2.name);
	//new task2();
	//task2 c3 ;
	//c3.name = "C2TC";
	//System.out.println(c3.name);
}
}
