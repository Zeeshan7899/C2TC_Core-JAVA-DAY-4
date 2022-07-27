package inter_face;
interface Interface1 {
public void myMethod1();
}
interface Interface2 {
public void myMethod2();
}
class inter_face implements Interface1, Interface2{
public void myMethod1() {
System.out.println("Hi this is 1");
}
public void myMethod2() {
System.out.println("Hi this is 2");
}
}
public class inter_face1 {
public static void main(String[] args) {
inter_face myObj = new inter_face();
myObj.myMethod1();
myObj.myMethod2();
}
}

