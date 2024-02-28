import java.util.Random;

public class MeuVetor {
    private int[] v;
    private int ultimaPos;

    public MeuVetor(int capacidade) {
        v = new int[capacidade];
        ultimaPos = -1;
    }    
    //metodos de acesso
    public int getUltimaPos() {
        return ultimaPos;
    }
    public int[] getV() {
        return v;
    }
    //metodos modificadores
    public void setUltimaPosicao(int pos) {
        if (pos >= 0 && pos < v.length) {
            ultimaPos = pos;
        }
        else {
            ultimaPos = v.length - 1;
        }
    }

    public boolean estaCheio () {
        if (ultimaPos == v.length -1)
            return true;
        else
            return false;
    }

    public boolean estaVazio (){
        return ultimaPos == -1;
    }

    public void resetVetor() {
        ultimaPos = -1;

    }

    //public boolean adiciona (int elemento){
    //    if (estaCheio())
    //        return false;
    //    else {
    //        ultimaPos++;
    //        v[ultimaPos] = elemento;
    //        return true;
    //    }
    //}

    public void adiciona (int elemento) {
        if (estaCheio()) {
            redimensiona(v.length*2);
        }
        v[++ultimaPos] = elemento;
    }

    public int remove(){
        if (estaVazio()) return 0;
        int aux = v[ultimaPos];
        ultimaPos--;
        if (ultimaPos <= v.length/4){
           redimensiona(v.length/2);
        }
        return aux;

    }

    private void redimensiona (int novaCapacidade) {
        int[] temp = new int[novaCapacidade];
        for (int i = 0; i < ultimaPos; i ++) {
            temp[i] = v[i];
        }
        v = temp;
    }

    @Override
    public String toString(){
        String s = "";
        if (estaVazio()) {
            s = s + "vetor vazio";

        }
        else {
            for (int i=0; i <= ultimaPos; i++) {
                s = s + String.format("%.0f", v[i]) + " ";
            }
        }
        s = s + "\n";
        return s;
    }
    public void preencheVetor(){
        Random r = new Random();
        for(int i = 0; i < v.length; i++){
            adiciona(r.nextInt(60)+ 1);
        }
    }
}