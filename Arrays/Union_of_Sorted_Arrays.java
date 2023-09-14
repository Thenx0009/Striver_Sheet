package Arrays;

import java.util.*;

public class Union_of_Sorted_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 1, 2, 3, 4, 5 };
		int arr2[] = { 2, 3, 4, 4, 5, 6 };
		Union(arr, arr2);
	}
//	Ist Brute Approach(Using HashSet)
	public static void Union(int arr[], int arr2[]) {
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		for (int j = 0; j < arr2.length; j++) {
			set.add(arr2[j]);
		}
		int union[] = new int[set.size()];
		int index = 0;
		for (int val : set) {
			union[index] = val;
			index++;
		}
		for (int k = 0; k < union.length; k++) {
			System.out.print(union[k]+" ");
		}
	}
}
