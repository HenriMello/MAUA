#include <stdio.h>

int main() {
    float num1, num2;
    float soma, divisao, multiplicacao, media_real;
    int media_inteira;

    printf("Digite o primeiro valor: ");
    scanf("%f", &num1);
    
    printf("Digite o segundo valor: ");
    scanf("%f", &num2);

    soma = num1 + num2;

    if (num2 != 0) {
        divisao = num1 / num2;
    } else {
        printf("Nao e possivel dividir por zero.\n");
        divisao = 0;
    }

    multiplicacao = num1 * num2;

    media_real = (num1 + num2) / 2;

    media_inteira = (int)((num1 + num2) / 2);

    printf("Soma: %.2f\n", soma);
    printf("Divisao: %.2f\n", divisao);
    printf("Multiplicaçao: %.2f\n", multiplicacao);
    printf("Media aritmetica real: %.2f\n", media_real);
    printf("Media aritmetica inteira: %d\n", media_inteira);

    return 0;
}
