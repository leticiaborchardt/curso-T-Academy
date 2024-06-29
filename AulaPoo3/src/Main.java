import Exemplo1.Animal;
import Exemplo1.Cachorro;
import Exemplo2.Geometria;
import Exemplo4.Cliente;
import Exemplo4.Endereco;
import Exemplo5.Habilidade;
import Exemplo5.Pokemon;
import Exemplo5.Tipo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        // Exemplo 01
//        Cachorro c1 = new Cachorro(1, "Laila", "Pinscher", 20000);
//        c1.emitirSom();
//
//        Animal a1 = new Animal(2, "Joaozinho", "???");
//        a1 = c1;
//
//        System.out.println(a1.getNome());

//        // Exemplo 2
//        Geometria g1 = new Geometria();
//        System.out.println(g1.calcularArea(5));
//        System.out.println(g1.calcularArea(5, 10));

//        // Exemplo 4
//        Cliente cliente = new Cliente("Letícia", "123.456.789-10");
//        Endereco endereco = new Endereco("RUA TAL", 123, "TIMBÓ", "SC");
//
//        cliente.setEndereco(endereco);
//
//        System.out.println(cliente);

        // Exemplo 5
        ArrayList<Tipo> tipos = new ArrayList<>();
        tipos.add(new Tipo("Água"));
        tipos.add(new Tipo("Fogo"));
        tipos.add(new Tipo("Planta"));
        tipos.add(new Tipo("Fantasma"));

        Habilidade h1 = new Habilidade("Lança chamas", 50, tipos.get(1));

        Pokemon p1 = new Pokemon("Gengar", tipos.get(3));
        p1.addHabilidade(h1);

        System.out.println(p1.getListaDeHabilidades().get(0).getNome());
    }
}