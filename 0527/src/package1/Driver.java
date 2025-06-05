package package1;

import package1.package11.Imaginary;

public class Driver {

	public static void main(String[] args) {
		
		Imaginary x = new Imaginary(3, 4);
		Imaginary y = new Imaginary(7, 5);
		Imaginary w = Imaginary.add(x,y);
		w.display();
	}
	
}
