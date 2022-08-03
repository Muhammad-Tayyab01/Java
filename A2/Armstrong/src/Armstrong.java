import java.io.*;
class Armstrong {
	 public static void main(String[] args) throws IOException {
	    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    	System.out.println("Enter your input: ");
	        int input = Integer.parseInt(br.readLine());
	        
	        int originalinput=input; 
	        int remainder; 
	        int result = 0;
	        while (originalinput != 0)
	        {
	            remainder = originalinput % 10;
	            result += Math.pow(remainder, 3);
	            originalinput /= 10;
	        }
	        if(result == input)
	            System.out.println(input + " is an Armstrong number.");
	        else
	            System.out.println(input + " is not an Armstrong number.");	    	
	 }
}