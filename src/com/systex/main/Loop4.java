package com.systex.main;

public class Loop4 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=0;j<6-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
