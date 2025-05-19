import java.util.*;

class QueriSum{
	public static void main(String[] args){
		
		
		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int N=10;
		int Q=3;

		int psArr[]=new int[N];

		psArr[0]=arr[0];
		for(int i=1; i<N; i++){
			psArr[i]=psArr[i-1]+arr[i];
		}
		Scanner sc=new Scanner(System.in);
	
		int sum=0;

		for(int i=0; i<Q; i++){
			int startIndex=sc.nextInt();
			int endIndex=sc.nextInt();

				if(startIndex==0)
					sum=psArr[endIndex];
				else
					sum=psArr[endIndex]-psArr[startIndex-1];

				System.out.println(sum);
		}
	}
}
