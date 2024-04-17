package com.chainsys.day3;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int i=1;i<=3;i++) {
	            for(int var=i;var<3;var++) {
	            
	                System.out.print(" ");
	            }
	            for(int j=1;j<=2*i-1;j++) {
	                if(j==1 && i==1) {
	                    System.out.print(" ");
	                }
	                    System.out.print("*");
	                
	            }
	            System.out.println();
	        }
	        for(int i=2;i>=1;i--) {
	            for(int var=i;var<3;var++) {
	                System.out.print(" ");
	            }
	            for(int j=1;j<=2*i-1;j++) {
	                if(j==1 && i==1) {
	                    System.out.print(" ");
	                }
	                    System.out.print("*");
	                
	            }
	            System.out.println();
	        }
	}

}
