public class Que2_SearchInRange
{
    public static void main(String[] args) {
        int[] nums={11,45,67,89,43,2,6};
        int target=43;
        int answer=linearSearch(nums , target, 3,6);
        System.out.println(answer);
    }
    
static int linearSearch(int arr[], int target,int start, int end){
    if(arr.length == 0){
        return -1;
    }
    for(int index=start;index<=end;index++){
        int element= arr[index];
        if(element==target){
            return index;
        }
    }
    return -1;
}
}