class SquareRoot{
	static int sqrt(int num){
		int val=0;
		int itr=0;
		for(int i=1; i<=num; i++){
			itr++;
			if(i*i <= num)
				val=i;
			else
				break;
		}
		System.out.println(itr);
		return val;
	}
	public static void main(String[] args){

		int num=100;
		int ret=sqrt(num);
		System.out.println(ret);
	}
}
