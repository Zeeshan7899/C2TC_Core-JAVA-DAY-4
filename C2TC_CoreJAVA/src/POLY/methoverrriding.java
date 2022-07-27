package POLY;
class Loan{
	void Interestrate() {
		System.out.println("the defaul chare is 0");
		};
	}
class LoanShark1 extends Loan{
	void Interestrate() {
		System.out.println("This is the rate 1 charge is 10");
}
class LoanShark2 extends Loan{
	void Interestrate() {
		System.out.println("This is the rate 2 charge is 13");
		
}
class LoanShark3 extends Loan{
	void Interestrate() {
	System.out.println("3 charges the default rate");
	}
}
public class methoverrriding {
public static void main(String args[]) {
	Loan ls1 = new LoanShark1();
	Loan ls2 = new LoanShark2();
	Loan ls3 = new LoanShark3();
	ls1.Interestrate();
	ls2.Interestrate();
	ls3.Interestrate();
	
}
