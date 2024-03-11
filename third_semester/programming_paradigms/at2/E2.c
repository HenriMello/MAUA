#include <stdio.h>
#include <stdlib.h>

int main() {
  float valorDecimal;
  char *strValor;

  // 1. Solicitar ao usuário que insira um valor decimal
  printf("Digite um valor decimal: ");
  scanf("%f", &valorDecimal);
  // 2. Alocar dinamicamente memória para armazenar uma string
  strValor = malloc(sizeof(char) * (32 + 1));
  // 3. Converter o valor decimal para uma string utilizando a função sprintf
  sprintf(strValor, "%f", valorDecimal);
  // 4. Imprimir na tela o valor decimal e a string resultante
  printf("Valor decimal: %.2f\n", valorDecimal);
  printf("String: %s\n", strValor);
  // Liberar a memória alocada dinamicamente
  free(strValor);

  return 0;
}
