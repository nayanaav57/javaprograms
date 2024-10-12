package com.obsqura.javaprograms.sub;

class FactorialNumber
{
public int calculate(int n)
{
int s=1;
for (int i=n;i>0;i--)
{
s=s*i;
}
return (s);
}
public void print(int n)
{
int a=this.calculate(n);
System.out.println("Factorial of "+ n +" is "+ a);
}
public static void main(String args[])
{
FactorialNumber obj=new FactorialNumber();
obj.print(7);
}
}