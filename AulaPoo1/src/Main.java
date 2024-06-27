import exercicios.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Letícia", 19, "T-Academy", "a-5468584");
        aluno1.setMedia(8);

        Aluno aluno2 = new Aluno("João", 23, "Desenvolvimento WEB", "a-5464888");
        Aluno aluno3 = new Aluno("Fernanda", 17, "T-Academy", "a-5468900");

        Aluno[] alunos = new Aluno[3];
        alunos[0] = aluno1;
        alunos[1] = aluno2;
        alunos[2] = aluno3;

        for (Aluno aluno : alunos) {
            aluno.imprimir();
        }
    }
}
