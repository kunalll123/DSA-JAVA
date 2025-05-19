//Return the length of the smallest subArray which contains both the maximum of the array and the minimum of the array


class MinMaxSubArray{
	public static void main(String[] args){

		int arr[]=new int[]{1,2,3,1,5,4,6,4,6,3};

		int minLength=Integer.MAX_VALUE;

		int maxValue=Integer.MIN_VALUE;
		int minValue=Integer.MAX_VALUE;

		int len=0;

		for(int i=0; i<arr.length; i++){
			if(arr[i]<minValue)
				minValue=arr[i];

			if(arr[i]>maxValue)
				maxValue=arr[i];
		}

		for(int i=0; i<arr.length; i++){
			if(arr[i]== minValue){
				for(int j=i+1; j<arr.length; j++){
					if(arr[j]==maxValue){
						len=j-i+1;
						if(minLength>len)
							minLength=len;
					}
				}
			}else if(arr[i]==maxValue){
				for(int j=i+1; j<arr.length; j++){
					if(arr[j]==minValue){
						len=j-i+1;
						if(minLength > len)
							minLength=len;
					}
				}
			}
		}
		System.out.println(minLength);
	}
}
