import javax.swing.JOptionPane;

public class Ternario{
    public static void main(String[] args) {
        // ler o valor de um inteiro e verificar se ele é par ou impar

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro"));
        String resposta = num % 2 == 0? "numero é par" : "numero é impar";
        JOptionPane.showMessageDialog(null, resposta);
    }
}