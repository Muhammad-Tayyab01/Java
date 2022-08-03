package maxAlphhebets;

import java.util.Scanner;
public class maxalpha {
	public static void main(String[] args) {
		System.out.println("Enter any string");
		Scanner sc = new Scanner(System.in);
		String newInput = sc.nextLine();
		    char ch[] = newInput.toCharArray();      
		     int i,j,k,c=1,n;
		     for (i=0; i<newInput.length();i++); 
		     n=i;
		     System.out.println("number of charaters in string = " + n); 
		     for (i=0; i<n;i++)
		     {
		        for (j=i+1; j<n ;j++)
		        {
		            if (ch[j] == ch[i])
		            {
		                c++;

		                for (k=j; k<n-1;k++) 
		                {
		                    ch[k] = ch[k+1];		                
		                    }
		             n--; 
		            }
		         }
		       System.out.println("alphabet " + ch[i] + " occured " + c + " times");

		       c=1;
		     }  
    }		
}
