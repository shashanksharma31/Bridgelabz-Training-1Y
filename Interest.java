class Calc {
    static void interest(double amt, double rate) throws IllegalArgumentException {
        if (amt < 0 || rate < 0) throw new IllegalArgumentException();
        System.out.println(amt * rate / 100);
    }
    public static void main(String[] args) {
        try {
            interest(-100, 5);
        } catch (Exception e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}
