package programs;

import java.util.Scanner;

public class printName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name ");
		String n=sc.next();
		int count=1;
		while(count<=10) {
			System.out.println(n);
			count=count+1;
		}
		System.out.println();
		
		int count_a=1;
		while(count_a<=10) {
			System.out.print(n);
			count_a=count_a+1;
			
		}

	}

}
