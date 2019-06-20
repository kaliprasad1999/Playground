#include <stdio.h>
int main() {
	int number,original_number,remainder,result=0;
  scanf("%d",&number);
  original_number=number;
  while(original_number != 0)
  {
    remainder=original_number % 10;
    result +=remainder*remainder*remainder;
    original_number /=10;
  }  
	if(result==number)
    {
      printf("Armstrong Number");
    }
  else
  {
    printf("Not an Armstrong Number");
  }
  return 0;
}