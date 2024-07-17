package Exemplo01;

public class FileReaderThread extends Thread {
    @Override
    public void run() {
        super.run();

        System.out.println("Lendo arquivo...");

        try {
            Thread.sleep(2000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("LEITURA CONCLUIDA");
    }
}
