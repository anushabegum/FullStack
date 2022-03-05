package programs;

import java.util.Scanner;

import programs.controller.ProgramController;

public class pro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s="y";
		while(s.equals("y")) {
			
			System.out.println("******MAIN MENU******");
			System.out.println("press 1 to execute Prime number program");
			System.out.println("press 2 to execute Fibnocci program");
			System.out.println("press 3 to execute addition of two numbers program");
			System.out.println("press 4 to execute area of circle program");
			System.out.println("press 5 to execute cube of numbers program");
			System.out.println("press 6 to execute Factorial program");
			System.out.println("press 7 to execute MultiplicationTable program");
			System.out.println("press 8 to execute Reverse of a number program");
			System.out.println("press 9 to execute Sum of numbers program");
			System.out.println("press 10 to execute pattern program");
			int ch=sc.nextInt();
			
			ProgramController pc=new ProgramController();
			
			switch(ch) {
			case 1:
				pc.primeProgram();
				break;
			case 2:
				pc.fibnocci();
				break;
			case 3:
				pc.addition();
				break;
			case 4:
				pc.areaofCircle();
				break;
			case 5:
				pc.CubeofNumbers();
				break;
			case 6:
				pc.Factorial();
				break;
			case 7:
				pc.multiplicationTable();
				break;
			case 8:
				pc.reverse();
				break;
			case 9:
				pc.sumofNumbers();
				break;
			case 10:
				pc.pattern1();
				break;
			default:
				System.out.println("Choose correct option");
			}
			System.out.println("do you want to continue press y/n");
			s=sc.next();
			
		}
		

	}

}
