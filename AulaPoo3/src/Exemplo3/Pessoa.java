package Exemplo3;

public class Pessoa extends Usuario {
    private String cpf;
    private String nome;

    public Pessoa(String email, String senha, String cpf, String nome) {
        super(email, senha);
        this.cpf = cpf;
        this.nome = nome;
    }
}
