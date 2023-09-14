package Arrays;
import java.util.*;
public class Intersection_of_Sorted_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 2, 3, 3, 4, 5, 6 };
		int arr2[] = { 2, 3, 3, 5, 6, 6, 7 };
		Intersection(arr, arr2);
	}
	//OPTIMAL APPROACH--->(using 2 Pointer Approach)
	
	public static void Intersection(int arr[], int arr2[]) {
		ArrayList<Integer> ll = new ArrayList<>();
		int i=0;
		int j=0;
		while(i<arr.length && j<arr2.length) {
			if(arr[i]==arr2[j]) {
				ll.add(arr[i]);
				i++;
				j++;
			}
			else {
				i++;
			}
		}
		System.out.println(ll);
	}

}
