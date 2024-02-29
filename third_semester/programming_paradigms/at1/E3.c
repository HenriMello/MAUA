#include <stdio.h>

int main() {
    char caractere;

    printf("Digite um caractere: ");
    scanf("%c", &caractere);
    
    printf("O codigo ASCII de '%c' e %d\n", caractere, caractere);

    return 0;
}
