package Assignments;

public class Pmethod {
	public void P1() {
		this.P1(1, 2, 3);
		System.out.println("Parent default Method");
	this.P1(1);
	this.P1(1, 2);
	}
	public void P1(int a) {
		
		System.out.println("Parent 1 parameterized Method");
	}
	public void P1(int a,int b) {
		
		System.out.println("Parent 2 parameterized Method");
	}

	public void P1(int a,int b,int c) {
		System.out.println("Parent 3 parameterized Method");
	}

}
