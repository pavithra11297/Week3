package week3.day1.assignment;

public class Automation extends MultipleLanguage{

	public void Java() {
		System.out.println("This is Java method in Language Interface ");
	}

	public void Selenium() {
		System.out.println("This is Selenium method in TestTool Interface ");
	}

	@Override
	public  void ruby() {
		System.out.println("This is ruby method in MultipleLanguage abstract class");

	}
	public static void main(String[] args) {
		Automation MLobj=new Automation();
		MLobj.python();
		MLobj.ruby();
		MLobj.Selenium();
		MLobj.Java();
	}
}