package com.jsp.String;

public class Palindrimewords7 {

	public static void main(String[] args) {
		String s="madAm Sir MadaM Sis";
		String [] s1=s.split(" ");
		for(int i=0; i<s.length(); i++) {
			if(isPalindrome(s1[i], i, i)) 
				System.out.println(s1[i]);
		}
	}
	static boolean isPalindrome(String s,int start, int end) {
		int i=start,j=end ;
			while(i<j){
				if(s.charAt(i)!=s.charAt(j))
					return false;
				i++;
				j--;
			}
			return true;
		}

}
