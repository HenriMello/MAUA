#include <stdio.h>

int main() {
    int celsius, fahrenheit;

    printf("Digite a temperatura em graus Celsius: ");
    scanf("%d", &celsius);

    fahrenheit = (celsius * 9/5) + 32;

    printf("A temperatura em Fahrenheit e %dF\n", fahrenheit);

    return 0;
}
