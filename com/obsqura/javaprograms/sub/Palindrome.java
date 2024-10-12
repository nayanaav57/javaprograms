package com.obsqura.javaprograms.sub;

class Palindrome
{
public int reverse(int n)
{
int b=0;
while(n>0)
{
int a=n%10;
b=(b*10)+a;
n=n/10;
}
return(b);
}
public void check(int b)
{
int c=reverse(b);
if (c==b)
{
System.out.println("Number is palindrome");
}
else
{
System.out.println("Number is not palindrome");
}
}
public static void main(String args[])
{
Palindrome obj=new Palindrome();
obj.check(1334);
}
}
