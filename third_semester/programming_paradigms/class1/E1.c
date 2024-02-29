// 1. Criar um programa que receba um numero e calcule seu cubo

#include <stdio.h>
#include <math.h>

int main(){
    int num = 0;
    int cubo = 0;

    printf("Digite um numero: ");
    scanf("%d", &num);

    cubo = num*num*num;
    //cubo = pow(num, 3);
    printf("\nCubo e %d = %d\n", num, cubo);

    return 0;
}