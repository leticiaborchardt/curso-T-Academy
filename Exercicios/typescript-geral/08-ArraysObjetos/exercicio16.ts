interface IProduto {
    nome: string,
    preco: number
}

let arrProdutos: IProduto[] = [
    {nome: "camiseta", preco: 100},
    {nome: "tênis", preco: 500},
    {nome: "calça", preco: 400},
    {nome: "casaco", preco: 200},
]

function filtrarPrecoMaiorQue(produtos: IProduto[], preco: number): IProduto[] {
    return produtos.filter(produto => produto.preco > preco);
}

console.log(filtrarPrecoMaiorQue(arrProdutos, 300));
