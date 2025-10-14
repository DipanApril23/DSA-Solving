// Product of Array Except Self:
class Problem1 {

    // This method returns an array where each element is
    // the product of all other elements except itself.
    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
		int[] prefix = new int[n];
		int suffix = 1;
		
        prefix[0] = 1;

        for (int i = 1; i < n; i++) {
            prefix[i] = arr[i - 1] * prefix[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            suffix *= arr[i + 1];
			prefix[i] *= (suffix);
        }
		return prefix;
    }

    public static void main(String[] args) {
        int[] arr = {-1,1,0,-3,3};
        int[] result = productExceptSelf(arr);

        // Print result
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
