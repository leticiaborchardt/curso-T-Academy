class Carro {
    marca: string;
    modelo: string;
    ano: number;

    static contador: number = 0;

    constructor(marca: string, modelo: string, ano: number) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

        Carro.contador++;
    }

    obterDescricao(): string {
        return `Marca: ${this.marca}, Modelo: ${this.modelo}, Ano: ${this.ano}`;
    }
}

const carro1 = new Carro("Honda", "Civic", 2023);
const carro2 = new Carro("Ford", "Fiesta", 1980);
const carro3 = new Carro("Chevrolet", "Cruze", 2010);

console.log(carro1.obterDescricao());
console.log(carro2.obterDescricao());
console.log(carro3.obterDescricao());

console.log(`Total criado: ${Carro.contador}`);