class Try {
    public static void main(String[] args) {
        int[] a = {10, 20};
        try {
            try {
                int res = a[1] / 0;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
