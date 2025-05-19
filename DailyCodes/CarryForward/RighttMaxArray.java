class Rightmax{
	public static void main(String[] args){

		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
		//int N=10;

		int Rightmax[]=new int[arr.length];
		
		for(int i=1; i<arr.length; i++){
			if(Rightmax[i+1] > arr[i])
				Rightmax[i]=arr[i];
			else
				Rightmax[i]=Rightmax[i+1];
		}

		for(int i=0; i<arr.length; i++){
			System.out.println(Rightmax[i] + " ");
		}
	}
}
