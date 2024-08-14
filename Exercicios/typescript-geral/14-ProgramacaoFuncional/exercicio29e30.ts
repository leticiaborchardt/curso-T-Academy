interface Produto {
    nome: string,
    preco: number,
    quantidade: number,
    categoria: string
}

let produtos: Produto[] = [
    { nome: "Camiseta", preco: 100, quantidade: 5, categoria: "Vestimenta" },
    { nome: "Computador", preco: 7500, quantidade: 2, categoria: "Eletrônicos" },
    { nome: "Sapato", preco: 500, quantidade: 2, categoria: "Vestimenta" }
];

function pesquisarValorTotalProduto(produtos: Produto[], nomeProduto: string): number {
    return produtos
        .filter(produto => produto.nome.toLowerCase() === nomeProduto.toLowerCase())
        .reduce((total, produto) => total + (produto.preco * produto.quantidade), 0);
}

console.log(pesquisarValorTotalProduto(produtos, "Camiseta"));
console.log(pesquisarValorTotalProduto(produtos, "sapato"));

function pesquisarProdutosPorCategoria(produtos: Produto[], categoria: string): Produto[] {
    return produtos.filter(produto => produto.categoria.toLowerCase() === categoria.toLowerCase());
}

console.log(pesquisarProdutosPorCategoria(produtos, "vestimenta"));
