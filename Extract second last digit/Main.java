#include<stdio.h>
int main()
{
  int number;
  scanf("%d",&number);
  int firstLastDigit=number/10;
  int secondLastDigit=firstLastDigit%10;
  printf("%d",secondLastDigit);
  return 0;
}