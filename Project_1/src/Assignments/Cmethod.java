package Assignments;

public class Cmethod extends Pmethod{
	public void C1() {
		
		System.out.println("child default Method");
	}
	public void C1(int a) {
		
		System.out.println("child 1 parameterized Method");
	}
	public void C1(int a,int b) {
		
		System.out.println("child 2 parameterized Method");
	}
	public void C1(int a,int b,int c) {
		super.P1();
		this.C1(1, 2);
		this.C1();
		this.C1(1);
		System.out.println("child 3 parameterized Method");
	}


	public static void main(String[] args) {
		Cmethod C= new Cmethod();
           C.C1(1, 2, 3);
           
	}

}
