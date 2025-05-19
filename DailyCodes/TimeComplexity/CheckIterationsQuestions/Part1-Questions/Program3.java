class CountIterations2{
	static int nCount(int start,int end){
		int count=0;

		if(start==0){
			count=(end-start)+1;
		}else{
			count=end-start;
		}
		return count;
	}
	public static void main(String[] args){
		System.out.println(nCount(5,10));
	}
}
