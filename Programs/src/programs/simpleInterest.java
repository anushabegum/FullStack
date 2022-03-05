package programs;

import java.util.Scanner;

public class simpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter profit:");
		int n1=sc.nextInt();
		System.out.println("enter time:");
		int n2=sc.nextInt();
		System.out.println("enter rate of interest:");
		int n3=sc.nextInt();
		
		int SI=(n1*n2*n3)/100;
		
		System.out.println("Simple Interest Is:"+SI);

	}

}
