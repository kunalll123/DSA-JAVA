
import java.util.*;

class Findfactors{
	static int factors(int num){
		int count=0;
		int itr=0;

		for(int i=1; i<=num/2; i++){
			itr++;
			if(num%i == 0){
				count++;
			}
		}
		System.out.println(itr);
		return count+1;
		
	}
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

		int count=factors(num);
		System.out.println(count);
	}
}

