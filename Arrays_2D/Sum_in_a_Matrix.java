package Arrays_2D;
import java.util.*;
public class Sum_in_a_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 7, 2, 1 }, { 6, 4, 2 }, { 6, 5, 3 }, { 3, 2, 1 } };
		System.out.println(matrixSum(arr));
	}

	public static int matrixSum(int[][] nums) {
		int m = nums.length;
		int n = nums[0].length;
		int res = 0;
		for (int i = 0; i < m; i++) {
			Arrays.sort(nums[i]);
		}
		for (int j = 0; j < n; j++) {
			int tmp = 0;
			for (int i = 0; i < m; i++) {
				tmp = Math.max(tmp, nums[i][j]);
			}
			res += tmp;
		}
		return res;
	}
}
