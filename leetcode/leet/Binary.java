import java.util.Arrays;

public class Binary {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};// IN this we alredy assume that array is sorted
        int temp = 5;

        // Sort the array first
        Arrays.sort(arr);

        int result = BinarySearch(arr, temp);
        System.out.println(result);
    }

    public static int BinarySearch(int[] arr, int temp) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            // safer way to calculate mid
            int mid = start + (end - start) / 2;

            if (arr[mid] == temp) {
                return mid;
            }
            else if (arr[mid] > temp) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}