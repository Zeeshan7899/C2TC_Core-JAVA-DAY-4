package DAY13;

public class string1 {
	public static void main(String args[]){
		String str = "Hello";
		String str1 = "Hello";
		String str2 = new String("Hello");
		System.out.println(str == str1);
		System.out.println(str == str2);
		String s1 = new String("C2TC");
		String s2 = new String("C2TC");
         System.out.println(s1 == s2);

				System.out.println(s1.equals(s2));
		}
	
}
