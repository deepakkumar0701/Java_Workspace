package com.jsp.String;

public class AddNums11 {

	public static void main(String[] args) {
		String s1="ab12cd34mg5y5trt4t54";
		int sum=0;
		char [] a=s1.toCharArray();
		for(char ch:a) {
			if(ch>='0' && ch<='9') {
				sum+=(ch-'0');
			}
		}
		
System.out.println(sum);
	}

}
