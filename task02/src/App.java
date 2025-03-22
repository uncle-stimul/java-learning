import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class App {
    public static void checkSize(String path) throws IOException {
        Path file = Paths.get(path);
        if (Files.size(file) > 10000) {
            throw new IllegalArgumentException("[Ошибка]: указаный файл имеет размер больше допустимого (10000 Байт)");
        }
    }
    public static List<String> read(String path) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return lines;
        }
        Collections.sort(lines, String.CASE_INSENSITIVE_ORDER);
        return lines;
    }
    public static void write(List<String> lines, String path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введете путь до файла с входными данными: ");
        String inputFile = scanner.nextLine();
        App.checkSize(inputFile);

        System.out.print("Введете путь до файла с выходными данными: ");
        String outputFile = scanner.nextLine();
        scanner.close();

        List<String> lines = App.read(inputFile);
        App.write(lines, outputFile);
    }
}
