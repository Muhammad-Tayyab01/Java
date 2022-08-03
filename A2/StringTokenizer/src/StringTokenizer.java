import java.util.Scanner;
class StringTokenizer {

	public static void main(String[] args) {
		
		StringTokenizer c =  new StringTokenizer();
		c.cToken();
	    }
	
	private int cToken() {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a random sample:");
	      
	        String s = sc.nextLine();
	        String delims= "[ .,'!?_@#*]+";
	        int token=s.split(delims).length;

	        System.out.println("Total tokens are: " + token);
	        

	        sc.close();
	        return 1;		 
	} 
	
  	    
	}
