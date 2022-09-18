package org.system;

public class Desktop extends Computer {

	public void desktopSize()
	{
		System.out.println("This is desktopzise method in desktop class");
	}
	public static void main(String[] args) {
		Computer cObj=new Computer();
		cObj.computerModel();
	}

}
