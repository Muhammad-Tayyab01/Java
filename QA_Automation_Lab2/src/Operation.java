
import java.util.*;
import java.util.Scanner;
class Operation {
 
	
	//a method named reverse that takes integers as parameters 
	
	public void reverse(int num1, int num2, int sum) {
		// take input from user
		
			 
		sum = num1 + num2;
		
		System.out.println("Sum = " + sum);
		
		 
			 
			 
	}
 
    // method to reverse a string
	public void reverseString()
	{
		
		String str= "ABC**bca*", nstr="";
        char ch;
        
      System.out.println("Original word: " + str);
      
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
	}
	
} 





 class Operator extends Operation
 {
   
	 
    
	 
	 
	 
 }
