package Assignments;

public class Student {
	int roll,age;
void display1(){
	System.out.println("display1");
}	

void display2(){
	System.out.println("display2");
}	


	public static void main(String[] args) {
		Student Amit= new Student();
		Amit.roll=14;
		Amit.age=28;
		System.out.println("my roll no. is-"+Amit.roll);
		System.out.println("my age is-"+Amit.age);
		Amit.display1();
		Amit.display2();
	}

}
