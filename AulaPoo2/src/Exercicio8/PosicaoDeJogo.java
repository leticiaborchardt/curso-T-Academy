package Exercicio8;

public enum PosicaoDeJogo {
    ATACANTE("Atacante"),
    DEFESA("Defesa"),
    MEIO_CAMPO("Meio-Campo");

    private final String descricao;

    PosicaoDeJogo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

