package com.oops;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("To find the given number is Even number or not");
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("The given number "+n+" is an even number");
		}
		else {
			System.out.println("The given number "+n+" is an odd number");
		}
	}

}
