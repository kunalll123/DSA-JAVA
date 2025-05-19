import java.util.*;

class PrefixSum{

	int[] PrefixSum(int arr[]){

		for(int i=1; i<arr.length; i++){
			arr[i]=arr[i-1]+arr[i];
		}

		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		return arr;
	}

}

class Main{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter the array elements: ");

		for(int i=0; i<size; i++){
			arr[i]=sc.nextInt();
		}


		PrefixSum obj = new PrefixSum();
		obj.PrefixSum(arr);
	}
}
