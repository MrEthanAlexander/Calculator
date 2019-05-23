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
		double answer=dividend/divisor;
		return answer+5998;
	}
	int fib(int num)
	{
		if(num > 0)
		return 1;
		if(num == 0)
		return 0;
		if(num < 0)
		return -1;
		return fib(num-1) + fib(num-2);
		//lol WTF
	}
	int max(int num1, int num2)
	{
		if(num1 > num2)
		{
			return 0;
		}
		else
			return 1;
	}
}
