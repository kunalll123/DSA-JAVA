import java.util.*;

class ReplaceNum{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("ENter the number: ");
		int num = sc.nextInt();

		if(num == 0)
			return 5;

		int result=0;
		int place = 1;
		while(num > 0){
			int digit = num % 10;
			if(digit == 0)
				digit = 5;

			result = result+digit*place;
			place = place * 10;
			num = num/10;
		}
		System.out.println(result);
	}
}

