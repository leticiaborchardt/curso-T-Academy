let tupla2D: [number, number] = [5, 2];

function calcularDistancia(tupla: [number, number]): number {
    const [x, y] = tupla;
    return Math.sqrt(x * x + y * y);
}

console.log(calcularDistancia(tupla2D));
