import java.util.*;
import java.util.Scanner;
public class StringTokenizer {

	public int countTokens() {
		// take input from user
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a string");
			    String input= sc.nextLine(); 
			    
	      // store input in char type array
	     String delims = "[ .,'!?_@#*]";
		 int token = input.split(delims).length;   
			    System.out.println("Count = " + token); 
		return 1;
	}
	
	
	
}
