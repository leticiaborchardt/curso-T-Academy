enum Categoria {
    Eletronico,
    Brinquedo,
    Vestimenta
}

interface Produto {
    nome: string,
    preco: number,
    categoria: Categoria
}

function filtrarProdutosPorCategoria(produtos: Produto[], categoria: Categoria): Produto[] {
    return produtos.filter(produto => produto.categoria === categoria);
}

const produtos: Produto[] = [
    { nome: "Laptop", preco: 5000, categoria: Categoria.Eletronico },
    { nome: "Smartphone", preco: 3000, categoria: Categoria.Eletronico },
    { nome: "Camiseta", preco: 50, categoria: Categoria.Vestimenta },
    { nome: "Bola", preco: 25, categoria: Categoria.Brinquedo },
    { nome: "Fone de ouvido", preco: 200, categoria: Categoria.Eletronico },
];

console.log(filtrarProdutosPorCategoria(produtos, Categoria.Brinquedo));