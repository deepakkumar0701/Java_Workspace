package com.jsp.arraysw;
import java.util.Scanner;
public class StoresEven11 {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter n element");
	int n=scn.nextInt();
	int [] a=new int[n];
	int j=0;
	for(int i=0; i<n; i++) {
	int n1=scn.nextInt();
	if(n1%2==0) {
		a[i]=n1;
		j++;
	}
}
for(int k:a) {
System.out.println(k+ " ");
}
}
}

