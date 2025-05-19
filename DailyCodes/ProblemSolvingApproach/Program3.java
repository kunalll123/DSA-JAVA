//Code Extra Optimize

import java.util.*;

class Findfactors{
	static int factors(int num){
		int count=0;
		int itr=0;

		for(int i=1; i*i<=num; i++){
			itr++;
			if(num%i == 0){
				if(i == num/i)
					count=count+1;
				else
					count=count+2;
			}
		}
		System.out.println(itr);
		return count;
		
	}
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

		int count=factors(num);
		System.out.println(count);
	}
}


