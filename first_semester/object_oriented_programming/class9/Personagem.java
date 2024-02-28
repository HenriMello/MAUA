public class Personagem {
    String nome;
    int energia = 10;
    int sono = 0;
    int fome = 0;
    public void cacar() {
        if(energia >= 2){
            System.out.println(nome + " esta cacando");
            energia -= 2;
        }
        else{
            System.out.println(nome + " esta sem energia e não pode cacar");
        }
        fome = Math.min(10, fome + 1);
        sono = Math.min(10, sono + 1);
    }
    public void dormir(){
        System.out.println(nome + "esta dormindo");
    }
    public void comer(){
        System.out.println(nome + "esta comendo");
    }
}