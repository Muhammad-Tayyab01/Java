import java.util.Scanner;
public class T5 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter total number of elements in array: ");
      int n = sc.nextInt();
      int Array[] = new int[n];
      System.out.println("Enter numbers: ");
      for(int i=0; i<=n-2; i++) {
         Array[i] = sc.nextInt();
      }
      //Finding the missing number
      int totalsum = (n*(n+1))/2;
      int sum = 0;
      for(int i=0; i<=n-2; i++) {
         sum = sum+Array[i];
      }
      int missingNumber = totalsum-sum;
      System.out.println("Missing number is: "+missingNumber);
      sc.close();
   }
}