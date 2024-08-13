class Animal {
    nome: string

    constructor(nome: string) {
        this.nome = nome;
    }

    som(): string {
        return "O animal fez um som.";
    }
}

class Cachorro extends Animal {
    som(): string {
        return "O cachorro late";
    }
}

class Gato extends Animal {
    som(): string {
        return "O gato mia";
    }
}

let animal: Animal = new Animal("Pingo");
let cachorro: Cachorro = new Cachorro("Laila");
let gato: Gato = new Gato("Joaquim");

console.log(animal.som());
console.log(cachorro.som());
console.log(gato.som());
