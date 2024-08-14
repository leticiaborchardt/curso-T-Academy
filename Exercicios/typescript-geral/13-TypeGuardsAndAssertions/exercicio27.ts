function verificarTipoParametro(parametro: string | number): void {
    if (typeof parametro == "string") {
        console.log(`"${parametro}" é uma string`);
    } else {
        console.log(`"${parametro}" é um number`);
    }
}

verificarTipoParametro("Palavra");
verificarTipoParametro(100);