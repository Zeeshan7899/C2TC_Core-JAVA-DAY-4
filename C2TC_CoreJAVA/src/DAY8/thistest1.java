package DAY8;

public class thistest1 {
	A obj;
	thistest1(A obj){
		this.obj=obj;
	}
	void show() {
		System.out.println(obj.info);
	}
	}
class A{
	int info = 6;
	A(){
		thistest1 tt = new thistest1(this);
		tt.show();
		}
	}
