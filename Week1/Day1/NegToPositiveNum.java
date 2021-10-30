package week1.day1;

public class NegToPositiveNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =-40;
		
		if(num<0)
		{
			
			System.out.println("Given input number is negative");
		
		      num = num * -1;
		    System.out.println("Give input is converted to positive number:" +num);
		}   
		    else if(num>0)
		    	System.out.println("Given input number is positive");
		
		    else
		    	System.out.println("Given input number is neither positive nor negative");
		    	
	}

}
