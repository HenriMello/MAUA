// 2. Fazer um programa que imprima, com apenas um comando printf, as frases abaixo exatamente como estão.
// Todos os valores numéricos devem estar armazenados dentro de variáveis

#include <stdio.h>
#include <stdlib.h>

int main() {
    int vendas = 50;
    int dia = 31;
    int mes = 12;
    int ano = 2000;
    int capital = 50000000;

    printf("Vendemos %d%% a mais que no ano passado \n", vendas);
    printf("Em %d/%d/%d nosso capital era de R$ %d \n", dia, mes, ano, capital);
    printf("A barra utilizada para pastas seria '/' ou \'\\' ?\n");

    return 0;
}