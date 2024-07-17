package Exemplo01;

public class DataProcessorThread extends Thread {
    @Override
    public void run() {
        super.run();

        System.out.println("Processando dados...");

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("PROCESSAMENTO PRONTO");
    }
}
