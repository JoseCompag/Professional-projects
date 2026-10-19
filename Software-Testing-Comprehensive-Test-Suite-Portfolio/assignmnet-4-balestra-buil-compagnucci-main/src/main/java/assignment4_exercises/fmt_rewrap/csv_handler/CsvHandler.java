package assignment4_exercises.fmt_rewrap.csv_handler;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvHandler {

    public static List<List<String>> getCsvContent(String path) {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return records;
    }

    public static void writeCsvContent(String path, List<List<String>> content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (List<String> record : content) {
                writer.write(String.join(",", record));
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeCsvContent(String path, List<List<String>> content, Integer cantReq) {

        float aux = 0;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (List<String> record : content) {
                writer.write(String.join(",", record));
                writer.newLine();
                aux++;
            }
            aux = aux / cantReq;
            writer.write("\nCobertura " + ((1-aux) * 100) + "\n" );
            writer.newLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




}
