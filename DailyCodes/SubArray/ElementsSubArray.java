//Print all the elements in a given subarray from start to end
// start=3  ,  end=7


class ElementsSubArray{
	public static void main(String[] args){

		int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int start=3;
		int end=7;

		for(int i=start; i<=end; i++){
			System.out.println(arr[i]);
		}
	}
}
