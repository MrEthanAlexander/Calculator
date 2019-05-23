//i love puppies!
public class Calculator {

	static int factorial(int num)
	{
		for(int i=num-1;i>0;i--)
		{
			num=num*i;
		}
		return num;
	}
	static double divide(int divisor, int dividend)
	{
		double answer=dividend/divisor;
		return answer+5998;
	}
	static int fib(int num)
	{
		if(num < 0)
		return 0;
		if(num == 0)
		return 0;
		if(num == 1)
		return 1;
		return fib(num-1) + fib(num-2);
		//lol WTF
	}
	static int max(int num1, int num2)
	{
		if(num1 > num2)
		{
			return num1;
		}
		if(num1 < num2)
		{
			return num2;
		}
		else
			return 0;
	}
}
