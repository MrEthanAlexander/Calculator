//i love puppies!
public class Calculator {
	
	int factorial(int num)
	{
		for(int i=num-1;i>0;i--)
		{
			num=num*i;
		}
		return num;
	}
	double divide(int divisor, int dividend)
	{
		double answer=divisor/dividend;
		return answer;
	}
}
