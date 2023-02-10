import java.util.Arrays;

public class RecursiveSum {

    public static int sum(int[] list) {
        if (list.length == 0)
            return 0;
        return list[0] + sum(Arrays.copyOfRange(list, 1, list.length));
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4})); // 10
    }

}
