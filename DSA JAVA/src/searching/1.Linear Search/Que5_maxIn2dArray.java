// Find maximum in 2d array
public class Que5_maxIn2dArray
{
	public static void main(String[] args) {
		int[][] arr={
		    {2,3,4},
		    {4,6,5000,2},
		    {34,78,94,23}
		};
		System.out.println(max(arr));
	}
	static int max(int[][] arr){
	    int max = arr[0][0];
            for (int[] arr1 : arr) {
                for (int col = 0; col < arr1.length; col++) {
                    if (arr1[col] > max) {
                        max = arr1[col];
                    }
                }
            }
	    return max;
	}
}
