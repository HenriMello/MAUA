#include <stdio.h>
#include <conio.h>

int main() {
    int caractere;

    printf("Digite um caractere: ");
    caractere = getchar();

    printf("\nO codigo ASCII de '%c' e %d\n", caractere, caractere);

    return 0;
}
