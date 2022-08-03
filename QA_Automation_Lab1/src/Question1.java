import java.util.*;
import java.util.Scanner;
public class Question1 {

	public void abbreviation() {
		System.out.println("Please enter full name with space");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        
        // using split method to split at given delims
        String[] arr = name.split(" ",3);
        System.out.println(arr[0].charAt(0)+"."+arr[1].charAt(0)+"."+arr[2]);
        
        

	}
	
	
}
