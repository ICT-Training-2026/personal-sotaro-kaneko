package package1.package11;

public class Imaginary {
	//フィールド------------------------------
	double a;//実部
	double b;//虚部

	//コンストラクタ------------------------------
	public Imaginary(double input_a, double input_b) {
		this.a = input_a;
		this.b = input_b;
	}

	public Imaginary(double input_a) {
		this(input_a, 0.0);
	}

	public Imaginary() {
		this(0.0, 0.0);
	}

	//インスタンスメソッド------------------------------
	public double abs() {
		return Math.sqrt(a * a + b * b);
	}
	
	public void display() {
		System.out.println(a + " + j" + b);
	}
	
	//staticメソッド------------------------------
	public static double abs( double a , double b ) {
		return Math.sqrt(a * a + b * b);
	}
	
	public static Imaginary add( Imaginary x , Imaginary y) {
		Imaginary w = new Imaginary();
		w.a = x.a + y.a;
		w.b = x.b + y.b;
		return w;
	}
}
