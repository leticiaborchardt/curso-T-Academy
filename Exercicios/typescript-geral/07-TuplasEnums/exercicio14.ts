enum DiasDaSemana {
    Domingo,
    Segunda,
    Terça,
    Quarta,
    Quinta,
    Sexta,
    Sabado
}

function verificarDiaUtil(dia: DiasDaSemana): string {
    if (dia === DiasDaSemana.Sabado || dia === DiasDaSemana.Domingo) {
        return "Fim de semana";
    } else {
        return "Dia útil";
    }
}

console.log(verificarDiaUtil(DiasDaSemana.Quarta));
console.log(verificarDiaUtil(DiasDaSemana.Sabado));
