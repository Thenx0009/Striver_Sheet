package Arrays;

import java.util.*;

public class Find_The_Duplicate_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,1,3,4,2};
		System.out.println(duplicate(arr));
		System.out.println(duplicate1(arr));
	}
	//Ist Approach
	public static int duplicate(int arr[]) {
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]) {
				return arr[i];
			}
		}
		return -1;
	}
	//2nd Approach
	public static int duplicate1(int arr[]) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int num:arr) {
			if(map.containsKey(num)) {
				return num;
			}
			else {
				map.put(num, 1);
			}
		}
		return -1;
	}
}
