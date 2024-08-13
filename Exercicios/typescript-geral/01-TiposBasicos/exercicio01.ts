let nome: string = "Joãozinho";
let idade: number = 12;
let possuiPets: boolean = false;
let hobbies: string[] = ["Jogar", "Assistir", "Cozinhar", "Ler"];

function exibirInformacoes(nome: string, idade: number, possuiPets: boolean, hobbies: string[]): string {
    return `
        Nome: ${nome},
        Idade: ${idade},
        Tem animal de estimação: ${possuiPets ? "Sim" : "Não"},
        Hobbies: ${hobbies.join(", ")}
    `;
}

console.log(exibirInformacoes(nome, idade, possuiPets, hobbies));