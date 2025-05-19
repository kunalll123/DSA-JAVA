class replace_zero{
	public static void main(String[] args){
		int num=1004;
		int rev=0;

		while(num>0){
			int rem=num%10;
			if(rem==0)
				rem=5;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
		System.out.println(num);
		while(rev>0){
			int digit=rev%10;
			num=num*10+digit;
			rev=rev/10;
		}
		System.out.println("Number after replacing zero is:"+num);
	}
}
