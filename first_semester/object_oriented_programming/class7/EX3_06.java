import java.util.Scanner;

public class EX3_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor presente na conta: ");
        double saldo = sc.nextDouble();

        System.out.print("Digite o valor desejado para sacar: ");
        double saque = sc.nextDouble();

        if (saldo >= saque){
            System.out.println("Saque realizado com sucesso");
        }
        else{
            System.out.println("Não é possivel realizar o saque, pois o saldo da conta é inferior a quantia solicitada");
        }

        sc.close();
    }
}
