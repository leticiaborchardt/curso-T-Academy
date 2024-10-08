package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String url = JOptionPane.showInputDialog("Digite a url do site: ", "https://");

        boolean flag = true;

        while (flag) {
            String menu = JOptionPane.showInputDialog("1 - Novo Site" +
                    "\n2 - Procurar links" +
                    "\n3 - Buscar parágrafo" +
                    "\n4 - Sair"
            );

            switch (menu) {
                case "1":
                    break;
                case "2":
                    String assunto = JOptionPane.showInputDialog("Digite um assunto para pesquisar (se for vazio, traz todos os links da página)");

                    Raspagem.buscarLinks(url, assunto);
                    break;
                case "3":
                    Raspagem.buscarParagrafo(url);
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }
}
