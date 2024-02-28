public class TesteHeranca1 {
    public static void main(String[] args) {
        AlunoDeGraduacao alunoGrad = new AlunoDeGraduacao();
        alunoGrad.setNome("José");
        alunoGrad.setIdade(20);
        System.out.println("aluno de garduação\nnome = " + alunoGrad.getNome() + "\nidade = " + alunoGrad.getIdade());
    }
}
