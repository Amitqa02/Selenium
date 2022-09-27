package Assignments;

import java.util.Scanner;

public class Assignment6{
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
		Scanner S=new Scanner(System.in);
		System.out.print("insert value of X1-");
		int x1=S.nextInt();
		System.out.print("insert value of X2-");
		int x2=S.nextInt();
		System.out.print("insert value of X3-");
		int x3=S.nextInt();
		System.out.print("insert value of X4-");
		int x4=S.nextInt();
		System.out.print("insert value of X5-");
		int x5=S.nextInt();
		System.out.print("insert value of X6-");
		int x6=S.nextInt();
		Assignment6 result= new Assignment6();
		int F1=result.multi(x1,x2);
		int F2=result.sub(F1,x3);
		int F3=result.multi(F2,x4);
		int F4=result.add(F3,x5);
		int F5=result.div(F4,x6);
		System.out.println("Final result="+F5);
	}
			

	}


