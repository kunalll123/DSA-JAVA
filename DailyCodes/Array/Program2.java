class CountArray{
	public static void main(String[] args){

		int arr[]=new int[]{2,5,1,4,8,0,8,1,3,8};

		int N=10;
		int count=0;

		/*for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				if(arr[i] < arr[j]){
					count++;
					break;
				}
			}
		}
		 System.out.println(count);
		
	}
}*/

		int maxEle=Integer.MIN_VALUE;
		for(int i=0; i<N; i++){
			if(arr[i] > maxEle)
				maxEle = arr[i];
			}

		for(int i=0; i<N; i++){
			if(arr[i]==maxEle)
				count++;
			}
		
		   System.out.println(N-count);
	}
}

