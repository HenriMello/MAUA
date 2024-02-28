import javax.swing.JOptionPane;

public class Divisores {
    public static void main(String[] args) {
        int numero;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro positivo"));

        } while (numero <= 0);
        String msg = "";
        for (int div = 1; div <= numero; div ++) {
            if (numero % div == 0) {
                msg = msg + div + " ";

            }
        }
        JOptionPane.showMessageDialog(null, msg, "Divisores de " + numero, JOptionPane.PLAIN_MESSAGE);
    }
}
