package Arrays;

public class Search_a_2D_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 3, 5, 7 }, 
				        { 10, 11, 16, 20 }, 
				        { 23, 30, 34, 60 } };
		int target = 20;
		System.out.println(searchMatrix(arr,target));
	}
	
	public static boolean searchMatrix(int arr[][], int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i][0]<=target && target<=arr[i][arr[0].length-1]) {
				 boolean ans = binarysearch(arr[i],target);
				 if(ans) {
					 return true;
				 }
			}
		}
		return false;
	}
	public static boolean binarysearch(int arr[],int target) {
		int low=0;
		int high= arr.length-1;
		
		while(low<=high) {
			
			int mid = (low+high)/2;
			
			if(arr[mid]==target) {
				return true;
			}
			else if(arr[mid]<target) {
				low = mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return false;
	}
}
