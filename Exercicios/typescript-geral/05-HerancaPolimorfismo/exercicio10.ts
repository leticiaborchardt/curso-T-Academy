class Funcionario {
    nome: string;
    salario: number;

    constructor(nome: string, salario: number) {
        this.nome = nome;
        this.salario = salario;
    }

    calcularSalario(): number {
        return this.salario;
    }
}

class FuncionarioHorista extends Funcionario {
    valorHora: number;
    horasTrabalhadas: number;

    constructor(nome: string, valorHora: number, horasTrabalhadas: number) {
        super(nome, 0);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    calcularSalario(): number {
        return this.valorHora * this.valorHora;
    }
}

class FuncionarioAssalariado extends Funcionario {
    bonus: number;

    constructor(nome: string, salario: number, bonus: number) {
        super(nome, salario);
        this.bonus = bonus;
    }

    calcularSalario(): number {
        return this.salario + this.bonus;
    }
}

const horista = new FuncionarioHorista("Pedro", 80, 50);
const assalariado = new FuncionarioAssalariado("Joao", 3500, 145);

console.log(`Funcionário horista: ${horista.nome}, Salario: ${horista.calcularSalario()}`);
console.log(`Funcionário assalariado: ${assalariado.nome}, Salario: ${assalariado.calcularSalario()}`);