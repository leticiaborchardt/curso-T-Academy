function inverterString(texto: string): string {
    return texto.split(' ').reverse().join(' ');
}

console.log(inverterString("Olá mundo!"));