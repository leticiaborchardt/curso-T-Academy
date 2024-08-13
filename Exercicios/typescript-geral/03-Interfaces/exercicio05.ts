interface Pessoa {
    nome: string,
    idade: number,
    profissao: string
}

function mostrarInformacoesPessoa(pessoa: Pessoa): string {
    return `
        Nome: ${pessoa.nome},
        Idade: ${pessoa.idade},
        Profissão: ${pessoa.profissao}
    `
}

let pessoa: Pessoa = {
    nome: "Leonardo",
    idade: 42,
    profissao: "Pescador"
}

console.log(mostrarInformacoesPessoa(pessoa));
