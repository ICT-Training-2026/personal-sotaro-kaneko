package package1;
//割り算の結果をcに代入する
public class Main {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		System.out.println( "い" );
		warizan(a,b);
		System.out.println( "あ" );
	}
	
	static void warizan( int a , int b ) {
		double syou = (double)a/b;
		System.out.println( a + "÷" + b + "=" + syou );
		display();
	}
	
	static void display() {
		System.out.println();
		System.out.println();
		System.out.println();
	}

}
