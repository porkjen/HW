package com.systex.main;

public class Loop6 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j = 0;j<i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(6-i)*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
