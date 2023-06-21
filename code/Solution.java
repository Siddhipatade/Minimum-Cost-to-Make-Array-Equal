import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static long minCost(int[] nums, int[] cost) {
        int n = nums.length;
        int[][] numsAndCost = new int[n][2];
        for (int i = 0; i < n; ++i) {
            numsAndCost[i][0] = nums[i];
            numsAndCost[i][1] = cost[i];
        }
        Arrays.sort(numsAndCost, (a, b) -> a[0] - b[0]);

        long[] prefixCost = new long[n];
        prefixCost[0] = numsAndCost[0][1];
        for (int i = 1; i < n; ++i)
            prefixCost[i] = numsAndCost[i][1] + prefixCost[i - 1];

        long totalCost = 0l;
        for (int i = 1; i < n; ++i)
            totalCost += 1l * numsAndCost[i][1] * (numsAndCost[i][0] - numsAndCost[0][0]);
        long answer = totalCost;

        for (int i = 1; i < n; ++i) {
            int gap = numsAndCost[i][0] - numsAndCost[i - 1][0];
            totalCost += 1l * prefixCost[i - 1] * gap;
            totalCost -= 1l * (prefixCost[n - 1] - prefixCost[i - 1]) * gap;
            answer = Math.min(answer, totalCost);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        int[] cost = new int[n];

        System.out.println("Enter the elements of nums array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Enter the elements of cost array:");
        for (int i = 0; i < n; i++) {
            cost[i] = scanner.nextInt();
        }

        // Print the input arrays
        System.out.println("nums: " + Arrays.toString(nums));
        System.out.println("cost: " + Arrays.toString(cost));

        // Calculate and print the output
        long result = minCost(nums, cost);
        System.out.println("Minimum cost: " + result);

        scanner.close();
    }
}
