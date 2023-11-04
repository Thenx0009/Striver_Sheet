package Arrays;

import java.util.*;

public class Longest_Consecutive_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 102, 4, 100, 1, 101, 3, 21, 1, 1 };
		System.out.println(longestConsecutive(arr));
	}

	public static int longestConsecutive(int arr[]) {
		int longest = 1;
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		for (int val : set) {
			if (!set.contains(val - 1)) {
				int count = 1;
				int x = val;
				while (set.contains(x + 1)) {
					x = x + 1;
					count = count + 1;
				}
				longest = Math.max(longest, count);
			}
		}
		return longest;
	}

}
