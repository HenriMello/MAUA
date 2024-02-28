import java.util.Scanner;

public class Pitagoras {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o valor da coordenada x no ponto 1: ");
            double Px1 = sc.nextDouble();
            
            System.out.print("Digite o valor da coordenada y no ponto 1: ");
            double Py1 = sc.nextDouble();
            
            System.out.print("Digite o valor da coordenada x no ponto 2: ");
            double Px2 = sc.nextDouble();
            
            System.out.print("Digite o valor da coordenada y no ponto 2: ");
            double Py2 = sc.nextDouble();

            double x1 = Px1 - Px2;
            double x2 = Math.pow(x1, 2);

            double y1 = Py1 - Py2;
            double y2 = Math.pow(y1, 2);

            double total = x2 + y2;
            double raiz = Math.sqrt(total);

            System.out.println ("A distancia sera de " + raiz);

        }    
}
