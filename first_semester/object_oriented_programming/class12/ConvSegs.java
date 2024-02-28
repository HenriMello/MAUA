import java.util.Scanner;


public class ConvSegs {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade em segundos: ");
        int total = sc.nextInt();
        int horas = total / 3600;
        int minutos = (total%3600)/60;
        int seg = (total%3600)%60;

        System.out.println (horas +" horas " + minutos + " min " + seg + " segs ");

        sc.close();
    }
}
