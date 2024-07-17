package Exemplo02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderT extends Thread {
    private String fileName;

    public FileReaderT(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        super.run();

        try (BufferedReader reader = new BufferedReader(new FileReader(this.fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println("Lendo: " + line);
                Thread.sleep(2000);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Leitura do arquivo " + fileName + " concluída!");
    }
}
