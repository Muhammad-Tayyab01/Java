import java.util.*;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {

		
		// Question 1
		System.out.println("Question No 1");
		Armmstrong a = new Armmstrong();
		a.armStrongNumber();
		
		
		// Question 2
		System.out.println("");
		System.out.println("Question No 2");
		
		StringTokenizer  token = new StringTokenizer();
		
		token.countTokens(); 
		
		
		// Question 3
		System.out.println("");
		System.out.println("Question No 3");
		
		RunEncapTest encap = new RunEncapTest(); 
		encap.setName("Sami");
		encap.setAge(24);
		encap.setId(123);
		
		
		 System.out.println("Name: " + encap.getName());
		System.out.println("Age: " + encap.getAge());
		 System.out.println("Id: " + encap.getId());
	   
	  
		
	
		// Question 4
		 System.out.println("");
		System.out.println("Question No 4");
		Operation op = new Operation();
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number ");
		int num1= sc.nextInt();
		
		    Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter second number");
			int num2= sc1.nextInt();
		op.reverse(num1, num2, sum );
		
		
		// method inherited from base class
		Operator o = new Operator();
		o.reverseString();
		
		
		// Question No 5
		System.out.println("");
		System.out.println("Question No 5");
		// Zebra and Dolphin objects
		
		Dolphin dol = new Dolphin();
		dol.dinfo();
		dol.set_Value("Dolphin", 12);
		System.out.println("Name is " + dol.get_Name() + " Age is " + dol.get_Age());
		
		
		Zebra zeb = new Zebra();
		zeb.zinfo();
		zeb.set_Value("Zebra", 10);
		System.out.println("Name is " + zeb.get_Name() + " Age is " + zeb.get_Age());
		
		
		// Question No 6
		System.out.println("");
		System.out.println("Question No 6");
		 MotorCycle M=new MotorCycle();
		 System.out.println("Error: Method was not overridden by MoterCycle class");
	}
}
