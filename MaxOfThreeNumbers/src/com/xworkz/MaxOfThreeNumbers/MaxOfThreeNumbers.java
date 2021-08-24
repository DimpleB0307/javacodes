package com.xworkz.MaxOfThreeNumbers;

public class MaxOfThreeNumbers {
	public static void main(String a[])
	{
	int num1=100;
	int num2=365;
	int num3=872509;

	if(num1>=num2)
	{
	if(num1>=num3)
	{
	System.out.println(num1+" is maximum number");
	}
	else
	{
	System.out.println(num3+" is maximum number");
	}
	}
	else
	{
	if(num2>num3)
	{
	System.out.println(num2+" is maximum number");
	}
	else{
	System.out.println(num3+" is maximum number");
	}
	}
	}
	
}
