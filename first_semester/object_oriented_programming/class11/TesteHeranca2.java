public class TesteHeranca2 {
    public static void main(String[] args) {
        ProfessorHorista profHorista = new ProfessorHorista();
        profHorista.setNome("Rodrigo");
        ProfessorPesquisador profPesq = new ProfessorPesquisador();
        profPesq.setNome("Ana");
        profHorista.lecionar();
        profPesq.lecionar();
    }
}