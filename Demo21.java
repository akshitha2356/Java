package day_5;
class Demo22 {
	int x=55;
}

public class Demo21 extends Demo22 {
	void show() {
		int y=66;
		System.out.println(y);
		System.out.println(super.x);
	}
	public static void main(String[] args) {
		Demo21 n1=new Demo21();
		n1.show();
	}

}
