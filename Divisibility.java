package Divisibility;

import java.util.Scanner;
public class Divisibility {
	public static int Divi(int ar[],int n) {
	   int count=0;
	   for(int i=0;i<n;i++) {
		   if(ar[i]!=0)
		   if(ar[i]%3==0) {
			   count++;
		   }
	   }System.out.println(count);
	return count;
	   
		
	}

	public static void main(String[] args) {
	
		Scanner A=new Scanner(System.in);
		int n=A.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=A.nextInt();
			}
	    System.out.println(Divi(ar,n));
		
	}

}