#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
  int average=a+b+c;
  average /=3;
  printf("%d",average);
  return 0;
}