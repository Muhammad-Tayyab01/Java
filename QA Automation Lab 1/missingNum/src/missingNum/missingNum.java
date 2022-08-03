package missingNum;
import java.util.*;
import java.util.Arrays;
public class missingNum {
		public static int getMissingNo(int[] nums, int n)
		{
			int sum = ((n + 1) * (n + 2)) / 2;
			for (int i = 0; i < n; i++)
				sum -= nums[i];
			return sum;
		}

		public static void main(String[] args)
		{
			int[] arr = { 1, 2, 3, 4, 5, 7, 8,9 };
			int N = arr.length;
			System.out.println(getMissingNo(arr, N));
		}
	}
