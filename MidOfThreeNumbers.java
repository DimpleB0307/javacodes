class MidOfThreeNumbers
{
public static void main(String a[]){
int num1=10;
int num2=20;
int num3=30;

if(num1>num2)
{
	if(num2>num3)
	{
	System.out.println(num2+"is a middle number");
	}
else if(num3>num1)
{
	System.out.println(num1+"is a middle number");
}
else
{
	System.out.println(num3+"is a middle number");
}
}
else{
	if(num2<num3){
		System.out.println(num2+"is a middle number");
	}
	else if(num3<num1)
	{
	System.out.println(num1+"is a middle number");
}
else
{
	System.out.println(num3+"is a middle number");
}
}
}
}