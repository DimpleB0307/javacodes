class Factorial
{

public static void main(String a[])
{
 int factorial =myFact(10);
 System.out.println(factorial);
int value =myFact(3);
 System.out.println(value);
int output =myFact(4);
 System.out.println(output);
 }
 public static int myFact(int num)
 {
 int k=1;
 for(int i=1;i<=num;i++)
 {
 k=k*i;
 }
 return k;
 }
 }