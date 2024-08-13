async function buscarDados(sucesso: boolean): Promise<string[]> {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            if (sucesso) {
                resolve(["dados1", "dados2", "dados3"]);
            } else {
                reject(new Error("Erro ao buscar dados do banco de dados"));
            }
        }, 2000);
    });
}

async function testarBuscaDados(sucesso: boolean) {
    try {
        let dados = await buscarDados(sucesso);
        console.log(dados);
    } catch (error) {
        console.log(error);
    }
}

testarBuscaDados(true);
testarBuscaDados(false);