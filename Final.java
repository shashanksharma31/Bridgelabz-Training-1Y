class Final {
    public static void main(String[] args) {
        try {
            int res = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error");
        } finally {
            System.out.println("Operation completed");
        }
    }
}
