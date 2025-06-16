public class ArraySum {
    public static void main(String[] args) {
        int[] nums = {25,75,100,125};
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        System.out.println("Sum of array elements: " + sum);
    }
}