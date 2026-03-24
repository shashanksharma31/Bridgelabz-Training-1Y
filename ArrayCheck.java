class ArrayCheck {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        try {
            System.out.println(nums[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
