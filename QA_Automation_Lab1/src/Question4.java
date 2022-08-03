import java.util.*;
import java.util.Scanner;
public class Question4 {
 
	public void firstNonRepeatLetter() {
		// take input string from user
		 System.out.println("Please enter a string");
	     Scanner sc = new Scanner(System.in);
	     String inputStr = sc.nextLine();
         
	     // loop to find first non repeating character in a string
        for(char i :inputStr.toCharArray()){
        if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
            System.out.println("First non-repeating character is: "+i);
            break;
        }
        }

	}
}
