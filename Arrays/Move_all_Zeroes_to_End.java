package Arrays;

import java.util.*;

public class Move_all_Zeroes_to_End {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
		moveZeroes(arr);
	}

	// Ist Brute Force Approach
//	public static void moveZeroes(int arr[]) {
//		ArrayList<Integer> ll = new ArrayList<>();
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=0) {
//				ll.add(arr[i]);
//			}
//		}
//		for(int j=0;j<ll.size();j++) {
//			arr[j]=ll.get(j);
//		}
//		for(int k=ll.size();k<arr.length;k++) {
//			arr[k] = 0;
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//	}
	// 2nd Optimal Approach
	public static void moveZeroes(int arr[]) {
		int j = -1;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == 0) {//Here getting the index where arr[i]==0 and store it in j variable
				j = index;
				break;
			}
		}
		for (int i = j + 1; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
			else {
				continue;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
