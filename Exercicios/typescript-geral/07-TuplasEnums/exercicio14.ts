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
    switch (dia) {
        case DiasDaSemana.Sabado:
        case DiasDaSemana.Domingo:
            return "Fim de Semana";
        default:
            return "Dia Útil";
    }
}

console.log(verificarDiaUtil(DiasDaSemana.Quarta));
console.log(verificarDiaUtil(DiasDaSemana.Sabado));
