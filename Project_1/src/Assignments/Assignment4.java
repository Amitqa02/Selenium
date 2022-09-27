package Assignments;

public class Assignment4 {

		 void Method(){
		   
			System.out.println("default Method");
			
		}
		void Method(int a){
	
			System.out.println("1 parameterized Method");
			
		}
		void Method(int a,int b) {

		System.out.println("2 parameterized Method");
	}

		void Method(int a,int b,int c){
			
			System.out.println("3 parameterized Method");
			this.Method();
			this.Method(1);
			this.Method(1,2);
			this.Method(1, 2,3, 4);
			
		}

		void Method(int a,int b,int c,int d){
	
		System.out.println("4 parameterized Method");
	}

	
		
		public static void main(String[] args) {
			Assignment4 result= new Assignment4();

			result.Method(1,2,3);

		}

	}


