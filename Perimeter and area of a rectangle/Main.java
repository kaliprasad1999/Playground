#include<stdio.h>
int main()
{
  int area;
  int length=6;
  int breadth=9;
  int perimeter;
  area=length*breadth;
  perimeter=2*(length+breadth);
  printf("The perimeter of the rectangle is: %d cm",+perimeter);
  printf("\nThe area of the rectangle is: %d sq cm",+area);
  return 0;
}