package Arrays;

public class Median_of_two_Sorted_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,3,4,7,10,12,8};
		int arr2[] = {2,3,6,15};
		System.out.println(median(arr1,arr2));
	}

	public static int median(int arr1[],int arr2[]) {
		int sorted[] = new int[arr1.length+arr2.length];
		int i = 0;
		int j = 0;
		int k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				sorted[k]=arr1[i];
				i++;
				k++;
			}
			else {
				sorted[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<=arr1.length-1) {
			sorted[k]=arr1[i];
			i++;
			k++;
		}
		
		while(j<=arr2.length-1) {
			sorted[k]=arr2[j];
			j++;
			k++;
		}
//		for(int x=0;x<sorted.length;x++){
//		    System.out.print(sorted[x]+" ");
//		}
		
		int n = arr1.length+arr2.length;
		if(n%2!=0) {
			return sorted[n/2];
		}
		else {
			return ((sorted[n/2]+sorted[n/2-1])/2);
		}
	}
	
}
