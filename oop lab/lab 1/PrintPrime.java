class PrintPrime {

	static void prime(int[] array){

		for (int i=0 ; i<array.length ;i++ ) {
			if(printPrimes(array[i]))
				System.out.println(array[i] +" ");
			
		}
	}

	static boolean printPrimes(int n){

		int sqrt = (int)Math.sqrt(n);

		int i=2;
		boolean flag = true;

		while(i<=sqrt){
			if (n%i==0) {
			
				flag = false;
				
			}
			i++;
		}
		return flag;
	}









	public static void main(String[] args) {
		int[] array = {41,4,3,7,11,44};

		prime(array);
	}
	
}