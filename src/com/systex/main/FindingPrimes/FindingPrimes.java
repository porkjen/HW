package com.systex.main.FindingPrimes;

public class FindingPrimes {

	public static void main(String[] args) {
		int max = Integer.parseInt(args[0]) ;
		System.out.println(2);
		boolean ck = true;
		for(int i=3;i<=max;i++){
			ck = true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					ck = false;
					break;
				}
			}
			if(ck) System.out.println(i);
		}
	}

}
