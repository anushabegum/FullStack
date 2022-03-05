package programs;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks");
		int n=sc.nextInt();
		
		if(n>85) {
			System.out.println("A Grade");
		}

		else if(n<=85 && n>60) {
			System.out.println("B Grade");
		}

		else if(n<=60 && n>50) {
			System.out.println("C Grade");
		}
		else {
			System.out.println("D Grade");
			
		}
		
	}

}
