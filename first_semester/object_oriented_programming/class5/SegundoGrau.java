import java.util.Scanner;

public class SegundoGrau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor de a: ");
        double a = sc.nextDouble();
        if (a == 0){
            System.out.println ("Não é equação do Segundo Grau");
        }
        else {
            System.out.print("Digite o valor de b: ");
            double b = sc.nextDouble();

            System.out.print("Digite o valor de c: ");
            double c = sc.nextDouble();
            double delta = b * b - 4*a*c;
            if (delta < 0){
                System.out.println("Não existem raizes reais");
            }
            else {
                double x1 = (-b - Math.sqrt(delta)) / (2*a);
                double x2 = (-b + Math.sqrt(delta)) / (2*a);
                System.out.println("\nx1 = " + x1 + "\nx2 = " + x2);
            }
        }

        




        
        sc.close();
    }
}
