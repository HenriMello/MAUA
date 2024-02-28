// aplicação do Personagem


public class Jogo {
    public static void main(String[] args) {
        Personagem cacador; //declarando
        cacador = new Personagem(); // instanciando

        Personagem batedor = new Personagem(); // declarando e instanciando na mesma linha

        cacador.nome = "John";
        cacador.cacar();
        cacador.comer();
        cacador.dormir();
    }
}
   