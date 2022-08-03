import java.io.*;	
class T4 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	
    	System.out.print("\nEnter your input:\t");
  	   String input=br.readLine();
  	   
  	   for(char i : input.toCharArray()) {
  		   if(input.indexOf(i)==input.lastIndexOf(i)) {
  			 System.out.println("\nFirst Non-Repeat element is:\t"+i); 
  			 break;
  		   }
  	   }
    
    }
}