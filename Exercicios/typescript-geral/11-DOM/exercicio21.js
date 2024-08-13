"use strict";
function adicionarTexto(texto) {
    let div = document.createElement("div");
    div.style.backgroundColor = "pink";
    div.innerText = texto;
    document.body.append(div);
}
adicionarTexto("Olá mundo");
