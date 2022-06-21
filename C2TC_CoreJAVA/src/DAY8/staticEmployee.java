package DAY8;

public class staticEmployee {
	int id;
	String name;
	static String company;
	static {
		company="YOUH";
	}
	staticEmployee(int x, String y){
		id = x;
		name = y;
}
	static void change() {
		company = "HIOOO";
	}
void show() {
	System.out.println(id+" "+name+" "+company);
}
public static void main ( String[] args) {
	staticEmployee e1 = new staticEmployee(101,"ARJUN");
	staticEmployee e2 = new staticEmployee(102,"KARAN");
	e1.show();
	e2.show();
	
}
}
