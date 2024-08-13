type Livro = {
    titulo: string;
    autor: string;
    numeroPaginas: number;
    estaDisponivel: boolean;
};

let livro: Livro = {
    titulo: "As aventuras de sei lá o que",
    autor: "Sei Quem Lá",
    numeroPaginas: 180,
    estaDisponivel: true
};

function mostrarInformacoes(livro: Livro): string {
    return `O livro "${livro.titulo}" de ${livro.autor}, possui ${livro.numeroPaginas} páginas e está ${livro.estaDisponivel ? "disponível" : "indisponível"}.`;
}

console.log(mostrarInformacoes(livro));