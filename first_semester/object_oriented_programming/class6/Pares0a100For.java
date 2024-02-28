import javax.swing.JOptionPane;

public class Pares0a100For {
    public static void main(String[] args) {
        String msg = "Pares de 0 a 100";
        int cont; 
        for (cont = 0 ; cont <= 100 ; cont = cont + 2){
            if(cont % 20 == 0){
                msg = msg + "\n";
            }
            msg = msg + cont + " ";
        }
        JOptionPane.showMessageDialog(null, msg);
        JOptionPane.showMessageDialog(null, "cont = " + cont);
    }
}
