package Assignments;

public class child extends parent {
	public child() {
		super(1,2);
		System.out.println("child default Constructor");
	}
	public child(int a) {
		this(2,3);
		System.out.println("child 1 parameterized Constructor");
	}
	public child(int a,int b) {
		this(2,3,4);
		System.out.println("child 2 parameterized Constructor");
	}
	public child(int a,int b,int c) {
		this();
		System.out.println("child 3 parameterized Constructor");
	}

	public static void main(String[] args) {
		child C=new child(2);

	}

}
