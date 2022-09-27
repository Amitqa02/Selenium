package Pkg1;

public class Selenium extends Automation {

	public Selenium() {
		System.out.println("child default Constructor");
	}
	public Selenium(int a) {
		super(34,23);
		System.out.println("child 1 parameterized Constructor");
	}
	public Selenium(int a,int b) {
		System.out.println("child 2 parameterized Constructor");
	}

	
	public static void main(String[] args) {
		
		Selenium S=new Selenium(22);
        System.out.println(S.x); 
        
	}

}
