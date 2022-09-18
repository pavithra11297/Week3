package week3.day1.assignment;

public class Students {
	public static void getStudentInfo(int id)
	{
		System.out.println("By passing id: " +id);
	}
	public static void getStudentInfo(int id, String name)
	{
		System.out.println("By passing id: " +id + " By passing name: " +name);
	}
	public static void getStudentInfo( String email, String phoneNumber)
	{
		System.out.println("By passing Email: " +email +"");
		System.out.println("By passing phoneNumber: " +phoneNumber);
	}
	public static void main(String[] args) {
		getStudentInfo(2);
		getStudentInfo(4,"Pavithra");
		getStudentInfo("Pavi@gmail.com","9999900023");
	}
}
