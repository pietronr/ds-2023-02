import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputFile = "input.csv";
        String outputFile = "output.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length >= 2) {
                    int column1 = Integer.parseInt(values[0]);
                    int column2 = Integer.parseInt(values[1]);
                    int sum = column1 + column2;

                    writer.write(line + "," + sum);
                    writer.newLine();
                }
            }

            System.out.println("Processamento concluído. Arquivo gerado: " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}