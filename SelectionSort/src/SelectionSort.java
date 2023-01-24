import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

    private static List<Integer> selectionSort(List<Integer> list) {
        List<Integer> ans = new ArrayList<>(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int smallest = findSmallest(list);
            ans.add(list.get(smallest));
            list.remove(smallest);
        }

        return ans;
    }

    private static int findSmallest(List<Integer> list) {
        int smallest = list.get(0);
        int smallestIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(5, 3, 6, 2, 10));
        System.out.println(selectionSort(list)); // [2, 3, 5, 6, 10]
    }
}
