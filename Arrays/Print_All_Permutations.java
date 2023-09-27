package Arrays;
import java.util.*;
public class Print_All_Permutations {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3 };
		System.out.println(permute(arr));
	}
	//recursion Approach
	public static List<List<Integer>> permute(int[] arr) {
		List<List<Integer>>ans = new ArrayList<>();
		Arrays.sort(arr);
		find(arr,arr.length,0,ans);
		return ans;
	}
	
	public static void find(int[] arr, int length, int ind, List<List<Integer>> ans) {
		//Base case
		if(ind==length) {
			List<Integer> ds = new ArrayList<>();
			for(int n:arr) {
				ds.add(n);
			}
			ans.add(ds);
			return;
		}
		for(int i=ind;i<length;i++) {
			swap(arr,i,ind);
			find(arr,arr.length,ind+1,ans);
			swap(arr,i,ind);
		}
	}
	public static void swap(int[] arr, int si, int ei) {
		int temp = arr[si];
		arr[si] = arr[ei];
        arr[ei] = temp;
		
	}

}
