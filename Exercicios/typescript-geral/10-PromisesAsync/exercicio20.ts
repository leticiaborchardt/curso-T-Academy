async function buscarDados1(): Promise<string> {
    return new Promise((resolve) => {
        setTimeout(() => {
            resolve("dados1");
        }, 2000);
    });
}

async function buscarDados2(): Promise<string> {
    return new Promise((resolve) => {
        setTimeout(() => {
            resolve("dados2");
        }, 4500);
    });
}

async function combinarResultados() {
    try {
        const [dado1, dado2] = await Promise.all([
            buscarDados1(),
            buscarDados2()
        ]);

        console.log(`Dados combinados: ${dado1}, ${dado2}`);
    } catch (error) {
        console.log(error);
    }
}

combinarResultados();