
package day_5;

interface I11{
	void add();
}

interface I22{
	void sub();
}

interface I33 extends I11,I22 {
	void mul();
}

class Demo88 {
	void div() {
		System.out.println("bachan");
	}
}

public class test2 extends Demo88 implements I33 {
	public void add() {
		System.out.println("hii");
	}
	public void sub() {
		System.out.println("hello");
	}
	public void mul() {
		System.out.println("welcome");
	}
	public static void main(String[] args) {
		test2 n1=new test2();
		n1.add();
		n1.sub();
		n1.mul();
		n1.div();
	}

}
