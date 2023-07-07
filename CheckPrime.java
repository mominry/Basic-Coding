class CheckPrime{
	public static void main(String args[]){
		
		int middleNumber,i;
		int flag = 0;
		int checkNumber = 7;
		middleNumber = checkNumber/2;
		
		if(checkNumber ==0 || checkNumber == 1)
		{
		
			System.out.println("number is not prime");
		
		}
		
		else
		{
			for(i=2;i<middleNumber;i++)
			{
				if(checkNumber%i==0)
				{
					flag = 1;
					break;
				}
			
			
			}
			
			if(flag==1)
			{
				System.out.println("number is not prime");
			
			}
			else
			{
				System.out.println("number is prime");
			}
		
		
		}
	}



}

// checkNumber =7 number to be checked hardcoded value
// output: number is prime