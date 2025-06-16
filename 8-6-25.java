INSERTION SORT (12-6-25)

class Main {
    public static void main(String[] args) {
        int[] nums = {5, 2, 4, 6, 1, 3};  // Example array

        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;

            // Move elements of nums[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }

        // Print sorted array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
