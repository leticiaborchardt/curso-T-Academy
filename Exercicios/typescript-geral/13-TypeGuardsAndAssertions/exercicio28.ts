class Pessoa {
    nome: string;
    cpf: string;

    constructor(nome: string, cpf: string) {
        this.nome = nome;
        this.cpf = cpf;
    }
}

class Empresa {
    nome: string;
    cnpj: string;

    constructor(nome: string, cnpj: string) {
        this.nome = nome;
        this.cnpj = cnpj;
    }
}

function verificarTipoObjeto(objeto: Pessoa | Empresa): void {
    if (objeto instanceof Pessoa) {
        console.log("É uma pessoa");
    } else {
        console.log("É uma empresa");
    }
}

let pessoa = new Pessoa("Letícia", "000.111.222-33");
let empresa = new Empresa("T-Systems", "123456789123");

verificarTipoObjeto(pessoa); 
verificarTipoObjeto(empresa);