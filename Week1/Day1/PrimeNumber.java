package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 13;
	    int flag = 0;
	    int i;
	   
	    	for (i=2; i<=num/2; i++)
	    {	
	    
	    	if(num%i==0)
	    	{
	    		flag=1;
	    	    break;
	    }}
	    if(flag==1)
	    	System.out.println("Given number is not prime");
	    else
	    	System.out.println("Given number is prime");
	}

}
