package Exercicio01;

import java.util.Random;

public class DownloadTask extends Thread {
    private final String fileName;

    public DownloadTask(String fileName) {
        this.fileName = fileName;
        this.start();
    }

    @Override
    public void run() {
        super.run();

        try {
            System.out.println("Iniciando download de " + this.fileName);

            Random random = new Random();
            int number = random.nextInt(10) + 1;

            Thread.sleep(1000 * number);

            System.out.println("Download de " + this.fileName + " finalizado.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
