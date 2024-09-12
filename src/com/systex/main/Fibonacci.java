package com.systex.main;

public class Fibonacci {

	public static void main(String[] args) {
		int count = Integer.parseInt(args[0]);
		int first=0, second=1, add=first+second;
		System.out.print(first+" "+second);
		while(add<count) {
			System.out.print(" "+add);
			first = second;
			second = add;
			add = first+second;
		}

	}

}
