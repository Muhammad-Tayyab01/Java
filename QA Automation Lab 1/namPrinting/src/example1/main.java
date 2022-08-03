package example1;
import java.util.Scanner;

public class main {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String fName, mName, lName;
	    
	    System.out.println("Enter first name"); 
	    fName = sc.nextLine();   
	    
	    System.out.println("Enter middle name"); 
	    mName = sc.nextLine();   
	    
	    System.out.println("Enter last name"); 
	    lName = sc.nextLine();   
	    
	    System.out.print("Username is: " + fName);   
	    System.out.print(" " + mName); 
	    System.out.print(" " + lName); 
	    System.out.println();
	    
	    System.out.print(fName.charAt(0) + "." + mName.charAt(0) + "." + lName);
	  }
	}

