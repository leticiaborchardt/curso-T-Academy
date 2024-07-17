package Exemplo02;

public class Main {
    public static void main(String[] args) {
        String input = "aulathreads01/src/exemplo02/input.txt";
        String output = "aulathreads01/src/exemplo02/output.txt";

        FileReaderT fileReader = new FileReaderT(input);

        String[] data = {"Filme A", "Filme B", "Filme C"};
        FileWriterT fileWriter = new FileWriterT(output, data);

        fileReader.start();
        fileWriter.start();
    }
}