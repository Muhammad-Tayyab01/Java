import java.util.*;
import java.util.Scanner;
public class Question6 {
 public void duplicateCharacter() {
	 
	 // take input from user
	 System.out.println("Please enter a string");
     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
	 
     // store string in a char type array
     char[] y = str.toCharArray();
     System.out.println("The string is:" + str);
     System.out.print("Duplicate Characters in above string are: ");
     
     // loop to find out duplicate letters in a given string
     for (int i = 0; i < str.length(); i++) {
        for (int j = i + 1; j < str.length(); j++) {
           if (y[i] == y[j]) {
              System.out.print(y[j] + " ");
              break;
           }
        }
        
        // string after removing duplicate letters
        
       StringBuilder sb = new StringBuilder();
        str.chars().distinct().forEach(c-> sb.append((char)c));
        System.out.println("String after removing duplicate letters ");
        System.out.println(sb);  
     }

 }
}
