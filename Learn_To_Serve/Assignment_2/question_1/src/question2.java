public class question2 {
    // Method to demonstrate handling of arithmetic exception (division by zero)
    public static void Arithmatic(int a, int b) {
        try {
            // Attempting to divide 'a' by 'b'
            int c = a / b;
        }
        catch (ArithmeticException e) {
            // Catching the ArithmeticException and printing the exception message
            System.out.println(e);
        }
    }
}