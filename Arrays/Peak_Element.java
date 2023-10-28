package Arrays;

public class Peak_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,3,1};
		System.out.println(binarySearch(nums));
	}
	public static int binarySearch(int arr[]) {
		//if the size of the array is 1
		if(arr.length==1) {
			return 0;
		}
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			//mid!=0 && mid!=arr.length-1
			if (mid > 0 && mid < arr.length - 1) {
				if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
					return mid;
				} 
				else if (arr[mid - 1] < arr[mid]) {
					low = mid + 1;
				} 
				else {
					high = mid - 1;
				}
			}
			//mid==0
			else if(mid==0) {
				if(arr[0]>arr[1]) {
					return 0;
				}
				else {
					return 1;
				}
			}
			//mid == arr.length-1
			else if(mid==arr.length-1){
				if(arr[arr.length-1]<arr[arr.length-2]) {
					return arr.length-2;
				}
				else {
					return arr.length-1;
				}
			}
		}
		return -1;
	}

}
