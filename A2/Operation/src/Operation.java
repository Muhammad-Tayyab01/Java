
class Operation {
	public int reverse(int a, int b){
        int sum = a + b; 
        return sum;
	}

	
}
class Operator extends Operation{
	public void reverse(String str) {
	String  n="";
	char ch;
	System.out.println("Original String: "+ str);
	
	for(int i=0;i<str.length();i++) {
		ch=str.charAt(i);
		n=ch+n;
	}
	System.out.println("Reverse Form is: "+n);
}
}