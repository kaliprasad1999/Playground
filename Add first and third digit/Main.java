#include<stdio.h>
int main()
{
  int number;
  int third;
  int first;
  scanf("%d",&number);
  third=number/100;
  first=number%10;
  int sum=third+first;
  printf("%d",sum);
  return 0;
}