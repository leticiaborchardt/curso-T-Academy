function obterPrimeiroValor<T>(array: T[]): T {
    return array[0];
}

console.log(obterPrimeiroValor([1, 2, 3, 4, 5]));
console.log(obterPrimeiroValor(["Banana", "Uva", "Melancia"]));

interface Livro {
    nome: string,
    autor: string
}

const livros: Livro[] = [
    { nome: "Livro A", autor: "Fulano"},
    { nome: "Livro B", autor: "Ciclano"}
];

console.log(obterPrimeiroValor(livros));
