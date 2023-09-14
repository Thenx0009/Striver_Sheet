package Arrays;

public class Rotate_Array_by_K_Places {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int k = 2;
		int arr2[] = rotate(arr,k);
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}
	public static int[] rotate(int arr[],int k) {
		for(int i=1;i<=k;i++) {
			int temp = arr[arr.length-1];
			for(int j=arr.length-2;j>=0;j--) { 
				arr[j+1]=arr[j];
			}
			arr[0]=temp;
		}
		return arr;
	}

}
