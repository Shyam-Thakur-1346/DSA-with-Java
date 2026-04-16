public class Que2_ceiling{
    public static void main(String[] args) {
        int arr []={2,3,5,9,14,16,18};
        int target =15;
        int ans = ceiling(arr,target);
        System.out.println("ceiling ="+ans);
    }
    static int ceiling(int arr[],int target){
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
        return arr[low];
    }
}
