//ler valores inteiros e pontos flutuantes

// realizar divisões e analisar o resultado

import java.util.Scanner;

public class Scan {
    public static void main (String args[]) {
        //declaração:
        int i1, i2;
        double d1, d2;
        Scanner sc = new Scanner(System.in);

        //leitura:
        System.out.print ("Digite o primeiro inteiro: ");
        i1 = sc.nextInt();
        System.out.print ("Digite o segundo inteiro: ");
        i2 = sc.nextInt();
        System.out.print ("Digite o primeiro Double: ");
        d1 = sc.nextDouble();
        System.out.print ("Digite o segundo Double: ");
        d2 = sc.nextDouble();

        int divisaoInt = i1/i2;
        System.out.println ("Divisão inteira, resultado inteiro: " + divisaoInt);

        double divisaoDouble = i1/i2;
        System.out.println ("Divisão inteira, resultado inteiro: " + divisaoDouble);
        
        double divisaoCasting = (double)i1/i2;
        //casting = conversão temporaria de tipos

        double divisaoDouble2 = i1/d1;
        System.out.println ("Divisão de int/double: " + divisaoDouble2);

        //atenção para as propriedades
        System.out.println ("Divisão double/int: " + d2/i2 );


        sc.close();
    }
    
}
