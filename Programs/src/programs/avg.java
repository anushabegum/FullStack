package programs;

import java.util.Scanner;

public class avg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			
			System.out.println("enter element:");
			
			arr[i]=sc.nextInt();
			
		}
		System.out.println();
		int sum=0;
		for(int i=0;i<n;i++) {
			int op=arr[i];
			sum=sum+op;
		}
		int avg=sum/n;
		System.out.println("Average is:"+avg);
	}

}
