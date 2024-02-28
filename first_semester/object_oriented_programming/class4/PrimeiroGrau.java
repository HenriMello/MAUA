import java.util.Scanner;


public class PrimeiroGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        if (a == 0){
            System.out.println("Não é uma equação de 2o Grau");
        }
        else{
            System.out.print("Digite o valor de b: ");
            double b = scanner.nextDouble();

            double raiz = -b/a;
            System.out.println("O valor da raiz é " + raiz);
        }
        scanner.close();

    }
}
