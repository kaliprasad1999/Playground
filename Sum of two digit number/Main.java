#include<stdio.h>
int main()
{
  int number;
  scanf("%d",&number);
  int number1=number%10;
  int number2=number/10;
  int number3=number1+number2;
  printf("%d",number3);
  
  return 0;
}