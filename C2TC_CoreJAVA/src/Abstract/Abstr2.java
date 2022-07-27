package Abstract;
import java.util.Scanner;
abstract class Movie{
	String s;
	abstract void Settitle(String s);
}
class Mymovie extends Movie{
	void Settitle(String n) {
		System.out.println("The title of my movies is "+n);
	}
	
}
public class Abstr2 {
	public static void main(String args[]) {
	System.out.println("Enter the movie name");
	Scanner sc = new Scanner(System.in);
	String name;
	name = sc.nextLine();
	Movie m = new Mymovie();
	m.Settitle(name);
	
	
	
	}
	
	
}

