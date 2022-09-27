package Assignments;

public class parent {
	public parent() {
		this(1,2,3);
		System.out.println("Parent default Constructor");
	}
	public parent(int a) {
		this();
		System.out.println("Parent 1 parameterized Constructor");
	}
	public parent(int a,int b) {
		this(2);
		System.out.println("Parent 2 parameterized Constructor");
	}

	public parent(int a,int b,int c) {
		System.out.println("Parent 3 parameterized Constructor");
	}
}
