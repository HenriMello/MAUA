public class Lista {
    private No primeiro;
    //por clareza
    public Lista (){
        primeiro = null;
    }
    public No getPrimeiro() {
        return primeiro;
    }
    public boolean estaVazia(){
        return primeiro == null;
    }
    public void insereInicio (int i) {
        No novo = new No(i);
        if (!estaVazia()) {
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    } 
}
