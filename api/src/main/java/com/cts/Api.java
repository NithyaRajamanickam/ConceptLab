package com.cts;




public class Api {

    public int apiSum(int a, int b) {
    	         return a + b;  
 }
 
 public int apiSubtraction(int a, int b) {
	 System.out.println(String.format("The value of my integer is %d", "Hello World"));  // Noncompliant; an 'int' is expected rather than a String)
     return a - b;
 }
 
 public int apiMultiplication(int a, int b) {
        return a * b;
 }

 public int apiDivison(int a, int b)  {
	 
        return a / b;
 }
 
 public boolean equalIntegers2(int a, int b) {
        boolean result = false;
        if (a == b) {
               result = true;
        }

        return result;
 }

	
}
