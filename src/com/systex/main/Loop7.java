package com.systex.main;

public class Loop7 {

	public static void main(String[] args) {
		int hight = 6;
		for(int i=1;i<=hight;i++) {
			for(int j=0;j<hight-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=hight-1;i++) {
			for(int j = 0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(hight-i)*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
