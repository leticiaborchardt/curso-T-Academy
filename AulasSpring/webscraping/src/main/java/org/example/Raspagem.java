package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Raspagem {

    public static void buscarLinks(String url, String assunto) {
        try {
            Document doc = Jsoup.connect(url).get();

            Elements links = doc.select("a[href]");

            for (Element link : links) {
                String conteudo = link.attr("href");

                if (conteudo.contains(assunto)) {
                    System.out.println("Link: " + conteudo);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void buscarParagrafo(String url) {
        try {
            Document doc = Jsoup.connect(url).get();

            Elements paragrafos = doc.select("p");

            for (Element paragrafo : paragrafos) {
                System.out.println(paragrafo.text());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
