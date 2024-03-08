import pack.*;

import java.util.Scanner;

class q13_48{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		mat m=new mat();
		do{
		System.out.println("choice: 1)display 2)Add 3)Multiply 4)Transpose");
		System.out.print("Enter Your choice:");
		int ch= sc.nextInt();
		switch(ch)
		{
			case 1:
				m.displayA();
				m.displayB();
				break;
			case 2:
				System.out.println("Add:");
				m.add();
				break;
			case 3:
				System.out.println("multiply:");
				m.multi();
				break;
			case 4:
				System.out.println("Transpose:");
				m.transpose();
				break;
			case 5:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid");
				break;
				
		}
		}while(ch!=5);
	}
}