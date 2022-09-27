package Assignments;

public class Assignments2 {
	int add(int a,int b) {
		int c=a+b;
	  return c;
	}

	int sub(int a1,int b1) {
		int c1= a1-b1;
		return c1;
		
	}

	int multi(int a2,int b2) {
		int c2= a2*b2;
		return c2;
	}

	int div(int a3,int b3) {
		int c3=a3/b3;
		return c3;
	}
	public static void main(String[] args) {
		System.out.println("Solve this ((((10-2)+2)-2)*2)/2)");
		Assignments2 result= new Assignments2();
int F=result.sub(10,2);
int F1=result.add(F,2);
int F2=result.sub(F1,2);
int F3=result.multi(F2,2);
int F4=result.div(F3,2);
System.out.println("Final result="+F4);

	}

}
