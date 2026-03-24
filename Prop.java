class Prop {
    void m1() { int x = 10 / 0; }
    void m2() { m1(); }
    public static void main(String[] args) {
        try {
            new Prop().m2();
        } catch (Exception e) {
            System.out.println("Handled exception in main");
        }
    }
}
