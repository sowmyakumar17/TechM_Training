package task2;

class ExceptionDemo {
    public static void main(String[] args) {
        try {
            // Manually throwing an exception
            throw new ArithmeticException("This is an example exception");
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
