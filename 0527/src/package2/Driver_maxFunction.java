package package2;

import java.util.Scanner;

public class Driver_maxFunction {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("1つ目の数字を入力してください： ");
		int a = s.nextInt();
		
		System.out.print("2つ目の数字を入力してください： ");
		int b = s.nextInt();
		
		System.out.println("大きいのは" +  max( a , b ) );
	}
	
	static int max( int a , int b ) {
		if( a>= b ) return a;
		else return b;
	}
}
