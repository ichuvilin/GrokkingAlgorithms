public class LoopSum {

    private static int sum(int[] arr) {
        int ans = 0;

        for (int i = 0; i < arr.length; i++)
            ans += arr[i];

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4})); // 10
    }
}
