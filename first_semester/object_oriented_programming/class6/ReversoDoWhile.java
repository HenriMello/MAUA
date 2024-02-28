import javax.swing.JOptionPane;

public class ReversoDoWhile {
    public static void main(String[] args) {
        String msg = "Sequencia ao contrario";
        int cont = 99;
        do {
            if (cont % 10 == 0){
                msg = msg + "\n";
            }
            msg = msg + cont + " ";
            cont = cont - 1;
        }   while (cont >= 0 );
        JOptionPane.showMessageDialog(null, msg);
    }
}
