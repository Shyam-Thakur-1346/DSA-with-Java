public class order_agnostic_binarySearch {
    public static void main(String[] args) {
        int arr[] = {3445,56,45,3,2,-2,-9};
        int target = 45;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else { // descending case
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
