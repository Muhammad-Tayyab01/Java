import java.io.*;
class T2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter a particular string:\t");
  	    String strings=br.readLine();
  	    
  	  System.out.print("\nEnter alphabet to check for occurance:\t");
	    String alphabet=br.readLine();
	    
	    
	    int count=0;
	    int i;
	    for(i=0; i <strings.length();i++) {
	    	if (strings.charAt(i) == alphabet.charAt(0)) {
	    		count++;
	    	}
	    }
	    System.out.println("\nTotal Characters are:\t"+count);
  	    
	}
}