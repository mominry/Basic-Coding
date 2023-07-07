class factorial{
	public static void main(String args[]){
		
		int number = 5;
		int factorialOfNumber = 1;
		
		for(int i=1;i<=number;++i){
		
		factorialOfNumber = factorialOfNumber*i;
		
		}
	
		System.out.println("factorial is "+factorialOfNumber);
	
	}



}