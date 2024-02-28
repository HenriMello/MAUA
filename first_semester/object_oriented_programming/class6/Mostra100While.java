import javax.swing.JOptionPane;

public class Mostra100While {
    public static void main(String[] args) {
        int cont = 0;
        String msg = "";
        while (cont <= 99) {
            if (cont % 10 == 0){
                msg = msg + "\n";
            }
            msg = msg + cont + " ";
            cont = cont + 1;
        }
        JOptionPane.showMessageDialog(null, msg);
        JOptionPane.showMessageDialog(null, "cont = " + cont);
    }
}