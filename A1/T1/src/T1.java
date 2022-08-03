import java.io.*;	
class T1 {
	    public static void main(String[] args) throws IOException {
	    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	    	  System.out.print("\nEnter First name:\t");
	    	  char firstname=br.readLine().charAt(0);

	    	  System.out.print("\nEnter Middle Name:\t");
	    	  char midname=br.readLine().charAt(0);

	    	  System.out.print("\nEnter Last name:\t");
	    	  String lastname=br.readLine();

	    	  System.out.println("\nYour Abbreviated Name:\t"+firstname+"."+midname+"."+lastname);

	    }
	}
	
