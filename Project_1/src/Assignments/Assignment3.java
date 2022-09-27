package Assignments;

public class Assignment3 {

Assignment3(){
	    this(1,2,3);
		System.out.println("default constructor");
		
	}
Assignment3(int a){
	this(1,2);
		System.out.println("1 parameterized constructor");
	}
Assignment3(int a,int b){
	this();
	System.out.println("2 parameterized constructor");
}

Assignment3(int a,int b,int c){
		
		System.out.println("3 parameterized constructor");
	}

Assignment3(int a,int b,int c,int d){
	this(1);
	System.out.println("4 parameterized constructor");
}


	public static void main(String[] args) {
		Assignment3 result= new Assignment3(1,2,3,4);

	}

}
