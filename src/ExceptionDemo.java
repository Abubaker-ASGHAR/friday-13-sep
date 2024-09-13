import java.io.IOException;

public class ExceptionDemo {

    // Method that declares it may throw an IOException (checked exception)
    public static void riskyFileOperation() throws IOException {
        // Simulating a situation where a checked exception might occur
        throw new IOException("File not found!");
    }

    // Method to demonstrate an unchecked exception (ArrayIndexOutOfBoundsException)
    public static void riskyArrayOperation() {
        int[] numbers = {1, 2, 3};
        // Trying to access an invalid index (which will cause an unchecked exception)
        System.out.println(numbers[5]);
    }

    public static void main(String[] args) {
        // Handling the checked exception using try-catch
        try {
            riskyFileOperation();
        } catch (IOException e) {
            System.out.println("Caught a checked exception: " + e.getMessage());
        }

        // Handling the unchecked exception using try-catch (not mandatory)
        try {
            riskyArrayOperation();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an unchecked exception: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
