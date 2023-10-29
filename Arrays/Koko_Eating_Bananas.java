package Arrays;
import java.util.*;
public class Koko_Eating_Bananas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int piles[] = { 3, 6, 7, 11 };
		int h = 8;
		System.out.println(minEatingSpeed(piles,h));
	}

	public static int minEatingSpeed(int[] arr, int h) {
	
		int low = 0;
		int high = Arrays.stream(arr).max().getAsInt();
		while(low<=high) {
			int mid = low + (high-low)/2;
			int totalhrs = hrs(arr,mid);
			if(totalhrs<=h) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return low;
	}
	public static int hrs(int arr[],int mid) {
		int totalhrs = 0;
		for(int i=0;i<arr.length;i++) {
			totalhrs+=Math.ceil((double)arr[i]/mid);
		}
		return totalhrs;
	}

}
