class Question1{
	static int nCount(int a,int b){
		int count=0;
		
		if(a==5){
			count=(b-a)+1;
		}else{
			count=b-a;
	}
	return count;
	}
	public static void main(String[] args){
		System.out.println(nCount(5,10));
	}
}
