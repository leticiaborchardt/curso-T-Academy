function calcularArea(raio : number = 1): number {
    return Math.PI * Math.pow(raio, 2);
}

console.log(calcularArea());      
console.log(calcularArea(5));      
console.log(calcularArea(2.6));  