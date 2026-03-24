class AgeError extends Exception {}

class Check {
    static void validate(int age) throws AgeError {
        if (age < 18) throw new AgeError();
        System.out.println("Access granted!");
    }
    public static void main(String[] args) {
        try {
            validate(15);
        } catch (AgeError e) {
            System.out.println("Age must be 18 or above");
        }
    }
}
