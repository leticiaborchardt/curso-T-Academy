import exercicios.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Letícia", 19, "T-Academy");
        Aluno aluno2 = new Aluno("João", 23, "Desenvolvimento WEB");
        Aluno aluno3 = new Aluno("Fernanda", 17, "T-Academy");

        Aluno[] alunos = new Aluno[3];
        alunos[0] = aluno1;
        alunos[1] = aluno2;
        alunos[2] = aluno3;
    }
}
