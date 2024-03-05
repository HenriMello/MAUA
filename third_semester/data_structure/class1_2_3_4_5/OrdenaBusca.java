import java.util.Scanner;

public class OrdenaBusca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MeuVetor v1 = new MeuVetor(10);
        v1.preencheVetor();
        System.out.println("vetor gerado: " + v1);
        System.out.print("Digite o valor para a busca: ");
        double x = sc.nextDouble();
        Retorno r = v1.buscaSimples(x); 
        if(r.getAchou()){
            System.out.println("Valor mais encontrado no vetor");
        }
        else {
            System.out.println(x + " não encontrado");
        }
        System.out.println("foram realizadas " + r.getContador() + " perguntas");
    }
}
