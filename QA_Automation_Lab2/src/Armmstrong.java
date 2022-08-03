import java.util.*;
import java.util.Scanner;
public class Armmstrong {
	
// method to find a armStrong number
	
public void armStrongNumber() {
	
	// take input from user
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to find either it is armstrong number or not");
	int number= sc.nextInt();
	
    int temp1 = number;
    int length = 0;
    
    // find length of a number entered by user
    while(temp1 !=0) {
    	
    	temp1 = temp1 /10;
    	length = length + 1;
    }
	
    System.out.println("Length of number you entered is " + length);
    
    // find either a number is armStrong or not
    
    int temp2 = number, rem, arm = 0;
    
    //while loop to find number is not equal to zer0
    while (temp2 != 0) {
    	//find remainder
    	rem = temp2 % 10;
    	int mul = 1;
    	
    	// for loop perform calculation 
    	for (int i=1; i<=length; i++) {
    		mul = mul * rem;
    	}
    	
    	arm = arm + mul;
    	temp2 = temp2 / 10;
    	
    }
   
        
    
    // if condition to find whether a number is armStrong or not
    
   if (number == arm) {
    	System.out.println("Input " + number + "is an Armstrong number");
    }
    else {
    	System.out.println("Input " + number + "is not an Armstrong number");
    } 
}
	
	

	
}
