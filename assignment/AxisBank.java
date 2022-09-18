package week3.day1.assignment;

public class AxisBank {
	public void deposit()
	{
		System.out.println("This is deposit method in AxisBank class");
	}
	public static void main(String[] args) {
		AxisBank axisObj=new AxisBank();
		axisObj.deposit();

		BankInfo bankObj=new BankInfo();
		bankObj.deposit();
		bankObj.fixed();
		bankObj.savings();		
	}
}
