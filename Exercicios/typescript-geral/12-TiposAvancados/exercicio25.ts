type Id = string | number
interface Usuario {
    id: Id,
    username: string,
    senha: string
}

interface Permissoes {
    cadastrar: boolean,
    visualizar: boolean,
    editar: boolean,
    remover: boolean
}

type User = Usuario & Permissoes;

let usuario: User = {
    id: 1,
    username: "admin123",
    senha: "abc123",
    cadastrar: true,
    editar: true,
    remover: false,
    visualizar: true
}
