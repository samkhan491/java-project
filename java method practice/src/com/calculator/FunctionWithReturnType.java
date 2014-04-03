package com.calculator;

public class FunctionWithReturnType {

	public static void main(String[] args) {
		int a= add(5,5)+20;
        System.out.println("Main function result "+a);
	
        int d=add(5,5)-20;
        System.out.println(d);
        
        int r=d*100;
        System.out.println(r);
        
        
    
        		
        
	
	}

	public static int add(int a, int b){
	    int c=a+b;
	    System.out.println("Add function result "+c);
	    return c;
		
}
public static void mult(int q,int r,int t ,int w,int e){
            int a=q*w*e*r;

           System.out.println(a);
           
}
public static void bla(){

	int a=4; int b=9;
	int c=a+b;
	System.out.println(c);
    
}

}