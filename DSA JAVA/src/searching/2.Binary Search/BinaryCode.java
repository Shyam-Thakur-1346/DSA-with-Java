public class BinaryCode
{
	public static void main(String[] args) {
	    int arr[]={-2,-7,0,5,7,98,101,456};
	    int target=456;
	    int ans=binarySearch(arr,target);
		System.out.println(ans);
	}
	static int binarySearch(int arr[],int target){
	    int start=0;
	    int end=arr.length-1;
	    while(start<=end){
	        int mid=start+(end-start)/2;
	        if(arr[mid]<target){
	            start=mid+1;
	        }
	        else if(arr[mid]>target){
	            end=mid-1;
	        }
	        else{
	            return mid;
	        }
	    }
	    return -1;
	}
}