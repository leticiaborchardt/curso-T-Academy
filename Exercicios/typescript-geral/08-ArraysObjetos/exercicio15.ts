function obterMaiorMenorNumero(numeros: number[]): [number, number] {
    let maiorNumero = Math.max(...numeros);
    let menorNumero = Math.min(...numeros);

    return [maiorNumero, menorNumero];
}

console.log(obterMaiorMenorNumero([6, 9.99, 2, 4, 10, 7, -9]));
