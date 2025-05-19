import java.util.*;

public class PrefixSum {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5}; // Input array
	int N=5;

	int psArr[]=new int[N];
	int psArr[0]=arr[0];
        
        for (int i = 1; i < N; i++) {
            psArr[i] = psArr[i - 1]+arr[i];  // Adding the previous element to the current element
        }

        // Output the prefix sum array
        System.out.println(Arrays.toString(A));
    }
}


