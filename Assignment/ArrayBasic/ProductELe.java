import java.util.*;

class ProdArray {
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number of Test cases : ");
		int T = sc.nextInt();

		final long mod = 1000000007;

		while(T-- > 0){
			System.out.println("Enter the element:");
			int n = sc.nextInt();
			long prod = 1;

			for(int i=0; i<n; i++){
				int num=sc.nextInt();
				prod=(prod*num)%mod;
			}
			System.out.println(prod);
		}
	}
}
