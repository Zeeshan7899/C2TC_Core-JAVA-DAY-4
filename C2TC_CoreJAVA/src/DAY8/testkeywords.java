package DAY8;

public class testkeywords {
	int id;
	String name;
	static String company = " WIOPP";
public	testkeywords(int x){
		id = x;
	}
	static void change() {
		company =  "TCBBS";
	}
	void display() {
		System.out.println(id+"  "+company);
	}
	
	public static void main (String[] args) {
		testkeywords e1 = new testkeywords(101);
		testkeywords e2 = new testkeywords(103);
change();
e1.display();
e2.display();
}
}

