#include <stdio.h>
int main() {
  int number;
  scanf("%d",&number);
  int count=1;
  while(count <= number)
  {
    printf("I am a C developer\n");
    count += 1;
  }
  return 0;
}