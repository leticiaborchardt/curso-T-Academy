class Caixa<T> {
    valor: T;

    constructor(valor: T) {
        this.valor = valor;
    }

    guardarValor(valor: T) {
        this.valor = valor;
    }

    pegarValor(): T {
        return this.valor;
    }
}

let caixaN = new Caixa<number>(150);
console.log(caixaN.pegarValor());

let caixaS = new Caixa<string>("Um milhão");
console.log(caixaS.pegarValor());

let caixaA = new Caixa<string[]>(["Teste"]);
caixaA.guardarValor(["Um milhão", "Dois milhões", "Três milhões"]);
console.log(caixaA.pegarValor());