package week1.day1;


public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=0,num2=1,range=8,sum,i;
		
		for(i=0;i<range;i++)
		{
			
			System.out.println(num1);
			sum = num1+num2;
			num1=num2;
			num2=sum;
			
			
		}

	}
}
