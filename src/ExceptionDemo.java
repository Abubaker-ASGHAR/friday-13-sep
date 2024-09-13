import java.io.IOException;

public class ExceptionDemo {

    // Method that declares it may throw an IOException (checked exception)
    public static void riskyFileOperation() throws Exception {
        // Simulating a situation where a checked exception might occur
        try{
            int b=0;
            int c=5/b;
        } catch (Exception e) {
            System.out.println("Caught a checked exception: 0" + e.getMessage());
            throw new Exception(e);

        }
        finally{
            System.out.println("hello from risky operation0");
        }

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
        } catch (Exception e) {
            System.out.println("Caught a checked exception: 1" + e.getMessage());
        }
        finally {
            System.out.println("hello from risky operation parent");
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
