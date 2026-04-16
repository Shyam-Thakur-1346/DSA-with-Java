public class Que3_floor{
    public static void main(String[] args) {
        int arr []={2,3,5,9,14,16,18};
        int target =8;
        int ans = floor(arr,target);
        System.out.println("floor ="+ans);
    }
    static int floor(int arr[],int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid =low +(high-low)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]<target){
                low =mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return arr[high];
    }
}
