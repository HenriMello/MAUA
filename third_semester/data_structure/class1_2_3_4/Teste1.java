public class Teste1 {
    public static void main(String[] args) {
        MeuVetor v1 = new MeuVetor(10);
        System.out.println("ultima posicao depois da construcao: " + v1.getUltimaPos());
        System.out.println("meu vetor foi construido");
        System.out.println(v1);
        
        //v1.setUltimaPosicao(100);
        //System.out.println("ultima posicao depois do set: " + v1.getUltimaPos());
        //System.out.println("meu vetor depois de estragar o controle dele:");
        //System.out.println(v1);

        //if (v1.adiciona(12)) {
        //    System.out.println(("elemento inserido com sucesso!"));
        //}
        //else {
        //    System.out.println("Vetor esta cheio, nao foi possivel inserir");
        //}

        for (int n =  1; n <=100; n ++){
            v1.adiciona(n);
            System.out.println("n = " + n + ", tamanho do vetor = " + v1.getV().length);
        }
        System.out.println("\n\n");
        while (!v1.estaVazio()) {
            System.out.println(v1.remove() + " saiu da lista, capacidade atual = " + v1.getV().length);
        }
        

        
    }
}