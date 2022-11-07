import java.util.Arrays;
public class selection_sort {
    void selection(int arr[]) {
        int x;
        int n = arr.length;
        for (x = 0; x < n - 1; x++) {
            int min_index = x;
            for (int i = x + 1; i < n; i++) {
                if (arr[i] < arr[min_index]) {
                    min_index = i;
                }
            }
            int temp = arr[x];
            arr[x] = arr[min_index];
            arr[min_index] = temp;
        }
    }
        public static void main(String[] args) {
        int[] y = { 20, 12, 100, 15, 2 };
        selection_sort s = new selection_sort() ;
        s.selection(y);
        System.out.println(Arrays.toString(y));
    }
    }
