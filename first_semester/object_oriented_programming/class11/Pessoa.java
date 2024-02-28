public class Pessoa {
    private String nome;
    private int idade;
    
    //metodos de acesso
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    //métodos modificadores
    public void setNome (String nome) {
        this.nome = nome;

    }
    public void setIdade(int idade){
        this.idade = idade;
    }
}
