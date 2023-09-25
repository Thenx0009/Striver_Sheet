package Arrays;

import java.util.*;

public class Three3_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -1, 0, 1, 2, -1, -4 };
		System.out.println(threeSum(arr));
	}
	//checking triplet summ ==0
	public static List<List<Integer>> threeSum(int[] arr) {
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			if (i != 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			int j = i + 1;
			int k = arr.length - 1;
			while (j < k) {
				int sum = arr[i] + arr[j] + arr[k];
				if (sum < 0) {
					j++;
				} else if (sum > 0) {
					k--;
				} else {
					List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
					ans.add(temp);
					j++;
					k--;
					while (j < k && arr[j] == arr[j - 1])
						j++;
					while (j < k && arr[k] == arr[k + 1])
						k--;
				}
			}
		}
		return ans;
	}
}
