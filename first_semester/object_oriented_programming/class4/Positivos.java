import javax.swing.JOptionPane;

// ler um numero e dizer se é positivo ou negativo

public class Positivos {
    public static void main (String [] args){
        double numero;
        numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero:"));
        if (numero >= 0) {
            JOptionPane.showMessageDialog(null, 
            numero + " e positivo", 
            "Resultado", 
            JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,
            numero + " e negativo",
            "Resultado",
            JOptionPane.WARNING_MESSAGE);
        }
    }
}
