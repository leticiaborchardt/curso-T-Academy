public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Livro livro = new Livro("teste", "testina", 2001);
        livro.fazerAlgoComLivro("test");

        Calcular soma = (a, b) -> a + b;

        System.out.println(soma.executar(10, 30));

        Calcular subtracao = (a, b) -> a - b;
        System.out.println(subtracao.executar(30, 10));
    }

    @MinhaAnotacao(value = "peixe", numero = 1)
    @Doc(author = "Leticia", date = "11/07/2024", version = "1.2", description = "Código feito para testar anotações personalizadas")
    public static void teste() {
        System.out.println("oi");
    }
}