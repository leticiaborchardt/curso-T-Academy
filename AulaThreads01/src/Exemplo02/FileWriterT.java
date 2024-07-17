package Exemplo02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterT extends Thread {
    private String fileName;
    private String[] data;

    public FileWriterT(String fileName, String[] data) {
        this.fileName = fileName;
        this.data = data;
    }

    @Override
    public void run() {
        super.run();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.fileName))) {
            for (String line : this.data) {
                writer.write(line);
                writer.newLine();

                System.out.println("Escrevendo: " + line);

                Thread.sleep(2000);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Escrita no arquivo " + this.fileName + " concluída!");
    }
}
