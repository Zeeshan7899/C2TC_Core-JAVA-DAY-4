package DAY5;

public class task1 {
public static void main(String[] args) {
	task1 obj = new task1();
	obj.start();
	
}
void start() {
	String stra = "do";
	String strb = method(stra);
	System.out.println(":" + stra +strb);
}
String method (String stra) {
	stra = stra + "   good";
	System.out.println(stra);
	return " good";
	
	
}
}
