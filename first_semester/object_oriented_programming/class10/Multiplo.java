import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print ("Digite o primeiro inteiro: ");
        int num1 = entrada.nextInt();
        System.out.print("Digte o segundo inteiro: ");
        int num2 = entrada.nextInt();
        if (num1 % num2 == 0){
            System.out.println (num1 + " e multiplo de " + num2);
        }
        else{
            System.out.println (num1 + " não é multiplo de ");
        }
    }
}