package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1,factorial=1,num=5;
		
		while(i<=num)
		{
			factorial=factorial*i;
			i=i+1;
		}
		
		System.out.println("Factorial of "+num+" is "+factorial);
	}

}
