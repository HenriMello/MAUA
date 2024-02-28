import javax.swing.JOptionPane;

public class AppCalculadora {
    public static void main(String[] args) {
        char op = JOptionPane
            .showInputDialog(
                "Digite:\n+ --- soma\n- --- subtração\n* --- multiplicação\n/ --- divisão"
            )
            .charAt(0);
        //aviliar a variavel op
        Calculadora calculadora = new Calculadora();
        int a = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o primeiro valor")
        );
        int b = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o segundo valor ")
        );
        switch (op) {
            case '+':
                JOptionPane.showMessageDialog(
                    null,
                    "soma = " + calculadora.soma(a, b),
                    "soma",
                    JOptionPane.INFORMATION_MESSAGE
                );
                break;

            case '-':
                JOptionPane.showMessageDialog(
                    null,
                    "subtração = " + calculadora.subtracao(a, b),
                    "subtração",
                    JOptionPane.INFORMATION_MESSAGE
                );
                break;

            case '*':
                JOptionPane.showMessageDialog(
                    null,
                    "multiplicação = " + calculadora.subtracao(a, b),
                    "multiplicação",
                    JOptionPane.INFORMATION_MESSAGE
                );
                break;

            case '/':
                if (b == 0) {
                    JOptionPane.showMessageDialog(
                        null,
                        "não dividiras por 0",
                        "Ups",
                        JOptionPane.WARNING_MESSAGE
                    );
                } else {
                    JOptionPane.showMessageDialog(
                        null,
                        "divisão = " + calculadora.divisao(a, b),
                        "divisão",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                }
                break;
            default:
                JOptionPane.showMessageDialog(
                    null,
                    "opção invalida",
                    "Erro!",
                    JOptionPane.ERROR_MESSAGE
                );
        }
    }
}
