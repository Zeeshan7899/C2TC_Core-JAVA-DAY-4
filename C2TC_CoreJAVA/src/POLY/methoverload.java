package POLY;
class Meth1{
	void Meth1(){
		System.out.println("Hi this is the defautl method with no argumnets");
}
	void Meth1(int a){
		System.out.println("Hi this the method with one argaumen  "+a);
	}
	void Meth1(int a ,int b){
		System.out.println("Hi this the method with two arguments  "+a +b);
	}
	void Meth1(int a, int b , int c){
		System.out.println("Hi this is a very overloaded method "+a+b+c);
	}
}
public class methoverload {
	
	public static void main(String args[]) {
		Meth1 me = new Meth1();
		me.Meth1();
		me.Meth1(2);
		me.Meth1(2,3);
		me.Meth1(4,5,6);
		
	}

}
