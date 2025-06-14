public class Main {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 10;
        String message = null;
        int[] scores = new int[3];

        try {
            int result = numerator / denominator; // ArithmeticException
            System.out.println("Message length: " + message.length()); // NullPointerException
            System.out.println("Score: " + scores[3]); // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range when accessing array.");
        } catch (Exception e) {
            System.out.println("Unexpected error occurred");
        }

        System.out.println("Program continues normally...");
    }
}
