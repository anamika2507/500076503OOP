class Calculator
{
	public static void main(String args[])
	{
		int x=Integer.parseInt(args[0]);
		String operator = args[1];
		int y=Integer.parseInt(args[2]);
		int a=0;
		if(operator.equals("+"))
		{
			a=x+y;
		}
		else if(operator.equals("-"))
		{
			a=x-y;
		}
		else if(operator.equals("*"))
		{
			a=x*y;
		}
		else if(operator.equals("/"))
		{
			a=x/y;
		}
		else
		{
			System.out.println("Invalid Operator");
		}
		System.out.println(x+" "+operator+" "+y+" = "+a);
	}
}