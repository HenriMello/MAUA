import java.util.Scanner;


public class EX3_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero inteiro: ");
        int i = sc.nextInt();
        System.out.print("Digite o numero real: ");
        double o = sc.nextInt();

        if (i < o){
            System.out.println("O numero inteiro é menor que o numero real");
        }
        sc.close();

    }
}
