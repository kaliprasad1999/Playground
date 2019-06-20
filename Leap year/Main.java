#include<stdio.h>
int main()
{
  int leap_year;
  scanf("%d",&leap_year);
  if(leap_year%4==0)
    printf("Leap year");
  else
    printf("Not Leap year");
  return 0;
}