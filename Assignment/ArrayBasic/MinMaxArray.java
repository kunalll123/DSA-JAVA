class MinMax{
	public static void main(String[] args){

		int n=6;
		int arr[]=new int[]{3,2,1,56,10000,167};


		int maxVal = Integer.MIN_VALUE;
		int minVal = Integer.MAX_VALUE;

		for(int i=0; i<n; i++){
			if(arr[i] > maxVal){
				maxVal = arr[i];

			if(arr[i] < minVal)
					minVal = arr[i];
					
			}
	
		}
			System.out.println(maxVal);
			System.out.println(minVal);
	}
}

