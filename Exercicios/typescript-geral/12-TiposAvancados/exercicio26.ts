function obterValorChave<O, C extends keyof O>(objeto: O, chave: C): O[C] {
    return objeto[chave];
}

interface Fruta {
    nome: string,
    calorias: number
}

let fruta: Fruta = {
    nome: 'Banana',
    calorias: 100
}

console.log(obterValorChave(fruta, 'nome'));
