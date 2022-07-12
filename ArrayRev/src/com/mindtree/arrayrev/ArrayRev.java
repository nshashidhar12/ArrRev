package com.mindtree.arrayrev;

import java.util.Scanner;

public class ArrayRev {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array:");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter numbers to reverse:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("reversed array:");
			for(int i=a.length-1;i>=0;i--) {
				System.out.print(a[i]);
			}
	}

}
