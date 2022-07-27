package INHERTANCE;

import first.Animal;
import first.DOG;

class Animal {
	String x;
	public void setX(String x) {
		System.out.println("What do animal do when hurt");
		this.x = "NOISES";
	}
	public String getX() {
		return x;
	}
	
}

class DOG extends Animal{
	String y;
	public void setY(String y) {
		System.out.println("What noise does a dog do");
		this.y="BARK";
	}
	public String getY() {
		return y;
	}
}
public class INHEQ {
	public static void main (String args[]) {
		Animal a = new Animal();
	    a.setX("");
	    System.out.println((a.getX()));
	    DOG d = new DOG();
	    d.setY(null);
	    d.setX(null);
	    System.out.println((d.getY()));
	    System.out.println("class DOG can also acess class Animal shown below");
	    System.out.println((d.getX()));
	}

}
