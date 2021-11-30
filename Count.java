package string;

import java.util.Scanner;

public class Count {

	static int upper,lower,special,digit,vowels,conso;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String of your choice...");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if (ch>='A' && ch<='Z') {
				upper++;
			}else if (ch>='a' && ch<='z') {
				lower++;
			}if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
				||	ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				vowels++;
			}else if (ch>='a' && ch<='z' || ch>='A' && ch<='Z')  {
				conso++;
			}else if (ch>='0' && ch<='9') {
				digit++;
			}else {
				special++;
			}
		}
		System.out.println("Number of Upper Case Characters -: "+upper);
		System.out.println("Number of Lower Case Characters -: "+lower);
		System.out.println("Number of Digits -: "+digit);
		System.out.println("Number of Special Characters -: "+special);
		System.out.println("Number of Vowels -: "+vowels);
		System.out.println("Number of Consonants -: "+conso);
	}
}
