package INHERTANCE;


class Base{
	Base(){
		System.out.println("HI from base");
	}
	Base(int a){
		System.out.println("HI frome base version "+a);
	}
	
}
class INHE1 extends Base{
	INHE1(){
		super();
		System.out.println("HI from INHE");
	}
	INHE1(int a, int b){
		super(a);
		System.out.println("HI from INHE verison"+b);
	}
}
class INHE2 extends INHE1{
	INHE2(int a, int b){
		super();
		System.out.println("HI from INHE1"+b);
	}
	INHE2(int a, int b, int c){
		super();
		System.out.println("HI from INHE verison"+c);
	}
}
public class INHE23 {
	public static void main(String args[]) {
		Base b = new Base();
		INHE1 in = new INHE1();
		INHE1 in1 = new INHE1(2,3);
		INHE2 in2 = new INHE2(2,3);
		INHE2 in3 = new INHE2(2,3,4);	
	}

}
