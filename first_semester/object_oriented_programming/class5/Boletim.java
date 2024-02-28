import java.util.Scanner;

// ler a média do aluno e classificar sua situação
// media < 2.0 - Reprovado
// 2 <= media < 7.0 - vai fazer sub
// media >= 7.0 - Aprovado

public class Boletim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Digite sua média atual: ");
        double media = scanner.nextDouble();

        if (media < 0 || media > 10){
            System.out.println("média inválida");
        }
        
        else if (media >= 7.0) {
            System.out.println ("Aprovado");
        }
        else if (media >= 2.0){
            System.out.println("Vai fazer sub");
        }
        else {
            System.out.println("Reprovado");
        


        scanner.close();
    }
}
}
