package Exemplo01;

public class Vocalista implements Musico {

    public final String STATUS_ATIVO = "ATIVO";
    public static final String statusAtivo = "ATIVO";

    @Override
    public void tocarInstrumento() {
        System.out.println("Vocalista canta");
    }

    public static void cantar() {
        System.out.println("Cantando 🎶🎶🎶🎶🎶");
    }
}
