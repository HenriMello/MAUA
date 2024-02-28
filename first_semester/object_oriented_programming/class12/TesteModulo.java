// ler 2 numeros inteiros, calcular e exibir o quociente e o resto entre eles

import java.util.Scanner;

public class TesteModulo {
    public static void main (String[] args){
        //declara e instancia o objeto scanner
        
        Scanner sc = new Scanner(System.in); //System.in é entrada padrão(teclado), System.out é a saida padrão
        
        //entrada de dados: ler 2 inteiros
        
        System.out.print("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int num2 = sc.nextInt();
        
        //processamento: calculos do quociente e do resto
        
        int quociente = num1 / num2;
        int resto = num1 % num2;

        //saida: exibir os dois resultados

        //vamos montar as Strings

        System.out.println (num1 + " / " + num2 + " = " + quociente);
        System.out.println (num1 + " mod " + num2 + " = " + resto);

        sc.close();
    }
}
