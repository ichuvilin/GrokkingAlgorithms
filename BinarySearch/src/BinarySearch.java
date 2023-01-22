public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] > target)
                r = mid - 1;
            if (arr[mid] < target)
                l = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] myList = {1, 3, 5, 7, 9};

        System.out.println(binarySearch(myList, 5)); // 2
        System.out.println(binarySearch(myList, -1)); // -1
    }
}
