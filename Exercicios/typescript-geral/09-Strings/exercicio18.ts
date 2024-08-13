function contarVogais(texto: string): number {
    let vogais = 'aeiou';
    let total = 0;
    
    for (let i = 0; i < texto.length; i++) {
        if (vogais.includes(texto[i].toLowerCase())) {
            total++;
        }
    }

    return total;
}

console.log(contarVogais("Quantas vogais tem esse texto?"));
