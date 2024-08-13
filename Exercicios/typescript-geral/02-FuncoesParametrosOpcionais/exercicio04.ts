function obterString(palavra: string, qtdVezes: number = 1) : string {
    return palavra.repeat(qtdVezes);
}

console.log(obterString("Uva"));      
console.log(obterString("Morango", 3));