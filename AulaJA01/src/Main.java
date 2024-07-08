import java.util.*;

public class Main {
    public static void main(String[] args) {
//        // List
//        List<String> cores = new ArrayList<>();
//        cores.add("Azul");
//        cores.add("Verde");
//        cores.add("Amarelo");
//
//        // Map
//        Map<String, String> cliente = new HashMap<String, String>();
//        cliente.put("nome", "Maria");
//        cliente.put("cpf", "111.222.333-44");
//
//        System.out.println(cliente.get("cpf"));

//        Map<String, Produto> produtosMarca = new HashMap<String, Produto>();
//        produtosMarca.put("Gucci", new Produto("Camisa", 5500));
//        produtosMarca.put("Supreme", new Produto("Colar de Tijolo", 10000));
//
//        Map<String, Map<String, Produto>> produtosSubCategoria = new HashMap<String, Map<String, Produto>>();
//        produtosSubCategoria.put("Vestimenta", produtosMarca);
//
//        Map<String, Map<String, Map<String, Produto>>> estoqueHierarquico = new HashMap<String, Map<String, Map<String, Produto>>>();
//        estoqueHierarquico.put("Artigos de Luxo", produtosSubCategoria);
//
//        // Percorrendo um map
//
//        Map<String, Double> frutas = new HashMap<>();
//        frutas.put("Maçã", 2.0);
//        frutas.put("Banana", 1.0);
//        frutas.put("Maracujá", 5.0);
//        frutas.put("Manga", 14.0);
//        frutas.put("Romã", 8.0);
//
//        for (Map.Entry<String, Double> fruta : frutas.entrySet()) {
//            String chave = fruta.getKey();
//            Double valor = fruta.getValue();
//
//            System.out.println("Fruta: " + chave + " | Valor: " + valor);
//        }
//
//        frutas.forEach((chave, valor) -> {
//            System.out.println("Fruta: " + chave + " | Valor: " + valor);
//        });
//
//        Map<String, Integer> mapaIdades = new HashMap<>();
//        mapaIdades.put("Aragogue", 2);
//        mapaIdades.put("Calindor", 89);
//        mapaIdades.put("Ungoliant", 120);
//        mapaIdades.put("Denethor", 6);
//        mapaIdades.put("Padawan", 284);
//
//        Iterator<Map.Entry<String, Integer>> iterator = mapaIdades.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, Integer> entry = iterator.next();
//
//            String nome = entry.getKey();
//            Integer idade = entry.getValue();
//
//            System.out.println("Nome: " + nome + " | Idade: " + idade);
//        }
//
//        Map<String, String> mapaPaises = new HashMap<>();
//        mapaPaises.put("AUS", "Australia");
//        mapaPaises.put("ARS", "Aruba");
//        mapaPaises.put("ENG", "Inglaterra");
//        mapaPaises.put("BTN", "Butão");
//        mapaPaises.put("THA", "Tailândia");
//
//        mapaPaises.entrySet().stream()
//                .filter(entry -> entry.getValue().startsWith("A"))
//                .map(entry -> entry.getKey().toUpperCase())
//                .forEach(chave -> System.out.println("País: " + chave));


        // SET

        Set<String> produtos = new HashSet<>();
        produtos.add("Cajado de Fogo");
        produtos.add("Lamina");
        produtos.add("Manto");
        produtos.add("manto");

        System.out.println(produtos.contains("Manto"));
        System.out.println(produtos);

        ArrayList<String> linguagensProgramacao = new ArrayList<>();
        linguagensProgramacao.add("Java");
        linguagensProgramacao.add("Java");
        linguagensProgramacao.add("Java");
        linguagensProgramacao.add("Java");
        linguagensProgramacao.add("JavaScript");
        linguagensProgramacao.add("Python");
        linguagensProgramacao.add("C#");
        linguagensProgramacao.add("C#");
        linguagensProgramacao.add("C#");
        linguagensProgramacao.add("Kotlin");
        linguagensProgramacao.add("C++");

        Set<String> linguagens = new HashSet<>(linguagensProgramacao);
        System.out.println(linguagens);
    }
}