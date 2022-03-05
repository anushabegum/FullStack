package programs.controller;

import java.util.Scanner;

public class ProgramController {

	Scanner sc=new Scanner(System.in);

	public void primeProgram() {
	
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int count=0;
		if(n>1) {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					count=count+1;
				}
				
			}
			if(count==0) {
				System.out.println("Prime Number");
			}
			else {
				System.out.println("Not a Prime Number");
			}
		}
		else {
			System.out.println("Enter Valid Number");
			
		}
		
		
	}

	public void fibnocci() {
		
		int n1=0,n2=1,count=1,n=20;
		
		if(n<0) {
			System.out.println("Enter Positive Number");
		}
		else if(n==1){
			System.out.println(n1);
			
		}
		else {
			while(count<=n) {
				System.out.println(n1);
				int n3=n1+n2;
				n1=n2;
				n2=n3;
				count=count+1;
				
			}
		}
	}

	public void addition() {
		System.out.println("enter num1:");
		int i1=sc.nextInt();
		System.out.println("enter num2:");
		int i2=sc.nextInt();
		System.out.println(i1+i2);
		
	}

	public void areaofCircle() {
		 System.out.println("Enter Radius");
	     int r=sc.nextInt();
	     System.out.println("Area Of Circle is:"+3.14*r*r);
		
	}

	public void CubeofNumbers() {
		for(int i=1;i<=10;i++) {
			System.out.println(i*i*i);
			
		}
	
		
	}

	public void Factorial() {
		System.out.println("Enter Number");
		int a=sc.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		
	}

	public void multiplicationTable() {
		System.out.println("Enter Number");
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++){
			System.out.println(i+"*"+n+"="+(i*n));
			
			
			
		}
		
	}

	public void reverse() {
		System.out.println("Enter Number:");
		String a=sc.next();
		int b=a.length();
		String rev="";
		for(int i=0;i<b;i++) {
			char c=a.charAt(i);
			rev=c+rev;
		}
		System.out.println(rev);
		
	}

	public void sumofNumbers() {
		int sum_a=0;
		for(int i=1;i<=99;i++) {
			if(i%2!=0) {
				sum_a=sum_a+i;
			}
		
			
		}
		System.out.println(sum_a);
		
	}

	public void pattern1() {
		System.out.println("Enter Number");
		int v=sc.nextInt();
		String rev="";
		for(int i=1;i<=v;i++) {
			String s=Integer.toString(i);
			rev=rev+" "+s;
			System.out.println(rev);
				

	}

		
	}

}
