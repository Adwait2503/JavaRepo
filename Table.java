package assignments;

import java.util.Scanner;

public class Table {
	static int prod, sum, range;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of your Choice -: ");
		int num = sc.nextInt();
		/*System.out.print("Enter the Range -: ");
		range = sc.nextInt();*/
		for (int i = 1; i <= 10; i++) {
			prod = num * i;
			System.out.println(num + " * " + i + " = " + prod);
			sum = sum + prod;
			/*
			 * if(sum>=range) { break; }
			 */
		}
		System.out.println("The Sum is -: " + sum);
	}

}
