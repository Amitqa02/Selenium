package Patterns;

public class pattern {

	public static void main(String[] args) {
		for(int i=4; i>=1; i--) {
			 
			for(int j=4; j>=1; j--) {
				if(j>i){
					System.out.print(j);	
				}
				else {
					System.out.print(i);	
				}
				}
			System.out.println();
		}

	}

}
