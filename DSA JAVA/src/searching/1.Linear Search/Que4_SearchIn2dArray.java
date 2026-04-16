import java.util.Arrays;
public class Que4_SearchIn2dArray{
	public static void main(String[] args) {
		int[][] arr={
		    {2,3,4},
		    {4,6,-5,2},
		    {34,78,94,23}
		};
		int target = -5;
		int[] ans= Searchin2dArray(arr,target);
		System.out.println(Arrays.toString(ans));
	}
	static int[] Searchin2dArray(int[][] arr,int target){
	    for(int row=0;row<arr.length;row++){
	        for(int col=0;col<arr[row].length;col++){
	            if(arr[row][col]==target){
	                return new int[]{row,col};
	            }
	        }
	    }
	    return new int[]{-1,-1};
	}
}
