"use strict";
function adicionarItens(itens) {
    const ul = document.querySelector("ul");
    if (ul) {
        for (const item of itens) {
            const li = document.createElement("li");
            li.innerText = item;
            ul.append(li);
        }
    }
    else {
        console.error("Elemento não encontrado");
    }
}
adicionarItens(["Uva", "Morango", "Banana", "Maçã", "Melancia"]);
