#include <stdio.h>

int main(){
    int a = 6, b = 5;
    a = b++;
    if (a == b)
        b += a + 1;
    printf ("%d", a - b);
}