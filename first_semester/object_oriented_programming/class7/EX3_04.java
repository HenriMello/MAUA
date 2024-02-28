import java.util.Scanner;

public class EX3_04  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Digite o primeiro inteiro: ");
        int i = sc.nextInt();

        System.out.print ("Digite o segundo inteiro: ");
        int o = sc.nextInt();

        int num = i > o? i : o;
        System.out.println(num + " é o maior");

        sc.close();
    }
        
}
