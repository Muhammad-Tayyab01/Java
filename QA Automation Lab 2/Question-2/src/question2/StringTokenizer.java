package question2;
import java.util.Scanner;
public class StringTokenizer {
	Scanner sc = new Scanner(System.in);
	private String newInput = sc.nextLine();
	public String input() {
		return newInput;
	}
	public int countToken(String newInput) {
		int i =0;
		int count =0;
		int length = newInput.length();
		char ch[] = new char[length];
		for (i=0; i<length ;i++){
			ch[i] = newInput.charAt(i);
	    	if(ch[i]=='@' || ch[i]=='#' || ch[i]==' ' || ch[i]==',' || ch[i]=='*')
	    	{
	    		count++;
	    	}
	     }
		return count;
	}
	public static void main(String[] args) {
		System.out.println("Enter any input");
		StringTokenizer func = new StringTokenizer();
		String arr = func.input();
		
		int check = func.countToken(arr);
		System.out.println("Delimiters are " + check); 
         }
}

