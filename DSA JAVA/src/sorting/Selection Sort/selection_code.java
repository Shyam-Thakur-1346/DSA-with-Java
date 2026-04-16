import java.util.Arrays;
public class selection_code {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 2, 1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minIndex = i;
            for(int j =i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        
    }
}
