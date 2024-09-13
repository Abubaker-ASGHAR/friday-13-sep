import java.nio.file.*;

public class FileProcessingExample {
    public static void main(String[] args) {
        Path path = Paths.get("example.txt");

        // Write to a file
        String content = "Hello, this is a modern Java file handling example!";
        try {
            Files.write(path, content.getBytes());
            System.out.println("File written successfully!");

            // Read from a file
            String fileContent = Files.readString(path);
            System.out.println("File content: " + fileContent);
        } catch (Exception e) {
            System.out.println("Error handling file: " + e.getMessage());
        }
    }
}