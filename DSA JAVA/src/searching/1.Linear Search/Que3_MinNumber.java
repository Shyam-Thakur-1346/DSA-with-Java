// 1d array
public class Que3_MinNumber
{
	public static void main(String[] args) {
	    int[] arr={2,6,8,34,-5,-89};
		System.out.println(min(arr));
	}
	static int min(int[] arr){
	       int ans=arr[0];
	    for(int  i=1;i<arr.length;i++){
	    if(arr[i]<ans){
	        ans = arr[i];
	    }
	}
	return ans;
	}
}

// 2d array