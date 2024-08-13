function adicionarItens(itens: string[]): void {
    const ul = document.querySelector("ul");

    if (ul) {
        for (const item of itens) {
            let li = document.createElement("li");
            li.innerText = item;

            ul.append(li);
        }
    } else {
        console.error("Elemento não encontrado");
    }
}

adicionarItens(["Uva", "Morango", "Banana", "Maçã", "Melancia"]);