package com.jsp.arraysw;

public class countzero10 {
	public static void main(String[] args) {
		int[]ar= {1,0,5,2,0,1,5,0,64,4,0,0,7};
		int count=0s;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==0)count++;
		}
		System.out.println(count);

	}

}
