
public class Que1_first_last_position {
    public static void main(String[] args) {
        int arr[] = {2, 4, 4, 4, 7, 10, 15};
        int target = 4;
        int[] ans = firstAndLastPosition(arr, target);
        System.out.println("First and Last Position: [" + ans[0] + ", " + ans[1] + "]");
    }

    static int[] firstAndLastPosition(int arr[], int target) {
        int first = findFirst(arr, target);
        int last = findLast(arr, target);
        return new int[]{first, last};
    }

    static int findFirst(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int first = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                first = mid;
                high = mid - 1; // keep searching left
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }

    static int findLast(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int last = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                last = mid;
                low = mid + 1; // keep searching right
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }
}